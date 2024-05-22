import javax.swing.*;
import java.awt.*;

public class Ramka extends JFrame {
    Ramka(){
        Plyta plyta = new Plyta();
        this.setVisible(true);
        this.setSize(1900,1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(plyta);
        this.setLocationRelativeTo(null);
        this.pack();


    }
}
