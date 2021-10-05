package PredicatePositiveEX;

import java.util.Scanner;
import java.util.function.Predicate;

public class positiveInteger {
public static void main (String args[]) {
	Predicate<Integer>p = i -> i>0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Sample input is: \t ");
	int m = sc.nextInt();
	System.out.println("Sample output is:\t " +p.test(m));
	System.out.print("Sample input is: \t ");
	int n = sc.nextInt();
	System.out.println("Sample output is:\t " +p.test(n));
	
}
}
