/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.util.*;

/**
 *
 * @author Usuario DAM 1
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dia;
        String hora;
        int minutos;

        System.out.print("Introduce el día: ");
        dia = sc.nextLine();
        System.out.print("Introduce la hora: ");
        hora = sc.nextLine();

        if (dia.equals("lunes") && 1 < Integer.parseInt(hora.substring(0, 2)) && Integer.parseInt(hora.substring(0, 2)) < 24 && 0 < Integer.parseInt(hora.substring(3, 5)) && Integer.parseInt(hora.substring(3, 5)) < 60) {
            minutos = 24 * 60 - (Integer.parseInt(hora.substring(0, 2)) * 60 + Integer.parseInt(hora.substring(3, 5))) + 5220;
            System.out.println("Faltan " + minutos + " minutos para el fin de semana.");
        } else if (dia.equals("martes") && 1 < Integer.parseInt(hora.substring(0, 2)) && Integer.parseInt(hora.substring(0, 2)) < 24 && 0 < Integer.parseInt(hora.substring(3, 5)) && Integer.parseInt(hora.substring(3, 5)) < 60) {
            minutos = 24 * 60 - (Integer.parseInt(hora.substring(0, 2)) * 60 + Integer.parseInt(hora.substring(3, 5))) + 3780;
            System.out.println("Faltan " + minutos + " minutos para el fin de semana.");
        } else if (dia.equals("miercoles") && 1 < Integer.parseInt(hora.substring(0, 2)) && Integer.parseInt(hora.substring(0, 2)) < 24 && 0 < Integer.parseInt(hora.substring(3, 5)) && Integer.parseInt(hora.substring(3, 5)) < 60) {
            minutos = 24 * 60 - (Integer.parseInt(hora.substring(0, 2)) * 60 + Integer.parseInt(hora.substring(3, 5))) + 2340;
            System.out.println("Faltan " + minutos + " minutos para el fin de semana.");
        } else if (dia.equals("jueves") && 1 < Integer.parseInt(hora.substring(0, 2)) && Integer.parseInt(hora.substring(0, 2)) < 24 && 0 < Integer.parseInt(hora.substring(3, 5)) && Integer.parseInt(hora.substring(3, 5)) < 60) {
            minutos = 24 * 60 - (Integer.parseInt(hora.substring(0, 2)) * 60 + Integer.parseInt(hora.substring(3, 5))) + 900;
            System.out.println("Faltan " + minutos + " minutos para el fin de semana.");
        } else if (dia.equals("viernes") && 1 < Integer.parseInt(hora.substring(0, 2)) && Integer.parseInt(hora.substring(0, 2)) < 14 && 0 < Integer.parseInt(hora.substring(3, 5)) && Integer.parseInt(hora.substring(3, 5)) < 60) {
            minutos = 15 * 60 - (Integer.parseInt(hora.substring(0, 2)) * 60 + Integer.parseInt(hora.substring(3, 5)));
            System.out.println("Faltan " + minutos + " minutos para el fin de semana.");
        } else {
            System.out.println("ERROR");
        }
    }

}
