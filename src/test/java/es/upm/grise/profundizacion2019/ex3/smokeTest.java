package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;

public class smokeTest {
	MyClass my;
	DateTimeFormatter formatter;
	
	@Before
	public void setUp() {
		my = new MyClass();
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
	}
	
	@Test
	public void stateTest() {
		//Time time = new Time();
		long SECONDS = 120;
		LocalDateTime CORRECT_INCREMENT = LocalDateTime.of(2020,1,1,0,2,0,0);
		assertEquals("Correcto: se añaden 120 segundos a la fecha",formatter.format(CORRECT_INCREMENT),Time.getFutureTime(SECONDS));
	}
	
}
