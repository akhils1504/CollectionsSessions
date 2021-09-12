package listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> str= new LinkedList<String>();
		
		//add
		str.add("Test");
		str.add("Qtp");
		str.add("Selenium");
		str.add("RPA");
		str.add("katlon");
		
		//print
		System.out.println("contents of linkedlist"+str);
		//addfirst
		str.addFirst("Akhil");
		//add last
		str.addLast("Kumar");
		System.out.println("contecnt of linked list"+str);
		
		//get:
		System.out.println(str.get(0));
		//set:
		str.set(0, "Tom");
		System.out.println(str.get(0));
		
		//remove and first and last element
		str.removeFirst();
		str.removeLast();
		System.out.println("content of linkedlist"+str);
		
		str.remove(2);
		System.out.println("contecnt of linked list"+str);
		
		//how too print all values of linked list
		//for loop
		System.out.println("using for loop");
		for(int n=0;n<str.size();n++){
			System.out.println(str.get(n));
		}
		//advance for loop
		for (String i:str)
			System.out.println(str);
      
		//itreator
		Iterator<String> it=str.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
			
			
			//while loop
			int num=0;
			while(str.size()>num){
				System.out.println(str.get(num));
				num++;
			}
		}
	}

}
