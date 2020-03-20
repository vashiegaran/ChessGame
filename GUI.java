import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.reflect.*;
import java.lang.*;
import java.io.*;
import static java.lang.Math.*;


public class GUI extends JComponent implements MouseListener
{
    //private static final long serialVersionUID = 100;
    //setting the rows & collumns for the board
    final int rows = 7;
    final int cols = 7;
    int aX,aY,cX,cY,teX,teY,eX,eY,trX,trY,
        Ax,Ay,Cx,Cy,TEx,TEy,Ex,Ey,TRx,TRy;

    int counterO = 0;
    int counterG = 0;

    //setting the width & height of the Board
    final int width=850;
    final int height=850;

    //to copy the original board from the board class
    String[][] copyOfBoard = Board.chessBoard;
    boolean flag=false;

     @Override
    	public void paintComponent(Graphics g)
    	{
    		super.paintComponent(g);		// draw the rows
            int rowHt = height / (rows);
            for (int i = 0; i < rows; i++)
                g.drawLine(0, i * rowHt, width, i * rowHt);

            // draw the columns
            int rowWid = width / (cols);
            for (int i = 0; i < cols; i++)
                g.drawLine(i * rowWid, 0, i * rowWid, height);

            Image advancerGreen;
            advancerGreen = new ImageIcon("advancerGreen.png").getImage();
            Image advancerBrown;
            advancerBrown = new ImageIcon("advancerBrown.png").getImage();
            Image chiefBrown;
            chiefBrown = new ImageIcon("chiefBrown.png").getImage();
            Image chiefGreen;
            chiefGreen = new ImageIcon("chiefGreen.png").getImage();
            Image excelBrown;
            excelBrown = new ImageIcon("excelBrown.png").getImage();
            Image excelGreen;
            excelGreen = new ImageIcon("excelGreen.png").getImage();
            Image tercelBrown;
            tercelBrown = new ImageIcon("tercelBrown.png").getImage();
            Image tercelGreen;
            tercelGreen = new ImageIcon("tercelGreen.png").getImage();
            Image tridentBrown;
            tridentBrown = new ImageIcon("tridentBrown.png").getImage();
            Image tridentGreen;
            tridentGreen = new ImageIcon("tridentGreen.png").getImage();


            for(int i=0;i<49;i++)
            {
            	switch (Board.chessBoard[i/7][i%7])
              {
            		    case "a":
            			     g.drawImage(advancerBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
            			     break;
                    case "A":
                        g.drawImage(advancerGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
                        break;
                    case "te":
                        g.drawImage(tercelBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
                        break;
                    case "TE":
                        g.drawImage(tercelGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
                        break;
                    case "e":
                        g.drawImage(excelBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
                        break;
                     case "E":
                        g.drawImage(excelGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
                        break;

                    case "tr":
                        g.drawImage(tridentBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
                        break;
                    case "TR":
                        g.drawImage(tridentGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
                        break;
                    case "C":
                        g.drawImage(chiefGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
                        break;
                    case "c":
                        g.drawImage(chiefBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
                        break;
            	  }
            }
       }



        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseClicked(MouseEvent e)
        {
            int coorX=e.getX();
            int coorY=e.getY()-45;

            int y=0;
            int x=0;
            int garbx,garby;
            int poX=(int)Math.floor(coorX/(width/7));
            int poY=(int)Math.floor(coorY/(height/7));

            System.out.println(" " + poY+ " " + poX);

            //Creating pieces Objects
            Advancer ad= new Advancer(y,x);
            Chief c= new Chief(y,x);
            Trident tr= new Trident(y,x);
            Tercel te= new Tercel(y,x);
            Excel ex = new Excel(y,x);

            /////////////////Orange Players////////////
            //to store the index of the pieces
            //this code is for printing the movements in the command line
            //advancer
            if(Board.chessBoard[poY][poX]=="a")
            {
                    aX=poX;
                    aY=poY;
                    System.out.println("advancer" + aY+ " " + aX);
            }

            //chief
             if (Board.chessBoard[poY][poX]=="c")
             {
                    cX=poX;
                    cY=poY;
                    System.out.println("advancer" + cY+ " " + cX);
             }

             //trident
             if (Board.chessBoard[poY][poX]=="tr")
             {
                    trX=poX;
                    trY=poY;
                    System.out.println("tr" + trY+ " " + trX);
             }

             //tercel
             if (Board.chessBoard[poY][poX]=="te")
             {
                    teX=poX;
                    teY=poY;
                    System.out.println("te" + teY + " " + teX);
             }

             //excel
             if (Board.chessBoard[poY][poX]=="e")
             {
                    eX=poX;
                    eY=poY;
                    System.out.println("e" + eY+ " " + eX);
             }

            ////////////////////////////Green Player/////////////////////
            //this code is for printing the movements in the command line
            //Advancer
             if (Board.chessBoard[poY][poX]=="A")
             {
                    Ax=poX;
                    Ay=poY;
                    System.out.println("Advancer A  " + Ax+ " " + Ay);
              }

              //tercel
              if (Board.chessBoard[poY][poX]=="TE")
              {
                    TEx=poX;
                    TEy=poY;
                    System.out.println("TE" + TEy+ " " + TEx);
              }

              //excel
              if (Board.chessBoard[poY][poX]=="E")
              {
                    Ex=poX;
                    Ey=poY;
                    System.out.println("c" + Ey+ " " + Ex);
              }

              //trident
              if (Board.chessBoard[poY][poX]=="TR")
              {
                    TRx=poX;
                    TRy=poY;
                    System.out.println("TR" + TRy+ " " + TRx);
              }

              //chief
              if (Board.chessBoard[poY][poX]=="C")
              {
                    Cx=poX;
                    Cy=poY;
                    System.out.println("c" + Cy+ " " + Cx);
              }

              if(Board.chessBoard[poY][poX]== " ")
              {
                    garbx=poX;
                    garby=poY;
                    System.out.println(garby + "empty click" +garbx);
              }

             /////////////////////////////////////////////////////////////////////////
             ////////For Eating & Movement///////////////////
            /////////Orange Player Moving////////////////////
            //advancer
            if(ad.validMovement(poY,poX,aY,aX) && flag==true && ad.logicMovement(poY,poX,aY,aX))
            {
                    copyOfBoard[aY][aX]=" ";
                    copyOfBoard[poY][poX]="a";
                    if(PlayerO()==false)
                    {
                        JOptionPane.showMessageDialog(null,"Player Orange is the winner");
                        System.exit(0);
                    }
                    //track the number of movements
                    counterO++;
                    changePiecesO();
                    flipBoard();
                    repaint();
                    flag = false;
                    aY=0;
                    aX=0;
            }

            //chief
            else if(c.validMovement(poY,poX,cY,cX)&& flag==true && c.logicMovement(poY,poX,cY,cX))
            {

                  copyOfBoard[cY][cX]=" ";
                  copyOfBoard[poY][poX]="c";
                  if(PlayerO()==false)
                  {
                        JOptionPane.showMessageDialog(null,"Player Orange is the winner");
                        System.exit(0);
                  }
                  //track the number of movements
                  counterO++;
                  changePiecesO();
                  flipBoard();
                  repaint();
                  flag = false;
                  cY=0;
                  cX=0;
            }

            //tridet
            else if(tr.validMovement(poY,poX,trY,trX)&& flag==true && tr.logicMovement(poY,poX,trY,trX))
            {
                  copyOfBoard[trY][trX]=" ";
                  copyOfBoard[poY][poX]="tr";
                  if(PlayerO()==false)
                  {
                        JOptionPane.showMessageDialog(null,"Player Orange is the winner");
                        System.exit(0);
                  }
                  //track the number of movements
                  counterO++;
                  changePiecesO();
                  flipBoard();
                  repaint();
                  flag = false;
                  trY=0;
                  trX=0;
            }

            //excel
            else if(ex.validMovement(poY,poX,eY,eX)&& flag==true && ex.logicMovement(poY,poX,eY,eX))
            {
                  copyOfBoard[eY][eX]=" ";
                  copyOfBoard[poY][poX]="e";
                  if(PlayerO()==false)
                  {
                        JOptionPane.showMessageDialog(null,"Player Orange is the winner");
                        System.exit(0);
                  }
                  //track the number of movements
                  counterO++;
                  changePiecesO();
                  flipBoard();
                  repaint();
                  flag = false;
                  eY=0;
                  eX=0;
            }

            //tercel
            else if(te.validMovement(poY,poX,teY,teX)&& flag==true  && te.logicMovement(poY,poX,teY,teX) )
            {
                  copyOfBoard[teY][teX]=" ";
                  copyOfBoard[poY][poX]="te";
                  if(PlayerO()==false)
                  {
                        JOptionPane.showMessageDialog(null,"Player Orange is the winner");
                        System.exit(0);
                  }
                  //track the number of movements
                  counterO++;
                  changePiecesO();
                  flipBoard();
                  repaint();
                  flag = false;
                  teY=0;
                  teX=0;
            }

            /////////////////////////Green Player Moving////////////////////
            //advancer
            else if(ad.validMovement(poY,poX,Ay,Ax)&& flag==false && ad.logicMovement(poY,poX,Ay,Ax))
            {
                  copyOfBoard[Ay][Ax]=" ";
                  copyOfBoard[poY][poX]="A";
                  if(PlayerG()==false)
                  {
                        JOptionPane.showMessageDialog(null,"Player Green is the winner");
                        System.exit(0);
                  }
                  //track the number of movements
                  counterG++;
                  changePiecesG();
                  flipBoard();
                  repaint();
                  flag = true;
                  Ay=0;
                  Ax=0;
            }

            //tercel
            else if(te.validMovement(poY,poX,TEy,TEx)&& flag==false  && te.logicMovement(poY,poX,TEy,TEx))
            {
                  copyOfBoard[TEy][TEx]=" ";
                  copyOfBoard[poY][poX]="TE";
                  if(PlayerG()==false)
                  {
                        JOptionPane.showMessageDialog(null,"Player Green is the winner");
                        System.exit(0);
                  }
                  //track the number of movements
                  counterG++;
                  changePiecesG();
                  flipBoard();
                  repaint();
                  flag = true;
                  TEy=0;
                  TEx=0;
            }

            //excel
            else if(ex.validMovement(poY,poX,Ey,Ex)&& flag==false && ex.logicMovement(poY,poX,Ey,Ex))
            {
                  copyOfBoard[Ey][Ex]=" ";
                  copyOfBoard[poY][poX]="E";
                  if(PlayerG()==false)
                  {
                        JOptionPane.showMessageDialog(null,"Player Green is the winner");
                        System.exit(0);
                  }
                  //track the number of movements
                  counterG++;
                  changePiecesG();
                  flipBoard();
                  repaint();
                  flag = true;
                  Ey=0;
                  Ex=0;
            }

            //tercel
            else if(tr.validMovement(poY,poX,TRy,TRx)&& flag==false  && tr.logicMovement(poY,poX,TRy,TRx))
            {
                  copyOfBoard[TRy][TRx]=" ";
                  copyOfBoard[poY][poX]="TR";
                  if(PlayerG()==false)
                  {
                        JOptionPane.showMessageDialog(null,"Player Green is the winner");
                        System.exit(0);
                  }
                  //track the number of movements
                  counterG++;
                  changePiecesG();
                  flipBoard();
                  repaint();
                  flag = true;
                  TRy=0;
                  TRx=0;
            }

            //chief
            else if(c.validMovement(poY,poX,Cy,Cx)&& flag==false && c.logicMovement(poY,poX,Cy,Cx))
            {
                  copyOfBoard[Cy][Cx]=" ";
                  copyOfBoard[poY][poX]="C";
                  if(PlayerG()==false)
                  {
                        JOptionPane.showMessageDialog(null,"Player Green is the winner");
                        System.exit(0);
                  }
                  //track the number of movements
                  counterG++;
                  changePiecesG();
                  flipBoard();
                  repaint();
                  flag = true;
                  Cy=0;
                  Cx=0;
            }

            else
                System.out.println("empty move");
              /////////////////////////End of Movement//////////////////////////////

        }

        @Override
        public void mouseEntered(MouseEvent e) {}
        @Override
        public void mouseExited(MouseEvent e) {}
        @Override
        public void mouseReleased(MouseEvent e) {}

        //code for flipping the board
        public void flipBoard()
        {
            for(int y=0; y<3; y++)
            {
                for(int x=0; x<7; x++)
                {
                    String temp = copyOfBoard[6-y][x];
                    copyOfBoard[6-y][x] = copyOfBoard[y][x];
                    copyOfBoard[y][x] = temp;
                }
            }
        }

        //Green Chief Player eating Orange Chief Player
        public boolean PlayerG()
        {
          for(int y=0; y<7; y++)
          {
                for(int x=0; x<7; x++)
                {
                   if(copyOfBoard[y][x]=="c")
                   {
                    return true;
                   }
              }
           }
           return false;
        }

        //Orange CHief Player eating Green Chief Player
        public boolean PlayerO()
        {
          for(int y=0; y<7; y++)
          {
                for(int x=0; x<7; x++)
                {
                   if(copyOfBoard[y][x]=="C")
                   {
                    return true;
                   }
              }
           }
           return false;
        }

        //change tercel to excel and vice versa for Green piece
        public void changePiecesG()
        {
          String tempE=" ";
          String tempTE=" ";
          int ey=10;
          int ex=10;
          if(counterG%3==0)
          {
              for(int y=0; y<7; y++)
              {
                for(int x=0; x<7; x++)
                {

                    if(copyOfBoard[y][x]=="TE")
                    {
                      copyOfBoard[y][x]="i";
                    }
                    if(copyOfBoard[y][x]=="E")
                    {
                     // if(copyOfBoard[y][x]=="i")
                         for(int i=0; i<7; i++){
                            for(int j=0; j<7; j++){

                          if(copyOfBoard[i][j]=="TE")
                              copyOfBoard[y][x]="TE";
                        }
                      }
                    }

                    if(copyOfBoard[y][x]=="i")
                    {
                         // if(copyOfBoard[y][x]=="i")
                          for(int i=0; i<7; i++)
                          {
                                for(int j=0; j<7; j++)
                                {
                                    if(copyOfBoard[i][j]=="i")
                                      copyOfBoard[y][x]="E";
                                }
                          }
                    }
                }
              }
          }
        }

        //change tercel to excel and vice versa for Orange piece
        public void changePiecesO()
        {
              String tempE=" ";
              String tempTE=" ";
              int ey=10;
              int ex=10;

              if(counterG%3==0)
              {
                  for(int y=0; y<7; y++)
                  {
                    for(int x=0; x<7; x++)
                    {

                        if(copyOfBoard[y][x]=="te")
                        {
                          copyOfBoard[y][x]="l";
                        }
                        if(copyOfBoard[y][x]=="e")
                        {
                            // if(copyOfBoard[y][x]=="i")
                             for(int i=0; i<7; i++)
                             {
                                for(int j=0; j<7; j++)
                                {
                                    if(copyOfBoard[i][j]=="te")
                                        copyOfBoard[y][x]="te";
                                }
                              }
                        }

                        if(copyOfBoard[y][x]=="l")
                        {
                         // if(copyOfBoard[y][x]=="i")
                          for(int i=0; i<7; i++)
                          {
                                for(int j=0; j<7; j++)
                                {
                                    if(copyOfBoard[i][j]=="l")
                                        copyOfBoard[y][x]="e";
                                }
                          }
                        }
                    }
                  }
              }
        }

        // private void SetImageAfterFlipBoard( String[][] copyOfBoard) {
        //     for(int i=0;i<49;i++)
        //     {
        //         switch (copyOfBoard[i/7][i%7]){
        //             case "a":
        //                 g.drawImage(advancerBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "a2":
        //                 g.drawImage(advancerBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "a3":
        //                 g.drawImage(advancerBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "a4":
        //                 g.drawImage(advancerBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "a5":
        //                 g.drawImage(advancerBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "a6":
        //                 g.drawImage(advancerBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "a7":
        //                 g.drawImage(advancerBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;


        //             case "A":
        //                 g.drawImage(advancerGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "A2":
        //                 g.drawImage(advancerGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "A3":
        //                 g.drawImage(advancerGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "A4":
        //                 g.drawImage(advancerGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "A5":
        //                 g.drawImage(advancerGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "A6":
        //                 g.drawImage(advancerGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "A7":
        //                 g.drawImage(advancerGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "te":
        //                 g.drawImage(tercelBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "TE":
        //                 g.drawImage(tercelGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "e":
        //                 g.drawImage(excelBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //              case "E":
        //                 g.drawImage(excelGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;

        //             case "tr":
        //                 g.drawImage(tridentBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "TR":
        //                 g.drawImage(tridentGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "C":
        //                 g.drawImage(chiefGreen,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;
        //             case "c":
        //                 g.drawImage(chiefBrown,(i%7)*rowWid, (i/7)*rowHt, rowHt, rowWid, this);
        //                 break;

        //         }
        //     }
        // }

}
