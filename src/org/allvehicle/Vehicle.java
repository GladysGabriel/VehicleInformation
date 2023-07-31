package org.allvehicle;
import org.twowheeler.TwoWheeler;
import org.threewheeler.ThreeWheeler;
import org.fourwheeler.FourWheeler;
public class Vehicle {
    private void vehicleNecessary() {
		System.out.println("Yes need Vehicles");
	}
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		TwoWheeler tw= new TwoWheeler();
		ThreeWheeler thw= new ThreeWheeler();
		FourWheeler fw= new FourWheeler();
		v.vehicleNecessary();
		tw.bike();
		tw.cycle();
		thw.auto();
		fw.car();
		fw.bus();
		fw.lorry();
	}	
}
