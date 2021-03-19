package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class GUI {

    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem quitItem;

    // constructor will create all GUI components and set their properties
    public GUI() {
        frame = new JFrame("the window");  //creates a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of the application
        frame.setVisible(true);  //make frame visible
        frame.setSize(550, 550);

        // menu bar with one item for quitting the program
        menuBar = new JMenuBar ();  //creates the menu bar
        frame.setJMenuBar(menuBar);  //MenuBar are set to the Frame

        fileMenu = new JMenu ("File");  //builds the first menu
        menuBar.add(fileMenu);  // Menu are added to MenuBar

        quitItem = new JMenuItem ("Quit");  //  MenuBar->Menu->MenuItem
        fileMenu.add (quitItem);  // MenuItem add to Menu
        quitItem.addActionListener ((ActionEvent e) ->
                System.exit (0));  //everything in brackets is a lambda expression (function)
    }

    public void hw1() {
        String[] choices = {"first", "second", "third"};
        JComboBox comboBox = new JComboBox(choices);
        comboBox.setSelectedIndex(2);
        frame.add(comboBox);
        comboBox.addActionListener((ActionEvent e) ->
                System.out.println(comboBox.getSelectedItem()));  //prints selected choice from comboBox
    }

    public void hw2() {

    }
}
