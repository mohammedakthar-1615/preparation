import java.util.HashMap;
import java.util.Map;

public class Mapmain{
    public static void main(String[] args)
    {
        
        Map<String, Integer> m = new HashMap<>();
        
        // Inserting key-value pairs into the HashMap
        m.put("apple", 10);
        m.put("orange" , 20);
        m.put("kiwi" , 30);
        m.put("banana" , 40);

        // Accessing values using keys
        System.out.println("Value for key 'apple': " + m.get("apple"));

        // updating value 
        m.put("apple" , 15);
        System.out.println("Updated value for key 'apple': " + m.get("apple"));


        // Accessing the updated value
        System.out.println("Value for key 'apple': " + m.get("apple"));

        // Removing a key-value pair
        m.remove("banana", 40);

        // traversing the HashMap
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
