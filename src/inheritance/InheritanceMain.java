package inheritance;

/**
 * Task:
 * There are a base Person class and subclasses (the Professor, Student classes).
 * You have to do the following:
 *   1. Complete Professor, Student classes by implementing abstract method work();
 *   2. Add getters and setters in each class;
 *   3. Add some specific methods to expand subclasses with new behavioral;
 *   4. Follow the principals of encapsulations;
 *   5. Create at least 3 new classes that inherit already provided ones and perform 4 points decribed in the above;
 * The classes to complete the task are in io.github.valentyn.nahai.oop.inheritance.people package.
 *
 * Задача:
 * Есть базовый класс Person и подклассы (классы Professor, Student).
 * Вам необходимо сделать следующее:
 *   1. Завершить классы профессора, ученика, реализовав абстрактный метод work ();
 *   2. Добавить геттеры и сеттеры в каждый класс;
 *   3. Добавить некоторые специфические методы для расширения подклассов с новым поведением;
 *   4. Следовать принципам инкапсуляции;
 *   5. Создать как минимум 3 новых класса, которые наследуют уже предоставленные, и выполнить 4 пункта, описанных выше;
 * Классы для выполнения задачи находятся в пакете io.github.valentyn.nahai.oop.inheritance.people.
 */

    public class InheritanceMain {
    public static void main(String[] args) {
        Person person = new Student(); // наш абстр класс персон , а в студенте уже есть реализация нашего абс метода
        //person. - методы все доступны

        Student student = new Student();
        // person. - не могу вызвать с студента Универ и кредит
        Student student1 = new Student("aaaa"," m", "dffff","KPI", 4);
        Student student2 = new Student("bbbbb","w","dddddd","NTY",2000);
        System.out.println(student1);
        System.out.println(student2.toString());
        student.work();
        System.out.println("----------------------------");

        Professor p = new Professor();
        p.work();
        p.numberCourse();
        System.out.println(p);
        System.out.println("-----------------------------------------");
        Speciality s = new Speciality("ffffff", "w", "sttreet","PPP",5000,"QA");
        s.description();
        s.nameCity();
        s.rating();
        System.out.println(s.getTechnical());
        System.out.println(s);

        System.out.println("---------------------------------------------");

        student.study();
        student.activity(4);
        student.nameYear();
        System.out.println("--------------------------------------------------");
        User user = new User("xxxx", "m", " adress", " YYY", 500 , "987654321","dotcom@gmail.com " );
        user.greeting();
        user.work();
        System.out.println(user.toString());

        System.out.println(student);
        System.out.println(student.activity(4));

       // extraWork(new Person){  //анонимный обьект

        }
    }

  /*  public static void exraWork(Person person)}
    person.work();
}*/


