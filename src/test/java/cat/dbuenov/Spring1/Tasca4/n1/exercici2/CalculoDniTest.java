package cat.dbuenov.Spring1.Tasca4.n1.exercici2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CalculoDniTest {
	
	@Parameters
	public static Iterable<Object> getData(){
		List<Object> obj = new ArrayList<>();
		obj.add(new Object[] {46699243, 'C'});
		obj.add(new Object[] {46702249, 'J'});	
		obj.add(new Object[] {49463367, 'G'});	
		obj.add(new Object[] {49457267, 'E'});
		obj.add(new Object[] {73324262, 'D'});
		obj.add(new Object[] {14690202, 'X'});	
		obj.add(new Object[] {99397745, 'W'});	
		obj.add(new Object[] {12345678, 'Z'});
		obj.add(new Object[] {76960385, 'Q'});
		obj.add(new Object[] {87009119, 'G'});
			
		return obj;
	}
	
	private int numero;
	private char letraEsperada;
	
	public CalculoDniTest(int numero, char letraEsperada) {
		this.numero = numero;
		this.letraEsperada = letraEsperada;
	}
	
	@Test
	public void testLetraDni() {
		CalculoDni calculoDni = new CalculoDni(this.numero);
		char letra = calculoDni.getLetraDNI();
		assertEquals(this.letraEsperada, letra);
	}

}
