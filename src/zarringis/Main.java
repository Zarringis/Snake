package zarringis;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 2;
        p1.y= 3;
        p1.sym = '*';
        char escCode = 0x1B;

        Draw(p1.x, p1.y, p1.sym);

        /*int x2 = 3;
        int y2 = 4;
        char sym2 = '#';*/

        //Draw(x2, y2, sym2);
    }
    static void Draw(int x, int y, char sym)
    {
        char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df",escCode,x,y)); //ставит курсор на экране
        System.out.print(sym); //рисует символ
    }

}
