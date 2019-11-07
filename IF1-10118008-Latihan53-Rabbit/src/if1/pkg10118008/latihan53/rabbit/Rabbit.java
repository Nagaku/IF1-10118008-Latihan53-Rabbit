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
public class Rabbit extends Animal {
	private String color, name;	

	public Rabbit(String name, boolean veg, String food, int legs, String color){
		super( veg,  food,  legs);
		this.noOfLegs = legs;
		this.color = color;
	}

	public String getColor(){
		return this.color;
	}

	public String getName(){
		return this.name;
	}
}
