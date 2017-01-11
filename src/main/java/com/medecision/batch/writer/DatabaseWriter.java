package com.medecision.batch.writer;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.database.ItemSqlParameterSourceProvider;

import com.medecision.batch.dvo.GenericData;

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
	public void setSql(java.lang.String inSql){
		this.sql = (String)sqlMap.get(fileType);
		log.info("Setting sql: "+sql);
		if(sql==null){
			this.sql=inSql;
		}
		super.setSql(sql);
	}
	
	@Override
	public void write(java.util.List items) throws Exception{
		String sql = (String)sqlMap.get(fileType);
		Instant timestamp1 = Instant.now();
		log.info("Starting database operation for sql:"+ sql +" at "+ timestamp1);
		//log.info("##########Now inserting"+items.get(0));
		if(sql==null || sql.startsWith("select")){
			return;
		}
		else{
			super.write(items);		
		}
		Instant timestamp2 = Instant.now();
		log.info("Finished database operation for sql:"+ sql +" at "+ timestamp2);
		log.info("Duration for sql:"+ sql + " number of iterations:" +items.size()+ " was:"+ Duration.between(timestamp2, timestamp1));
	}
	
}
