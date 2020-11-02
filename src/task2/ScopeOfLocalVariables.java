package task2;
/**
 * Task:
 * Define three or more code blocks in the "main" method that include each other.
 * Then include any numbers of the different variables using any primitive data types
 * in those code of blocks.
 * Finally, to see and understand mechanism of limited access to local variables,
 * it suggests you to output all the above declared variables via System.out.println()
 * in each code of block.
 * See an example below.
 */
public class ScopeOfLocalVariables {
    public static void main(String[] args) {
        {
            int intValue = 97;
            byte byteValue = 10;
            short shortValue = 5;

            {

                // try to output all the earlier declared variables
                System.out.println("Let's try to use 'intValue' variable.");
                System.out.println("We can do it: " + intValue);
                System.out.println("Because we are in the inner block. That's why 'intValue' is accessible");
                System.out.println("byteValue: " +  byteValue);
                System.out.println("shortValue: " + shortValue);



                {
                    // and declare two or more variable here as well
                    char charValue = 'B';
                    long longValue = 14566325896325L;
                    //...

                    // try to output all the earlier declared variables
                    System.out.println("intValue: " + intValue);
                    System.out.println("byteValue: " +  byteValue);
                    System.out.println("shortValue: " + shortValue);
                    System.out.println("charValue: " + charValue);
                    System.out.println("longValue: " + longValue);

                    //...
                }
                // try to output all the earlier declared variables
                System.out.println("intValue: " + intValue);
                System.out.println("byteValue: " +  byteValue);
                System.out.println("shortValue: " + shortValue);

                // We cannot use it here. Why?
                // System.out.println("charValue: " + charValue);
                // System.out.println("longValue: " + longValue);
                //System.out.println("we have variables and they are created inside another block");

            }
        }
        {
            // We cannot use it here. Why?
            // System.out.println("intValue: " + intValue);
            //System.out.println("byteValue: " +  byteValue);
            //System.out.println("shortValue: " + shortValue);
            //System.out.println("we have variables and they are created inside another block");
        }
    }

}
