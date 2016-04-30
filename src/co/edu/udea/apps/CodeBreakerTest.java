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
	public void adivinar6721() {
		CodeBreaker c = new CodeBreaker();
		String r = c.adivinar(6721);
		assertEquals("X",r);
	}
	
	@Test
	public void adivinar6782() {
		CodeBreaker c = new CodeBreaker();
		String r = c.adivinar(6782);
		assertEquals("X",r);
	}
	
	@Test
	public void adivinar4762() {
		CodeBreaker c = new CodeBreaker();
		String r = c.adivinar(4762);
		assertEquals("X",r);
	}
}
