
import java.util.Queue;
import java.util.LinkedList;

//Given a number you have to generate a queue of n binary numbers and print that numbers 
public class GenerateNBinaryNumbers {

	public static void nBinaryNumbers(int n,Queue<String> q) {
		q.add("1");
		for(int i=0;i<n;i++) {
			String current=q.poll();

			//	Print the binary number		
			System.out.print(current+" ");
			
			//  Add the next two binary numbers 0 and 1 			
			q.add(current+"0");
			q.add(current+"1");
		}
	}

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		int n = 5;
		nBinaryNumbers(n,q);
	}

}
