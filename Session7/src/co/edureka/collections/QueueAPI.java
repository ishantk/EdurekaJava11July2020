package co.edureka.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueAPI {

	public static void main(String[] args) {
		
		//Queue<Integer> queue = new PriorityQueue<Integer>();			//Polymorphic
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();	//Direct Object Construction
		
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
		
		// Queue: 	Head 10 9 8 7 6 5 4 3 2 1 Tail
		// But PriorityQueue sorts the data. Hence,
		// Queue: 	Head 1 2 3 4 5 6 7 8 9 10 Tail
		
		// peek -> reads and gives back the head of queue
		// poll -> removes and gives back the head of queue
		
		/*int head = queue.peek(); // 1
		System.out.println("Head of Queue is: "+head+" size:"+queue.size());
		
		queue.poll();	// removes the Head
		System.out.println("Head Removed");
		
		head = queue.peek(); // 2
		System.out.println("Head of Queue now is: "+head+" size:"+queue.size());*/
		
		for(int i=0;i<queue.size();i++) {
			System.out.println(queue.peek());
			queue.poll();
		}
		

	}

}
