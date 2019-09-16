package training.Lambda_expressions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sapxeptheoten {

	public static void main(String[] args) {
		Employee[] employee = {
				new Employee("D"),
				new Employee("C"),
				new Employee("B"),
				new Employee("A")
		};
		
		System.out.println("Beford sorting name :"+ Arrays.toString(employee));
		Arrays.sort(employee, Employee:: nameCompare);
		System.out.println("After Sorting Names:"+ Arrays.toString(employee));
		}

	}


