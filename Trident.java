
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.reflect.*;
import java.lang.*;
import java.io.*;

public class Trident extends ChessPiece
{
    int x;
    int y;

    //setPosition of x
    public void setX(int x)
    {
        this.x = x;
    }

    //setPosition of y
    public void setY(int y)
    {
        this.y = y;
    }

    public Trident(int x,int y)
    {
        setX(x);
        setY(y);
    }

     public boolean logicMovement(int cury,int curx,int prevy,int prevx)
     {
            //Checking right movement
        for(int check=curx-1; prevx<check;check--)
        {
            if(Board.chessBoard[prevy][check]!=" ")
            {
                return false;
            }
        }
            //Checking left movement
         for(int check=curx+1; prevx>check;check++)
        {
            if(Board.chessBoard[prevy][check]!=" ")
            {
                return false;
            }
        }

        if(Board.chessBoard[prevy][prevx]=="tr")
        {
            if(Board.chessBoard[cury][curx]=="a"||Board.chessBoard[cury][curx]=="tr"||Board.chessBoard[cury][curx]=="te"
               ||Board.chessBoard[cury][curx]=="c"||Board.chessBoard[cury][curx]=="e")
            {
                    return false;
            }else
                return true;
        }

        if(Board.chessBoard[prevy][prevx]=="TR")
        {
            if(Board.chessBoard[cury][curx]=="A"||Board.chessBoard[cury][curx]=="TR"||Board.chessBoard[cury][curx]=="TE"
               ||Board.chessBoard[cury][curx]=="C"||Board.chessBoard[cury][curx]=="E")
            {
                    return false;
            }else
                return true;
        }

        return true;
     }

    public boolean  validMovement(int cury,int curx,int prevy,int prevx)
    {
      try
        {
          //Move  1 step up
          if((cury==prevy-1 && curx==prevx))
          {
               return true;
          }

          //Move 1 step left or right
          if(((cury==prevy && curx == prevx-1)||(cury==prevy && curx == prevx+1)))
              {
               return true;
              }

              //Move 2 step left or right
          if(((cury==prevy && curx == prevx-2)||(cury==prevy && curx == prevx+2)))
              {
               return true;
              }

              //Move 3 step left or right
          if( ((cury==prevy && curx == prevx-3)||(cury==prevy && curx == prevx+3)))
              {
               return true;
              }

              //Move 4 step left or right
          if(((cury==prevy && curx == prevx-4)||(cury==prevy && curx == prevx+4)))
          {
               return true;
          }

          //Move 5 step left or right
          if(((cury==prevy && curx == prevx-5)||(cury==prevy && curx == prevx+5)))
              {
               return true;
              }

      //Move 6 step left or right
          if(((cury==prevy && curx == prevx-6)||(cury==prevy && curx == prevx+6)))
              {
               return true;
              }
          }catch(Exception e){
              //do nothing
          }

          return false;
      }
}
