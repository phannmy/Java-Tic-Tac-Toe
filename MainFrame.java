import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener{
    //need to fix the playerturn 
    JButton settingButton;
    JButton playButton;
    JButton howToPlayButton;

    MainFrame() 
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.setBackground(Color.white);
        this.setTitle("Tic Tac Toe");
        this.setResizable(true);
        this.setLayout(null);

        addButton();

        this.add(playButton);
        this.add(settingButton);
        this.add(howToPlayButton);
        this.setVisible(true);
    }

    public void addButton()
    {
        settingButton = new JButton("setting");
        settingButton.setBounds(150, 120, 100, 50);
        settingButton.addActionListener(this);

        playButton = new JButton("play");
        playButton.setBounds(150, 70, 100, 50);
        playButton.addActionListener(this);

        howToPlayButton = new JButton("How to play");
        howToPlayButton.setBounds(150, 170, 100, 50);
        howToPlayButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == howToPlayButton)
        {
            this.dispose();
            new HowToPlay();
        }
        else if (e.getSource() == settingButton)
        {
            this.dispose();
            new Setting();
        }
        else if (e.getSource() == playButton)
        {
            this.dispose();
            new Board();
        }
    }
}
