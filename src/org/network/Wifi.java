package org.network;

public class Wifi {

	
	public void wifiName() {
		
		System.out.println("No Internet");

	}
	
	public static void main(String[] args) {
		Wifi w = new Wifi();
		w.wifiName();
		MobileData m = new MobileData();
		m.dataName();
		Lan l = new Lan();
		l.lanname();
		Wireless wi = new Wireless();
		wi.modamName();
	}
}

