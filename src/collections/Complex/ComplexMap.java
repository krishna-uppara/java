package collections.Complex;

import java.util.ArrayList;
import java.util.HashMap;

public class ComplexMap
{
	private HashMap<String, HashMap<String, HashMap<String, ArrayList<String>>>> storeTestClass;
	private HashMap<String, HashMap<String, ArrayList<String>>> storeTestMethod;
	private HashMap<String, ArrayList<String>> storeTestVariable;
	private ArrayList<String> storeTestValue;
	
	public ComplexMap(){
		storeTestClass = new HashMap< String,HashMap<String,HashMap<String,ArrayList<String>>>>();
		storeTestMethod = new HashMap< String, HashMap<String, ArrayList<String>>>();
		storeTestVariable = new HashMap< String, ArrayList<String>>();
		storeTestValue = new ArrayList<String>();
	}
	
	public void InsertValue(String TestClass, String TestMethod, String Variable, 
		String Value ){
		
		storeTestValue.add(Value);
		storeTestVariable.put(Variable,storeTestValue);
		storeTestMethod.put(TestMethod,storeTestVariable);
		storeTestClass.put(TestClass,storeTestMethod);
	}
	
	public HashMap<String, HashMap<String, ArrayList<String>>>
	  SearchByTestClass(String TestClass){
		
		return storeTestClass.get(TestClass);
	}
	
	public HashMap< String, ArrayList<String>> SearchByTestMethod(String TestMethod){
		
		return storeTestMethod.get(TestMethod);
	}
	
	public ArrayList<String> SearchByTestVariable(String Variable){
		
		
		return storeTestVariable.get(Variable);
	}
	
	public static void main(String[] args)
	{
		ComplexMap obj = new ComplexMap();
		obj.InsertValue("form","register", "fullname", "krishna uppara");
		obj.InsertValue("form","register", "first", "krishna");
		obj.InsertValue("form","register", "last", "uppara");
		System.out.println(obj.SearchByTestClass("full"));
		System.out.println(obj.SearchByTestMethod("register"));
		System.out.println(obj.SearchByTestVariable("fullname"));
	}

	
}
