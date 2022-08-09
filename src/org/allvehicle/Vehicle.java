package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle{

	private void VehicleNecessery() {
	System.out.println("Printing the following Vehicle");

	}
	
	public static void main(String[] args) {
		Vehicle v =new Vehicle();
		v.VehicleNecessery();
		TwoWheller t = new TwoWheller();
		t.bike();
		t.cycle();
		ThreeWheeler th = new ThreeWheeler();
		th.Auto();
		FourWheeler f = new FourWheeler();
		f.car();
		f.bus();
		f.lorry();
				
	}
}
