package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.water;

public class Transport implements Air,water,Road {
	
	
	private void TransportForm() {
		System.out.println("Transport System");
	}

	@Override
	public void bike() {
		// TODO Auto-generated method stub
		System.out.println("Yamaha");
	}

	@Override
	public void cycle() {
		// TODO Auto-generated method stub
		System.out.println("Bicycle");
	}

	@Override
	public void bus() {
		// TODO Auto-generated method stub
		System.out.println("Public Bus");
	}

	@Override
	public void car() {
		// TODO Auto-generated method stub
		System.out.println("Maruti");
	}

	@Override
	public void boat() {
		// TODO Auto-generated method stub
		System.out.println("Boat House");
	}

	@Override
	public void ship() {
		// TODO Auto-generated method stub
		System.out.println("Ship Carriage");
	}

	@Override
	public void aeroPlane() {
		// TODO Auto-generated method stub
		System.out.println("Indigo Airline");
	}

	@Override
	public void heliCopter() {
		// TODO Auto-generated method stub
		System.out.println("Helipad");
	}
	
	public static void main(String[] args) {
		Transport t = new Transport();
		t.aeroPlane();
		t.bike();
		t.boat();
		t.bus();
		t.car();
		t.cycle();
		t.ship();
		t.TransportForm();
		t.heliCopter();
	}
}
