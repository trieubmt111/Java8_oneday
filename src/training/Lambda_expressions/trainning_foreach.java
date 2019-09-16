package training.Lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class trainning_foreach {

	public static void main(String[] args) {
//		List<String> persons = new ArrayList<String>();
//		persons.add("Java 1");
//		persons.add("Java 2");
//		persons.add("Java 3");
//		persons.add("Java 4");
//		persons.add("Java 5");
//		persons.add("Java 6");
//		 //java 8 forech+lambda
//		persons.forEach((x) ->{
//			System.out.println(x);
//		});
//		

		List<Persons>persons = new  ArrayList<Persons>();
		persons.add(new Persons(1,"Java 1"));
		persons.add(new Persons(2,"Java 2"));
		persons.add(new Persons(3,"Java 3"));
		persons.add(new Persons(4,"Java 4"));
		persons.add(new Persons(5,"Java 5"));
		
		persons.forEach((x)->{
			System.out.println(x.getId()+". "+x.getName());
		});
	}

}
