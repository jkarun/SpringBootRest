package com.ebix.ifbieapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@ResponseBody
@RestController
public class TemporaryController {

	@GetMapping("/metadata")
	public String getMetaData() {
		return this.EAPP_META_DATA;
	}
	
	@GetMapping("/agentInbox")
	public String getAgentInbox(@RequestParam String userid) {
		return this.AGENT_INBOX;
	}
	
	@GetMapping("/caseDetails")
	public String getCaseById(@RequestParam String caseid ) {
		String json = "{\r\n" + 
				"	\"E"+caseid+"\": [{\r\n" + 
				"			\"CASE_SUMMARY\": [{\r\n" + 
				"					\"caseId\": \"E"+caseid+"\",\r\n" + 
				"					\"insuredName\": \"Bernice Archuleta\",\r\n" + 
				"					\"age\": \"28\",\r\n" + 
				"					\"planName\": \"Whole Life\",\r\n" + 
				"					\"amountOfIns\": \"$50,000\",\r\n" + 
				"					\"rateClassification\": \"Non-Tobacco\",\r\n" + 
				"					\"EFT\": \"N/A\",\r\n" + 
				"					\"salarySavings\": \"N/A\",\r\n" + 
				"					\"pipp\": \"N/A\",\r\n" + 
				"					\"quarterly\": \"N/A\",\r\n" + 
				"					\"semiAnnual\": \"N/A\",\r\n" + 
				"					\"annual\": \"N/A\"\r\n" + 
				"				}\r\n" + 
				"\r\n" + 
				"			]\r\n" + 
				"		}, {\r\n" + 
				"			\"CASE_SETUP_SCRN\": [{\r\n" + 
				"					\"caseid\": \""+caseid+"\",\r\n" + 
				"					\"applicationState\": \"INDIANA\",\r\n" + 
				"					\"signedAt\": \"USA\",\r\n" + 
				"					\"dob\": \"05/05/1980\",\r\n" + 
				"					\"age\": 33,\r\n" + 
				"					\"productType\": \"WLIFE\",\r\n" + 
				"					\"planOfInsurance\": \"Whole Life\",\r\n" + 
				"					\"nicotineUseInd\": \"N\",\r\n" + 
				"					\"nicotineTypeCd\": \"CHW\",\r\n" + 
				"					\"nicotineTypeOther\": \"CHW\",\r\n" + 
				"					\"pastNicotineUse\": \"N\",\r\n" + 
				"					\"pastNicotineUseDate\": \"\",\r\n" + 
				"					\"amountOfInsurance\": 50000\r\n" + 
				"				}\r\n" + 
				"\r\n" + 
				"			]\r\n" + 
				"		},\r\n" + 
				"		{\r\n" + 
				"			\"INSURED_SCRN\": [{\r\n" + 
				"				\"caseid\": \""+caseid+"\",\r\n" + 
				"				\"prefix\": \"Dr\",\r\n" + 
				"				\"firstName\": \"Bernice\",\r\n" + 
				"				\"applicationState\": \"Archuleta\",\r\n" + 
				"				\"lastName\": \"INDIANA\",\r\n" + 
				"				\"suffix\": \"II\",\r\n" + 
				"				\"dob\": \"02/26/1986\",\r\n" + 
				"				\"age\": \"32\",\r\n" + 
				"				\"rateClassification\": \"Non Tobacco\",\r\n" + 
				"				\"birthCountry\": \"United States of America\",\r\n" + 
				"				\"stateOfBirth\": \"CALIFORNIA\",\r\n" + 
				"				\"gender\": \"Female\",\r\n" + 
				"				\"maritalStatus\": \"Married\",\r\n" + 
				"				\"socialSecurityNo\": \"666-53-2551\",\r\n" + 
				"				\"driverLicenseState\": \"NEW MEXICO\",\r\n" + 
				"				\"driverLicenseNo\": \"885178767\",\r\n" + 
				"				\"areYouEmployed\": \"Y\",\r\n" + 
				"				\"status \": \"Unemployed\",\r\n" + 
				"				\"address1\": \"885178767\",\r\n" + 
				"				\"address2\": \"885178767\",\r\n" + 
				"				\"city\": \"885178767\",\r\n" + 
				"				\"state\": \"885178767\",\r\n" + 
				"				\"zipCode\": \"885178767\",\r\n" + 
				"				\"usCitizen\": \"Y\",\r\n" + 
				"				\"phoneNumber\": \"907-200-3131\",\r\n" + 
				"				\"bestTimetoCall\": \"1:00PM\",\r\n" + 
				"				\"email\": \"bernicearchuleta0226@aol.web\",\r\n" + 
				"				\"replaceAnyInsurance\": \"N\",\r\n" + 
				"				\"currentlyInforce\": \"$2,500\"\r\n" + 
				"			}]\r\n" + 
				"		}\r\n" + 
				"	]\r\n" + 
				"}";
		
		return json;
	}
	
