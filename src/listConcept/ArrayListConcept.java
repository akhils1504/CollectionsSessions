package listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		//employee class objects
		Employee emp=new Employee(10, "Tom", 10);
		Employee emp1=new Employee(1111, "Dick", 11);
		
		
		//create Array List
		//Only employee objects can be saved in arrayList
		ArrayList <Employee> ar3=new ArrayList<Employee>();
		ar3.add(emp);
		ar3.add(emp1);
		
		
		//itreator to traverse the value
		Iterator<Employee>it =ar3.iterator();
		while(it.hasNext()){
			Employee hello=it.next();
			System.out.println(hello.name);
			System.out.println(hello.salary);
		}
		System.out.println("**********************************************************");
		 //******************************************
		//AddAll concept
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("My ");
		ar5.add("Name");
		
		ArrayList<String>ar6=new ArrayList<>();
		ar6.add("is");
		ar6.add("Akhil");
	    ar5.addAll(ar6);
		
	for(int i=0;i<ar5.size();i++){
		System.out.println(ar5.get(i));
	}
//	*************************************************************
	System.out.println("**********************************************************");
	//removeAll
	ar5.removeAll(ar6);
	for(int i=0;i<ar5.size();i++){
		System.out.println(ar5.get(i));
	}
	System.out.println("**********************************************************");
	//retain All
	ArrayList<String> ar7=new ArrayList<String>();
	ar7.add("My");
	ar7.add("Name");
	
	ArrayList<String>ar8=new ArrayList<>();
	ar8.add("My");
	ar8.add("Akhil");
	
    ar7.retainAll(ar8);
	for(int i=0;i<ar7.size();i++){
		System.out.println(ar7.get(i));
	}
	
	

}}
