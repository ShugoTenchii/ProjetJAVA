package SystemeSolaire;

import javax.swing.*;
import Draw.StdDraw;
import java.lang.*;

import java.awt.*;

public class Astre extends JPanel{

    private String nom;
    private double coordX;
    private double coordY;
    private long temps;
    private long vitesse;
    private double rayon;
    private long periodeRevolution;
    private double taille;
    private Color couleur;

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    public String getNom() {
        return nom;
    }

    public long getTemps() {
        return temps;
    }

    public long getVitesse() {
        return vitesse;
    }

    public long getPeriodeRevolution() {
        return periodeRevolution;
    }

    public double getTaille() {
        return taille;
    }

    public Color getCouleur() {
        return couleur;
    }

    public double getCoordX(){
        return coordX;
    }

    public double getCoordY(){
        return coordY;
    }

    public double getRayon(){
        return rayon;
    }

    public void ChangePosition(double angle, double coordX, double coordY){
        coordX = 0 + (coordX -0)*Math.cos(angle) - (coordY -0)*Math.sin(angle);
        setCoordX(coordX);
        System.out.println("x =" + coordX);
        coordY = 0 + (coordX -0)*Math.sin(angle) + (coordY -0)*Math.cos(angle);
        setCoordY(coordY);
        System.out.println("y =" + coordY);
    }

    public Astre(String nom, double coordX, double coordY, double rayon, long periodeRevolution, double taille, Color couleur) {
        this.nom = nom;
        this.coordX = coordX;
        this.coordY = coordY;
        this.rayon = rayon;
        this.periodeRevolution = periodeRevolution;
        this.taille = taille;
        this.couleur = couleur;
    }

    public static void placerAstre(double taille, Color couleur, double coordX, double coordY){
        StdDraw.setPenRadius(taille);
        StdDraw.setPenColor(couleur);
        System.out.println(coordY);
        StdDraw.point(coordX, coordY);
    }

}
