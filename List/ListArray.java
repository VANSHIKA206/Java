package Week6.List;



//store only unique elemenst in arraylist


import java.util.*;


public class ListArray{
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		
		int temp=(-1);
		
		System.out.println("Enter the no of elements");
		int n= s.nextInt();
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<n;i++) {
			temp=s.nextInt();
			
			if(!numbers.contains(temp)) {
				numbers.add(temp);
			}
	
		}
		System.out.println(numbers);
		
		
	}

}
