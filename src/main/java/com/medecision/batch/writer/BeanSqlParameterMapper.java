package com.medecision.batch.writer;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

//import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.medecision.batch.dvo.GenericData;



public class BeanSqlParameterMapper extends BeanPropertyItemSqlParameterSourceProvider<Object> {
	private static final Logger log = LoggerFactory.getLogger(BeanSqlParameterMapper.class);
	@Override
    public SqlParameterSource createSqlParameterSource(Object item) {
		log.info("##################This is sql param mapper:"+item);

		return new MapSqlParameterSource()
                //.addValue("id", castedItem.get("_id"))
                .addValue("json_doc", ((GenericData)item).getJson_doc());               
    }
	


}
