import java.util.*;
public class Java8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> a =Arrays.asList(1,2,3,4,5,6);
      IntSummaryStatistics stats =a.stream().mapToInt((x)->x).summaryStatistics();
      System.out.println("Average of the Integer List : "+stats.getAverage());
	}

}