package mirea;

import javax.swing.*;
import java.awt.*;

public class SimpleGUI extends JFrame  {
    private int kMilan = 0;
    private int kMadrid = 0;
    private JLabel labelRes = new JLabel("Result: 0 X 0");
    private JLabel labelScorer = new JLabel("Last Scorer: N/A");
    private JLabel labelWin = new JLabel("Winner: DRAW");

    public SimpleGUI(){
        super("Football");
        setBounds(500, 200, 400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        labelRes.setBounds(100, 20, 200, 20);
        labelRes.setFont(new Font("Impact", Font.PLAIN, 20));
        labelRes.setForeground(Color.BLUE);

        labelScorer.setBounds(100, 45,200,20);
        labelScorer.setFont(new Font("Impact", Font.PLAIN, 20));
        labelScorer.setForeground(Color.BLUE);

        labelWin.setBounds(100, 70, 200,20);
        labelWin.setFont(new Font("Impact", Font.PLAIN, 20));
        labelWin.setForeground(Color.BLUE);

        JButton buttonMadrid = new JButton("Real Madrid");
        buttonMadrid.setBounds(60, 120, 120, 30);

        JButton buttonMilan = new JButton("AC Milan");
        buttonMilan.setBounds(180, 120, 120, 30);

        panel.add(labelRes);
        panel.add(labelScorer);
        panel.add(labelWin);
        panel.add(buttonMilan);
        panel.add(buttonMadrid);

        buttonMadrid.addActionListener(e -> {
            kMadrid++;
            result("Real Madrid");
            isWinner();
        });

        buttonMilan.addActionListener(e -> {
            kMilan++;
            result("AC Milan");
            isWinner();
        });

        setContentPane(panel);
    }

    private void isWinner(){
        if(kMilan > kMadrid)
            labelWin.setText("Winner: AC Milan");
        else if(kMilan < kMadrid)
            labelWin.setText("Winner: Real Madrid");
        else
            labelWin.setText("Winner: DRAW");
    }

    private void result(String str) {
        labelRes.setText("Result: " + kMilan + " X " + kMadrid);
        labelScorer.setText("Last Scorer: " + str);
    }
}
