package stringtasks;

public class Task1 {
    // Задача №1.
//    Даны 2 слова, состоящие из четного числа букв. Получить слово состоящее из первой половины первого слова и второй половины второго слова.

    public static void main(String[] args) {
        String str1 = "Privet";
        String str2 = "Zanzibar";
        String str3 = str1.substring(0,str1.length()/2) + str2.substring(str2.length()/2);
        System.out.println(str3);
    }
}
