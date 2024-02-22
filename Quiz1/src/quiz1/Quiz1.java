/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author johnn
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Solicitar la cantidad de cursos que desea incluir
        //  Por cada uno de los cursos debe solicitar cuanto es el monto pagado por curso
        int montoTotal = 0;
        double hacienda = 0;
                        
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String data1 = JOptionPane.showInputDialog("Cantidad de cursos que desea incluir: ");
        int cursos = Integer.parseInt(data1);

        for (int i = 1; i <= cursos; i++) {
            String data2 = JOptionPane.showInputDialog("Ingrese el monto del curso " + i + ": ");
            int monto = Integer.parseInt(data2);

            montoTotal += monto;
            hacienda = montoTotal * 0.02;
        }
        
        JOptionPane.showMessageDialog(null, "El monto total es de: " + montoTotal);
        JOptionPane.showMessageDialog(null, "El profesor " + nombre + " debera pagar a hacienda el monto de: " + hacienda);
    }

}
