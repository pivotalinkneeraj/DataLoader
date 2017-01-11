package com.medecision.batch.writer;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.database.ItemSqlParameterSourceProvider;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;

import com.medecision.batch.dvo.GenericData;

public class DatabaseProviderValidator<Object> extends org.springframework.batch.item.database.JdbcBatchItemWriter{
	private static final Logger log = LoggerFactory.getLogger(DatabaseProviderValidator.class);	
	private String fileType = null;
	private Map<String, String> sqlMap = null;
	private String sql = null;
	private NamedParameterJdbcOperations jdbcTemplate;
	
	public NamedParameterJdbcOperations getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(NamedParameterJdbcOperations jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String getFileType() {
		return fileType;
	}
	
	public Map<String, String> getSqlMap() {
		return sqlMap;
	}
	
	public void setSqlMap(Map<String, String> sqlMap) {
		this.sqlMap = sqlMap;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;		
	}
	
	@Override
	public void setItemSqlParameterSourceProvider(ItemSqlParameterSourceProvider itemSqlParameterSourceProvider){
		super.setItemSqlParameterSourceProvider(itemSqlParameterSourceProvider);
	}
	
	@Override
	public void setSql(java.lang.String sql){
		sql = (String)sqlMap.get(fileType);
		super.setSql(sql);
	}	
	
	@Override
	public void write(List items) throws Exception{
		Instant timestamp1 = null;
		List fileteredList = new ArrayList();
		String sql = (String)sqlMap.get(fileType);
		if(sql!=null){
			timestamp1 = Instant.now();
			log.info("Starting database operation for sql:"+ sql +" at "+ timestamp1);
			//log.info("########
			for(java.lang.Object item : items){
				if(isValid((GenericData)item)){
					fileteredList.add(item);
				}	
			}	
			super.write(fileteredList);
		}
		else{
			timestamp1 = Instant.now();
			log.info("Starting database operation for sql:"+ sql +" at "+ timestamp1);
			//log.info("##########Now inserting"+items.get(0));
			super.write(items);
		}				
		Instant timestamp2 = Instant.now();
		log.info("Finished database operation for sql:"+ sql +" at "+ timestamp2);
		log.info("Duration for sql:"+ sql + " number of iterations:" +items.size()+ " was:"+ Duration.between(timestamp2, timestamp1));
	}
	
	private boolean isValid(GenericData item){
		Map<String,String>  paramMap = new HashMap<String,String> ();
		paramMap.put("provider", item.getProviderId());
		Class<Integer> integer = Integer.class;
		Integer count = jdbcTemplate.queryForObject(sql, paramMap , integer);
		return count.intValue()>0;
	}
	
}
