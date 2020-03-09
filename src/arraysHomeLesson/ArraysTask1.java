package arraysHomeLesson;

import java.util.Arrays;

public class ArraysTask1 {
    public static void main(String[] args) {
        // Задача 1
        int[] evenArr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = evenArr.length-1; i >= 0 ; i--) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.println();

//            Задача 2
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
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100+10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] array2 = array.clone();
        Arrays.sort(array2);
        System.out.println(Arrays.equals(array,array2));


        }
    }

