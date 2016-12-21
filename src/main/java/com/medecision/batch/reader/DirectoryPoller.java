package com.medecision.batch.reader;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.filters.FileListFilter;


public class DirectoryPoller extends FileReadingMessageSource {
	private static final Logger log = LoggerFactory.getLogger(DirectoryPoller.class);
	
	public void	setDirectory(File directory){
		super.setDirectory(directory);
	}
	
	public void	setFilter(FileListFilter<File> filter){
		super.setFilter(filter);
	}
	
	

}
