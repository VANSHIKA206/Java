package Week5.Generics;


//creating a generic class - that can be used with any type of data. 

class ClassGeneric<T>{
	
	public T data;

	public ClassGeneric(T data) {
		//super();
		this.data = data;
	}

	public T getData() {
		return data;
	}
	
	
}
public class GenericClass {

	public static void main(String[] args) {
		
            
		ClassGeneric<Integer> intObj = new ClassGeneric(6);      //integer type 
		System.out.println("Type Integer:- " + intObj.getData());
		
		ClassGeneric<String> stringObj =  new ClassGeneric("Vanshika Sharma");   //string type
		System.out.println("Type String:- " + stringObj.getData());
		
	}

}
