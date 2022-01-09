import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator{

  
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();


        Product p1 = new Product("Pen", 12);
        Product p2 = new Product("Pencil", 12);
        Product p3 = new Product("Rubber", 12);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        

        //Collections.sort(list);


        list.sort(new MyComparator());

        for(Product p: list){
            System.out.println(p);
        }
    
        
    }
}