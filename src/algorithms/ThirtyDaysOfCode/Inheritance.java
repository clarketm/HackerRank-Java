package algorithms.ThirtyDaysOfCode;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/30-inheritance/problem

public class Inheritance {

    static class Grade {
        public static final char O = 'O';
        public static final char E = 'E';
        public static final char A = 'A';
        public static final char P = 'P';
        public static final char D = 'D';
        public static final char T = 'T';
    }


    static class Person {
        protected int id;
        protected String firstName;
        protected String lastName;

        // Constructor
        Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.printf("Name: %s, %s\n", lastName, firstName);
            System.out.printf("ID: %d \n", id);
        }
    }


    static class Student extends Person {
        private int[] scores;

        /*
        *   Class Constructor
        *
        *   @param firstName - A string denoting the Person's first name.
        *   @param lastName - A string denoting the Person's last name.
        *   @param id - An integer denoting the Person's ID number.
        *   @param scores - An array of integers denoting the Person's test scores.
        */

        public Student(String firstName, String lastName, int identification, int[] scores) {
            super(firstName, lastName, identification);
            this.scores = scores;
        }

        /*
        *   Method Name: average
        *   @return Average grade score.
        */
        public int average() {
            int total = 0;

            for (int score : scores) {
                total += score;
            }

            return total / scores.length;
        }

        /*
        *   Method Name: calculate
        *   @return A character denoting the grade.
        */
        public char calculate() {
            int average = average();

            if (average >= 90) {
                return Grade.O;
            } else if (average >= 80) {
                return Grade.E;
            } else if (average >= 70) {
                return Grade.A;
            } else if (average >= 55) {
                return Grade.P;
            } else if (average >= 40) {
                return Grade.D;
            } else {
                return Grade.T;
            }
        }

        public void printPerson() {
            super.printPerson();
            System.out.printf("Grade: %c \n", calculate());
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
    }

}


