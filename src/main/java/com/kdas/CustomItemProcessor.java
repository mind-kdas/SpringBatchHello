package com.kdas;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.batch.item.ItemProcessor;
 
public class CustomItemProcessor implements ItemProcessor<HelloRecord, HelloRecord> {
 

	public HelloRecord process(HelloRecord item) throws Exception {
 
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		//do not include for older than this date
		Date expireDate = dateFormat.parse("01/01/2000");
		//FAIL for older than this date
		Date failDate = dateFormat.parse("01/01/2010");
		
		System.out.println("Processing..." + item);
		if (item.getDate().before(expireDate)){
			return null;
		} else if (item.getDate().before(failDate)){
			item.setStatus("FAIL");
		}
		return item;
	}
 
}