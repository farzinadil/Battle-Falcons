/**
 * Created by farzinadil on 10/29/19.
 */
import javax.swing.*;
import java.awt.*;


public class Main {

    JFrame frame;

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();




    Main(){
        frame = new JFrame();
        frame.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.getContentPane().setBackground(Color.white);
        frame.setTitle("Battle Falcons");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Top Row
        JPanel rect1 = new JPanel();
        draw(rect1, (int)(screenSize.width*0.18),0,(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect2 = new JPanel();
        draw(rect2, (int)(screenSize.width*0.315),0,(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect3 = new JPanel();
        draw(rect3, (int)(screenSize.width*0.45),0,(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect4 = new JPanel();
        draw(rect4, (int)(screenSize.width*0.585),0,(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect5 = new JPanel();
        draw(rect5, (int)(screenSize.width*0.72),0,(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));


        //2nd Row
        JPanel rect6 = new JPanel();
        draw(rect6, (int)(screenSize.width*0.1125),(int)(screenSize.height*0.265),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect7 = new JPanel();
        draw(rect7, (int)(screenSize.width*0.2475),(int)(screenSize.height*0.265),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect8 = new JPanel();
        draw(rect8, (int)(screenSize.width*0.3825),(int)(screenSize.height*0.265),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect9 = new JPanel();
        draw(rect9, (int)(screenSize.width*0.5175),(int)(screenSize.height*0.265),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect10 = new JPanel();
        draw(rect10, (int)(screenSize.width*0.6525),(int)(screenSize.height*0.265),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect11 = new JPanel();
        draw(rect11, (int)(screenSize.width*0.7875),(int)(screenSize.height*0.265),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));

        //3rd Row
        JPanel rect12 = new JPanel();
        draw(rect12, (int)(screenSize.width*0.1125),(int)(screenSize.height*0.53),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect13 = new JPanel();
        draw(rect13, (int)(screenSize.width*0.2475),(int)(screenSize.height*0.53),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect14 = new JPanel();
        draw(rect14, (int)(screenSize.width*0.3825),(int)(screenSize.height*0.53),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect15 = new JPanel();
        draw(rect15, (int)(screenSize.width*0.5175),(int)(screenSize.height*0.53),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect16 = new JPanel();
        draw(rect16, (int)(screenSize.width*0.6525),(int)(screenSize.height*0.53),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect17 = new JPanel();
        draw(rect17, (int)(screenSize.width*0.7875),(int)(screenSize.height*0.53),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));

        //Bottom Row
        JPanel rect18 = new JPanel();
        draw(rect18, (int)(screenSize.width*0.18),(int)(screenSize.height*0.795),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect19 = new JPanel();
        draw(rect19, (int)(screenSize.width*0.315),(int)(screenSize.height*0.795),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect20 = new JPanel();
        draw(rect20, (int)(screenSize.width*0.45),(int)(screenSize.height*0.795),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect21 = new JPanel();
        draw(rect21, (int)(screenSize.width*0.585),(int)(screenSize.height*0.795),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect22 = new JPanel();
        draw(rect22, (int)(screenSize.width*0.72),(int)(screenSize.height*0.795),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));





    }
    public void draw(JPanel square, int x, int y, int z, int w){
        square.setBackground(Color.gray);
        square.setBounds(x,y,z,w);
        frame.add(square);


    }




    public static void main (String[]args) {
        new Main();
    }
}
