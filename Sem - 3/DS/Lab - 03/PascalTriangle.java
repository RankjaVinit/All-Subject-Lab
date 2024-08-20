import java.util.*;

public class PascalTriangle{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		int a = 1, b = 1, print;
		for( int i = 0 ; i < n ; i++ ){
			for( int j = n - i ; j >= 0 ; j-- ){
				System.out.print(" ");
			}
			a = i;
			b = 1;
			print = 1;
			for( int j = i ; j >= 0 ; j-- ){
				System.out.print( print + " ");
				print = (print * a--) / (b++);
			}
			System.out.println();
		}
	}
}