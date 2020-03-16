package stringtasks;

import java.util.Arrays;

public class Task4 {
//    Задача 4
//    Написать функцию, которая проверяет, является ли строка палиндромом.
//    Палиндром — это слово или фраза, которые одинаково читаются по буквам или по словам как слева направо, так и справа налево.
    public static void main(String[] args) {
        String str = "пора ароп";
        char[] massiv = str.toCharArray();
        char[] obrMassiv = massiv.clone();
        System.out.println(Arrays.toString(obrMassiv));
        char temp;
        for (int i = 0, j = massiv.length-1; i < massiv.length/2; i++, j--) {
            temp = obrMassiv[i];
            obrMassiv[i] = obrMassiv[j];
            obrMassiv[j] = temp;
        }
        System.out.println(Arrays.toString(obrMassiv));
//        System.out.println(Arrays.equals(massiv, obrMassiv));
        if (Arrays.equals(massiv, obrMassiv))
            System.out.println("Строка является палиндромом");
        else
            System.out.println("Строка не является палиндромом");

    }
}
