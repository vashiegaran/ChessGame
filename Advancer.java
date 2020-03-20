
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.reflect.*;
import java.lang.*;
import java.io.*;

public class Advancer  extends ChessPiece
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

    public Advancer(int x,int y)
    {
        setX(x);
        setY(y);
    }

    public boolean validMovement(int cury,int curx,int prevy,int prevx)
    {
      //move 1 or 2 step for forward
      if((cury==prevy-1 &&curx==prevx)||(cury==prevy-2 && curx==prevx))
        return true;
      else
        return false;
    }

    public boolean logicMovement(int cury,int curx,int prevy,int prevx)
    {
        //Check movement
        for(int check=cury+1; prevy>check;check++)
        {
            if(Board.chessBoard[check][curx]!=" ")
            {
                return false;
            }
        }

        if(Board.chessBoard[prevy][prevx]=="a")
        {
            if(Board.chessBoard[cury][curx]=="a"||Board.chessBoard[cury][curx]=="tr"||Board.chessBoard[cury][curx]=="te"
               ||Board.chessBoard[cury][curx]=="c"||Board.chessBoard[cury][curx]=="e")
            {
                    return false;
            }else
                return true;
        }

        if(Board.chessBoard[prevy][prevx]=="A")
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
}
