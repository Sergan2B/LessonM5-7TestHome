package kg.geektech.lessonm5_7test;

import java.util.Arrays;

public class ReverseWords {

    /*Урок 6 дз.
    ссылка на урок - https://youtu.be/3_abM0oE0Lw
    дедлайн до след урока
    1. Добавить тесты для метода reverseWords(
    1 case: три и более слов. СДЕЛАНО
    2 case: пробелы в начале и в конце стринга СДЕЛАНО
    3 case: придумать самим СДЕЛАНО
    ).Дополнить метод reverse() - что бы он проходил все тесты.
    2. Написать simple test для арифметических  функций.
    3. Написать логику работы вьюшек в MainActivity и добавить для них тесты в класса MainActivityTest.*/

    public String reverseString(String words) {
        //Будет приходить слова через пробел
        String[] reversWords = words.split(" ");
        Arrays.sort(reversWords);
        return Arrays.toString(reversWords);
    }

    public String deleteSpaceProgram(String words) {
        return words.replace(" ", "");
    }

    public String workString(String words) {
        if (!words.equals("set")) {
            words.replaceAll("", "set");
        }
        else words.replaceAll("", "error");
        return words;
    }

    public String firstUpperCase(String words){
        if(words == null || words.isEmpty()) return "";//или return words;
        return words.substring(0, 1).toUpperCase() + words.substring(1);
    }
}
