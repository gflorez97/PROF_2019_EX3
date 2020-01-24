package es.upm.grise.profundizacion2019.ex3;

public class MyClass {
	
	public void nextTime(Time time, long seconds) {
		String next = time.getFutureTime(seconds);
		System.out.println(next);
	}

}
