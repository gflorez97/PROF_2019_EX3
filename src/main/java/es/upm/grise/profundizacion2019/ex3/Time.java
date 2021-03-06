package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	
	public String getFutureTime(long seconds) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime time = LocalDateTime.of(2020,1,1,0,0,0,0);
		time = time.plusSeconds(seconds);
		return formatter.format(time);	
	}

}
