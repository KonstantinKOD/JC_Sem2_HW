package tasks;

// Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.

import java.util.Scanner;

public class DiffMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int playerDig = sc.nextInt();
        System.out.println();
        int[] mass = new int[playerDig];
        System.out.println("Введите числа для того,\nчтоб узнать какие из них четные: ");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = sc.nextInt();
        }
        System.out.println(diffMinMax(mass));

    }
    public static int diffMinMax(int[] mass){
        int min = mass[0];
        int max = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] <= min){
                min = mass[i];
            }
        }
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > max){
                max = mass[i];
            }
        }
        int diff = max - min;
        System.out.print("Разница максимального и минимального: ");
        return diff;
    }
}
