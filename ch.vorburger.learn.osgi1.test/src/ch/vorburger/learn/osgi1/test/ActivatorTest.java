package ch.vorburger.learn.osgi1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.vorburger.learn.osgi1.Activator;

public class ActivatorTest {

	@Test
	public void testActivator() {
		assertTrue(Activator.isRunning());
	}

}
