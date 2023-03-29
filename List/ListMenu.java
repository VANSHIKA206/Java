package Week6.List;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMenu {

    /**
     * @param args
     */
    public static void main(String[] args) {
           
            
       
        Scanner in = new Scanner(System.in);
            
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int ch=-1;
		int num=-1;

        while(ch!=4) {
			
            System.out.println("1. Add");
			System.out.println("2. Remove");
			System.out.println("3. Display Element");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
            ch = in.nextInt();
         



            switch(ch)
			{
			case 1:
				System.out.println("enter the element you want to add");
			 	num = in.nextInt();
				arr.add(num);
				break;
			case 2:
				System.out.println("Enter the position you want to remove");
				int index = in.nextInt(); in.nextLine();
				arr.remove(index-1);
				break;
			
			case 3:
				System.out.println(arr);
				break;
			
			case 4: 
				System.out.println("exited");
				break;
			default: 
				System.out.println("Invalid choice");
				break;
			}
        }
    }

}