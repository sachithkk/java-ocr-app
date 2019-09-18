package com.self.test.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OcrResponse  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7267540793369634554L;

	private String response;

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
}
