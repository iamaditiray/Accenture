package com.acc.lkm.inheritancedemo;

public class Employee extends Org{
String company;
String location;

void details(String compnay, String location) {
	this.company=company;
	this.location=location;
	System.out.println( company + "\n" + location);
	super.company="Accenture";
	
	
}
}
