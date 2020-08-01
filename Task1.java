package com.dmdev.oop.HW10;

/**
 * Проверить, является ли введенная строка палиндромом, т.е читается одинаково в обоих направлениях.
 */
public class Task1 {

    public static void main(String[] args) {

        String value = "1221";
        boolean result = isPalindrome (value);
        System.out.println(result);

    }

    public static boolean isPalindrome (String value){
        int n = value.length();
        for (int i = 0; i < (n/2); ++i) {
            if (value.charAt(i) != value.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
    }

