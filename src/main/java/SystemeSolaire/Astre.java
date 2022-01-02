package SystemeSolaire;

import javax.swing.*;
import Draw.StdDraw;
import HorlogeUniverselle.HorlogeUniverselle;
import java.lang.*;

import java.awt.*;

public class Astre extends JPanel{

    private String nom;
    private double coordX;
    private double coordY;
    private long temps;
    private long vitesse;
    private double rayon;
    private int periodeRevolution;
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
        this.coordX = this.rayon * Math.sin(angle);
        System.out.println("x =" + this.coordX);
        this.coordY = this.rayon * Math.cos(angle);
        System.out.println("y =" + coordY);
    }



    public Astre(String nom, double coordX, double coordY, double rayon, int periodeRevolution, double taille, Color couleur) {
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
        StdDraw.filledCircle(this.coordX, this.coordY, 0.05);
    }



    public void trajetAstre(){
        StdDraw.setPenRadius(0.001);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.circle(0, 0,this.rayon);
    }

    public void deplacePosition(HorlogeUniverselle Horloge){
        double angle = Math.PI*1/2;
        int temps = Horloge.getSeconde() / 1000;
        while (Horloge.getNombreDejour() < this.getPeriodeRevolution()){
            StdDraw.clear(StdDraw.BLACK);
            this.ChangePosition(angle);
            angle = angle - 0.02;
            MonSystemeSolaire.creeSysteme();
            StdDraw.show();
            StdDraw.pause(this.periodeRevolution/Horloge.getCombienDejour());
        }
    }

}
