package SetQuestions;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
//write a program to find number of unique characters in a Set<string> 
public class Question6 {
	public static int getUniqueElementsCount(Set<String> s) {
		Set<Character> uniqueElements=new HashSet<>();
		for(String str:s) {
			for(char ch:str.toCharArray()){
				uniqueElements.add(ch);
			}
		}
		return uniqueElements.size();
	}
	public static void main(String args[]) {
		Set<String> s = new HashSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Strings that you want : ");
		int n=sc.nextInt();
		System.out.println("Enter values : ");
		for (int i = 0; i < n; i++) {
			s.add(sc.next());
		}
		System.out.println("Number of unique elements are : "+getUniqueElementsCount(s));
		sc.close();
	}
}
