package com.acc.lkm.staticdemo;

import java.util.LinkedHashMap;

public class LinkedHashMapAssignment2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String>Training=new LinkedHashMap<>();
		Training.put(100, "Java");
		Training.put(200, "Python");
		Training.put(300, "GenAI");
		Training.put(400, "Azure");
		Training.put(500, "Microsoft");
		System.out.println(Training.entrySet());
		Training.replace(300, "GCP");
		System.out.println(Training.entrySet());
		Training.remove(500);
		System.out.println(Training.entrySet());
	}

}
