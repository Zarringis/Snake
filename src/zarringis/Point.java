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
      public Point(Point p) { //задать точку с помощью другой точки
          x = p.x;
          y = p.y;
          sym = p.sym;
      }

      public void Move(int offset, Direction direction){
          if(direction == Direction.RIGHT){
              y = y + offset;}
          else if(direction == Direction.LEFT){
              y = y - offset;}
          else if(direction == Direction.UP){
              x = x + offset;}
          else if(direction == Direction.DOWN){
              x = x - offset;}


      }

      public void draw()
      {
          char escCode = 0x1B;
          System.out.print(String.format("%c[%d;%df",escCode,x,y)); //ставит курсор на экране
          System.out.print(sym); //рисует символ
      }


    }


