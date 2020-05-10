package Compareobjects_comparable_and_Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareToMethod implements Comparable<CompareToMethod>{
		
	
	int age;
    String name;
    String email;
    public CompareToMethod(int age, String name, String email) {
		super();
		this.age = age;
		this.name = name;
		this.email = email;
	}
	
	    public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



		



	@Override
	public String toString() {
		return "CompareToMethod [age=" + age + ", name=" + name + ", email=" + email + "]";
	}

	public static void main(String[] args) {
		
	
		
		List<CompareToMethod> students = Arrays.asList(new CompareToMethod(20,"Bob", "bob@mail.com"), new CompareToMethod(19, "Jane", "Jane@mail.com"),
		        new CompareToMethod(21,"Foo", "foo@mail.com"),new CompareToMethod(201,"Bob", "bob@mail1.com"),new CompareToMethod(21,"Foo1", "fo1o@mail.com"));
		Collections.sort(students);  
		for(CompareToMethod st:students){  
			System.out.println(st.age+" "+st.name+" "+st.email);  
			}  
		

	}

	@Override
	public int compareTo(CompareToMethod o) {
		if(age==o.age)  
			return 0;  
			else if(age>o.age)  
			return 1;  
			else  
			return -1;  
	}

}

	
	


