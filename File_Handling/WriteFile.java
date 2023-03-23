package Week5.File_Handling;

// Task : Implement file write method.

import java.io.*;
import java.util.*;
public class WriteFile {
	public static void implementFileWrite(String str, String path) throws Exception
	{
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(str.getBytes());
		fos.close();
	}
	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the content");
		String str = in.nextLine();
		System.out.println("Enter the file path");
		String path = in.nextLine();
		implementFileWrite(str,path);
	}
}
