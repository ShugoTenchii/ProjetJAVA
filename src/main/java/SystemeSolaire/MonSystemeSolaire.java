package SystemeSolaire;

import Draw.StdDraw;
import HorlogeUniverselle.HorlogeUniverselle;

public class MonSystemeSolaire {

    static Astre Soleil = new Astre("Soleil", 0,0,2, 0, 0.2, StdDraw.PRINCETON_ORANGE);
    public static Astre Terre = new Astre("Terre", 0.85,0, 2,4, 0.025, StdDraw.BOOK_BLUE);
    static Astre Mars = new Astre("Mars",1.0,0,2,7, 0.02, StdDraw.BOOK_RED);
    static Astre Venus = new Astre("Venus", 0.7,0,2,3, 0.025, StdDraw.LIGHT_GRAY);
    static Astre Mercure = new Astre("Mercure", 0.5,0, 2,1, 0.02, StdDraw.GRAY);
    static Astre Jupiter = new Astre("Jupiter", 1.2,0, 2,10,0.05, StdDraw.ORANGE);
    static Astre Saturne = new Astre("Saturne", 1.45,0, 2,15,0.05, StdDraw.YELLOW);
    static Astre Uranus = new Astre("Uranus", 1.675,0, 2,20,0.04,StdDraw.BOOK_LIGHT_BLUE);
    static Astre Neptune = new Astre("Neptune", 1.875,0, 2,30,0.04,StdDraw.BLUE);

    static void creeSysteme(){
        Soleil.placerAstre();
        Terre.trajetAstre();
        Terre.placerAstre();
        Mars.trajetAstre();
        Mars.placerAstre();
        Venus.trajetAstre();
        Venus.placerAstre();
        Mercure.trajetAstre();
        Mercure.placerAstre();
        Jupiter.trajetAstre();
        Jupiter.placerAstre();
        Saturne.trajetAstre();
        Saturne.placerAstre();
        Uranus.trajetAstre();
        Uranus.placerAstre();
        Neptune.trajetAstre();
        Neptune.placerAstre();
    }

    public static void main(String[] args) {

        StdDraw.clear(StdDraw.BLACK);
        creeSysteme();




        double angle = 0.0;

        HorlogeUniverselle Horloge =
                new HorlogeUniverselle(1, 10);

        Horloge.start();

        while (Horloge.getNombreDejour() != Terre.getPeriodeRevolution()*360){
            creeSysteme();
                Terre.deplacerPoint(angle);
            angle = angle - 1;
            StdDraw.clear(StdDraw.BLACK);
        }


        StdDraw.clear(StdDraw.BLACK);
        Horloge.fin();



    }

}
