import java.util.Arrays;

public class Prog3 {

    public static void main(String[] args){
        int[] my_array1 = {
                123, 45, 912, 628, 496,
                152, 486, 948, 402, 928,
                429, 256, 748, 412};
        System.out.println("Original array : "+ Arrays.toString(my_array1));
        for(int i = 0; i < my_array1.length / 2; i++)
        {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(my_array1));
    }
}


