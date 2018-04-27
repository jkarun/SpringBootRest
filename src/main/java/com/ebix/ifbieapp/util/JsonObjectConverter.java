package com.ebix.ifbieapp.util;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonObjectConverter {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> T convertJsonToObject(String json, Class dest)
			throws JsonParseException, JsonMappingException, IOException {
		T obj = null;
		if (json != null && !json.isEmpty()) {
			ObjectMapper obm = new ObjectMapper();
			obj = (T) obm.readValue(json, dest);
		}
		return obj;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T> List<T> convertJsonListToObjectList(String json, Class dest)
			throws JsonParseException, JsonMappingException, IOException {

		List<T> list = new ArrayList<T>();

		if (json != null && !json.isEmpty()) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				Class<T[]> arrayClass = (Class<T[]>) Class.forName("[L" + dest.getName() + ";");
				T[] objects = mapper.readValue(json, arrayClass);
				return Arrays.asList(objects);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return list;

	}
	
	public static <T> String converObjectToJson(T targetObject) throws IOException {
		String json = "";

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setDateFormat(new SimpleDateFormat("MM-dd-yyyy HH:mm:ss.SSS"));

		Object jsonObj = objectMapper.readValue(objectMapper.writeValueAsString(targetObject), Object.class);
		json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObj);
		
		return json;
	}

	public static <T> String converObjectToJson(List<T> targetObject) throws IOException {
		String json = "";

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setDateFormat(new SimpleDateFormat("MM-dd-yyyy HH:mm:ss.SSS"));

		Object jsonObj = objectMapper.readValue(objectMapper.writeValueAsString(targetObject), Object.class);
		json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObj);
		

		/*//this will work to
		 * Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL,
		 * DateFormat.FULL).create(); json = gson.toJson(targetObject);
		 */

		return json;
	}

	public static String generateJSONFromObjectArray(List<Object> list, String[] key,String jsonHeader)  
	{        
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonObject = null;
		if(list!=null){
			int j=1;
			for (Object obj : list) {
			    jsonObject = new JSONObject();
			    Object[] values = (Object[]) obj;
			    jsonObject.accumulate("row_id", j+"");
			    if (values.length == key.length) {
			        for (int i = 0; i < key.length; i++) {
			        	if (values[i] instanceof Timestamp) {						
							jsonObject.accumulate(key[i], Util.getDateStringFromTimeStamp((Timestamp) values[i]));
						}else{
							if(values[i]==null)
								values[i] = "";
							jsonObject.accumulate(key[i], values[i]);
						}
			           
			        }
			    }
			    jsonArray.add(jsonObject);
			    j++;
			}
		}
		
		return "{\""+jsonHeader+"\":" + jsonArray.toString() + "}";
	}
	
}
