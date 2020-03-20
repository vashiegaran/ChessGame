import java.lang.*;   //MODEL
import javax.swing.*;

public class Main {
  public static void main(String[] args){
      JMenu menu;
      //creating the menu bar
      JMenuBar menubar = new JMenuBar();
      //creating 3 buttons for save game, load game, new game, and instructions
      JMenuItem savemenu,loadgame,newgame,instruction;
      //name of the menu bar
      menu = new JMenu("File");
      newgame= new JMenuItem("New Game");
      savemenu = new JMenuItem("Save Game");
      savemenu.addActionListener(new SaveGame());
      loadgame = new JMenuItem("Load Game");
      //loadgame.addActionListener(new Load());
      instruction = new JMenuItem("Game Instruction");
      instruction.addActionListener(new GameInstructions());
      menubar.add(menu);
      menu.add(newgame);
      menu.add(savemenu);
      menu.add(loadgame);
      menu.add(instruction);

      //setting the title of the JFrame
       JFrame f = new JFrame("Cyber Catur");
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          GUI ui = new GUI();
          f.addMouseListener(ui);
          f.add(ui);
          f.setBounds(30, 30, 850, 900);
          f.setJMenuBar(menubar);
          f.setVisible(true);
          f.setResizable(true);
          f.setLocationRelativeTo(null);
  }
}
