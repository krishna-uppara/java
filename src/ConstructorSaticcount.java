
public class ConstructorSaticcount {

	static int count=0;//will get memory each time when the instance is created  
	  
	ConstructorSaticcount(){  
	count++;//incrementing value  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	//Creating objects  
		ConstructorSaticcount c1=new ConstructorSaticcount();  
		ConstructorSaticcount c2=new ConstructorSaticcount();  
		ConstructorSaticcount c3=new ConstructorSaticcount();  
	}  
}