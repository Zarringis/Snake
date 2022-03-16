package zarringis;

public class Point

     {
      public  int x;
      public int y;
      public char sym;

      public Point(int _x, int _y, char _sym)
      {
          x = _x;
          y = _y;
          sym = _sym;
      }
      public void draw()
      {
          char escCode = 0x1B;
          System.out.print(String.format("%c[%d;%df",escCode,x,y)); //ставит курсор на экране
          System.out.print(sym); //рисует символ
      }


    }


