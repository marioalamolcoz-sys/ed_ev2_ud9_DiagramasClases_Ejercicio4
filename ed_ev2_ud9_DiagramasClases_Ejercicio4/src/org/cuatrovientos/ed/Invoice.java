package org.cuatrovientos.ed;

import java.util.ArrayList;

public class Invoice {
	ArrayList<Product> products = new ArrayList <Product>();
	
	Invoice(String name){
		new Custumer(name);
		
	}
	public void add(Product p) {
		this.products.add(p);
		
	}
	public void remove(int index) {
		this.products.remove(index);
	}
	public float total(){
		float result =0;
		for(Product product:products) {
			result += product.total();
		}
		return result;
	}

}
