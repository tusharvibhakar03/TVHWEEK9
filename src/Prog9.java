import java.util.HashMap;
import java.util.Map;

public class Prog9 {

    public static void main(String[] args) {

        // object is peeple
        HashMap<String, Integer> people = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("Tushar", 32);
        people.put("Vimal", 30);
        people.put("Bhavesh", 33);

        for (Map.Entry<String, Integer> pair: people.entrySet()) {
            System.out.format("key: %s, value: %d%n", pair.getKey(), pair.getValue());



                  }
    }

}
