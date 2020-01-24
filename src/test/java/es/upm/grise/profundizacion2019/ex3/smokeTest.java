package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
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
		Time time = new Time();
		long SECONDS = 120;
		LocalDateTime CORRECT_INCREMENT = LocalDateTime.of(2020,1,1,0,2,0,0);
		assertEquals("Correcto: se añaden 120 segundos a la fecha",formatter.format(CORRECT_INCREMENT),time.getFutureTime(SECONDS));
	}
	
	@Test
	public void interactionTest() {
		//Se crea el mock de Time
		Time timeMock = mock(Time.class);
		long SECONDS = 120;
		
		//	Con las siguientes 2 líneas, que no serían necesarias, el print devolvería el valor correcto en vez de null.
		//	Como a efecto de este test lo que importa es la interacción, se omiten.
		//Time time = new Time();
		//when(timeMock.getFutureTime(SECONDS)).thenReturn(time.getFutureTime(SECONDS));
		my.nextTime(timeMock, SECONDS);
		
		verify(timeMock, times(1)).getFutureTime(SECONDS);
	}
	
}
