package interviewsPrograms;

import java.util.*;  
class TreeMapInterfaceExample{  
 public static void main(String args[]){  
  Map<Integer,String> map=new TreeMap<Integer,String>();  
  map.put(100,"Amit");  
  //can not have null map.put(null,"ss");
  map.put(101,"Amit");
  map.put(102,"Rahul");  
  for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  