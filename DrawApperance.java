import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class DrawApperance extends JFrame implements ActionListener{
    JButton done;
    JLabel draw;

    DrawApperance()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.setBackground(Color.white);
        this.setTitle("Tic Tac Toe");
        this.setResizable(true);
        this.setLayout(null);

        labelCreator();
        buttonCreator();

        this.add(draw);
        this.add(done);
        this.setVisible(true);
    }

    public void buttonCreator()
    {
        done = new JButton("done");
        done.setBounds(500,500,100,50);
        done.addActionListener(this);
    }

    public void labelCreator()
    {
        draw = new JLabel();
        draw.setText("you guy draw");
        draw.setBounds(600,200,200,200);
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
