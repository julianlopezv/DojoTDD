package co.edu.udea.apps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.edu.udea.app.CodeBreaker;

public class CodeBreakerTest {

	CodeBreaker c = new CodeBreaker();
	String r;
	
	//adivinar 4381
	@Test
	public void adivinar4381() {
		r = c.adivinar(4381);
		assertEquals("XXXX",r);
	}
	
	@Test
	public void adivinar6721() {
		r = c.adivinar(6721);
		assertEquals("X",r);
	}
	
	@Test
	public void adivinar6782() {
		r = c.adivinar(6782);
		assertEquals("X",r);
	}
	
	@Test
	public void adivinar4762() {
		r = c.adivinar(4762);
		assertEquals("X",r);
	}
	
	@Test
	public void adivinar4782() {
		r = c.adivinar(4782);
		assertEquals("XX",r);
	}
	
	@Test
	public void adivinar1438() {
		r = c.adivinar(1438);
		assertEquals("____",r);
	}
	
	@Test
	public void adivinar4318() {
		r = c.adivinar(1438);
		assertEquals("XX__",r);
	}
	
	
}
