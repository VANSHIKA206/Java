package Week6.Queue;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

class Reverse{
     public void ReverseKQueStack(int k,ArrayDeque<Integer> temp) {
    
         Stack<Integer> sck= new Stack<Integer>();
    
        for(int i=0;i<k;i++) { //adding elements of queue till k elements into stack
        sck.push(temp.peek());
        temp.poll();
        }
    
    
         while(!sck.isEmpty()) {
        temp.addLast(sck.peek());
        sck.pop();
        }
    
        for(int i=1;i<=(temp.size()-k);i++) {
        temp.addLast(temp.peek());
        temp.poll();
        }
        System.out.println(temp);
    }
}

public class ReverseQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Scanner s = new Scanner(System.in);
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		
		System.out.println("Enter no of elements ");
		int n= s.nextInt();
		
        System.out.println("Enter elements");
				
			for(int j=0;j<n;j++) {
					int e=s.nextInt();
					que.offer(e);
				}	
        System.out.println(que);	
		
	    System.out.println("Enter the value of k");
		int k=s.nextInt();

        Reverse r= new Reverse();
				
		System.out.println("After Reversing :- ");

        System.out.println(que);
		
        r.ReverseKQueStack(k, que);
            }
		        
        }