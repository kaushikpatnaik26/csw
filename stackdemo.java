package csw2;
import java.util.*;
public class stackdemo {

	public static void main(String[] args) throws java.lang.Exception
	{
		Stack<Integer> mylist= new Stack<>();
		mylist.push(5);
		mylist.push(2);
		mylist.push(1);
		System.out.println(mylist.peek());
		System.out.println(mylist.search(2));
		mylist.pop();
		System.out.println(mylist.empty());
		System.out.println(mylist);

	}

}
