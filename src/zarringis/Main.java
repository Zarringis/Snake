package zarringis;

import java.io.Console;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, Snake");
        int x1 = 2;
        int y1 = 3;
        char sym1 = '*';
        char escCode = 0x1B;

        System.out.print(String.format("%c[%d;%df",escCode,x1,y1)); //ставим курсор
        System.out.print(sym1); // печатаем символ

        int x2 = 3;
        int y2 = 4;
        char sym2 = '#';

        System.out.print(String.format("%c[%d;%df",escCode,x2,y2));
        System.out.print(sym2);
    }

}
