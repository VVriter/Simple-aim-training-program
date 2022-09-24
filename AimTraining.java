package ua.nato.himars;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AimTraining {
    public static void main(String... args) {
        JFrame frame = new JFrame("Aim Training");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        //Centering window
        frame.setBounds(x,y,1000,1000);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setLayout(null);
        frame.setResizable(true);
        frame.setBackground(Color.WHITE);



        //Encoder button
        JButton button = new JButton("");
        button.setBounds(15,10,50,50);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.BLACK);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                button.setBounds(randomValue(0,frame.getWidth()-50),randomValue(0,frame.getHeight()-50),50,50);
            }
        });


        //add
        frame.setVisible(true);

        frame.add(button);
    }

    static int randomValue(int min, int max){
        Random r = new Random();
        return r.nextInt(max-min) + min;
    }
}
