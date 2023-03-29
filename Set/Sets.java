package Week6.Set;

import java.util.*;
public class Sets {
	/**
	 * @param args
	 */
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no. of elements:");
		int n=in.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			int num = in.nextInt();in.nextLine();
			arr.add(num);
		}
        System.out.println(arr);

        Set<Integer> set= new HashSet<Integer>();
        set.addAll(arr);
        System.out.println(set);
    }
}
