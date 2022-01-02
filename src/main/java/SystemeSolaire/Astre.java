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

    public void ChangePosition(double angle){
        this.coordX = (this.coordX -0)*Math.cos(angle) + (this.coordY -0)*Math.sin(angle) + 0;
        setCoordX(this.coordX);
        System.out.println("x =" + this.coordX);
        coordY = -(coordX -0)*Math.sin(angle) + (coordY -0)*Math.cos(angle) + 0;
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

    public void placerAstre(){
        StdDraw.setPenRadius(this.taille);
        StdDraw.setPenColor(this.couleur);
        System.out.println(this.coordY);
        StdDraw.point(this.coordX, this.coordY);
    }



    public void trajetAstre(){
        StdDraw.setPenRadius(0.001);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.circle(0, 0,this.rayon);
    }

    public void removeAstre(){

    }

}
