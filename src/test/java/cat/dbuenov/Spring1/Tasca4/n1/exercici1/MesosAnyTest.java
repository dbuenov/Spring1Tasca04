package cat.dbuenov.Spring1.Tasca4.n1.exercici1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MesosAnyTest {

	@Test
	public void testTamany() {
		MesosAny mesos = new MesosAny();
		assertEquals(12, mesos.getMesos().size());
		
	}
	
	@Test
	public void testNoNula() {
		MesosAny mesos = new MesosAny();
		assertNotNull(mesos.getMesos());
	}
	
	@Test
	public void testAgost() {
		MesosAny mesos = new MesosAny();
		assertEquals("agost", mesos.getMesos().get(7).getName());
		
	}

}
