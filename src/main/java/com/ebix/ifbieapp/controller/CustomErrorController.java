package com.ebix.ifbieapp.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.ebix.ifbieapp.model.ErrorJson;

/*
 * this is a REST controller (see annotation at top of class). 
 * So the ErrorJson instance is returned as the HTTP response body. 
 * No View or template is used.
 * 
 * @author Arun prasath
 * @since 21.03.2018
 * 
 * Ref:https://gist.github.com/jonikarppinen/662c38fb57a23de61c8b
 */

@RestController
public class CustomErrorController implements ErrorController {

	private static final String PATH = "/error";

	private boolean debug;

	@Autowired
	private ErrorAttributes errorAttributes;

	@RequestMapping(value = PATH)
	ErrorJson error(HttpServletRequest request, HttpServletResponse response) {
		// Appropriate HTTP response code (e.g. 404 or 500) is automatically set by
		// Spring.
		// Here we just define response body.
		return new ErrorJson(response.getStatus(), getErrorAttributes(request, debug));
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}

	private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
		RequestAttributes requestAttributes = new ServletRequestAttributes(request);
		return errorAttributes.getErrorAttributes(requestAttributes, includeStackTrace);
	}

}
