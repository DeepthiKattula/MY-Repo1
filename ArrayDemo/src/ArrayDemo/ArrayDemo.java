package ArrayDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;

public class ArrayDemo {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9} };
		      
		      System.out.println("\nLength of row 1: " + b[0].length);
		      System.out.println("\nLength of row 2: " + b[1].length);
		      System.out.println();
	int[][] arr= {{1,2,3},{7,8,9},{4,5,6}};
	for(int row=0; row<arr.length; row++)
		{for(int col=0;col<arr[row].length;col++)
		{
			System.out.print(arr[row][col]+" ");
		}System.out.println();
		}
	System.out.println();
	//array list
		System.out.println("ARRAY LIST");
     ArrayList<Integer> list=new ArrayList<>();
     list.add(10);
     list.add(20);
     list.add(30);
     list.add(50);
     list.add(100);
     list.add(200);
     System.out.println(list.contains(30));
     list.remove(4);
     System.out.println(list);
     list.remove(0);
     System.out.println(list);
		
		//linked list
     System.out.println("LINKED LIST");
		LinkedList<Integer> linkedList= new LinkedList<>();
		linkedList.add(5);
		linkedList.add(10);
		linkedList.add(25);
		linkedList.add(50);
		linkedList.add(100);
		System.out.println(linkedList.get(3));
		System.out.println(linkedList);
		System.out.println(linkedList.remove(2));
		System.out.println(linkedList);
				
		System.out.println("VECTOR");
		Vector<Integer> vect=new Vector<>();
		vect.add(10);
		vect.add(20);
		vect.add(30);
		vect.add(40);
		vect.add(50);
		vect.add(60);
		vect.add(70);
		System.out.println(vect);
		
		System.out.println("STACK");
		Stack<Integer> stack=new Stack<>();
		stack.push(11);
		stack.push(21);
		stack.push(31);
		stack.push(41);
		stack.push(51);
		stack.push(61);
		stack.push(71);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	}

}
