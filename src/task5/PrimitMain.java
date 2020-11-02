package task5;

public class PrimitMain {
    public static void main(String[] args) {
        int i = 1;
    increment(i);
        System.out.println(i);// выводит 1

        User user = new User(10); // создали ссылку на обьект
        increment(user); // которая передается
        System.out.println(user); //выводит 11
}


public static void increment( int i) {
    //System.out.println(i); //внутри метода у  нас 2 но консоль выводить будет 1 т.к. примитивы передают свое значение- клонируют и передают в метод
    i++;
}
    public static void increment(User user){
    ++user.id; //ссылочный тип данных и наша ссылка менят значения в любом месте и выводит 11
    }
}

