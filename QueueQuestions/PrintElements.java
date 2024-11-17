
import java.util.Queue;
import java.util.LinkedList;

//Problem Statements : Write a program to print the queue elements without removing them.Ensure that queue remains unchanged after printing. 
public class PrintElements{

	public static void printQueueElements(Queue<Integer> q) {
//		//1st method : using enhanced for loop 
//		for(int e:q) {
//			System.out.println(e);
//		}

//		//2nd method : using peek() method 
		if (q.isEmpty())
			return;
		int front = q.poll();
		System.out.println(front);
		printQueueElements(q);
		((LinkedList<Integer>) q).addFirst(front);
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(25);
		q.add(21);
		q.add(31);
		q.add(71);
		printQueueElements(q);
	}
}
