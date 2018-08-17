import java.util.ArrayList;
import java.util.List;

public class SafeVar {
	//@SafeVarargs  
    private void display(List<String>... products) {  
        for (List<String> product : products) {  
            System.out.println(product);  
        }  
    }  
    public static void main(String[] args) {  
        SafeVar v = new SafeVar();  
        List<String> list = new ArrayList<String>();  
        list.add("Laptop");  
        list.add("Tablet");  
        v.display(list);  
    }     
}
