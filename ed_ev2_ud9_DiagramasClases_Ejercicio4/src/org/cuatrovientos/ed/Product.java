package org.cuatrovientos.ed;

public class Product {
	private String name;
	private int qty;
	private float price;
	
	public Product() {
		this.name="";
		this.qty=0;
		this.price=0f;
	}
	public Product(String name,int qty,float price) {
		this.name =name ;
		this.price = price;
		this.qty= qty;
	}
	public String toString() {
		return this.name+" " +this.qty+" "+this.price;
	}
	public float total() {
		return this.qty * this.price;
	}
}
