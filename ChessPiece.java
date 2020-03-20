import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

//Design pattern Abstract Factory
public abstract class ChessPiece  //abstract class (ChessPieces)
{
    // private String token=null;
    // int piecesType;
    int prevy;  //variable for getting the location of the piece image clicked
    int prevx;

    int curx;   //variable for getting the location of the desired move to be done by the user
    int cury;

      //check valid movement of the piece
      public abstract boolean validMovement(int cury,int curx,int prevy,int prevx);
      //check Movements doesnt pass through any pieces
      public abstract boolean logicMovement(int cury,int curx,int prevy,int prevx);
}
