package com.revature;

public class Calculator {

    public int calculate(String s) {
        int result = 0;
        int a, b;
        String operator;
        String[] arr = s.split(" ");

        operator = arr[1];
        a = Integer.parseInt(arr[0]);
        b = Integer.parseInt(arr[2]);

        switch (operator) {
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
                break;

        }

        return result;
    }
}
