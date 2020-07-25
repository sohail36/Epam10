import java.util.*;
import java.util.stream.Collectors;
public class Java8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> str=Arrays.asList("abc","aaaa","aac","abcd","bcd");
     List<String> res=str.stream().filter(a->a.startsWith("a")).filter(a->a.length()==3).collect(Collectors.toList());
     System.out.print("The List Sorted Per Conditions: ");
     for(String i:res)
     {
    	 System.out.print(i+" ");
     }
	}

}