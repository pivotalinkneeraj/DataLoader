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
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.database.ItemSqlParameterSourceProvider;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.medecision.batch.dvo.GenericData;

public class DatabaseMemberValidator<Object> implements ItemProcessor<Object, Object>{
	private static final Logger log = LoggerFactory.getLogger(DatabaseMemberValidator.class);	
	private String fileType = null;
	private Map<String, String> sqlMap = null;
	private String sql = null;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
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
	
	public void setSql(java.lang.String inSql){
		this.sql = (String)sqlMap.get(fileType);
		log.info("Setting sql: "+sql);
		if(sql==null){
			this.sql=inSql;
		}
	}	
	
	@Override
	public Object process(Object item) throws Exception{
		Instant timestamp1 = Instant.now();
		List fileteredList = new ArrayList();
		String sql = (String)sqlMap.get(fileType);
		if(sql!=null && !sql.startsWith("blank")){
			timestamp1 = Instant.now();
			//log.info("Starting database validation for sql:"+ sql +" at "+ timestamp1);		
			boolean isValid=isValid((GenericData)item);
			//Instant timestamp2 = Instant.now();
			//log.info("Finished database operation for sql:"+ sql +" at "+ timestamp2);
			//log.info("isValid returned:"+isValid+" for " +item);
			if(isValid){
				//log.info("Validated Item"+item);
				return item;
			}	
			else{
				//log.warn("Invalid member data:"+item);
				return null;
			}				
		}	
		return null;
	}
	
	private boolean isValid(GenericData item){
		Map<String,String>  paramMap = new HashMap<String,String> ();
		paramMap.put("memberId", item.getMemberId());
		Class<Integer> integer = Integer.class;
		//log.info("Null Checking:"+sql+","+namedParameterJdbcTemplate+","+paramMap+","+integer);
		Integer count = namedParameterJdbcTemplate.queryForObject(sql, paramMap , integer);
		return count.intValue()>0;
	}


	
}
