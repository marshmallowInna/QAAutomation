package task4;

public class For {
    public static void main(String[] args) {

        //int [] array = {1,2,3,4,5};

        for (int i = 0, j = 10; ; i++, j--) { //убрали <5 ,>6 и получли бескоечный цыкл
            System.out.println("This is " + i + " iterator");
            System.out.println("This is " + j + " iterator");
        }

    }
}
