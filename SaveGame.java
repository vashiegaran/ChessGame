import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

//Save class to save the game data to the file
   public class SaveGame implements ActionListener{

    public void actionPerformed(ActionEvent e){
      
      String[][] copyOfBoard = Board.chessBoard;

        for (int i = 0; i < 7; i++)
        {
           for (int j = 0; j < 7; j++)
           {
                copyOfBoard[i][j] = Board.chessBoard[i][j];

            }
        }
        //to show that its working
        // for (int i = 0; i < 7; i++)
        // {
        //    for (int j = 0; j < 7; j++)
        //    {
        //         System.out.println("copyOfBoard" + copyOfBoard[i][i]);
        //
        //     }
        // }
        try{
            File file =  new File("output.txt");
            FileWriter fw= new FileWriter(file);
            for (int i = 0; i < 7; i++)
            {
               for (int j = 0; j < 7; j++)
               {
                    fw.write(copyOfBoard[i][j]+ " ,");


                }fw.write("\n");
            }
            fw.close();
            JOptionPane.showMessageDialog(null,"Game is saved successfully!");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error, Unable to save game!");
        }
    }
}
