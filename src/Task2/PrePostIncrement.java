package Task2;

/**
 * Task:
 * In the following program, explain why the value "13" is printed twice in a row.
 * Put the explanation in comments.
 */
public class PrePostIncrement {
    public static void main(String[] args) {
        int i = 10;
        i++;
        System.out.println(i);    // "11"
        ++i;
        System.out.println(i);    // "12"
        System.out.println(++i);  // "13" is prefix increment operator, the result is calculate  and stored first then the veriable is used
        System.out.println(i++);  // "13" is postfix increment, the veriable is used first then the result is calculate  and stored first
        System.out.println(i);    // "14"
    }
}
