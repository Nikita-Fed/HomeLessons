package arraysHomeLesson;

import java.util.Arrays;

public class ArraysTask1 {
    public static void main(String[] args) {
        // Задача 1
//        Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2).
        int[] evenArr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = evenArr.length-1; i >= 0 ; i--) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.println();

//            Задача 2
//        Создайте массив из 15 случайных целых чисел из отрезка [0;9].
//        Выведите массив в консоль.
//        Подсчитайте сколько в массиве чётных элементов и выведете это количество в консоль.
            int[] randomArr = new int[15];
            for (int j = 0; j < randomArr.length; j++) {
                randomArr[j] = (int) (Math.random()*10);
                System.out.print(randomArr[j] + " ");
            }
            int evenCount = 0;
        for (int i = 0; i < randomArr.length; i++) {
            if (randomArr[i]%2==0)
                evenCount++;
        }
        System.out.println();
        System.out.println(evenCount);
//        Задача 3
//        Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его в консоль.
//        Определить и вывести в консоль сообщение о том, является ли массив строго возрастающей последовательностью.
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100+10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] array2 = array.clone();
        Arrays.sort(array2);
        System.out.println(Arrays.equals(array,array2));

//        Задача 4
//        Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив в консоль.
//        Определите какой элемент встречается в массиве чаще всего и выведите об этом в консоль.
//        Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
        int[] array4 = new int[11];
        int countZero = 0, countMinus = 0, countPlus = 0;
        for (int i = 0; i < 11; i++) {
            array4[i] = (int) (Math.random()*3)-1;
            System.out.print(array4[i] + " ");
            if (array4[i] == -1)
                countMinus++;
            else if (array4[i] == 1)
                countPlus++;
            else countZero++;
        }
        System.out.println();
//        System.out.println("countMinus = " + countMinus + "countPlus = " + countZero + "countPlus = " + countPlus);


        }
    }

