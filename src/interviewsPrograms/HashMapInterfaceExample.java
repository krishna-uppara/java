package interviewsPrograms;

import java.util.*;  
class HashMapInterfaceExample{  
 public static void main(String args[]){  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(null, "Amit");  
  map.put(102,"Rahul");  
  for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  