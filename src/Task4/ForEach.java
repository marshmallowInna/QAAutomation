package Task4;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class ForEach {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        List<Integer> list = asList(1,2,3,4);
        for (int i = 0; i < array.length; i++) {
            System.out.println( array [i] );
        }
        System.out.println("for each");
        for (int value:list) {
            value = 78;
            System.out.println(value);

        }
    }
}
