import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinApperance extends JFrame implements ActionListener{
    JButton done;
    JLabel win;

    WinApperance(String xOrO)
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.setBackground(Color.white);
        this.setTitle("Tic Tac Toe");
        this.setResizable(true);
        this.setLayout(null);

        labelCreator(xOrO);
        buttonCreator();

        this.add(win);
        this.add(done);
        this.setVisible(true);
    }

    public void buttonCreator()
    {
        done = new JButton("done");
        done.setBounds(500,500,100,50);
        done.addActionListener(this);
    }

    public void labelCreator(String xOrO)
    {
        win = new JLabel();
        if (xOrO == "x")
        {
            win.setText("Congraduation for wining the game player 1(x)");
        }
        else if (xOrO == "o")
        {
            win.setText("Congraduation for wining the game player 2(o)");
        }
        win.setBounds(500,200,500,200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == done)
        {
            this.dispose();
            new MainFrame();
        }
    }
    
}
