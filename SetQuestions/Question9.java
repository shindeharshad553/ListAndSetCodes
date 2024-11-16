package SetQuestions;

import java.util.Set;
import java.util.HashSet;

//Problem Statement :Write a Program to remove all vowels from a set of characters 
public class Question9 {
	public static void main(String[] args) {
		// Create a Set<Character>
		Set<Character> s = new HashSet<>();
		s.add('a');
		s.add('h');
		s.add('l');
		s.add('k');
		s.add('o');
		s.add('c');

//		Create a vowels set
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

//		remove all vowels from set s
		s.removeAll(vowels);
		System.out.println(s);
	}

}
