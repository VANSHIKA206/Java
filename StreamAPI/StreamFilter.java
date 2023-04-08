package Week6.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class StreamFilter {
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP",25000));  
        productsList.add(new Product(2,"Dell",30000));  
        productsList.add(new Product(3,"Lenevo",28000));  
        productsList.add(new Product(4,"Sony",28000));  
        productsList.add(new Product(5,"Apple",90000));  
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 25000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
                                       
        System.out.println(productPriceList2); 
        productsList.stream()  
        .filter(product -> product.price == 25000)  
        .forEach(product -> System.out.println(product.name));    
        
    }  
    
}
