package ch.vorburger.learn.osgi1.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import ch.vorburger.learn.osgi2.PublicThingInOSGi2;

public class PublicThingsTest {

	// NOTE: You can run this as a plain-old JUnit Test...
	
	@Test
	public void testMessage() {
		assertEquals("Saluton!", PublicThingInOSGi2.hallo());
		// BUT we can't access PrivateParts - would have to make a fragment for osgi2
	}

	@Test
	public void testFailing() {
		fail("Boo!");
	}

}
