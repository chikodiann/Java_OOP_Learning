package org.example;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount();
//        BankAccount bobsAccount = new BankAccount("0011223344",
//                1000.00, "Bob Brown", "bob@email.com",
//                "(081) 1234 56");
        BankAccount timsAccount = new BankAccount("111122", "Tim Buchi", "081 755656")
;
        System.out.println("Account no: " + timsAccount.getAccountNumber() +
                "; name " + timsAccount.getCustomerName());


        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());


        /* this is no longer needed, all of this code is replaced by the use of a constructor...
        bobsAccount.setAccountNumber("0011223344");
        bobsAccount.setAccountBalance(1000.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setEmail( "bob@email.com");
        bobsAccount.setPhoneNumber("(081) 1234 56");
         */

        bobsAccount.depositFunds(1000);
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.withdrawFunds(900);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        System.out.println("*********************************************");
        System.out.println();

        SimpleCalculator calculate = new SimpleCalculator();

        calculate.setFirstNumber(20);
        calculate.setSecondNumber(10);



        System.out.println("Addition result = " + calculate.getAdditionResult());
        System.out.println("Subtraction result = " + calculate.getSubtractionResult());
        System.out.println("Division result = " + calculate.getDivisionResult());
        System.out.println("Multiplication result = " + calculate.geMultiplicationResult());

        System.out.println("**********************************************");
        System.out.println();

        Person person = new Person();

        person.setFirstName("Ann");
        person.setLastName("Luke");

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getFullName());

        System.out.println("**********************************************");
        System.out.println();

        Customer customer1 = new Customer("Chika",1000,"chika@email.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());

        System.out.println();
        Customer customer2 = new Customer();

        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());

        System.out.println();
        Customer customer3 = new Customer("Joe", "joe@email.com");

        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmailAddress());

        System.out.println("**********************************************");
        System.out.println();




                PriorityQueue<String> priorityQueue = new PriorityQueue<>();

                // Add the strings to the priority queue

                priorityQueue.add("Arinze Isaac");
                priorityQueue.add("Chikodinaka Anyanwu");
                priorityQueue.add("Chinwendu Nsonwu");
                priorityQueue.add("Susan Egonu");
                priorityQueue.add("Adebisi Adeyemi");

                // Print the priority queue
                while (!priorityQueue.isEmpty()) {
                    System.out.println(priorityQueue.poll());
                }

        System.out.println("**********************************************");
        System.out.println();


        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("592300" + i,
                    switch (i) {
                        case  1 -> "Mary";
                        case  2 -> "Carol";
                        case  3 -> "Tim";
                        case  4 -> "Harry";
                        case  5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1996",
                    "Java Masterclass");
            System.out.println(s);
        }

        System.out.println();
        Student pojoStudent = new Student("5923006", "Ann",
                "05/11/1996", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("5923007", "Bill",
                "05/11/1996", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println();

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
    }
}