import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HowToPlay extends JFrame implements ActionListener{
    JLabel label;
    JLabel label2;
    JLabel label3;
    JButton done;

    HowToPlay()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920, 1080);
        this.setBackground(Color.white);
        this.setResizable(true);
        this.setLayout(null);


        addlabel();
        addButton();

        this.add(done);
        this.add(label);
        this.add(label2);
        this.add(label3);
        this.setVisible(true);
    }

    public void addlabel()
    {
        label = new JLabel();
        label.setBounds(0, 0, 1920, 100);
        label.setText("1.when it's your turn to pkay choose a avalable button to choose the space you want to go");
        label.setFont(new Font("MV Boli" ,Font.PLAIN ,25));

        label2 = new JLabel();
        label2.setBounds(0, 100, 1920, 100);
        label2.setText("2.To win, you will need to have x(if your are player 1) or o(if you are player 2) to be 3 in a row/column/diagonal");
        label2.setFont(new Font("MV Boli" ,Font.PLAIN ,25));

        label3 = new JLabel();
        label3.setBounds(0, 200, 1920, 100);
        label3.setText("3.if both of the player dont win and the board is full that is a draw");
        label3.setFont(new Font("MV Boli" ,Font.PLAIN ,25));
    }

    public void addButton()
    {
        done = new JButton("done");
        done.setBounds(100, 300, 100, 50);
        done.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == done)
        {
            this.dispose();
            new MainFrame();
        }
    }
}