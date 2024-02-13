package org.example;
//лаба 3 - строка палиндром?
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку, если хотите выйти - введите слово 'выход'");
        while (true) {
            String stroka = sc.nextLine().toLowerCase().replaceAll("//s", "");
            if (stroka.equals("выход")){
                break;
            }
            int i = 0;
            int j = stroka.length() - 1;
            while (i < j) {
                if (stroka.charAt(i) != stroka.charAt(j)) {
                    break;
                }
                i++; j--;
            }
            System.out.println((i >= j) ? "строка является палиндромом" : "строка не палиндром");
        }
    }
}