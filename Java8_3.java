import java.util.*;
import java.util.stream.*;
public class Java8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> list=Arrays.asList("aba","abc","radar","hole","aabaa","abccba");
     Java8_3 n=new Java8_3();
     for(String i:list)
     {
    	 if(n.isPalindrome(i))
    	 {
    		 System.out.println(i+" String is Palindrome");
    	 }
    	 else
    	 {
    		 System.out.println(i+" String is Not Palindrome");
    	 }
     }
	}
	public boolean isPalindrome(String a)
	{
		String revstring=a.replaceAll("//s+", "").toLowerCase();
		return IntStream.range(0,revstring.length()/2).noneMatch(i->revstring.charAt(i)!=revstring.charAt(revstring.length()-i-1));
		//using String bulider
		/*String revstring=new StringBuilder(a).reverse().toString();
		return a.equals(revstring);*/
	}

}