package com.acc.lkm.staticdemo;

import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String>map=new LinkedHashMap<>();
		map.put(1, null);
		map.put(100,"Java");
		map.put(200, "SFDC");
		map.put(300, "SAP");
		map.put(400, null);
		map.put(500, null);
		map.put(400,"Azure");
		map.put(null, "Cloud Azure");//HashMap can have one null key and multiple null values
		map.put(null, "Python");
		map.replace(1, "CProgramming");
		
		/*for(Map.Entry m1:map.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}*/
		/*map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);

	}*/
		System.out.println(map);

}}

