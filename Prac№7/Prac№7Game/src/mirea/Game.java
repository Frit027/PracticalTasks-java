package mirea;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.util.Stack;

public class Game extends JFrame {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    private JTextField textField1 = new JTextField();
    private JTextField textField2 = new JTextField();
    private JLabel labelWin = new JLabel("Победитель: ");

    public Game() {
        super("Game");
        setBounds(500, 200, 400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Border solidBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
        Font font = new Font("Century Gothic", Font.PLAIN, 12);
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel labelCards = new JLabel("Карты: 0 1 2 3 4 5 6 7 8 9");
        labelCards.setBounds(10,20,200,30);
        labelCards.setFont(font);
        labelCards.setBorder(solidBorder);
        labelCards.setHorizontalAlignment(JLabel.CENTER);

        JLabel label1 = new JLabel("Первая колода:");
        label1.setBounds(10, 60, 120, 30);
        label1.setFont(font);
        label1.setBorder(solidBorder);
        label1.setHorizontalAlignment(JLabel.CENTER);

        JLabel label2 = new JLabel("Вторая колода:");
        label2.setBounds(10, 100, 120, 30);
        label2.setFont(font);
        label2.setBorder(solidBorder);
        label2.setHorizontalAlignment(JLabel.CENTER);

        labelWin.setBounds(10, 140, 200, 30);
        labelWin.setFont(font);
        labelWin.setBorder(solidBorder);
        labelWin.setHorizontalAlignment(JLabel.LEFT);

        textField1.setFont(font);
        textField1.setBounds(140, 60,100,30);
        textField1.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (getLength() < 9) {
                    super.insertString(offs, str, a);
                }
            }
        });

        textField2.setFont(font);
        textField2.setBounds(140, 100,100,30);
        textField2.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (getLength() < 9) {
                    super.insertString(offs, str, a);
                }
            }
        });

        JButton button = new JButton("Кто выиграл?");
        button.setFont(font);
        button.setBounds(20,190,170,30);
        button.addActionListener(e -> fill());

        JButton buttonClear = new JButton("Очистить поля");
        buttonClear.setFont(font);
        buttonClear.setBounds(210,190,140,30);
        buttonClear.addActionListener(e -> toClear());

        panel.add(label1);
        panel.add(labelCards);
        panel.add(label2);
        panel.add(labelWin);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(button);
        panel.add(buttonClear);

        setContentPane(panel);
    }

    private void fill() {
        String str1 = new StringBuffer(textField1.getText()).reverse().toString().replaceAll("\\s+", "");
        String str2 = new StringBuffer(textField2.getText()).reverse().toString().replaceAll("\\s+", "");

        stack1.clear();
        stack2.clear();

        for(char c : str1.toCharArray()) {
            stack1.push(Character.getNumericValue(c));
        }
        for(char c : str2.toCharArray()) {
            stack2.push(Character.getNumericValue(c));
        }

        isWinner();
    }

    private void isWinner() {
        int k = 0;

        while(!stack1.empty() && !stack2.empty()) {
            k++;
            int cardFirst = stack1.pop();
            int cardSecond = stack2.pop();

            if((cardFirst == 0 && cardSecond == 9) || (cardFirst == 9 && cardSecond == 0)) {
                if (cardFirst == 0) {
                    stack1.add(0, cardFirst);
                    stack1.add(0, cardSecond);
                }
                if (cardFirst == 9) {
                    stack2.add(0, cardFirst);
                    stack2.add(0, cardSecond);
                }
            } else {
                if (cardFirst > cardSecond) {
                    stack1.add(0, cardFirst);
                    stack1.add(0, cardSecond);
                }
                if (cardFirst < cardSecond) {
                    stack2.add(0, cardFirst);
                    stack2.add(0, cardSecond);
                }
            }

            if(!result(k))
                break;
        }
    }

    private boolean result(int k) {
        if(stack1.isEmpty()) {
            labelWin.setText("Победитель: second " + k);
            return true;
        }
        if(stack2.isEmpty()) {
            labelWin.setText("Победитель: first " + k);
            return true;
        }
        if(k == 1000_001) {
            labelWin.setText("Победитель: botva");
            return false;
        }

        return true;
    }

    private void toClear() {
        textField1.setText("");
        textField2.setText("");
    }
}