package interviewsPrograms;
interface jjj
{
	public void kkk();
}
class showroom 
{
	showroom()
	{
		System.out.println("i'm in showroom");
	}
	
	showroom(int i)
	{
		this();
		System.out.println("i'm in bike showroom ");
	}
}

abstract class Bike extends showroom implements jjj{  
	   Bike()
	   {
		   super(10);	   
		   System.out.println("bike is created");
	   }  
	   abstract void run();  
	   void changeGear(){System.out.println("gear changed");}  
	 }  
	  
	 class Honda extends Bike{
		 Honda()
		 {
			 
			 System.out.println("honda started");
		 }
	 void run(){System.out.println("running safely..");}  
	   public void kkk()
	   {
		   
	   }
	   

 
	 }  
	 public class abstract1{  
	 public static void main(String args[]){  
	  Bike obj = new Honda();  
	  obj.run();  
	  obj.changeGear();  
	 }  
	}  
