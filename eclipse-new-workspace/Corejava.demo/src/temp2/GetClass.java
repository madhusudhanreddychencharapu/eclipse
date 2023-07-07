package temp2;

import javax.xml.catalog.Catalog;

public class GetClass {

	public static void main(String[] args) {
		Cat c=new Cat("Tom",15);
		System.out.println(c.weight);
		
		Class B=c.getClass();
		System.out.println();

	}

}
class Cat{
	String colour;
	int weight;
	
	public Cat(String Colour,int weight) {
		this.colour=colour;
		this.weight=weight;
	}
	public String getCatColour() {
		return colour;
	}
	public int getCatWeight() {
		return weight;
	}
}
