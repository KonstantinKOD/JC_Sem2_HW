package tasks;


import java.util.Scanner;

public class Main {
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
        System.out.println(checkEven(mass));

    }
    public static int checkEven (int[] mass){
        int SumEven = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0){
                SumEven += 1;
            }
        }
        System.out.print("Количество четных в массиве: ");
        return SumEven;
    }

}