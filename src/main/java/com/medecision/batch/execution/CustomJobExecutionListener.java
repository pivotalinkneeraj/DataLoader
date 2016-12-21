package com.medecision.batch.execution;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component
public class CustomJobExecutionListener extends JobExecutionListenerSupport {
	private static final Logger log = LoggerFactory.getLogger(CustomJobExecutionListener.class);
	Instant start = null;
	Instant complete = null;


	@Override
	public void afterJob(JobExecution jobExecution) {
		if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
			complete = Instant.now();
			log.info("Completed loader batch job at:"+ complete);
			log.info("Total Duration of loader batch job :"+ Duration.between(complete, start));
		}
	}
	
	@Override
	public void beforeJob(JobExecution jobExecution) {
		if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
			start = Instant.now();
			log.info("Started loader batch job at:"+ start);
		}
	}
}
