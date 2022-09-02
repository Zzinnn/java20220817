package ch08.book.exercise.s080503;

import ch08.book.exercise.s080502.Tire;

public class Car {
	Tire[] tires = {
			new HankoookTire(),
			new HankoookTire(),
			new HankoookTire(),
			new HankoookTire()
	};
	
	void run() {
		for (Tire tire : tires) {
			tire.roll();
		}
	}
}
