import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Входные данные
        // TODO: 07.10.2021 Реализовать input данных
        int n = 4;
        int m = 6;
        int result = -1;
        ArrayList<Integer> cList = new ArrayList<Integer>();
        cList.add(199);
        cList.add(453);
        cList.add(220);
        cList.add(601);
        cList.sort(Collections.reverseOrder());

        //Начало решения

        //Удаление лишних счетов
        if (n > m) {
            int difference = n - m;
            for (int i = 0; i < difference; i++) {
                cList.remove(n - 1 - i);
                n--;
            }
            System.out.println(cList);
        }

        //Проверка, достаточно ли денег, чтобы раздать по 1 у.е.
        int sum = 0;
        for (Integer c: cList) {
            sum += c;
        }
        if (sum < m) {
            result = 0;
        }
        int maxResult = sum / m;


        System.out.println(result);
    }
}
