package csw2;
import java.util.*;
public class priorityqueuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>mylist=new PriorityQueue<>();
		System.out.println(mylist.isEmpty());
		mylist.offer(5);
		mylist.offer(2);
		mylist.offer(1);
		System.out.println(mylist.peek());
		System.out.println(mylist.isEmpty());
		mylist.poll();
		System.out.println(mylist);
	}

}
