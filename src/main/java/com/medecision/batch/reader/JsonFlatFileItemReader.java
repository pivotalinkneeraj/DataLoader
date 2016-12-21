/**
 * 
 */
package com.medecision.batch.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.JsonLineMapper;
import java.lang.StringBuffer;
import java.time.Instant;

public class JsonFlatFileItemReader<T> extends FlatFileItemReader<java.lang.String> {
	private static final Logger log = LoggerFactory.getLogger(JsonFlatFileItemReader.class);
	
	public JsonFlatFileItemReader(){
		log.info("Starting loader batch job at:"+ Instant.now());
	}
	
	@Override
	public String doRead() throws Exception{
		String nextLine = (String) super.doRead();		
		String strippedLine= cleanUpData(nextLine);
		//log.info("Cleaned up next line ="+strippedLine);
		return strippedLine;		
	}
	
	public String cleanUpData(String input){
		String output = null;
		if(isLastCharacter(input, ",")){
			//log.info("passed isLastCharacter");
			output = this.replaceLastCharacter(input, "," ,"");
		} 
		//output = removeCharacter(output, "[", "");
		//output = removeCharacter(output, "]", "");
		return output;
	}
	
	private boolean isLastCharacter(String input, String toCheck){
		return (input.endsWith(toCheck));
	}
	
	private boolean containsCharacter(String input, String toCheck){
		return (input.contains(toCheck));
	}
	
	private String removeCharacter(String input, String toReplace, String replacement){
		return (input.replace(toReplace, replacement));
	}
	
	private String replaceLastCharacter(String input, java.lang.String replaceThis, java.lang.String replaceWith){
		StringBuffer buffer = new StringBuffer(input);
		String temp = buffer.reverse().toString().replaceFirst(replaceThis,replaceWith);
		temp = new StringBuffer(temp).reverse().toString();
		return temp;
	}

}
