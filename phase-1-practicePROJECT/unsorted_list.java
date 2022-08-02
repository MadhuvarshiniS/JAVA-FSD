package unsorted_list;
import java.util.*;
public class list {
	class GFG { 
	}public static void main(String[] args) {
        int[] arr = { 12, 3, 5, 7, 19, 1, 2, 3, 4 }; 
        int n = arr.length; 
        int k = 4;
          k--;
        Set<Integer> s = new TreeSet<Integer>();
        for(int i=0;i<n;i++) 
        	s.add(arr[i]); 
        Iterator<Integer> itr = s.iterator(); 
        while(k>0) 
        { 
        	itr.next(); 
        	k--; 
        	}
        System.out.println(itr.next()); 
	}
}
