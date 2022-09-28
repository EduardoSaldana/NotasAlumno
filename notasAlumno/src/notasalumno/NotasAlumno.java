/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasalumno;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class NotasAlumno {

    public static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("INTRODUCCIÓN DE DATOS: ");
        System.out.println("\n----------------------");
        System.out.printf("\nintroduzca la nota del alumno: ");
        int nota = ent.nextInt();

        if (nota >= 0 & nota <= 10) {
            if (nota < 5) {
                System.out.println("El alumno esta suspenso");
            } else if (nota >= 5 & nota <= 6) {
                System.out.println("El alumno ha sacado un aprobado");
            } else if (nota >= 6 & nota <= 7) {
                System.out.println("El alumno ha sacado un bien");
            } else if (nota > 7 & nota < 9) {
                System.out.println("El alumno ha sacado un notable");
            } else if (nota >= 9 & nota <= 10) {
                System.out.println("El alumno ha sacado un sobresaliente");
            }
        }
    }

}
