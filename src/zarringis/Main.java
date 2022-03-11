package zarringis;

import java.io.Console;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, Snake");
        int x1 = 2;
        int y1 = 3;
        char sym1 = '*';
        char escCode = 0x1B;

        Draw(x1, y1, sym1);

        int x2 = 3;
        int y2 = 4;
        char sym2 = '#';

        Draw(x2, y2, sym2);
    }
    static void Draw(int x, int y, char sym)
    {
        char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df",escCode,x,y)); //ставит курсор на экране
        System.out.print(sym); //рисует символ
    }

}
