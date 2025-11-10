
import java.util.*;
import java.util.stream.*;

record Pair(int a, int b) {}

public class FebinacciSeries{
	
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE TOTAL LENGTH OF THE SERIES YOU WANT TO PRINT::");
		int n = sc.nextInt();
		
		//Approach01
		List<Integer> series1 = new ArrayList<>();
		series1.add(0);
		series1.add(1);
		while (series1.size() <= n){
			series1.add(series1.get(series1.size()-1)+series1.get(series1.size()-2));
		}
		
		System.out.println(series1);
		
		//Approach02
			List<Integer> series1 = new ArrayList<>();
		series1.add(0);
		series1.add(1);
		while (series1.size() <= n){
			series1.add(series1.get(series1.size()-1)+series1.get(series1.size()-2));
		}
		
		System.out.println(series1);
		
		//Approach02
		List<Integer> series2 = Stream.iterate(new Pair(0,1), p-> new Pair(p.b(), (p.a()+p.b()))).map(Pair::a).limit(n).collect(Collectors.toList());
		System.out.println(series2);
		
		
	}
	
}