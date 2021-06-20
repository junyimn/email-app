package com.company;

import java.util.Scanner;

public class email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternativeEmail;
    private String email;
    private String companySuffix = "kaibacorp.com";

    // Constructor to receive  the first name and last name

    public email (String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        // call a method which ask for department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // call a method which returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // combine
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
        System.out.println("Your email is " + email);
    }



    // Ask for department

    private String setDepartment() {
        System.out.print("Department Codes\n1 for Sales\n2 for Development\n3 for accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    // Generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTVUWXYZ0123456789!@";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
           int rand =  (int)(Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    // Set the mailbox capacity

    // set the alt email

    // change the password

}
