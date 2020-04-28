package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class Uniquearray {

	public static void main(String[] args) {
        int arr[] = {-6, 0, -4, 4, 8};
        int len = arr.length;
        Set<Integer> mySet = new HashSet<Integer>();
        for(int i=0; i<len; i++) {
            mySet.add(Math.abs(arr[i]));
        }
        System.out.println(mySet.size());
       System.out.println(mySet);
    }


}
