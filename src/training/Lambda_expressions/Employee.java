package training.Lambda_expressions;

public class Employee {
private String name;

public Employee(String name) {
	super();
	this.name = name;
}


@Override
public String toString() {
	return "Employee [name1=" + name + "]";
}
public static int nameCompare(Employee a1, Employee a2) {
    return a1.name.compareTo(a2.name);
  }

}
