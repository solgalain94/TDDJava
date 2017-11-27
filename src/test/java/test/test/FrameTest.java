package test.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FrameTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void intentoTest() {
		Frame fr= new Frame();
		fr.sumarPuntaje(3,5);
		assertEquals(8,fr.getPuntos());
	}
}
