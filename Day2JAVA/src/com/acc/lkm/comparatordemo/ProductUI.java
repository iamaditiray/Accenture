package com.acc.lkm.comparatordemo;
import java.util.*;

public class ProductUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product>prodList=new ArrayList<>();
		prodList.add(new Product(34, "Smartphone", 65000.00));
		prodList.add(new Product(13, "Grocery", 20000.00));
		prodList.add(new Product(82, "Books", 90000.00));
		//Price Comparison
		System.out.println("Comparing Prices of Product: ");
		Collections.sort(prodList);
		for(Product p1:prodList) {
			System.out.println("Product ID is: " + p1.product_id+"\n"+"Product Name is: " + p1.product_name+"\n" + "Price is: "+ p1.price);
			
		}
	}

}
