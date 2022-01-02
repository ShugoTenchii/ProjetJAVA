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
    private int vitesse;
    private double angleDistance;
    private double rayon;
    private int periodeRevolution;
    private double taille;
    private Color couleur;
    double angle ;

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    public String getNom() {
        return nom;
    }

    public int getVitesse() {
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
        this.coordY = this.rayon * Math.cos(angle);
    }



    public Astre(String nom, double coordX, double coordY, double rayon, int periodeRevolution, double taille, Color couleur, HorlogeUniverselle Horloge) {
        this.nom = nom;
        this.coordX = coordX;
        this.coordY = coordY;
        this.rayon = rayon;
        this.periodeRevolution = periodeRevolution;
        this.taille = taille;
        this.couleur = couleur;
        this.angle = Math.PI*1/2;
        this.vitesse = 20;
        this.angleDistance = ((Math.PI*2)/(this.periodeRevolution/Horloge.getCombienDejour()));
    }

    public void placerAstre(){
        StdDraw.setPenRadius(this.taille);
        StdDraw.setPenColor(this.couleur);
        StdDraw.point(this.coordX, this.coordY);
    }



    public void trajetAstre(){
        StdDraw.setPenRadius(0.001);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.circle(0, 0,this.rayon);
    }

    public void deplacePosition(HorlogeUniverselle Horloge){
        StdDraw.clear(StdDraw.BLACK);
        this.ChangePosition(this.angle);
        this.angle = this.angle - this.angleDistance;
        MonSystemeSolaire.creeSysteme();
        StdDraw.show();
    }

    public static void deplaceSysteme(HorlogeUniverselle Horloge,Astre Mars, Astre Terre, Astre Venus, Astre Mercure, Astre Neptune, Astre Uranus, Astre Saturne, Astre Jupiter){

                Terre.deplacePosition(Horloge);
                Mars.deplacePosition(Horloge);
                Venus.deplacePosition(Horloge);
                Mercure.deplacePosition(Horloge);
                Neptune.deplacePosition(Horloge);
                Uranus.deplacePosition(Horloge);
                Saturne.deplacePosition(Horloge);
                Jupiter.deplacePosition(Horloge);
    }
}
