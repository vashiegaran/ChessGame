
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.reflect.*;
import java.lang.*;
import java.io.*;

public class Tercel extends ChessPiece
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


    public Tercel(int x,int y)
    {
        setX(x);
        setY(y);
    }

    public boolean logicMovement(int cury,int curx,int prevy,int prevx)
    {
        ///Checking movement for left
         for(int check=curx-1; prevx<check;check--)
        {
            if(Board.chessBoard[prevy][check]!=" ")
            {
                return false;
            }
        }

         ///Checking movement for right
         for(int check=curx+1; prevx>check;check++)
        {
            if(Board.chessBoard[prevy][check]!=" ")
            {
                return false;
            }
        }

          ///Checking movement for up
         for(int check=cury+1; prevy>check;check++)
        {
            if(Board.chessBoard[check][curx]!=" ")
            {
                return false;
            }
        }

           ///Checking movement for down
         for(int check=cury-1; prevy<check;check--)
        {
            if(Board.chessBoard[check][curx]!=" ")
            {
                return false;
            }
        }

        if(Board.chessBoard[prevy][prevx]=="TE")
        {
            if(Board.chessBoard[cury][curx]=="a"||Board.chessBoard[cury][curx]=="tr"||Board.chessBoard[cury][curx]=="te"
               ||Board.chessBoard[cury][curx]=="c"||Board.chessBoard[cury][curx]=="e")
            {
                    return false;
            }else
                return true;
        }

        if(Board.chessBoard[prevy][prevx]=="te")
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
        //Move up any step up and down
        try
            {
            if(((cury==prevy-1&&curx==prevx)||(cury==prevy+1&&curx==prevx)))
                {
                 return true;
                }

            if( ((cury==prevy-2&&curx==prevx)||(cury==prevy+2&&curx==prevx)))
                {
                 return true;
                }

            if(((cury==prevy-3&&curx==prevx)||(cury==prevy+3&&curx==prevx)))
                {
                 return true;
                }

            if(((cury==prevy-4&&curx==prevx)||(cury==prevy+4&&curx==prevx)))
                {
                 return true;
                }

            if( ((cury==prevy-5&&curx==prevx)||(cury==prevy+5&&curx==prevx)))
                {
                 return true;
                }

            if( ((cury==prevy-6&&curx==prevx)||(cury==prevy+6&&curx==prevx)))
                {
                 return true;
                }

                }catch(Exception e){
                ///do nothing
                }


    //////////////////////////////////////////////////////////////////
        //Move any step left or right
        try{
            if(((cury==prevy&&curx==prevx-1)||(cury==prevy&&curx==prevx+1)))
                {
                 return true;
                }

            if(((cury==prevy&&curx==prevx-2)||(cury==prevy&&curx==prevx+2)))
                {
                 return true;
                }

            if(((cury==prevy&&curx==prevx-3)||(cury==prevy&&curx==prevx+3)))
                {
                 return true;
                }

            if(((cury==prevy&&curx==prevx-4)||(cury==prevy&&curx==prevx+4)))
                {
                 return true;
                }

            if( ((cury==prevy&&curx==prevx-5)||(cury==prevy&&curx==prevx+5)))
                {
                 return true;
                }

            if(((cury==prevy&&curx==prevx-6)||(cury==prevy&&curx==prevx+6)))
                {
                 return true;
                }

                }catch(Exception e){
                ///do nothing
             }

             return false;
    }
}
