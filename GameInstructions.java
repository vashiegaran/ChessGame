import javax.swing.JOptionPane; //imports
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameInstructions extends JFrame implements ActionListener{

    public void actionPerformed(ActionEvent e)
    {
        JFrame f = new JFrame(); //creates jframe f
        setTitle("How To Play Perilanda Chess");
        setVisible(true);
        setLocationRelativeTo(null);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //this is your screen size
        System.out.println(screenSize);
        f.setUndecorated(true); //removes the surrounding border

        ImageIcon image = new ImageIcon("GameInstruction.png"); //imports the image
        //Image scaleImage = image.getImage().getScaledInstance(1, 1,Image.SCALE_DEFAULT);

        JLabel lbl = new JLabel(image); //puts the image into a jlabel

        f.getContentPane().add(lbl); //puts label inside the jframe

        f.setSize(image.getIconWidth(), image.getIconHeight()); //gets h and w of image and sets jframe to the size

        int x = (screenSize.width - f.getSize().width)/2; //These two lines are the dimensions
        int y = (screenSize.height - f.getSize().height)/2;//of the center of the screen

        f.setLocation(x, y); //sets the location of the jframe
        f.setVisible(true); //makes the jframe visible
    }
}



// import java.awt.Container;
// import java.awt.EventQueue;
// import javax.swing.GroupLayout;
// import javax.swing.ImageIcon;
// import javax.swing.JComponent;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.event.*;
// import java.awt.Dimension;
// import java.awt.Image;
// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
//
// //code for displaying the Game Instructions when clicked by the user
// class GameInstructions extends JFrame implements ActionListener{
//
//   public void actionPerformed(ActionEvent e){ initUI();	}
//
//   private void initUI(){
//
//     ImageIcon ii = loadImage();
//
//     JLabel label = new JLabel(ii);
//     createLayout(label);
//
//     setTitle("How To Play Perilanda Chess");
//     setVisible(true);
//     setLocationRelativeTo(null);
//   }
//
//   private ImageIcon loadImage(){
//
//     ImageIcon ii = new ImageIcon("GameInstruction.png");
//     Image scaleImage = ii.getImage().getScaledInstance(1, 1,Image.SCALE_DEFAULT);
//
//     return ii;
//   }
//
//   private void createLayout(JComponent... arg) {
//
//     Container pane = getContentPane();
//     GroupLayout gl = new GroupLayout(pane);
//     pane.setLayout(gl);
//     gl.setAutoCreateContainerGaps(true);
//     gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));
//     gl.setVerticalGroup(gl.createParallelGroup().addComponent(arg[0]));
//     pack();
//   }
// }
