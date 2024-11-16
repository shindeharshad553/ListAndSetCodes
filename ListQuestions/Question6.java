package ListQuestions;
import java.util.Scanner;
//Write a program to check whether a string is palindrome or not 
public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i=0,j=str.length()-1;
		while(i<j){
			if(!(str.charAt(i)==str.charAt(j))) {
				System.out.println("Not Pallindrome");
				return;
			}
			i++;
			j--;
		}
		System.out.println("Pallindrome");
		sc.close();
	}

}
