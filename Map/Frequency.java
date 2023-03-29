package Week6.Map;
// to count Frequency of characters in a string using HashMap.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
   public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
		
		Map<Character,Integer> mp = new HashMap<Character, Integer> ();
		
		System.out.println("Enter the String");
		
		String str= s.next();

        for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(mp.containsKey(ch))
			{
				mp.put(ch,mp.get(ch)+1);
			}
			else
			{
				mp.put(ch,1);
			}
		}
		System.out.println(mp);
        
    }
    
}
