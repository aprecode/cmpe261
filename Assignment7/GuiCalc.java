package com.company;

/**
 * Created by emirhankutlu on 21/04/16.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiCalc extends JFrame {

    private JTextField answerField;
    private JButton one, two, three, four, five, six, seven, eight, nine, zero,
            add, sub, mult, div, equal, clearAll, clearEntry, dot, negative;

    private String entry1, entry2;
    private double answer = 0.0;
    private JPanel calcPanel;

    //First equals and operation buttons haven't clicked yet
    //A char variable to keep the information of the operation
    //Will be used for the operations later
    private boolean equals = false;
    private boolean operation = false;
    char op = ' ';


    public GuiCalc(){
        super("Calculator");


        answerField = new JTextField(null);
        answerField.setPreferredSize(new Dimension(320,90));
        answerField.setEditable(false);

        //Indicate buttons with the numbers and symbols
        one = new JButton("1"); two = new JButton("2"); three = new JButton("3"); four = new JButton("4");
        five = new JButton("5"); six = new JButton("6"); seven = new JButton("7"); eight = new JButton("8");
        nine = new JButton("9"); zero = new JButton("0"); add = new JButton("+"); sub = new JButton("-");
        mult = new JButton("*"); div = new JButton("/"); equal = new JButton("="); clearAll = new JButton("C");
        clearEntry = new JButton("CE"); dot = new JButton("."); negative = new JButton("+/-");


        //Indicate sizes of the buttons
        Dimension dimension = new Dimension(75,40);

        one.setPreferredSize(dimension); two.setPreferredSize(dimension); three.setPreferredSize(dimension);
        four.setPreferredSize(dimension); five.setPreferredSize(dimension); six.setPreferredSize(dimension);
        seven.setPreferredSize(dimension); eight.setPreferredSize(dimension); nine.setPreferredSize(dimension);
        zero.setPreferredSize(new Dimension(155,40)); add.setPreferredSize(dimension); sub.setPreferredSize(dimension);
        mult.setPreferredSize(dimension); div.setPreferredSize(dimension); equal.setPreferredSize(dimension);
        clearAll.setPreferredSize(dimension); clearEntry.setPreferredSize(dimension); dot.setPreferredSize(dimension);
        negative.setPreferredSize(dimension);




        //Button action listeners
        //Different classes numbers and the calculation operations
        Numbers number = new Numbers();
        Calculate calc = new Calculate();

        one.addActionListener(number); two.addActionListener(number); three.addActionListener(number);
        four.addActionListener(number); five.addActionListener(number); six.addActionListener(number);
        seven.addActionListener(number); eight.addActionListener(number); nine.addActionListener(number);
        zero.addActionListener(number); dot.addActionListener(number); negative.addActionListener(number);

        add.addActionListener(calc); sub.addActionListener(calc); mult.addActionListener(calc);
        div.addActionListener(calc); equal.addActionListener(calc); clearAll.addActionListener(calc);
        clearEntry.addActionListener(calc);




        //Panel section
        //Add all the buttens to the frame
        calcPanel = new JPanel();
        calcPanel.setLayout(new FlowLayout());

        calcPanel.add(answerField, BorderLayout.NORTH);

        calcPanel.add(seven);
        calcPanel.add(eight);
        calcPanel.add(nine);
        calcPanel.add(mult);

        calcPanel.add(four);
        calcPanel.add(five);
        calcPanel.add(six);
        calcPanel.add(div);

        calcPanel.add(one);
        calcPanel.add(two);
        calcPanel.add(three);
        calcPanel.add(sub);

        calcPanel.add(zero);
        calcPanel.add(dot);

        calcPanel.add(add);
        calcPanel.add(clearAll);
        calcPanel.add(clearEntry);
        calcPanel.add(equal);

        calcPanel.add(negative);


        this.setContentPane(calcPanel);

}


    private class Numbers implements ActionListener{

        /**
         * Writes each number in the display section when the button is clicked
         * includes dot(decimal point) and negative sign
         * @param event
         */
        public void actionPerformed(ActionEvent event){

            JButton source = (JButton) event.getSource();

            if (source.equals(one)){
                if(!operation){
                    if(entry1 == null){
                        entry1 = "1";
                    }else{
                        entry1 += "1";
                    }
                }else{
                    if(entry2 == null){
                        entry2 = "1";
                    }else{
                        entry2 += "1";
                    }
                }
            }

            if (source.equals(two)){
                if(!operation){
                    if(entry1 == null){
                        entry1 = "2";
                    }else{
                        entry1 += "2";
                    }
                }else{
                    if(entry2 == null){
                        entry2 = "2";
                    }else{
                        entry2 += "2";
                    }
                }
            }

            if (source.equals(three)){
                if(!operation){
                    if(entry1 == null){
                        entry1 = "3";
                    }else{
                        entry1 += "3";
                    }
                }else{
                    if(entry2 == null){
                        entry2 = "3";
                    }else{
                        entry2 += "3";
                    }
                }
            }

            if (source.equals(four)){
                if(!operation){
                    if(entry1 == null){
                        entry1 = "4";
                    }else{
                        entry1 += "4";
                    }
                }else{
                    if(entry2 == null){
                        entry2 = "4";
                    }else{
                        entry2 += "4";
                    }
                }
            }

            if (source.equals(five)){
                if(!operation){
                    if(entry1 == null){
                        entry1 = "5";
                    }else{
                        entry1 += "5";
                    }
                }else{
                    if(entry2 == null){
                        entry2 = "5";
                    }else{
                        entry2 += "5";
                    }
                }
            }

            if (source.equals(six)){
                if(!operation){
                    if(entry1 == null){
                        entry1 = "6";
                    }else{
                        entry1 += "6";
                    }
                }else{
                    if(entry2 == null){
                        entry2 = "6";
                    }else{
                        entry2 += "6";
                    }
                }
            }

            if (source.equals(seven)){
                if(!operation){
                    if(entry1 == null){
                        entry1 = "7";
                    }else{
                        entry1 += "7";
                    }
                }else{
                    if(entry2 == null){
                        entry2 = "7";
                    }else{
                        entry2 += "7";
                    }
                }
            }

            if (source.equals(eight)){
                if(!operation){
                    if(entry1 == null){
                        entry1 = "8";
                    }else{
                        entry1 += "8";
                    }
                }else{
                    if(entry2 == null){
                        entry2 = "8";
                    }else{
                        entry2 += "8";
                    }
                }
            }

            if (source.equals(nine)){
                if(!operation){
                    if(entry1 == null){
                        entry1 = "9";
                    }else{
                        entry1 += "9";
                    }
                }else{
                    if(entry2 == null){
                        entry2 = "9";
                    }else{
                        entry2 += "9";
                    }
                }
            }

            //If the first clicked button is 0 and second one is 0 too,
            //Display doesn't change as 00, it remains as 0
            if (source.equals(zero)){
                if(!operation){
                    if(entry1 == null){
                        entry1 = "0";
                    }else if(entry1 != null){
                        if(entry1.startsWith("0") && entry1.length() == 1){
                            System.out.println("no change");
                        }else {
                            entry1 += "0";
                        }
                    }
                }else{
                    if(entry2 == null){
                        entry2 = "0";
                    }else if(entry2 != null){
                        if(entry2.startsWith("0") && entry2.length() == 1){
                            System.out.println("no change");
                        }else {
                            entry2 += "0";
                        }
                    }
                }
            }


            //If the '.' button is clicked once, it can't be clicked to write another dot.
            if (source.equals(dot)){
                if(!operation){
                    if(entry1 == null){
                        entry1 = "0.";
                    }else if(entry1 != null){
                        if(entry1.contains(".")){
                            System.out.println("There's already a decimal");
                        }else {
                            entry1 += ".";
                        }
                    }
                }else{
                    if(entry2 == null){
                        entry2 = "0.";
                    }else if(entry2 != null){
                        if(entry2.contains(".")){
                            System.out.println("There's already a decimal");
                        }else {
                            entry2 += ".";
                        }
                    }
                }
            }

            //Number sign can be changed with '+/-' button.
            //Changws the sign every with every clicking action
            if(source.equals(negative)){
                if(!operation){
                    if(entry1 == null){
                        entry1 = "-";
                    }else if(entry1 != null && entry1.startsWith("-")){
                        entry1 = entry1.substring(1);
                    }else{
                        entry1 = "-" + entry1;
                    }
                }else{
                    if(entry2 == null){
                        entry2 = "0";
                    }else if(entry2 != null && entry2.startsWith("-")){
                        entry2 = entry2.substring(1);
                    }else {
                        entry2 = "-" + entry2;
                    }
                }
            }


            if (!equals) {
                if(!operation){
                    answerField.setText(entry1);
                }else{
                    answerField.setText(entry2);
                }
            }

        }

    }

    private class Calculate implements ActionListener{

        /**
         * Performs all the calculation actions and writes them in the display field
         * @param event
         */
        public void actionPerformed(ActionEvent event){

            JButton source = (JButton) event.getSource();

            if(source.equals(add)){
                if(entry1 == null){
                    System.out.println("PLEASE CLICK NUMBER BEFORE OPERATION");
                }else if(entry1 != null && entry2 == null){
                    operation = true;
                    op = '+';
                }else if(entry1 != null && entry2 != null){
                    System.out.println("two operations by now");
                }
            }

            if(source.equals(sub)){
                if(entry1 == null){
                    System.out.println("PLEASE CLICK NUMBER BEFORE OPERATION");
                }else if(entry1 != null && entry2 == null){
                    operation = true;
                    op = '-';
                }else if(entry1 != null && entry2 != null){
                    System.out.println("two operations by now");
                }
            }

            if(source.equals(mult)){
                if(entry1 == null){
                    System.out.println("PLEASE CLICK NUMBER BEFORE OPERATION");
                }else if(entry1 != null && entry2 == null){
                    operation = true;
                    op = '*';
                }else if(entry1 != null && entry2 != null){
                    System.out.println("two operations by now");
                }
            }
            if(source.equals(div)){
                if(entry1 == null){
                    System.out.println("PLEASE CLICK NUMBER BEFORE OPERATION");
                }else if(entry1 != null && entry2 == null){
                    operation = true;
                    op = '/';
                }else if(entry1 != null && entry2 != null){
                    System.out.println("two operations by now");
                }
            }

            if(source.equals(equal)){
                if(entry1 == null){
                    System.out.println("PLEASE CLICK NUMBER BEFORE OPERATION");
                }else if(entry1 != null && entry2 == null){
                    System.out.println("PLEASE CLICK NUMBER BEFORE OPERATION");
                }

                if(entry1 != null && entry2 != null){
                    double e1 = Double.parseDouble(entry1);
                    double e2 = Double.parseDouble(entry2);

                    switch(op){
                        case '+':
                            answer = e1 + e2;
                            break;
                        case '-':
                            answer = e1 - e2;
                            break;
                        case '*':
                            answer = e1 * e2;
                            break;
                        case '/':
                            answer = e1 / e2;
                            break;
                    }


                    answerField.setText(String.valueOf(answer));

                    //If the number is tried to divided by zero, displey ERROR message
                    if(op == '/' && e2 == 0){
                        answerField.setText("ERROR");
                    }
                }
            }

            //Clears all the information in the calculator.
            //No need to close and execute the program again.
            if(source.equals(clearAll)){
                entry1 = null;
                entry2 = null;
                equals = false;
                operation = false;
                op = ' ';
                answerField.setText(null);
                answer = 0;
            }

            //Clears the entry given before or after of the operation is clicked
            if(source.equals(clearEntry)){
                if(entry1 != null && entry2 == null){
                    entry1 = null;
                    answerField.setText(null);
                }else if(entry1 != null && entry2 != null){
                    entry2 = null;
                    answerField.setText(null);
                }
            }

        }

    }
}
