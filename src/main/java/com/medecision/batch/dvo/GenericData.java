package com.medecision.batch.dvo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenericData {
	private static final Logger log = LoggerFactory.getLogger(GenericData.class);	
	private Map<String, Object> json_map = new HashMap<String, Object>();

	private String json_doc;
	private String claimNumber;
	private String baseKey;
	private String claimLineNumber;
	
	public GenericData(String json_doc){
		setJson_doc(json_doc);
		log.info("json_doc is:"+json_doc);
		if(json_map.get("claimNumber")!=null){
			this.claimNumber=(String)json_map.get("claimNumber");
		}
		if(json_map.get("baseKey")!=null){
			this.baseKey=(String)json_map.get("baseKey");
		}
		if(json_map.get("claimLineNumber")!=null){
			this.claimLineNumber=(String)json_map.get("claimLineNumber").toString();
		}
	}

	public GenericData() {
	}
	
	public String getClaimLineNumber() {
		return claimLineNumber;
	}

	public void setClaimLineNumber(String claimLineNumber) {
		this.claimLineNumber = claimLineNumber;
	}
	
	public Map<String, Object> getJson_map() {
		return json_map;
	}

	public void setJson_map(Map<String, Object> json_map) {
		this.json_map = json_map;
	}

	public String getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public String getBaseKey() {
		return baseKey;
	}

	public void setBaseKey(String baseKey) {
		this.baseKey = baseKey;
	}

	public String getJson_doc() {
		return json_doc;
	}

	public void setJson_doc(String json_doc) {
		this.json_doc = json_doc;
		this.json_map = extractAsJson(json_doc);
	}
	
	public Map<String, Object> extractAsJson(String input){
		Map<String, Object> json_map_temp = null;
		try {
			json_map_temp = new ObjectMapper().readValue(input, new TypeReference<Map<String, Object>>(){});
		} catch (IOException e) {
			log.error("Exception",e);
		}
		return json_map_temp;
	}

	@Override
	public String toString() {
		return "GenericData [json_map=" + json_map + ", json_doc=" + json_doc + ", claimNumber=" + claimNumber
				+ ", baseKey=" + baseKey + "]";
	}	

	
	
}
