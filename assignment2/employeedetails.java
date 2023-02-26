//Write a java program to display the employee details of 5 employees using Scanner class.

import java.util.*;

class employeedetails {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        String name[] = new String[5];
        int age[] = new int[5];
        String designation[] = new String[5];
        for (i = 0; i < 5; i++) {
            System.out.println("Enter the name, age and designation of the employee");
            name[i] = sc.next();
            age[i] = sc.nextInt();
            designation[i] = sc.next();
        }
        System.out.println("Name\tAge\tDesignation");
        for (i = 0; i < 5; i++) {
            System.out.println(name[i] + "\t" + age[i] + "\t" + designation[i]);
        }
        sc.close();
    }

}
