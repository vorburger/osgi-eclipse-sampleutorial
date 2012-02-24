package ch.vorburger.learn.osgi1;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import ch.vorburger.learn.osgi2.PublicThingInOSGi2;

public class Activator implements BundleActivator {

	private static boolean isRunning = false;

	public static boolean isRunning() {
		return isRunning ;
	}
	
	public void start(BundleContext context) throws Exception {
		isRunning = true;
		System.out.println("Hello World!! And that's from another plug-in: " + PublicThingInOSGi2.hallo());
	}
	
	public void stop(BundleContext context) throws Exception {
		isRunning = false;
		System.out.println("Goodbye World!!");
	}

}
