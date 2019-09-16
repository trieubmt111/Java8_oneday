package training.Lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class Lambda_java8 {

	public static void main(String[] args) {
//		List<String> list  = new ArrayList<String>();
//		list.add("1");
//		list.add("2");
//		list.forEach(p ->{
//			System.out.println(p);
//		});
		 new Thread(
				 () -> System.out.println("my name")
				 ).start();

	}

}
