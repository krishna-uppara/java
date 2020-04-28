package interviewsPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
 
public class vectortolist {
 
    public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        System.out.println("Actual vector:"+vct);
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.addAll(vct);
        System.out.println("After Copy: "+list);
    }
}
