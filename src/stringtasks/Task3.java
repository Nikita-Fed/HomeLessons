package stringtasks;

public class Task3 {
//    Задача 3
//    Имеются две строки. Найти количество вхождений одной строки в другую.
    public static void main(String[] args) {
        String str1 = "Поркооркакорка";
        String str2 = "орк";
        String big, small;
        if (str1.length() > str2.length()) {
            big = str1;
            small = str2;
        }
        else {
            small = str1;
            big = str2;
        }
//        System.out.println(big + " " + small);
        int count = 0; // счетчик вхождений
        for (int i = 0; i < big.length()-small.length()+1; i++) {
            if (big.startsWith(small,i))
                count++;
        }
        System.out.println("Количество вхождений строки " + small + " в строку " + big + " равно " + count);
    }
}
