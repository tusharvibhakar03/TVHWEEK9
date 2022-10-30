import java.util.ArrayList;
import java.util.List;

public class Prog6 {

    public static void main(String[] args) {
        // Create a list and add some Animals in list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("DOG");
        list_Strings.add("COW");
        list_Strings.add("CAT");
        list_Strings.add("TIGER");
        list_Strings.add("LION");
        // Print the list
        System.out.println(list_Strings);
        // Retrive the Third and Fourth element
        String element = list_Strings.get(2);
        System.out.println("Third element: "+element);
        element = list_Strings.get(3);
        System.out.println("Fourth element: "+element);
    }

}
