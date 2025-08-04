package com.example.tight;

public class CoffeeMaker {
//	private EspressoMachine espressoMachine;
	private DripCoffeeMachine dripCoffeeMachine;
	
	public CoffeeMaker() {
		//this.espressoMachine = new EspressoMachine();
		this.dripCoffeeMachine = new DripCoffeeMachine();
	}
	
	public void makeCoffee() {
		System.out.println(dripCoffeeMachine.brew());
	}
}
