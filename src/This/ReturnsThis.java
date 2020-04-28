package This;

class test1
{
public test1 getA(){  
return this;  
}  
public void msg(){System.out.println("Hello java");}  
}  
public class ReturnsThis{  
public static void main(String args[]){  
test1 a = new test1();
a.getA().msg();
a.msg();
}  
}  