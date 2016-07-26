package com.dallas.timeanddate;


import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class TimeAndDateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Clock clock = Clock.systemDefaultZone();
         System.out.println("clock is "+ clock.millis());
         
         Instant instant = clock.instant();
         System.out.println("current instant is "+ instant);
         
         Date date = Date.from(instant);
         System.out.println(date);
         
         
         
         LocalDate localDate = LocalDate.now();
         System.out.println("local date is "+ localDate);
	
	      LocalDateTime localDateTime = LocalDateTime.now();
	      System.out.println("local time and date"+ localDateTime);
	      
	      ZoneOffset offset = ZoneOffset.of("+05:30");
	      OffsetDateTime ofsetdate = OffsetDateTime.of(localDateTime, offset);
	      System.out.println("off set is "+ ofsetdate);
	      
	      
	
	
	}
	
	

}
