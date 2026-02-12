/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        ejerc4();

    }
    public static void ejerc1() {
        String a1 = JOptionPane.showInputDialog("ingrese el pimer número");
        String a2 = JOptionPane.showInputDialog("ingrese el segundo número");
        String a3 = JOptionPane.showInputDialog("ingrese el tercero número");
        String a4 = JOptionPane.showInputDialog("ingrese el cuarto número");
        String a5 = JOptionPane.showInputDialog("ingrese el quinto número");

        int x1 = Integer.parseInt(a1);
        int x2 = Integer.parseInt(a2);
        int x3 = Integer.parseInt(a3);
        int x4 = Integer.parseInt(a4);
        int x5 = Integer.parseInt(a5);

        int total = (x1 + x2 + x3 + x4 + x5) / 5;

        JOptionPane.showMessageDialog(null, total);

        System.out.println("Hello World");
    }

    public static void ejerc2() {

        String p1 = JOptionPane.showInputDialog("ingrese el pimer número");
        String p2 = JOptionPane.showInputDialog("ingrese el segundo número");
        String p3 = JOptionPane.showInputDialog("ingrese el tercero número");

        int x1 = Integer.parseInt(p1);
        int x2 = Integer.parseInt(p2);
        int x3 = Integer.parseInt(p3);

        double total = (x1 * 0.55) + (x2 * 0.30) + (x3 * 0.15);

        JOptionPane.showMessageDialog(null, total);
         
        
    }

    public static void ejerc3() {
        String nombre =JOptionPane.showInputDialog("ingrese el nombre del empleado");
        
        String horas=JOptionPane.showInputDialog("ingrese las horas trabajadas al mes");
        int horasTrabajadas= Integer.parseInt(horas);
        
        String pago= JOptionPane.showInputDialog("ingrese el pago por hora");
        double pagoHora= Double.parseDouble(pago);
        
        double sueldo= horasTrabajadas *pagoHora;
        JOptionPane.showMessageDialog(null,"Empleado: " + nombre +"\nHoras trabajadas: " + horasTrabajadas +
        "\nPago por hora: " + pagoHora +"\nSueldo mensual: " + sueldo);
        
    }
    public static void ejerc4() {
        String dato=JOptionPane.showInputDialog("ingrese el numero");
        int numero= Integer.parseInt(dato);
        
        if (numero % 2==0){JOptionPane.showMessageDialog(null, "El número es PAR");
        } else{
            JOptionPane.showMessageDialog(null, "El número es IMPAR");
        }
        
    }
}

        