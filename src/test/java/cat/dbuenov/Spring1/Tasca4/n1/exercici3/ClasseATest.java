package cat.dbuenov.Spring1.Tasca4.n1.exercici3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClasseATest {

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testExcepcion() {
		ClasseA classe = new ClasseA();
		classe.creaExcepcio();		
	}

}
