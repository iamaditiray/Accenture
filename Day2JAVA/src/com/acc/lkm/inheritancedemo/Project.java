package com.acc.lkm.inheritancedemo;

public class Project extends Employee{
	void projdisp(int pid, String pname) {
		System.out.println(pid+""+pname);
	}
	
	void callsuper() {
		System.out.println("Super 2nd property");
		super.details("Accenture", "Pune");
	}
	public static void main(String[] args) {
		Project project=new Project();
		project.details("Accenture", "Kolkata");
//		project.empdisp("Accenture", 1);
		project.projdisp(100, "HybridsDev");
		project.callsuper();
		
	}

}
