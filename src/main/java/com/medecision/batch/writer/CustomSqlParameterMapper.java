package com.medecision.batch.writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.database.ItemSqlParameterSourceProvider;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class CustomSqlParameterMapper implements ItemSqlParameterSourceProvider{
	private static final Logger log = LoggerFactory.getLogger(CustomSqlParameterMapper.class);	
	@Override
	public SqlParameterSource createSqlParameterSource(Object item) {
		log.info("This is custom mapper"+item);
		return null;
	}

}
