import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Plyta extends JPanel {
final int Panel_width = 1900;
final int Panel_height = 1080;
Image policja;
Image tlo;
Image tlo1;
Image tlo2;
Timer timer;
int xSzybkosc = 1;
int ySzybkosc = 1;
int x = 0;
int y = 0;
Plyta(){
    this.setPreferredSize(new Dimension(Panel_width,Panel_height));
    this.setBackground(Color.BLACK);
    tlo = new ImageIcon("magazyn1.png").getImage();
    tlo1 = new ImageIcon("magazyn2.png").getImage();
    tlo2 = new ImageIcon("magazyn3.png").getImage();
}
    public void paint(Graphics g){
    super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(tlo,1600,0,300,300,null);
        g2d.drawImage(tlo1,1600,350,300,300,null);
        g2d.drawImage(tlo2,1600,700,300,300,null);
        g2d.drawImage(policja,x,y,null);



    }

}
