
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    static void rect(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j==0 || j==5)
                    System.out.print(" | ");
                if (j!=0 && j!=5){
                    if (i==0 || i==5)
                        System.out.print(" - ");
                    else
                        System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    Main(){
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();
        add(panel);

        pack();
    }
    public static void main(String[] args) {
        new Main();

    }
}

