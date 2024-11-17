
import java.util.Queue;
import java.util.LinkedList;

//Write a program to where you are given a queue of integers and you have to reverse its elements.
//you can use recursion or stack to assist with the same 
public class ReverseQueueElements {

	public static void reverseQueueElements(Queue<Integer> q) {
		// base case 
		// If queue is empty then return from the function
		if (q.isEmpty())
			return;
		// processing 
		int front = q.poll();
		// recursive call
		reverseQueueElements(q);

		// processing
		q.add(front);
	}

	public static void main(String[] args) {
//		step 1)create a queue 
//		step 2) Add the elements into it
//		step3 3)reverse the queue elements 
//		step 4)print the reverse Queue elements 

		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(25);
		q.add(21);
		q.add(31);
		q.add(71);
		reverseQueueElements(q);
		System.out.println("Queue elements after reversal are : " + q);
	}

}