	private static String AGENT_INBOX = "{\r\n" + 
			"	\"AGENT_INBOX\": [{\r\n" + 
			"			\"caseid\": \"10188\",\r\n" + 
			"			\"dspCaseid\": \"E10188\",\r\n" + 
			"			\"insuredName\": \"Bernice Archuleta\",\r\n" + 
			"			\"phone\": \"9072003131\",\r\n" + 
			"			\"planName\": \"WholeLife\",\r\n" + 
			"			\"faceAmount\": \"$150,000\",\r\n" + 
			"			\"amountCollected\": \"$1,500\",\r\n" + 
			"			\"daysLeft\": \"7\",\r\n" + 
			"			\"caseStatus\": \"InProgress\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"caseid\": \"10187\",\r\n" + 
			"			\"dspCaseid\": \"E10187\",\r\n" + 
			"			\"insuredName\": \"Bernice Archuleta\",\r\n" + 
			"			\"phone\": \"9072003131\",\r\n" + 
			"			\"planName\": \"WholeLife\",\r\n" + 
			"			\"faceAmount\": \"$150,000\",\r\n" + 
			"			\"amountCollected\": \"$1,500\",\r\n" + 
			"			\"daysLeft\": \"7\",\r\n" + 
			"			\"caseStatus\": \"InProgress\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"caseid\": \"10186\",\r\n" + 
			"			\"dspCaseid\": \"E10186\",\r\n" + 
			"			\"insuredName\": \"Bernice Archuleta\",\r\n" + 
			"			\"phone\": \"9072003131\",\r\n" + 
			"			\"planName\": \"WholeLife\",\r\n" + 
			"			\"faceAmount\": \"$150,000\",\r\n" + 
			"			\"amountCollected\": \"$1,500\",\r\n" + 
			"			\"daysLeft\": \"7\",\r\n" + 
			"			\"caseStatus\": \"InProgress\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"caseid\": \"10185\",\r\n" + 
			"			\"dspCaseid\": \"E10185\",\r\n" + 
			"			\"insuredName\": \"Bernice Archuleta\",\r\n" + 
			"			\"phone\": \"9072003131\",\r\n" + 
			"			\"planName\": \"WholeLife\",\r\n" + 
			"			\"faceAmount\": \"$150,000\",\r\n" + 
			"			\"amountCollected\": \"$1,500\",\r\n" + 
			"			\"daysLeft\": \"7\",\r\n" + 
			"			\"caseStatus\": \"InProgress\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"caseid\": \"10184\",\r\n" + 
			"			\"dspCaseid\": \"E10184\",\r\n" + 
			"			\"insuredName\": \"Bernice Archuleta\",\r\n" + 
			"			\"phone\": \"9072003131\",\r\n" + 
			"			\"planName\": \"WholeLife\",\r\n" + 
			"			\"faceAmount\": \"$150,000\",\r\n" + 
			"			\"amountCollected\": \"$1,500\",\r\n" + 
			"			\"daysLeft\": \"7\",\r\n" + 
			"			\"caseStatus\": \"InProgress\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"caseid\": \"10183\",\r\n" + 
			"			\"dspCaseid\": \"E10183\",\r\n" + 
			"			\"insuredName\": \"Bernice Archuleta\",\r\n" + 
			"			\"phone\": \"9072003131\",\r\n" + 
			"			\"planName\": \"WholeLife\",\r\n" + 
			"			\"faceAmount\": \"$150,000\",\r\n" + 
			"			\"amountCollected\": \"$1,500\",\r\n" + 
			"			\"daysLeft\": \"7\",\r\n" + 
			"			\"caseStatus\": \"InProgress\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"caseid\": \"10182\",\r\n" + 
			"			\"dspCaseid\": \"E10182\",\r\n" + 
			"			\"insuredName\": \"Bernice Archuleta\",\r\n" + 
			"			\"phone\": \"9072003131\",\r\n" + 
			"			\"planName\": \"WholeLife\",\r\n" + 
			"			\"faceAmount\": \"$150,000\",\r\n" + 
			"			\"amountCollected\": \"$1,500\",\r\n" + 
			"			\"daysLeft\": \"7\",\r\n" + 
			"			\"caseStatus\": \"InProgress\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"caseid\": \"10181\",\r\n" + 
			"			\"dspCaseid\": \"E10181\",\r\n" + 
			"			\"insuredName\": \"Bernice Archuleta\",\r\n" + 
			"			\"phone\": \"9072003131\",\r\n" + 
			"			\"planName\": \"WholeLife\",\r\n" + 
			"			\"faceAmount\": \"$150,000\",\r\n" + 
			"			\"amountCollected\": \"$1,500\",\r\n" + 
			"			\"daysLeft\": \"7\",\r\n" + 
			"			\"caseStatus\": \"InProgress\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"caseid\": \"10180\",\r\n" + 
			"			\"dspCaseid\": \"E10180\",\r\n" + 
			"			\"insuredName\": \"Bernice Archuleta\",\r\n" + 
			"			\"phone\": \"9072003131\",\r\n" + 
			"			\"planName\": \"WholeLife\",\r\n" + 
			"			\"faceAmount\": \"$150,000\",\r\n" + 
			"			\"amountCollected\": \"$1,500\",\r\n" + 
			"			\"daysLeft\": \"7\",\r\n" + 
			"			\"caseStatus\": \"InProgress\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"caseid\": \"10179\",\r\n" + 
			"			\"dspCaseid\": \"E10179\",\r\n" + 
			"			\"insuredName\": \"Bernice Archuleta\",\r\n" + 
			"			\"phone\": \"9072003131\",\r\n" + 
			"			\"planName\": \"WholeLife\",\r\n" + 
			"			\"faceAmount\": \"$150,000\",\r\n" + 
			"			\"amountCollected\": \"$1,500\",\r\n" + 
			"			\"daysLeft\": \"7\",\r\n" + 
			"			\"caseStatus\": \"InProgress\"\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"	]\r\n" + 
			"}";
	
	private static String EAPP_META_DATA = "{\r\n" + 
			"  \"EAPP_META_DATA\": [\r\n" + 
			"    {\r\n" + 
			"      \"M_PROD_TYPES\": [\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"INSEN\",\r\n" + 
			"          \"desc\": \"Interest Sensitive\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TLIFE\",\r\n" + 
			"          \"desc\": \"Term Life\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"WLIFE\",\r\n" + 
			"          \"desc\": \"Whole Life\"\r\n" + 
			"        }\r\n" + 
			"      ]\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"M_BASE_PLANS\": [\r\n" + 
			"        {\r\n" + 
			"          \"categoryCd\": \"INSEN\",\r\n" + 
			"          \"code\": \"SPFULL\",\r\n" + 
			"          \"desc\": \"Single Premium\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"categoryCd\": \"INSEN\",\r\n" + 
			"          \"code\": \"ULFULL\",\r\n" + 
			"          \"desc\": \"Universal Life\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"categoryCd\": \"TLIFE\",\r\n" + 
			"          \"code\": \"20YTFULL\",\r\n" + 
			"          \"desc\": \"20 Level Term\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"categoryCd\": \"TLIFE\",\r\n" + 
			"          \"code\": \"20ROPFULL\",\r\n" + 
			"          \"desc\": \"20 Level Term with Return of Premium\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"categoryCd\": \"TLIFE\",\r\n" + 
			"          \"code\": \"30YTFULL\",\r\n" + 
			"          \"desc\": \"30 Level Term\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"categoryCd\": \"TLIFE\",\r\n" + 
			"          \"code\": \"30ROPFULL\",\r\n" + 
			"          \"desc\": \"30 Level Term with Return of Premium\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"categoryCd\": \"TLIFE\",\r\n" + 
			"          \"code\": \"ARTFULL\",\r\n" + 
			"          \"desc\": \"Annual Renewable Term\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"categoryCd\": \"TLIFE\",\r\n" + 
			"          \"code\": \"ETERM20\",\r\n" + 
			"          \"desc\": \"eTerm20\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"categoryCd\": \"TLIFE\",\r\n" + 
			"          \"code\": \"S20YTFULL\",\r\n" + 
			"          \"desc\": \"Stand Alone 20 Level Term\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"categoryCd\": \"TLIFE\",\r\n" + 
			"          \"code\": \"S30YTFULL\",\r\n" + 
			"          \"desc\": \"Stand Alone 30 Level Term\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"categoryCd\": \"TLIFE\",\r\n" + 
			"          \"code\": \"SETERM20\",\r\n" + 
			"          \"desc\": \"Stand Alone eTerm20\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"categoryCd\": \"WLIFE\",\r\n" + 
			"          \"code\": \"WLFULL\",\r\n" + 
			"          \"desc\": \"Whole Life\"\r\n" + 
			"        }\r\n" + 
			"      ]\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"M_PREFIX\": [\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Dr.\",\r\n" + 
			"          \"desc\": \"Dr\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Mr.\",\r\n" + 
			"          \"desc\": \"Mr\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Mrs.\",\r\n" + 
			"          \"desc\": \"Mrs\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Ms.\",\r\n" + 
			"          \"desc\": \"Ms\"\r\n" + 
			"        }\r\n" + 
			"      ]\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"M_SUFIX\": [\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Jr.\",\r\n" + 
			"          \"desc\": \"Jr\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Sr.\",\r\n" + 
			"          \"desc\": \"Sr\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"II\",\r\n" + 
			"          \"desc\": \"II\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"III\",\r\n" + 
			"          \"desc\": \"III\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"IV\",\r\n" + 
			"          \"desc\": \"IV\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"V\",\r\n" + 
			"          \"desc\": \"V\"\r\n" + 
			"        }\r\n" + 
			"      ]\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"M_RATE_CLASS_ADULT\": [\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"0\",\r\n" + 
			"          \"desc\": \"None\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"500001\",\r\n" + 
			"          \"desc\": \"Preferred Plus\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"500002\",\r\n" + 
			"          \"desc\": \"Preferred Non Tobacco\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"500003\",\r\n" + 
			"          \"desc\": \"Preferred Tobacco\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"500004\",\r\n" + 
			"          \"desc\": \"Non Tobacco\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"500005\",\r\n" + 
			"          \"desc\": \"Tobacco\"\r\n" + 
			"        }\r\n" + 
			"      ]\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"M_RATE_CLASS_JUVENILE\": [\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"500006\",\r\n" + 
			"          \"desc\": \"Juvenile\"\r\n" + 
			"        }\r\n" + 
			"      ]\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"M_STATE\": [\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"AB\",\r\n" + 
			"          \"desc\": \"ALBERTA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"AK\",\r\n" + 
			"          \"desc\": \"ALASKA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"AL\",\r\n" + 
			"          \"desc\": \"ALABAMA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"AR\",\r\n" + 
			"          \"desc\": \"ARKANSAS\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"AZ\",\r\n" + 
			"          \"desc\": \"ARIZONA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BC\",\r\n" + 
			"          \"desc\": \"BRITISH COLUMBIA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CA\",\r\n" + 
			"          \"desc\": \"CALIFORNIA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CN\",\r\n" + 
			"          \"desc\": \"UNKNOWN\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CO\",\r\n" + 
			"          \"desc\": \"COLORADO\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CT\",\r\n" + 
			"          \"desc\": \"CONNECTICUT\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"DC\",\r\n" + 
			"          \"desc\": \"DISTRICT OF COLUMBIA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"DE\",\r\n" + 
			"          \"desc\": \"DELAWARE\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"FL\",\r\n" + 
			"          \"desc\": \"FLORIDA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GA\",\r\n" + 
			"          \"desc\": \"GEORGIA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GU\",\r\n" + 
			"          \"desc\": \"GUAM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"HI\",\r\n" + 
			"          \"desc\": \"HAWAII\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"IA\",\r\n" + 
			"          \"desc\": \"IOWA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ID\",\r\n" + 
			"          \"desc\": \"IDAHO\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"IL\",\r\n" + 
			"          \"desc\": \"ILLINOIS\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"IN\",\r\n" + 
			"          \"desc\": \"INDIANA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"KS\",\r\n" + 
			"          \"desc\": \"KANSAS\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"KY\",\r\n" + 
			"          \"desc\": \"KENTUCKY\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"LA\",\r\n" + 
			"          \"desc\": \"LOUISANA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MA\",\r\n" + 
			"          \"desc\": \"MASSACHUSETTS\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MB\",\r\n" + 
			"          \"desc\": \"MANITOBA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MD\",\r\n" + 
			"          \"desc\": \"MARYLAND\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ME\",\r\n" + 
			"          \"desc\": \"MAINE\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MI\",\r\n" + 
			"          \"desc\": \"MICHIGAN\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MN\",\r\n" + 
			"          \"desc\": \"MINNESOTA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MO\",\r\n" + 
			"          \"desc\": \"MISSOURI\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MS\",\r\n" + 
			"          \"desc\": \"MISSISSIPPI\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MT\",\r\n" + 
			"          \"desc\": \"MONTANA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NA\",\r\n" + 
			"          \"desc\": \"N/A\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NB\",\r\n" + 
			"          \"desc\": \"NEW BRUNSWICK\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NC\",\r\n" + 
			"          \"desc\": \"NORTH CAROLINA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ND\",\r\n" + 
			"          \"desc\": \"NORTH DAKOTA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NE\",\r\n" + 
			"          \"desc\": \"NEBRASKA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NF\",\r\n" + 
			"          \"desc\": \"NEWFOUNDLAND\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NH\",\r\n" + 
			"          \"desc\": \"NEW HAMPSHIRE\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NJ\",\r\n" + 
			"          \"desc\": \"NEW JERSEY\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NM\",\r\n" + 
			"          \"desc\": \"NEW MEXICO\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NS\",\r\n" + 
			"          \"desc\": \"NOVA SCOTIA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NT\",\r\n" + 
			"          \"desc\": \"NORTHWEST TERRITORIES\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NU\",\r\n" + 
			"          \"desc\": \"NUNAVUT\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NV\",\r\n" + 
			"          \"desc\": \"NEVADA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NY\",\r\n" + 
			"          \"desc\": \"NEW YORK\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"OH\",\r\n" + 
			"          \"desc\": \"OHIO\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"OK\",\r\n" + 
			"          \"desc\": \"OKLAHOMA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ON\",\r\n" + 
			"          \"desc\": \"ONTARIO\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"OR\",\r\n" + 
			"          \"desc\": \"OREGON\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PA\",\r\n" + 
			"          \"desc\": \"PENNSYLVANIA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PE\",\r\n" + 
			"          \"desc\": \"PRINCE EDWARD ISLAND\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PR\",\r\n" + 
			"          \"desc\": \"PUERTO RICO\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"QC\",\r\n" + 
			"          \"desc\": \"QUEBEC\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"RI\",\r\n" + 
			"          \"desc\": \"RHODE ISLAND\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SC\",\r\n" + 
			"          \"desc\": \"SOUTH CAROLINA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SD\",\r\n" + 
			"          \"desc\": \"SOUTH DAKOTA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SK\",\r\n" + 
			"          \"desc\": \"SASKATCHEWAN\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TN\",\r\n" + 
			"          \"desc\": \"TENNESSEE\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TX\",\r\n" + 
			"          \"desc\": \"TEXAS\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"UN\",\r\n" + 
			"          \"desc\": \"UNKNOWN\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"UT\",\r\n" + 
			"          \"desc\": \"UTAH\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"VA\",\r\n" + 
			"          \"desc\": \"VIRGINIA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"VI\",\r\n" + 
			"          \"desc\": \"VIRGIN ISLANDS - US\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"VT\",\r\n" + 
			"          \"desc\": \"VERMONT\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"WA\",\r\n" + 
			"          \"desc\": \"WASHINGTON\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"WI\",\r\n" + 
			"          \"desc\": \"WISCONSIN\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"WV\",\r\n" + 
			"          \"desc\": \"WEST VIRGINIA\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"WY\",\r\n" + 
			"          \"desc\": \"WYOMING\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"YT\",\r\n" + 
			"          \"desc\": \"YUKON\"\r\n" + 
			"        }\r\n" + 
			"      ]\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"M_GENDER\": [\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"M\",\r\n" + 
			"          \"desc\": \"Male\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"F\",\r\n" + 
			"          \"desc\": \"Female\"\r\n" + 
			"        }\r\n" + 
			"      ]\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"M_MARITAL_STATUS\": [\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"D\",\r\n" + 
			"          \"desc\": \"Divorced\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"M\",\r\n" + 
			"          \"desc\": \"Married\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"O\",\r\n" + 
			"          \"desc\": \"Other\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"P\",\r\n" + 
			"          \"desc\": \"Separated\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"S\",\r\n" + 
			"          \"desc\": \"Single\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"W\",\r\n" + 
			"          \"desc\": \"Widow\"\r\n" + 
			"        }\r\n" + 
			"      ]\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"M_BEST_TIME_TO_CALL\": [\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Morning\",\r\n" + 
			"          \"desc\": \"Morning\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Afterno\",\r\n" + 
			"          \"desc\": \"Afternoon\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Evening\",\r\n" + 
			"          \"desc\": \"Evening\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"5am\",\r\n" + 
			"          \"desc\": \"5:00AM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"6am\",\r\n" + 
			"          \"desc\": \"6:00AM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"7am\",\r\n" + 
			"          \"desc\": \"7:00AM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"8am\",\r\n" + 
			"          \"desc\": \"8:00AM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"9am\",\r\n" + 
			"          \"desc\": \"9:00AM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"10am\",\r\n" + 
			"          \"desc\": \"10:00AM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"11am\",\r\n" + 
			"          \"desc\": \"11:00AM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"12pm\",\r\n" + 
			"          \"desc\": \"12:00PM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"1pm\",\r\n" + 
			"          \"desc\": \"1:00PM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"2pm\",\r\n" + 
			"          \"desc\": \"2:00PM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"3pm\",\r\n" + 
			"          \"desc\": \"3:00PM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"4pm\",\r\n" + 
			"          \"desc\": \"4:00PM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"5pm\",\r\n" + 
			"          \"desc\": \"5:00PM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"6pm\",\r\n" + 
			"          \"desc\": \"6:00PM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"7pm\",\r\n" + 
			"          \"desc\": \"7:00PM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"8pm\",\r\n" + 
			"          \"desc\": \"8:00PM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"9pm\",\r\n" + 
			"          \"desc\": \"9:00PM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"10pm\",\r\n" + 
			"          \"desc\": \"10:00PM\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"anytime\",\r\n" + 
			"          \"desc\": \"Anytime\"\r\n" + 
			"        }\r\n" + 
			"      ]\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"M_OCCUPATIONAL_STATUS\": [\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"child\",\r\n" + 
			"          \"desc\": \"Child\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"dis\",\r\n" + 
			"          \"desc\": \"Disabled\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ret\",\r\n" + 
			"          \"desc\": \"Retired\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"stu\",\r\n" + 
			"          \"desc\": \"Student\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"unemp\",\r\n" + 
			"          \"desc\": \"Unemployed\"\r\n" + 
			"        }\r\n" + 
			"      ]\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"M_OCCUPATIONAL_DUTIES\": [\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Agri\",\r\n" + 
			"          \"desc\": \"Agricultural\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Auto\",\r\n" + 
			"          \"desc\": \"Automotive\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Business\",\r\n" + 
			"          \"desc\": \"Business Owner\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"child\",\r\n" + 
			"          \"desc\": \"Child\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Clerical\",\r\n" + 
			"          \"desc\": \"Clerical/Secretarial\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Const\",\r\n" + 
			"          \"desc\": \"Construction\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"dis\",\r\n" + 
			"          \"desc\": \"Disabled\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Driver\",\r\n" + 
			"          \"desc\": \"Driver/Truck Driver\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Educatio\",\r\n" + 
			"          \"desc\": \"Education\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Fireman\",\r\n" + 
			"          \"desc\": \"Fireman\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Food\",\r\n" + 
			"          \"desc\": \"Food Services\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Industri\",\r\n" + 
			"          \"desc\": \"Industrial\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Labourer\",\r\n" + 
			"          \"desc\": \"Laborer\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Law\",\r\n" + 
			"          \"desc\": \"Law Enforcement\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Medical\",\r\n" + 
			"          \"desc\": \"Medical\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Military\",\r\n" + 
			"          \"desc\": \"Military\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Other\",\r\n" + 
			"          \"desc\": \"Other\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Prof\",\r\n" + 
			"          \"desc\": \"Professional\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Retail\",\r\n" + 
			"          \"desc\": \"Retail\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ret\",\r\n" + 
			"          \"desc\": \"Retired\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"stu\",\r\n" + 
			"          \"desc\": \"Student\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"unemp\",\r\n" + 
			"          \"desc\": \"Unemployed\"\r\n" + 
			"        }\r\n" + 
			"      ]\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"M_BIRTH_COUNTRY\": [\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"US\",\r\n" + 
			"          \"desc\": \"United States of America\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CA\",\r\n" + 
			"          \"desc\": \"Canada\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"OH\",\r\n" + 
			"          \"desc\": \"Other\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"AFG\",\r\n" + 
			"          \"desc\": \"Afghanistan\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ALB\",\r\n" + 
			"          \"desc\": \"Albania\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"DZA\",\r\n" + 
			"          \"desc\": \"Algeria\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ASM\",\r\n" + 
			"          \"desc\": \"American Samoa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"AND\",\r\n" + 
			"          \"desc\": \"Andorra\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"AGO\",\r\n" + 
			"          \"desc\": \"Angola\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"AIA\",\r\n" + 
			"          \"desc\": \"Anguilla\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ATA\",\r\n" + 
			"          \"desc\": \"Antarctica\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ATG\",\r\n" + 
			"          \"desc\": \"Antigua and Barbuda\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ARG\",\r\n" + 
			"          \"desc\": \"Argentina\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ARM\",\r\n" + 
			"          \"desc\": \"Armenia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ABW\",\r\n" + 
			"          \"desc\": \"Aruba\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"AUS\",\r\n" + 
			"          \"desc\": \"Australia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"AUT\",\r\n" + 
			"          \"desc\": \"Austria\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"AZE\",\r\n" + 
			"          \"desc\": \"Azerbaijan\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BHS\",\r\n" + 
			"          \"desc\": \"Bahamas\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BHR\",\r\n" + 
			"          \"desc\": \"Bahrain\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BGD\",\r\n" + 
			"          \"desc\": \"Bangladesh\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BRB\",\r\n" + 
			"          \"desc\": \"Barbados\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BLR\",\r\n" + 
			"          \"desc\": \"Belarus\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BEL\",\r\n" + 
			"          \"desc\": \"Belgium\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BLZ\",\r\n" + 
			"          \"desc\": \"Belize\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BEN\",\r\n" + 
			"          \"desc\": \"Benin\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BMU\",\r\n" + 
			"          \"desc\": \"Bermuda\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BTN\",\r\n" + 
			"          \"desc\": \"Bhutan\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BOL\",\r\n" + 
			"          \"desc\": \"Bolivia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BIH\",\r\n" + 
			"          \"desc\": \"Bosnia and Herzegovina\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BWA\",\r\n" + 
			"          \"desc\": \"Botswana\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BVT\",\r\n" + 
			"          \"desc\": \"Bouvet Island\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BRA\",\r\n" + 
			"          \"desc\": \"Brazil\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"IOT\",\r\n" + 
			"          \"desc\": \"British Indian Ocean Territory\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BRN\",\r\n" + 
			"          \"desc\": \"Brunei Darussalam\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BGR\",\r\n" + 
			"          \"desc\": \"Bulgaria\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BFA\",\r\n" + 
			"          \"desc\": \"Burkina Faso\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"BDI\",\r\n" + 
			"          \"desc\": \"Burundi\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"KHM\",\r\n" + 
			"          \"desc\": \"Cambodia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CMR\",\r\n" + 
			"          \"desc\": \"Cameroon\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CPV\",\r\n" + 
			"          \"desc\": \"Cape Verde\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CYM\",\r\n" + 
			"          \"desc\": \"Cayman Islands\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CAF\",\r\n" + 
			"          \"desc\": \"Central African Republic\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TCD\",\r\n" + 
			"          \"desc\": \"Chad\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CHL\",\r\n" + 
			"          \"desc\": \"Chile\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CHN\",\r\n" + 
			"          \"desc\": \"China\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CXR\",\r\n" + 
			"          \"desc\": \"Christmas Island\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"COL\",\r\n" + 
			"          \"desc\": \"Colombia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"COM\",\r\n" + 
			"          \"desc\": \"Comoros\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"COG\",\r\n" + 
			"          \"desc\": \"Congo\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"COD\",\r\n" + 
			"          \"desc\": \"Congo, the Democratic Republic of the\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"COK\",\r\n" + 
			"          \"desc\": \"Cook Islands\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CRI\",\r\n" + 
			"          \"desc\": \"Costa Rica\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CIV\",\r\n" + 
			"          \"desc\": \"Cote d'Ivoire\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"HRV\",\r\n" + 
			"          \"desc\": \"Croatia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CUB\",\r\n" + 
			"          \"desc\": \"Cuba\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CYP\",\r\n" + 
			"          \"desc\": \"Cyprus\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CZE\",\r\n" + 
			"          \"desc\": \"Czech Republic\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"DNK\",\r\n" + 
			"          \"desc\": \"Denmark\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"DJI\",\r\n" + 
			"          \"desc\": \"Djibouti\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"DMA\",\r\n" + 
			"          \"desc\": \"Dominica\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"DOM\",\r\n" + 
			"          \"desc\": \"Dominican Republic\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ECU\",\r\n" + 
			"          \"desc\": \"Ecuador\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"EGV\",\r\n" + 
			"          \"desc\": \"Egypt\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SLV\",\r\n" + 
			"          \"desc\": \"El Salvador\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GNQ\",\r\n" + 
			"          \"desc\": \"Equatorial Guinea\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ERI\",\r\n" + 
			"          \"desc\": \"Eritrea\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"EST\",\r\n" + 
			"          \"desc\": \"Estonia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ETH\",\r\n" + 
			"          \"desc\": \"Ethiopia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"FRO\",\r\n" + 
			"          \"desc\": \"FAEROE ISLANDS\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"FLK\",\r\n" + 
			"          \"desc\": \"Falkland Islands (Malvinas)\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"FJI\",\r\n" + 
			"          \"desc\": \"Fiji\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"FIN\",\r\n" + 
			"          \"desc\": \"Finland\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"FRA\",\r\n" + 
			"          \"desc\": \"France\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GUF\",\r\n" + 
			"          \"desc\": \"French Guiana\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PYF\",\r\n" + 
			"          \"desc\": \"French Polynesia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ATF\",\r\n" + 
			"          \"desc\": \"French Southern Territories\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GAB\",\r\n" + 
			"          \"desc\": \"Gabon\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GMB\",\r\n" + 
			"          \"desc\": \"Gambia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GEO\",\r\n" + 
			"          \"desc\": \"Georgia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"DEU\",\r\n" + 
			"          \"desc\": \"Germany\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GHA\",\r\n" + 
			"          \"desc\": \"Ghana\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GIB\",\r\n" + 
			"          \"desc\": \"GIBRALTAR\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GRC\",\r\n" + 
			"          \"desc\": \"Greece\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GRL\",\r\n" + 
			"          \"desc\": \"Greenland\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GRD\",\r\n" + 
			"          \"desc\": \"Grenada\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GLP\",\r\n" + 
			"          \"desc\": \"Guadeloupe\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GUM\",\r\n" + 
			"          \"desc\": \"Guam\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GTM\",\r\n" + 
			"          \"desc\": \"Guatemala\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GGY\",\r\n" + 
			"          \"desc\": \"Guernsey\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GIN\",\r\n" + 
			"          \"desc\": \"Guinea\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GNB\",\r\n" + 
			"          \"desc\": \"Guinea-Bissau\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GUY\",\r\n" + 
			"          \"desc\": \"Guyana\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"HTI\",\r\n" + 
			"          \"desc\": \"Haiti\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"HMD\",\r\n" + 
			"          \"desc\": \"Heard Island and McDonald Islands\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"VAT\",\r\n" + 
			"          \"desc\": \"Holy See (Vatican City State)\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"HND\",\r\n" + 
			"          \"desc\": \"Honduras\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"HKG\",\r\n" + 
			"          \"desc\": \"Hong Kong\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"HUN\",\r\n" + 
			"          \"desc\": \"Hungary\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ISL\",\r\n" + 
			"          \"desc\": \"Iceland\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"IND\",\r\n" + 
			"          \"desc\": \"India\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"IDN\",\r\n" + 
			"          \"desc\": \"Indonesia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"IRN\",\r\n" + 
			"          \"desc\": \"Iran, Islamic Republic of\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"IRQ\",\r\n" + 
			"          \"desc\": \"Iraq\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"IRL\",\r\n" + 
			"          \"desc\": \"Ireland\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ISR\",\r\n" + 
			"          \"desc\": \"Israel\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ITA\",\r\n" + 
			"          \"desc\": \"Italy\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"JAM\",\r\n" + 
			"          \"desc\": \"Jamaica\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"JPN\",\r\n" + 
			"          \"desc\": \"Japan\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"JOR\",\r\n" + 
			"          \"desc\": \"Jordan\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"KAZ\",\r\n" + 
			"          \"desc\": \"Kazakhstan\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"KEN\",\r\n" + 
			"          \"desc\": \"Kenya\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"KIR\",\r\n" + 
			"          \"desc\": \"Kiribati\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PRK\",\r\n" + 
			"          \"desc\": \"Korea, Democratic People's Republic of\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"KOR\",\r\n" + 
			"          \"desc\": \"Korea, Republic of\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"KWT\",\r\n" + 
			"          \"desc\": \"Kuwait\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"KGZ\",\r\n" + 
			"          \"desc\": \"Kyrgyzstan\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"LAO\",\r\n" + 
			"          \"desc\": \"Lao People's Democratic Republic\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"LVA\",\r\n" + 
			"          \"desc\": \"Latvia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"LBN\",\r\n" + 
			"          \"desc\": \"Lebanon\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"LSO\",\r\n" + 
			"          \"desc\": \"Lesotho\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"LBR\",\r\n" + 
			"          \"desc\": \"Liberia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"LAJ\",\r\n" + 
			"          \"desc\": \"Libyan Arab Jamahiriya\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"LIE\",\r\n" + 
			"          \"desc\": \"Liechtenstein\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"LTU\",\r\n" + 
			"          \"desc\": \"Lithuania\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"LUX\",\r\n" + 
			"          \"desc\": \"Luxembourg\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MAC\",\r\n" + 
			"          \"desc\": \"Macao\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MKD\",\r\n" + 
			"          \"desc\": \"Macedonia, The Former Yugoslav Republic of\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MDG\",\r\n" + 
			"          \"desc\": \"Madagascar\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MWI\",\r\n" + 
			"          \"desc\": \"Malawi\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MYS\",\r\n" + 
			"          \"desc\": \"Malaysia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MDV\",\r\n" + 
			"          \"desc\": \"Maldives\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MLI\",\r\n" + 
			"          \"desc\": \"Mali\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MLT\",\r\n" + 
			"          \"desc\": \"Malta\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MHL\",\r\n" + 
			"          \"desc\": \"Marshall Islands\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MTQ\",\r\n" + 
			"          \"desc\": \"Martinique\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MRT\",\r\n" + 
			"          \"desc\": \"Mauritania\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MUS\",\r\n" + 
			"          \"desc\": \"Mauritius\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MYT\",\r\n" + 
			"          \"desc\": \"Mayotte\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MEX\",\r\n" + 
			"          \"desc\": \"Mexico\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"FSM\",\r\n" + 
			"          \"desc\": \"Micronesia, Federated States of\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MDA\",\r\n" + 
			"          \"desc\": \"Moldova, Republic of\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MCO\",\r\n" + 
			"          \"desc\": \"Monaco\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MNG\",\r\n" + 
			"          \"desc\": \"Mongolia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MSR\",\r\n" + 
			"          \"desc\": \"Montserrat\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Mar\",\r\n" + 
			"          \"desc\": \"Morocco\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MOZ\",\r\n" + 
			"          \"desc\": \"Mozambique\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"MMR\",\r\n" + 
			"          \"desc\": \"Myanmar\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NAM\",\r\n" + 
			"          \"desc\": \"Namibia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NRU\",\r\n" + 
			"          \"desc\": \"Nauru\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NPL\",\r\n" + 
			"          \"desc\": \"Nepal\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NLD\",\r\n" + 
			"          \"desc\": \"Netherlands\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ANT\",\r\n" + 
			"          \"desc\": \"Netherlands Antilles\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NCL\",\r\n" + 
			"          \"desc\": \"New Caledonia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NZL\",\r\n" + 
			"          \"desc\": \"New Zealand\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NIC\",\r\n" + 
			"          \"desc\": \"Nicaragua\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NEG\",\r\n" + 
			"          \"desc\": \"Niger\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NGA\",\r\n" + 
			"          \"desc\": \"Nigeria\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NIU\",\r\n" + 
			"          \"desc\": \"Niue\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NFK\",\r\n" + 
			"          \"desc\": \"Norfolk Island\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"NOR\",\r\n" + 
			"          \"desc\": \"Norway\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"OMN\",\r\n" + 
			"          \"desc\": \"Oman\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PAK\",\r\n" + 
			"          \"desc\": \"Pakistan\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PLW\",\r\n" + 
			"          \"desc\": \"Palau\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PSE\",\r\n" + 
			"          \"desc\": \"Palestinian Territory, Occupied\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PAN\",\r\n" + 
			"          \"desc\": \"Panama (also known as Canal Zone)\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PNG\",\r\n" + 
			"          \"desc\": \"Papua New Guinea\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PRY\",\r\n" + 
			"          \"desc\": \"Paraguay\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PER\",\r\n" + 
			"          \"desc\": \"Peru\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PHL\",\r\n" + 
			"          \"desc\": \"Philippines\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PCN\",\r\n" + 
			"          \"desc\": \"Pitcairn\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"POL\",\r\n" + 
			"          \"desc\": \"Poland\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PRT\",\r\n" + 
			"          \"desc\": \"Portugal\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"PRI\",\r\n" + 
			"          \"desc\": \"Puerto Rico\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"QAT\",\r\n" + 
			"          \"desc\": \"Qatar\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"REU\",\r\n" + 
			"          \"desc\": \"Reunion\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"RUS\",\r\n" + 
			"          \"desc\": \"Russia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ROU\",\r\n" + 
			"          \"desc\": \"Romania\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"RWA\",\r\n" + 
			"          \"desc\": \"Rwanda\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SHN\",\r\n" + 
			"          \"desc\": \"Saint Helena\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"KNA\",\r\n" + 
			"          \"desc\": \"Saint Kitts and Nevis\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"LCA\",\r\n" + 
			"          \"desc\": \"Saint Lucia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SPM\",\r\n" + 
			"          \"desc\": \"Saint Pierre and Miquelon\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"VCT\",\r\n" + 
			"          \"desc\": \"Saint Vincent and the Grenadines\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"WSM\",\r\n" + 
			"          \"desc\": \"Samoa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SMR\",\r\n" + 
			"          \"desc\": \"San Marino\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"STP\",\r\n" + 
			"          \"desc\": \"Sao Tome and Principe\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SAU\",\r\n" + 
			"          \"desc\": \"Saudi Arabia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SEN\",\r\n" + 
			"          \"desc\": \"Senegal\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SYC\",\r\n" + 
			"          \"desc\": \"Seychelles\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SLE\",\r\n" + 
			"          \"desc\": \"Sierra Leone\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SGP\",\r\n" + 
			"          \"desc\": \"Singapore\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SVK\",\r\n" + 
			"          \"desc\": \"Slovakia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SVN\",\r\n" + 
			"          \"desc\": \"Slovenia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SLB\",\r\n" + 
			"          \"desc\": \"Solomon Islands\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SOM\",\r\n" + 
			"          \"desc\": \"Somalia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ZAF\",\r\n" + 
			"          \"desc\": \"South Africa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SGS\",\r\n" + 
			"          \"desc\": \"South Georgia and the South Sandwich Islands\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ESP\",\r\n" + 
			"          \"desc\": \"Spain\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"LKA\",\r\n" + 
			"          \"desc\": \"Sri Lanka\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SDN\",\r\n" + 
			"          \"desc\": \"Sudan\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SUR\",\r\n" + 
			"          \"desc\": \"Suriname\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SJM\",\r\n" + 
			"          \"desc\": \"Svalbard and Jan Mayen\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SWZ\",\r\n" + 
			"          \"desc\": \"Swaziland\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SWE\",\r\n" + 
			"          \"desc\": \"Sweden\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"CHE\",\r\n" + 
			"          \"desc\": \"Switzerland\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"SYR\",\r\n" + 
			"          \"desc\": \"Syrian Arab Republic\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TWN\",\r\n" + 
			"          \"desc\": \"Taiwan, Province of China\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TJK\",\r\n" + 
			"          \"desc\": \"Tajikistan\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TZA\",\r\n" + 
			"          \"desc\": \"Tanzania, United Republic of\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"THA\",\r\n" + 
			"          \"desc\": \"Thailand\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TLS\",\r\n" + 
			"          \"desc\": \"Timor-Leste\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TGO\",\r\n" + 
			"          \"desc\": \"Togo\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TKL\",\r\n" + 
			"          \"desc\": \"Tokelau\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TON\",\r\n" + 
			"          \"desc\": \"Tonga\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TTO\",\r\n" + 
			"          \"desc\": \"Trinidad and Tobago\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TUN\",\r\n" + 
			"          \"desc\": \"Tunisia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TUR\",\r\n" + 
			"          \"desc\": \"Turkey\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TKM\",\r\n" + 
			"          \"desc\": \"Turkmenistan\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TCA\",\r\n" + 
			"          \"desc\": \"Turks and Caicos Islands\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TUV\",\r\n" + 
			"          \"desc\": \"Tuvalu\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"UGA\",\r\n" + 
			"          \"desc\": \"Uganda\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"UKR\",\r\n" + 
			"          \"desc\": \"Ukraine\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ARE\",\r\n" + 
			"          \"desc\": \"United Arab Emirates\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GBR\",\r\n" + 
			"          \"desc\": \"United Kingdom\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"UMI\",\r\n" + 
			"          \"desc\": \"United States Minor Outlying Islands\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"URY\",\r\n" + 
			"          \"desc\": \"Uruguay\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"UZB\",\r\n" + 
			"          \"desc\": \"Uzbekistan\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"VUT\",\r\n" + 
			"          \"desc\": \"Vanuatu\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"VEN\",\r\n" + 
			"          \"desc\": \"Venezuela\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"VNM\",\r\n" + 
			"          \"desc\": \"Viet Nam\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"VGB\",\r\n" + 
			"          \"desc\": \"Virgin Islands, British\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"VIR\",\r\n" + 
			"          \"desc\": \"Virgin Islands, US\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"WLF\",\r\n" + 
			"          \"desc\": \"Wallis and Futuna\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ESH\",\r\n" + 
			"          \"desc\": \"Western Sahara\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"YEM\",\r\n" + 
			"          \"desc\": \"Yemen\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"YU\",\r\n" + 
			"          \"desc\": \"Yugoslavia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ZMB\",\r\n" + 
			"          \"desc\": \"Zambia\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"ZWE\",\r\n" + 
			"          \"desc\": \"Zimbabwe\"\r\n" + 
			"        }\r\n" + 
			"      ]\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"M_VISA_TYPES\": [\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"B1\",\r\n" + 
			"          \"desc\": \"B-1 Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"B11\",\r\n" + 
			"          \"desc\": \"business\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"E1\",\r\n" + 
			"          \"desc\": \"E-1 Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"E2\",\r\n" + 
			"          \"desc\": \"E-2 Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"EB5\",\r\n" + 
			"          \"desc\": \"EB-5 Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"EB1_1\",\r\n" + 
			"          \"desc\": \"EB1-1 Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"EB1_2\",\r\n" + 
			"          \"desc\": \"EB1-2 Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"EB1_3\",\r\n" + 
			"          \"desc\": \"EB1-3 Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"EB2_1\",\r\n" + 
			"          \"desc\": \"EB2-1 Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"EB2_2\",\r\n" + 
			"          \"desc\": \"EB2-2 Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"EB3_1\",\r\n" + 
			"          \"desc\": \"EB3-1 Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"EB3_2\",\r\n" + 
			"          \"desc\": \"EB3-2 Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"F1\",\r\n" + 
			"          \"desc\": \"F-1 Student Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"GC\",\r\n" + 
			"          \"desc\": \"Green Card\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"H1B\",\r\n" + 
			"          \"desc\": \"H-1B Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"J1\",\r\n" + 
			"          \"desc\": \"J-1 Exchange Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"K1\",\r\n" + 
			"          \"desc\": \"K-1 Fiance Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"L1\",\r\n" + 
			"          \"desc\": \"L-1 Visas\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"O1\",\r\n" + 
			"          \"desc\": \"O-1 Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"Q\",\r\n" + 
			"          \"desc\": \"Q Visa\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"          \"code\": \"TN\",\r\n" + 
			"          \"desc\": \"TN Visa\"\r\n" + 
			"        }\r\n" + 
			"      ]\r\n" + 
			"    }\r\n" + 
			"  ]\r\n" + 
			"}";

}
