package ch.vorburger.learn.osgi2;

import ch.vorburger.learn.osgi2.internal.PrivateParts;

public class PublicThingInOSGi2 {

	public static String hallo() {
		return new PrivateParts().message();
	}
	
}
