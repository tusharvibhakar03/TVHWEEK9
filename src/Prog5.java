import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prog5 {

    public static void main(String[] args) {

        Set<String> list = new HashSet<>();
        list.add("TUSHAR");
        list.add("VIBHAKAR");
        list.add("44,CECIL ROAD");
        list.add("WEALDSTONE");
        list.add("LONDON");

        Iterator itr = list.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }

        for (String Name : list) {
            System.out.println(Name);
        }

    }
}





