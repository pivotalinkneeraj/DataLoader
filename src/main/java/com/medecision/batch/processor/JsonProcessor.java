package com.medecision.batch.processor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.medecision.batch.dvo.GenericData;

public class JsonProcessor implements ItemProcessor<Object, Object>{
	private static final Logger log = LoggerFactory.getLogger(JsonProcessor.class);
	private String commandLineParam = null;
	
	public String getCommandLineParam() {
		return commandLineParam;
	}

	public void setCommandLineParam(String commandLineParam) {
		this.commandLineParam = commandLineParam;
	}

	@Override
	public Object process(Object inboundItems) throws Exception {
		@SuppressWarnings("unchecked")
		GenericData genericData = new GenericData();
		HashMap<String, Object> castedItem = (LinkedHashMap<String, Object>)inboundItems;
		HashMap<String, Object> outboundItems = new LinkedHashMap<String, Object>();
		castedItem.forEach((key, value) -> log.info("Key:"+key, "Value:"+value));
		//castedItem.forEach((key, value) -> new GenericData((String)value));
		for (Map.Entry<String, Object> entry : castedItem.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    outboundItems.put(key, value);
		    genericData.setJson_doc((String)value);
		}
		log.info("Command line param:"+commandLineParam);
		return genericData;
	}
}
