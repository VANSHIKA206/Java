import java.util.Scanner;  


public class Pin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println("Is the said PIN number is valid? "+ validate(a));

    }
    

   public static boolean validate(String a) {
       return a.matches("\\d{4}|\\d{6}|\\d{8}");
    }
}
