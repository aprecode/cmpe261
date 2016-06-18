package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        GuiCalc gg = new GuiCalc();

        gg.setSize(330,350);
        gg.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gg.setVisible(true);
        gg.setResizable(false);
    }
}
