package com.medecision.batch.execution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.boot.SpringApplication;
import org.springframework.integration.file.FileReadingMessageSource;

//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class AppRunnerPartial{

		public static void main(String[] args) throws Exception {
			String[] springConfig  =
				{	"spring.xml"
				};

			ApplicationContext context =
				new ClassPathXmlApplicationContext(springConfig);
			
			FileReadingMessageSource fileReadingMessageSource = (FileReadingMessageSource)context.getBean("directoryScanner");
			fileReadingMessageSource.start();
		}
}