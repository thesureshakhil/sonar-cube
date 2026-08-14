package com.example;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static String PASSWORD = "admin123"; // Hardcoded password

    public static void main(String[] args) {

        List list = new ArrayList();   // Raw type
        list.add("Java");

        int unusedVariable = 100;      // Unused variable

        System.out.println("Application Started");

        App app = new App();
        app.calculate(10, 0);

        if (true) {                    // Constant condition
            System.out.println("Always True");
        }

        String str = null;
        if (str.equals("Hello")) {     // Possible NullPointerException
            System.out.println(str);
        }

        System.exit(0);                // Avoid using System.exit()
    }

    public int calculate(int a, int b) {

        if (b == 0) {
            return 0;                  // Poor error handling
        }

        return a / b;
    }

    public void duplicateCode1() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void duplicateCode2() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
