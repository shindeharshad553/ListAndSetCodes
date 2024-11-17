
import java.util.Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;

//Problem Statements : Implement basic queue operations like enqueue() dequeue() get the front element and get the last element and checking 
//whether it is empty or not and get the size of the queue

public class Question1 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
//		enqueue : It is the process of adding element into the queue 
		q.add(10);
		q.add(25);
		q.add(21);
		q.add(31);
		q.add(71);

//		Dequeue() is the process of deleting/removing the element from queue

		// removes the element which is at front position in a queue
		q.remove();

//		To remove the specific element 
		if (q.remove(20))
			System.out.println("Element reoved successfully!!");
		else
			System.out.println("Element is not present in a queue");

//		To get the first element in a queue

//		we can get it with the help of three methods 
//		1)peek(); //returns the front element without removing it from queue.

//		2)poll(); //returns the front element and remove it from queue.

//		3)element(); //returns the front element and throws an exception if queue is empty.
		try {
			int frontElement = q.element();
			System.out.println("First element is : " + frontElement);

			// To get the last element
			int lastElement = ((LinkedList<Integer>) q).getLast();
			System.out.println("Last element is : " + lastElement);
		} catch (NoSuchElementException e) {
			System.out.println("Queue is empty");
		}

//		To check if queue is empty or not 
		boolean emptyOrNot = q.isEmpty();
		if (emptyOrNot)
			System.out.println("Queue is empty");
		else
			System.out.println("Queue is not empty");

//		To get the size of the queue
		System.out.println("The queue contains : " + q.size() + " elements ");
	}
}
