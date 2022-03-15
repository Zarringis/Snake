package zarringis;

public class Point

     {
      public  int x;
      public int y;
      public char sym;

      public void Draw()
      {
          char escCode = 0x1B;
          System.out.print(String.format("%c[%d;%df",escCode,x,y)); //ставит курсор на экране
          System.out.print(sym); //рисует символ
      }


    }


