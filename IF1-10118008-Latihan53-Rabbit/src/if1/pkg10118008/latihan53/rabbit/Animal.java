/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan53.rabbit;

/**
 *
 * @author ASUS
 */
public class Animal {
	protected boolean vegetarian;
	protected String eats;
	protected int noOfLegs;



	public Animal(boolean vegetarian, String food, int legs){
		this.vegetarian = vegetarian;
		this.eats = food;
		this.noOfLegs = legs;
	}
	
	public boolean isVegetarian(){
		return this.vegetarian;
	}

	public String getEats(){
		return this.eats;
	}

	public int getNoOfLegs(){
		return this.noOfLegs;
	}
}
