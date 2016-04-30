package co.edu.udea.apps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.edu.udea.app.CodeBreaker;

public class CodeBreakerTest {

	
	//adivinar 4381
	@Test
	public void adivinar4381() {
		CodeBreaker c = new CodeBreaker();
		String r = c.adivinar(4381);
		assertEquals("XXXX",r);
	}
	
	@Test
	public void adivinar1234() {
		CodeBreaker c = new CodeBreaker();
		String r = c.adivinar(6721);
		assertEquals("X",r);
	}
}
