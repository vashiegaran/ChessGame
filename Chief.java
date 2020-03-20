
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.reflect.*;
import java.lang.*;
import java.io.*;

public class Chief extends ChessPiece
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

    public Chief(int x,int y)
    {
        setX(x);
        setY(y);
    }

    public boolean logicMovement(int cury,int curx,int prevy,int prevx)
    {
      if(Board.chessBoard[prevy][prevx]=="c")
        {
            if(Board.chessBoard[cury][curx]=="a"||Board.chessBoard[cury][curx]=="tr"||Board.chessBoard[cury][curx]=="te"
               ||Board.chessBoard[cury][curx]=="c"||Board.chessBoard[cury][curx]=="e")
            {
                return false;
            }else
                return true;
        }

        if(Board.chessBoard[prevy][prevx]=="C")
        {
            if(Board.chessBoard[cury][curx]=="A"||Board.chessBoard[cury][curx]=="TR"||Board.chessBoard[cury][curx]=="TE"
               ||Board.chessBoard[cury][curx]=="C"||Board.chessBoard[cury][curx]=="E")
            {
                return false;
            }else
                return true;
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
          //Move 1 step up
          if((cury==prevy+1 && curx==prevx))
          {
               return true;
          }
          //Move 1 step down
          if((cury==prevy-1 && curx==prevx))
          {
               return true;
          }
          //Move 1 step  left or right
          if(((cury==prevy&&curx==prevx-1)||(cury==prevy&&curx==prevx+1)))
          {
           return true;
          }
          //Move 1 step diagonally left or right
          if(((cury==prevy+1 && curx==prevx+1)||(cury==prevy-1 && curx==prevx-1)
              || (cury==prevy-1 && curx==prevx+1)||(cury==prevy+1 && curx==prevx-1)))
          {
           return true;
          }

        }catch(Exception e){
        ///do nothing
        }
        return false;
     }
}
