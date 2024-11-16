package SetQuestions;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
//write a program to find the union of two set objects
public class Question1 {

	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		Collection<Integer> c2=new ArrayList<Integer>(Arrays.asList(353,56,5,75,74));
		Set<Integer> s1=new HashSet<>(c1);
		Set<Integer> s2=new HashSet<>(c2);
		Set<Integer> UnionSet=new HashSet<Integer>(s1);
		UnionSet.addAll(s2);
		System.out.println("Union Operation of two sets are : "+UnionSet);
		
		
//		2nd approach : using StreamAPI
		
//		Collection<Integer> c1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
//		Collection<Integer> c2=new ArrayList<Integer>(Arrays.asList(353,56,5,75,74));
//		Set<Integer> s1=new HashSet<>(c1);
//		Set<Integer> s2=new HashSet<>(c2);
//		
////		used to add elements from stream s1 to the UnionSet
//		Set<Integer> UnionSet=s1.stream().collect(Collectors.toSet());
//		UnionSet.addAll(s2);
//		System.out.println("Union Operation of two sets are : "+UnionSet);
	}

}
