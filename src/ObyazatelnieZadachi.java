import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ObyazatelnieZadachi {
    public static void main(String[] args) throws IOException {
//        Первая задача
        int nod = 0;
        int smaller = 0;
        int a = 180, b = 210;
        if (a<b)
            smaller = a;
        else smaller = b;
        System.out.println(smaller);
        for (int i = 2; i <= smaller; i++) {
            if (a%i==0 && b%i==0)
                nod = i;

        }
        System.out.println("НОД равен: " + nod);
//        Вторая задача
        int ind1 = 0, ind2 = 0;
        int[] array = {9, 15, 44, 2, 4, 6, 1, 5, 11};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (array[i] + array[j] == 7) {
                    ind1 = i;
                    ind2 = j;
                }
            }
        }
        System.out.println("Сумма элементов под индексами " + ind1 + " и " + ind2 + " равна 7.");

//        Третья задача
        int sizeArr = 9;
        int[] arrayRand = new int[sizeArr];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, ave = 0;
        int summaArray = 0;
        for (int i = 0; i < sizeArr; i++) {
            arrayRand[i] = (int) (Math.random() * 100);
            summaArray += arrayRand[i];
            if (i == sizeArr-1)
                break;
            else if (arrayRand[i] > max)
                max = arrayRand[i];
            else if (arrayRand[i] < min)
                min = arrayRand[i];
        }
        System.out.println("Ряд массива: " + Arrays.toString(arrayRand));
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Среднее арифметическое: " + (ave = summaArray / sizeArr));

//        Четвертая задача

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        while (true) {
            System.out.println("Введите число:");
            n = Integer.parseInt(reader.readLine());
            if (n>3)
                break;
        }
        int[] array4 = new int[n];
        int countEven = 0;
        for (int i = 0; i < n; i++) {
            array4[i] = (int) (Math.random() * (n + 1));
            if (array4[i] % 2 == 0)
                countEven++;
        }

        System.out.println(Arrays.toString(array4));
        System.out.println(countEven);
        int[] array4Even = new int[countEven];
        int countArray4Even = 0;
        for (int i = 0; i < n; i++) {
            if (array4[i] % 2 == 0) {
                array4Even[countArray4Even] = array4[i];
                countArray4Even++;
            }
        }
        System.out.println(Arrays.toString(array4Even));
        System.out.println();

//        Пятая задача
        int[][] array5 = new int[5][8];
        int max5 = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                array5[i][j] = (int) (Math.random()*200)-99;
                System.out.print(array5[i][j] + " ");
                if (array5[i][j] > max5)
                    max5 = array5[i][j];
            }
            System.out.println();
        }
        System.out.println("Максимальный элемент массива равен: " + max5);

    }
}
