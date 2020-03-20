
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.reflect.*;
import java.lang.*;
import java.io.*;

public class Excel extends ChessPiece
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

    public Excel(int x,int y)
    {
        setX(x);
        setY(y);
    }

    public boolean logicMovement(int cury,int curx,int prevy,int prevx)
    {
        //Check movement for diagonally right upward
        for(int checky=cury+1,  checkx = curx-1;prevy>checky && prevx<checkx;checky++,checkx--)
        {
            if(Board.chessBoard[checky][checkx]!=" ")
            {
                return false;
            }
        }
        //Check movement for diagonally right downward
        for(int checky=cury-1,  checkx = curx-1;prevy<checky && prevx<checkx;checky--,checkx--)
        {
            if(Board.chessBoard[checky][checkx]!=" ")
            {
                return false;
            }
        }

        //Check movement for diagonally left upward
        for(int checky=cury+1,  checkx = curx+1;prevy>checky && prevx>checkx;checky++,checkx++)
        {
            if(Board.chessBoard[checky][checkx]!=" ")
            {
                return false;
            }
        }

          //Check movement for diagonally left downward
        for(int checky=cury-1,  checkx = curx+1;prevy<checky && prevx>checkx;checky--,checkx++)
        {
            if(Board.chessBoard[checky][checkx]!=" ")
            {
                return false;
            }
        }

        if(Board.chessBoard[prevy][prevx]=="e")
        {
            if(Board.chessBoard[cury][curx]=="a"||Board.chessBoard[cury][curx]=="tr"||Board.chessBoard[cury][curx]=="te"
               ||Board.chessBoard[cury][curx]=="c"||Board.chessBoard[cury][curx]=="e")
            {
                    return false;
            }else
                return true;
        }

        if(Board.chessBoard[prevy][prevx]=="E")
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


    public boolean validMovement(int cury,int curx,int prevy,int prevx)
    {
      ////////////// -----  move any number of steps diagonally left right -----  ///////////////////////

            //Move 1 step diagonally left or right

      try {
            if(((cury==prevy+1 && curx==prevx+1)||(cury==prevy-1 && curx==prevx-1)
                || (cury==prevy-1 && curx==prevx+1)||(cury==prevy+1 && curx==prevx-1)))
                {
                 return true;
                }

             //Move 2 step diagonally left or right

            if(((cury==prevy+2 && curx==prevx+2)||(cury==prevy-2 && curx==prevx-2)
                || (cury==prevy-2 && curx==prevx+2)||(cury==prevy+2 && curx==prevx-2)))
                {
                 return true;
                }

             //Move 3 step diagonally left or right

            if(((cury==prevy+3 && curx==prevx+3)||(cury==prevy-3 && curx==prevx-3)
                || (cury==prevy-3 && curx==prevx+3)||(cury==prevy+3 && curx==prevx-3)))
                {
                 return true;
                }

             //Move 4 step diagonally left or right

            if(((cury==prevy+4 && curx==prevx+4)||(cury==prevy-4 && curx==prevx-4)
                || (cury==prevy-4 && curx==prevx+4)||(cury==prevy+4 && curx==prevx-4)))
                {
                 return true;
                }

             //Move 5 step diagonally left or right

            if(((cury==prevy+5 && curx==prevx+5)||(cury==prevy-5 && curx==prevx-5)
                || (cury==prevy-5 && curx==prevx+5)||(cury==prevy+5 && curx==prevx-5)))
                {
                 return true;
                }

             //Move 6 step diagonally left or right

            if(((cury==prevy+6 && curx==prevx+6)||(cury==prevy-6 && curx==prevx-6)
                || (cury==prevy-6 && curx==prevx+6)||(cury==prevy+6 && curx==prevx-6)))
                {
                 return true;
                }

          }catch(Exception e){
            //do nothing
          }
        return false;
     }
}
