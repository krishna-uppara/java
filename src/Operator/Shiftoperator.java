package Operator;

class Shiftoperator{  
public static void main(String args[]){
int z=10;
System.out.println("left shift");
System.out.println(10<<2);//10*2^2=10*4=40  10*(2*2)
System.out.println(10<<3);//10*2^3=10*8=80  10*(2*2*2)
System.out.println(20<<2);//20*2^2=20*4=80  10*(2*2)
System.out.println(15<<4);//15*2^4=15*16=240  15*(2*2*2*2)
System.out.println("right shift");
System.out.println(10>>2);//10/2^2=10/4=2 10/(2*2)  
System.out.println(20>>2);//20/2^2=20/4=5  10/(2*2)
System.out.println(20>>3);//20/2^3=20/8=2 10/(2*2*2)
System.out.println("left shift >>>");
System.out.println(10>>>2);//10/2^2=10*4=40  10/(2*2)
System.out.println(10>>>3);//10/2^3=10*8=80  10/(3*3*3)
System.out.println(20>>>2);//20/2^2=20*4=80  10/(2*2)
System.out.println(15>>>4);//15/2^4=15*16=240  15/(2*2*2*2
}}  