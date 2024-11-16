package ListQuestions;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//Given a list of strings remove all strings that are pallindrome 
public class Question9 {
	public static boolean checkPallindrome(String val) {
		int s = 0, e = val.length() - 1;
		while (s < e) {
			if (!(val.charAt(s) == val.charAt(e)))
				return false;
			s++;
			e--;
		}
		// if all characters matched and it is not returned from the while loop that
		// means it is pallindrome
		return true;
	}

	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of List : ");
		int n = sc.nextInt();
		System.out.println("Enter the list values : ");
		for (int i = 0; i < n; i++) {
			str.add(sc.next());
		}
		System.out.println("Pallindrome Strings are :");
		for (String val : str) {
			if (checkPallindrome(val))
				System.out.println(val);

		}
		sc.close();
	}

}
