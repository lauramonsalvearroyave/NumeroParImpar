package com.mycompany.numeroparimpar;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura Monsalve
 */
public class NumeroParImpar {

    public static void main(String[] args) {
        int numero;
        numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrse un número entero: "));

        if ( numero % 2 == 0 )
        {
            JOptionPane.showMessageDialog(null, "El número ingresado es par.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El número ingresado es impar.");
        }
    
    }
}
