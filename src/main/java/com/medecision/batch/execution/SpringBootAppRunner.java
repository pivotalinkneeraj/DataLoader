package com.medecision.batch.execution;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppRunner {
  //private static final Logger log = LoggerFactory.getLogger(SpringBootAppRunner.class);
  public static void main(String[] args) {
   try{
	  SpringApplication.run(org.springframework.batch.core.launch.support.CommandLineJobRunner.class, args);

	} catch (Exception e) {
		e.printStackTrace();
	}

	//log.info("Done");

  }
}
