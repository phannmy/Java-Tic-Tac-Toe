import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Setting extends JFrame implements ActionListener{
    JButton change1;
    JButton change2;
    JButton done;
    JLabel playerLabel;
    JLabel difficultiesLabel;

    Setting()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.setBackground(Color.white);
        this.setTitle("Tic Tac Toe");
        this.setResizable(true);
        this.setLayout(null);

        addButton();
        addLabel();

        this.add(playerLabel);
        this.add(difficultiesLabel);
        this.add(change1);
        this.add(change2);
        this.add(done);
        this.setVisible(true);

    }
    
    public void addButton()
    {
        change1 = new JButton("change");
        change1.setBounds(300, 20, 100, 50);
        change1.addActionListener(this);

        change2 = new JButton("change");
        change2.setBounds(300, 120, 100, 50);
        change2.addActionListener(this);

        done = new JButton("done");
        done.setBounds(150, 200, 100, 50);
        done.addActionListener(this);
    }

    public void addLabel()
    {
        playerLabel = new JLabel();
        playerLabel.setText("number of player: " + Util.getPlayerNums());
        playerLabel.setBounds(0, 0, 300, 100);
        playerLabel.setFont(new Font("MV Boli" ,Font.PLAIN ,25));

        difficultiesLabel = new JLabel();
        difficultiesLabel.setText("Difficulties: " + Util.getDifficulties());
        difficultiesLabel.setBounds(0, 100, 300, 100);
        difficultiesLabel.setFont(new Font("MV Boli" ,Font.PLAIN ,25));
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == done)
        {
            this.dispose();
            new MainFrame();
        }
    }
    
}
