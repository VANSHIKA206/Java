package Week5.Generics;

// Task : Implement Wildcards in Java Generics

class MyGenericArray<T>
{
	T arr[] = (T[])new Object[5];
	int length = 0;
	
	public void append(T val)
	{
		arr[length++] = val;
	}
	
	public void display()
	{
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
public class WildCards {
	public static void fun(MyGenericArray<?> obj)
	{
		obj.display();
	}
	public static void main(String args[])
	{
		MyGenericArray<Integer> ga = new MyGenericArray<>();
		ga.append(1);
		ga.append(2);
		MyGenericArray<String> ga2 = new MyGenericArray<>();
		ga2.append("Hello");
		fun(ga);
		fun(ga2);
	}
}
