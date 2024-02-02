package tasks;

import java.util.Scanner;

// Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
public class ReturnBool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int playerDig = sc.nextInt();
        System.out.println();
        int[] mass = new int[playerDig];
        System.out.println("Введите числа для того,\nчтоб узнать есть ли два соседних элемента, с нулевым значением: ");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = sc.nextInt();
        }
        System.out.println(booleanNull(mass));

    }
    public static boolean booleanNull(int[] mass) {
        for (int i = 1; i < mass.length - 1; i++) {
            if (mass[i -1] == 0 && mass[i + 1] == 0){

                System.out.println("В массиве присутствуют элементы, у которых соседние элементы - 0");
                return true;
            }
        }
        System.out.println("Нет элементов с нулями по соседству");
        return false;
    }
}
