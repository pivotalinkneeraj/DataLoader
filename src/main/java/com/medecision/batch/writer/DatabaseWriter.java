package com.medecision.batch.writer;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.database.ItemSqlParameterSourceProvider;

public class DatabaseWriter<Object> extends org.springframework.batch.item.database.JdbcBatchItemWriter{
	private static final Logger log = LoggerFactory.getLogger(DatabaseWriter.class);	
	private String fileType = null;
	private Map<String, String> sqlMap = null;
	private String sql = null;
	
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
	public void write(java.util.List items) throws Exception{
		String sql = (String)sqlMap.get(fileType);
		Instant timestamp1 = Instant.now();
		log.info("Starting database operation for sql:"+ sql +" at "+ timestamp1);
		super.write(items);
		Instant timestamp2 = Instant.now();
		log.info("Finished database operation for sql:"+ sql +" at "+ timestamp2);
		log.info("Duration for sql:"+ sql + " number of iterations:" +items.size()+ " was:"+ Duration.between(timestamp2, timestamp1));
	}
	
}
