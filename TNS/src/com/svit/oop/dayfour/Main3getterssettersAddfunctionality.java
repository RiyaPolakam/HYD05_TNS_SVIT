package com.svit.oop.dayfour;

public class Main3getterssettersAddfunctionality {
	public static void main(String[] args) {
		Car3getterssetterAddfunctionality car = new Car3getterssetterAddfunctionality ();
		car.setSpeed (10);
		car.setDoors ("closed");
		car.setEngine ("on");
		car.setDrivers ("seated");
		//calling the function
		System.out.println (car.run());
	}

}
