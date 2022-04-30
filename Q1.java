package practice;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String str = "";
		char ch[] = new char[N];
		
		str = sc.next();
		
		for(int i=0;i<str.length();i++) {
			ch[i] = str.charAt(i);
			System.out.println(ch[i]);
		}
		
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			sum += ch[i]-'0';
		}
		
		System.out.println(sum);
	}

}
