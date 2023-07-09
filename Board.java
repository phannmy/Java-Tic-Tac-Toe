import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Board extends JFrame implements ActionListener{
    private static JPanel gamePlay;
    private static JButton[] buttons = new JButton[9];
    private static JLabel text = new JLabel();
    private static boolean player1Turn = false;
    private static boolean full;

    Board()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.setBackground(Color.white);
        this.setTitle("Tic Tac Toe");
        this.setResizable(true);
        this.setLayout(new BorderLayout(0,0));

        firstTurn();
        panelCreator();
        textField();

        this.add(text,BorderLayout.NORTH);
        this.add(gamePlay,BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void panelCreator()
    {
        gamePlay = new JPanel();
        gamePlay.setLayout(new GridLayout(3,3,5,5));
        gamePlay.setBounds(500, 200, 500, 500);

        for (int i = 0;i <=8;i++)
        {
            buttons[i] = new JButton();
            gamePlay.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        
    }

    public static void textField()
    {
        text = new JLabel();
        text.setFont(new Font("MV Boli",Font.BOLD,120));
        if (player1Turn)
        {
            text.setText("X turn");
        }
        else if(player1Turn = false)
        {
            text.setText("O turn");
        }
    }

    public void firstTurn()
        {
            if((int)Math.random()*2== 0)
            {
                player1Turn = true;
            }
            else
            {
                player1Turn = false;
            }
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0;i<=8;i++)
        {
            if(e.getSource() == buttons[i])
            {
                if(player1Turn)
                {
                    if (buttons[i].getText() =="")
                    {
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("x");
                        player1Turn = false;
                        check();
                        text.setText("O turn");
                    }
                }
                else
                {
                    if (buttons[i].getText() =="")
                    {
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("o");
                        player1Turn = true;
                        check();
                        text.setText("X turn");
                    }
                }
            }
        }
    }

    public void check()
    {
        if(buttons[0].getText() == "x"&& buttons[1].getText() == "x"&& buttons[2].getText() == "x")
        {
            this.dispose();
            new WinApperance("x");
        }
        else if(buttons[3].getText() == "x"&& buttons[4].getText() == "x"&& buttons[5].getText() == "x")
        {
            this.dispose();
            new WinApperance("x");
        }
        else if(buttons[6].getText() == "x"&& buttons[7].getText() == "x"&& buttons[8].getText() == "x")
        {
            this.dispose();
            new WinApperance("x");
        }
        else if(buttons[0].getText() == "x"&& buttons[3].getText() == "x"&& buttons[6].getText() == "x")
        {
            this.dispose();
            new WinApperance("x");
        }
        else if(buttons[1].getText() == "x"&& buttons[4].getText() == "x"&& buttons[7].getText() == "x")
        {
            this.dispose();
            new WinApperance("x");
        }
        else if(buttons[2].getText() == "x"&& buttons[5].getText() == "x"&& buttons[8].getText() == "x")
        {
            this.dispose();
            new WinApperance("x");
        }
        else if(buttons[0].getText() == "x"&& buttons[4].getText() == "x"&& buttons[8].getText() == "x")
        {
            this.dispose();
            new WinApperance("x");
        }
        else if(buttons[2].getText() == "x"&& buttons[4].getText() == "x"&& buttons[6].getText() == "x")
        {
            this.dispose();
            new WinApperance("x");
        }


        else if(buttons[0].getText() == "o"&& buttons[1].getText() == "o"&& buttons[2].getText() == "o")
        {
            this.dispose();
            new WinApperance("o");
        }
        else if(buttons[3].getText() == "o"&& buttons[4].getText() == "o"&& buttons[5].getText() == "o")
        {
            this.dispose();
            new WinApperance("o");
        }
        else if(buttons[6].getText() == "o"&& buttons[7].getText() == "o"&& buttons[8].getText() == "o")
        {
            this.dispose();
            new WinApperance("o");
        }
        else if(buttons[0].getText() == "o"&& buttons[3].getText() == "o"&& buttons[6].getText() == "o")
        {
            this.dispose();
            new WinApperance("o");
        }
        else if(buttons[1].getText() == "o"&& buttons[4].getText() == "o"&& buttons[7].getText() == "o")
        {
            this.dispose();
            new WinApperance("o");
        }
        else if(buttons[2].getText() == "o"&& buttons[5].getText() == "o"&& buttons[8].getText() == "o")
        {
            this.dispose();
            new WinApperance("o");
        }
        else if(buttons[0].getText() == "o"&& buttons[4].getText() == "o"&& buttons[8].getText() == "o")
        {
            this.dispose();
            new WinApperance("o");
        }
        else if(buttons[2].getText() == "o"&& buttons[4].getText() == "o"&& buttons[6].getText() == "o")
        {
            this.dispose();
            new WinApperance("o");
        }


        for (int i=0;i<8;i++)
        {
            if (!buttons[i].getText().equals(""))
            {
                full = true;
            }
            else
            {
                full =false;
                break;
            }
            if (full =false)
            {
                break;
            }
        }
        if(Util.getWin()== false&& full == true)
        {
            this.dispose();
            new DrawApperance();
        }
    }
}