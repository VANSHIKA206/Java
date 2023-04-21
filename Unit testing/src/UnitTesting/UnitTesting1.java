package UnitTesting;

public class UnitTesting1 {  
  
    public static int findMax(int arr[]){  
        int max=arr[0];  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
               max=arr[i];  
        }  
        return max; 
        
    }  
    public static int add(int x,int y) {
    	int sum =x+y;
    	return sum;
    }
}  
