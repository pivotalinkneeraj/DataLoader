package com.medecision.batch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.medecision.batch.dvo.GenericData;

public class ClaimProcessor implements ItemProcessor<Object, Object> {

	private static final Logger log = LoggerFactory.getLogger(ClaimProcessor.class);

	@Override
	public Object process(Object inboundItems) throws Exception {
		//log.info("Casting item##:"+ inboundItems.toString());
		GenericData genericData = new GenericData((String)inboundItems);
		//List dataList = new LinkedList();
		//dataList.add(genericData);
		//log.info("In ClaimProcessor: "+genericData.toString());
		return genericData;
	}
	
	

}
