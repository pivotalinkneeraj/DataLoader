package com.medecision.batch.execution;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.batch.core.JobParameter;

public class AppRunner {
  //Put logic to run n number of job at a time
  //Each job should have separate log
  //Job should mark file as in process and complete	
  //At start it should scan directory to get file list
  //On completion of an execution next job will be launched	
  private static final Logger log = LoggerFactory.getLogger(AppRunner.class);
  public static void main(String[] args) {
	try {
		Map<String,JobParameter> parameters = new HashMap<String,JobParameter>();
		String[] springConfig  =
		{	"spring.xml"
		};
		for(String arg : args){
			String[] pair= arg.split("=");
			parameters.put(pair[0], new JobParameter(pair[1]));
		}
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("reportJob");
		JobExecution execution = jobLauncher.run(job, new JobParameters(parameters));
		
		//JobLauncher jobLauncher =  context.getBean("jobLauncher");
		
		log.info("Exit Status : " + execution.getStatus());

	} catch (Exception e) {
		e.printStackTrace();
	}

	log.info("Done");

  }
}