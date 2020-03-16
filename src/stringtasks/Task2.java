package stringtasks;

import java.util.Arrays;

public class Task2 {
    //    Задача 2.
//    Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.

    public static void main(String[] args) {
        String seq = "Одно короткое слово не все меньше";
        String[] strings = seq.split("\\s");
//        System.out.println(Arrays.toString(strings));
        int max = Integer.MIN_VALUE; //длина наибольшего слова
        int index = 0; //индекс наибольшего слова
        for (int i = 0; i < strings.length; i++) {
            strings[i].trim();
            if (strings[i].length() > max) {
                max = strings[i].length();
                index = i;
            }

        }
        System.out.println("Самое длинное слово предложения: " + strings[index]);

    }


}
