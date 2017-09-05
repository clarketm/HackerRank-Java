package solutions;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/30-class-vs-instance

public class ClassVsInstance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int i = 0; i < n; i++) {
        Person p1 = new Person(-2);
        Person p2 = new Person(0);
        Person p3 = new Person(13);
        Person p4 = new Person(18);

        p1.yearPasses();
        p2.yearPasses();
        p3.yearPasses();
        p4.yearPasses();

        p1.amIOld(); // You are young. (1)
        p2.amIOld(); // You are young. (1)
        p3.amIOld(); // You are a teenager. (14)
        p4.amIOld(); // You are old. (19)
//        }
    }

}


class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        } else {
            age = initialAge;
        }
    }

    public void amIOld() {
        String message;

        if (age < 13) {
            message = "You are young.";
        } else if (age < 18) {
            message = "You are a teenager.";
        } else {
            message = "You are old.";
        }

        System.out.println(message);
    }

    public void yearPasses() {
        age++;
    }
}