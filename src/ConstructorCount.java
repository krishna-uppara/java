
public class ConstructorCount {

	int count=0;//will get memory each time when the instance is created  
	  
	ConstructorCount(){  
	count++;//incrementing value  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	//Creating objects  
		ConstructorCount c1=new ConstructorCount();  
		ConstructorCount c2=new ConstructorCount();  
		ConstructorCount c3=new ConstructorCount();  
	}  
	
}
