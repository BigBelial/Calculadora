/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame{

    boolean suma, resta, multiplicacion, division, igual = false;
    String valor1;
    double resultado;
    
    JTextField caja1;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bsuma,bresta,bmultiplicar,bdividir, bborrar, bpunto, bigual;
    JMenu archivo, Guardar;
    JMenuItem Nuevo, guardar2;
    
    public void validarPunto(){
        String texto = caja1.getText();
        int n = texto.indexOf(".");
        
        if(n < 0){
            escribir(".");
        }else;
    }
    
    public void borrar(){
        String texto = caja1.getText();
        int n = texto.length();
        if(n != 0){
            String texto2 = texto.substring(0, n-1);
            caja1.setText(texto2);
        }
    }
    
    public void escribir(String x){
        String texto = caja1.getText();
        caja1.setText( texto + x);
    }

    
    
    public Calculadora(){
        
        //Creacion de los contenedores

        Container  c = getContentPane();
        c.setLayout(new FlowLayout());
        JMenuBar barra = new JMenuBar();
        setJMenuBar(barra);
        


        archivo = new JMenu("Archivo");
        Nuevo = new JMenuItem("Nuevo");
        Guardar = new JMenu("Guardar");
        guardar2 = new JMenuItem("Guardar como");
        
        Guardar.add(guardar2);
        archivo.add(Guardar);
        archivo.add(Nuevo);
        
        barra.add(archivo);
        caja1 = new JTextField(10);

        //instancia de los botones

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        
        bsuma = new JButton("+");
        bresta = new JButton("-");
        bmultiplicar = new JButton("*");
        bdividir = new JButton("/");
        bborrar = new JButton ("<-");
        bpunto = new JButton(".");
        bigual = new JButton("=");
        
       // Añadir lo botones a el layout 

       c.add(caja1);
       c.add(bborrar);
       c.add(b7);
       c.add(b8);
       c.add(b9);
       c.add(bmultiplicar);
       c.add(b4);
       c.add(b5);
       c.add(b6);
       c.add(bresta);
       c.add(b3);
       c.add(b2);
       c.add(b1);
       c.add(bsuma);
       c.add(bdividir);
       c.add(bpunto);
       c.add(b0);
       c.add(bigual);
       
        //Implementacion botones para agregar numeros

       b0.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               escribir("0");
       }
       });
       
       b1.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               escribir("1");
       }
       });
       
       b2.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               escribir("2");
       }
       });
       
       b3.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               escribir("3");
       }
       });
       
       b4.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               escribir("4");
       }
       });
       
       b5.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               escribir("5");
       }
       });
       
       b6.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               escribir("6");
       }
       });
       
       b7.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               escribir("7");
       }
       });
       
       b8.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               escribir("8");
       }
       });
       
       b9.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               escribir("9");
       }
       });
       
       b0.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               escribir("0");
       }
       });
       
       bpunto.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               validarPunto();
       }
       });
       
       bborrar.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               borrar();
       }
       });
     
       guardar2.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               Ventana v = new Ventana(null, true);
               caja1.setText(v.dato);
       }
       });

       //Implementacion de botones para operar

       bsuma.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            valor1 = caja1.getText();
            caja1.setText("");
            suma = true;
        }
       });

       bresta.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            valor1 = caja1.getText();
            caja1.setText("");
            resta = true;
        }
       });

       bmultiplicar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            valor1 = caja1.getText();
            caja1.setText("");
            multiplicacion = true;
        }
       });

       bdividir.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            valor1 = caja1.getText();
            caja1.setText("");
            division = true;
        }
       });

       //Realizar operaciones

       bigual.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            if(suma == true){
              resultado =   Double.parseDouble(caja1.getText()) + Double.parseDouble(valor1);
              caja1.setText(resultado + "");
            }
            if(resta == true){
                resultado = Double.parseDouble(valor1) - Double.parseDouble(caja1.getText());
                caja1.setText(resultado + "");
            }
            if(multiplicacion == true){
                resultado = Double.parseDouble(valor1) * Double.parseDouble(caja1.getText());
                caja1.setText(resultado + "");
            }
            if(division == true){
                resultado = Double.parseDouble(valor1) / Double.parseDouble(caja1.getText());
                caja1.setText(resultado + "");
            }
        }
    });

    


    setVisible(true);
    setSize(200, 250);
    setTitle("Calculadora Java");
    caja1.setEditable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new Calculadora();
    }
}
