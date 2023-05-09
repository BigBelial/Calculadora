/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Ventana extends JDialog{
    
    JLabel n = new JLabel("Numero 1");
    JTextField t1;
    JButton cerrar ,guardar;
    String dato = "";
    
   Ventana(Frame e, boolean modal){
            
            super (e, modal);
      
       
       Container c = getContentPane();
       c.setLayout(new FlowLayout());
       t1 = new JTextField(10);
       cerrar = new JButton("Cerrar");
       guardar = new JButton("Guardar");
       
       c.add(guardar);
       c.add(n);
       c.add(t1);
       c.add(cerrar);
       
       
       cerrar.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               dispose();
       }
       });
       
       guardar.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               dato = t1.getText();
       }
       });
      
       
       setSize(200, 200);
       setVisible(true);
       
       
   }
}
