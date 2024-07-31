package com.acc.lkm.comparatordemo;
import java.lang.*;

public class Product implements Comparable<Product>{
	
	int product_id;
	String product_name;
	double price;
	
	public Product(int product_id, String product_name, double price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
	}


	@Override
	public int compareTo(Product other) {
		// TODO Auto-generated method stub
		return this.product_name.compareTo(other.product_name);
	}
}
