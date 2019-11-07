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
public class IF110118008Latihan53Rabbit {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Rabbit rbt = new Rabbit("Peter", false, "grass", 4, "grey");
		System.out.println("Hello, His name is "+ rbt.getName());
		System.out.println("Peter is Vegetarian? "+ rbt.isVegetarian());
		System.out.println("Peter eats "+rbt.getEats());
		System.out.println("Peter has " + rbt.getNoOfLegs() + " legs.");
		System.out.println("Peter Color is "+ rbt.getColor());

	}
	
}
