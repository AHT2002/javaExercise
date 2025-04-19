package main.java.com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ایجاد شیء Scanner برای دریافت ورودی از کاربر
        Scanner scanner = new Scanner(System.in);

        // دریافت رشته از کاربر
//        System.out.print("لطفاً یک رشته وارد کنید: ");
        String input = scanner.nextLine();

        // بررسی وجود حرف 'm' (حساس به بزرگی و کوچکی حروف)
//        if (input.toLowerCase().contains("m")) {
//            System.out.println("NO");
//        } else {
//            System.out.println("Yes");
//        }

        //containsMاستفاده از متد تعریف شده
        if (containsM(input) == true){
            System.out.println("NO");
        }else {
            System.out.println("Yes");
        }

        // بستن Scanner
        scanner.close();
    }

    public static boolean containsM(String input) {
        return input.toLowerCase().contains("m");
    }
}
