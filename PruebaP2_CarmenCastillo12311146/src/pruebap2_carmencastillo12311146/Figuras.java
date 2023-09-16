/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebap2_carmencastillo12311146;
import java.util.ArrayList;
/**
 *
 * @author casti
 */
public class Figuras {
    
    private double largo;
    private double alto;
    private double ancho;
    private String tipfigura;
    
    public Figuras(){
    
        
    }
    
    public Figuras(double largoN, double altoN, double anchoN, String tipfiguraN){
        
        this.largo = largoN;
        this.alto = altoN;
        this.ancho = anchoN;
        this.tipfigura = tipfiguraN;
        
    }
    
    public double calcArea() { //calcular area
        if (tipfigura.equalsIgnoreCase("Cuadrado")) {
            return largo * largo;
        } else if (tipfigura.equalsIgnoreCase("Triangulo")) {
            return 0.5 * largo * alto; //lo mismo de base * altura entre dos
        } else if (tipfigura.equalsIgnoreCase("Rectangulo")) {
            return largo * alto;
        } else {
            return 0; //no reconocio la figura
        }
    }
    
    public double calcVolumen() {
        if (tipfigura.equalsIgnoreCase("Cuadrado")) {
            return largo * largo * largo;
        } else if (tipfigura.equalsIgnoreCase("Triangulo")) {
            return (1.0 / 3.0) * largo * alto;
        } else if (tipfigura.equalsIgnoreCase("Rectangulo")) {
            return largo * ancho * alto;
        } else {
            return 0; // no reconoce la figura
        }
    }
    
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getTipoFigura() {
        return tipfigura;
    }

    public void setTipoFigura(String tipfigura) {
        this.tipfigura = tipfigura;
    }
    
}
