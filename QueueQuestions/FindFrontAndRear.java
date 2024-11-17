
import java.util.Queue;
import java.util.LinkedList;

//Problem Statements : Find the front and rear elements of the queue and return appropriate message if queue is empty 
public class FindFrontAndRear {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(25);
		q.add(21);
		q.add(31);
		q.add(71);

//		check if queue is empty or not 
		if (q.isEmpty())
			System.out.println("Queue is emmpty");
		else {
//			get front element of queue
			int front = q.peek();
			System.out.println("Front element is : " + front);
//			get the last element of queue
			int last = ((LinkedList<Integer>) q).getLast();
			System.out.println("Last element is : " + last);
		}
	}

}
