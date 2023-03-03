import java.util.Scanner;  

public class Average {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int result = (a + b + c)/2;
        System.out.println(result);
    }
    
}
