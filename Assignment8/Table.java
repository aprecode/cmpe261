package com.company;

import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.List;

/**
 * Created by emirhankutlu on 07/05/16.
 */
public class Table extends JFrame {

    JTable table;
    JPanel buttonpanel;
    JScrollPane scrollPane;
    JButton loadDataButton, calculateButton, sortButton, exitButton;
    JRadioButton ascending,descending;

    //Row names
    String[] columnNames = {"ID", "Name", "Surname","Gender", "Quiz 1", "Quiz 2", "Average"};
    //Column info
    String[][] info = twDStirng();



    public Table() throws FileNotFoundException {


        table = new JTable(info,columnNames);
        table.setBounds(200,330,200,330);
        scrollPane = new JScrollPane(table);
        this.setSize(600,300);

        buttonpanel = new JPanel();

        loadDataButton = new JButton("Load Data");
        calculateButton = new JButton("Calculate");
        sortButton = new JButton("Sort");
        exitButton = new JButton("Exit");
        ascending = new JRadioButton("Ascending");
        descending = new JRadioButton("Descending");

        //Buttons added to the panel
        buttonpanel.add(loadDataButton);
        buttonpanel.add(calculateButton);
        buttonpanel.add(sortButton);
        buttonpanel.add(exitButton);
        buttonpanel.add(ascending);
        buttonpanel.add(descending);

        Action action = new Action();
        loadDataButton.addActionListener(action);
        calculateButton.addActionListener(action);
        sortButton.addActionListener(action);
        exitButton.addActionListener(action);


        this.add(buttonpanel,BorderLayout.SOUTH);

        this.add(scrollPane);

        this.setVisible(true);
        setResizable(false);



    }

    class Action implements ActionListener{



        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();

            if(source.equals(loadDataButton)){
                try {
                    Table nn = new Table();
                    nn.add(scrollPane);
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }

            if(source.equals(calculateButton)){

                for(int i=0; i<info.length; i++) {

                    int q1 = Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 4)));
                    int q2 = Integer.parseInt(String.valueOf(table.getModel().getValueAt(i, 5)));
                    int av = (q1 + q2) / 2;
                    table.getModel().setValueAt(String.valueOf(av), i, 6);
                }
            }

            if(source.equals(sortButton)){
                TableRowSorter<TableModel> sort = new TableRowSorter<>(table.getModel());
                table.setRowSorter(sort);
                List<RowSorter.SortKey> sortKey = new ArrayList<>();

                int column = 6;
                if(ascending.isSelected()){
                    sortKey.add(new RowSorter.SortKey(column,SortOrder.ASCENDING));
                    sort.setSortKeys(sortKey);
                }
                else if(descending.isSelected()){
                    sortKey.add(new RowSorter.SortKey(column,SortOrder.ASCENDING.DESCENDING));
                    sort.setSortKeys(sortKey);

                }else {
                    System.out.println("Something's wrong");
                }
            }
            if(source.equals(exitButton)){
                System.exit(0);
            }
        }
    }

    /**
     * Reads two file and stores the information in Arraylist. Then writes it to a 2D String array
     * @return 2D String array
     * @throws FileNotFoundException
     */
    public String[][] twDStirng() throws FileNotFoundException {
        FileReader file = new FileReader();
        ArrayList<Student> stu;
        stu = file.read();
        String[][] inf = new String[stu.size()][7];



        for(int i=0; i<inf.length; i++){
            for(int j=0; j<7; j++){

                inf[i][0] = String.valueOf(stu.get(i).getID());
                inf[i][1] = stu.get(i).getName();
                inf[i][2] = stu.get(i).getSurname();
                inf[i][3] = stu.get(i).getGender();
                inf[i][4] = String.valueOf(stu.get(i).getQuiz1());
                inf[i][5] = String.valueOf(stu.get(i).getQuiz2());
                inf[i][6] = "---";
            }

        }
        return inf;
    }

}
