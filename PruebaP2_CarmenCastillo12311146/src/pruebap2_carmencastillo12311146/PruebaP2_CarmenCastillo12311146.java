/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebap2_carmencastillo12311146;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author casti
 */
public class PruebaP2_CarmenCastillo12311146 {

    static Scanner leer = new Scanner(System.in, "ISO-8859-1");
    static Scanner leer2 = new Scanner(System.in); //para strings
    static Figuras figura = new Figuras(); //para los numeros
    static ArrayList<Figuras> listafiguras = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        System.out.print("Ingrese cuántas figuras desea hacer: ");
        int numfiguras = leer.nextInt();

        for (int i = 0; i < numfiguras; i++) {
            Figuras figura = new Figuras();
            System.out.println("Ingrese los detalles de la figura " + (i + 1) + ":");
            System.out.print("Tipo de figura (Cuadrado/Triángulo/Rectángulo): ");
            figura.setTipoFigura(leer2.nextLine());
            System.out.print("Largo: ");
            figura.setLargo(leer.nextDouble());
            System.out.print("Alto: ");
            figura.setAlto(leer.nextDouble());

            while (figura.getTipoFigura().equalsIgnoreCase("Rectangulo") && figura.getLargo() == figura.getAlto()) { //verificar que sea rectangulo
                System.out.print("Para un rectángulo, el largo y el alto deben ser diferentes. Por favor, ingrese el alto de nuevo: ");
                figura.setAlto(leer.nextDouble());
            }

            System.out.print("Ancho: ");
            figura.setAncho(leer.nextDouble());

            while (figura.getTipoFigura().equalsIgnoreCase("Cuadrado") && (figura.getLargo() != figura.getAlto() || figura.getLargo() != figura.getAncho() || figura.getAncho() != figura.getAlto())) { //verificar que sea cuadrado
                System.out.println("Para un cuadrado, largo, alto y ancho deben ser iguales.");
                System.out.print("Por favor, ingrese el largo: ");
                figura.setLargo(leer.nextDouble());

                System.out.print("Por favor, ingrese el alto: ");
                figura.setAlto(leer.nextDouble());

                System.out.print("Por favor, ingrese el ancho: ");
                figura.setAncho(leer.nextDouble());
            }
            
            System.out.println("");
            listafiguras.add(figura);
            
        }

        for (int i = 0; i < listafiguras.size(); i++) {
            System.out.println("");
            System.out.println("Figura: " + (i + 1));
            System.out.println("Tipo de figura: " + listafiguras.get(i).getTipoFigura());
            System.out.println("Largo: " + listafiguras.get(i).getLargo());
            System.out.println("Alto: " + listafiguras.get(i).getAlto());
            System.out.println("Ancho: " + listafiguras.get(i).getAncho());
            System.out.println("Area: " + listafiguras.get(i).calcArea());
            System.out.println("Volumen: " + listafiguras.get(i).calcVolumen());
            System.out.println("");

        }

    }

}
