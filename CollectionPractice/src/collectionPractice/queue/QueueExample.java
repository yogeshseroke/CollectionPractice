package collectionPractice.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String args[]) {
		
		//implementing queue...
		Queue q = new LinkedList<>();
		
		for(int i=0; i<10; i++) {
			q.add(i);
			System.out.println(q);
		}
		
		//removing the element from queue...
		q.remove();
		System.out.println(q);
		q.add(10);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		
		System.out.println(q.size());
		
		//poll method...
		System.out.println(q.peek());
		System.out.println(q.poll());
		
		//priority queue...
		
		Queue queue = new PriorityQueue<>();
		
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		queue.add("E");
		
		System.out.println(queue);
		
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//deque...
		Deque dq = new LinkedList<Integer>();
		
		dq.add(1);
		dq.add(2);
		dq.add(3);
		dq.add(4);
		dq.add(5);
		System.out.println("deque...");
		System.out.println(dq);
		
		dq.addFirst(0);
		System.out.println(dq);
		dq.addLast(1);
		System.out.println(dq);
		dq.push(6);
		System.out.println(dq);
		dq.add(7);
		System.out.println(dq);
		dq.offer(8);
		System.out.println(dq);
		dq.offerFirst(9);
		System.out.println(dq);
		dq.offerLast(10);
		System.out.println(dq);
		System.out.println(dq.removeFirst());
		System.out.println(dq);
		System.out.println(dq.removeLast());
		System.out.println(dq);
		
		PriorityQueue dq1 = new PriorityQueue();
		
		dq1.add("yogesh seroke");
		dq1.add("akash bairagi");
		dq1.add("shivam pal");
		dq1.add("yogesh bhite");
		dq1.add("nitin vishwakarma");
		
		System.out.println(dq1);
		
		dq1.remove();
		System.out.println(dq1);
		
		dq1.remove("shivam pal");
		System.out.println(dq1);

	}
}
