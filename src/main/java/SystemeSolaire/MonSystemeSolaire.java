package SystemeSolaire;

import Draw.StdDraw;

public class MonSystemeSolaire {

    static Astre Soleil = new Astre("Soleil", 0,0,2, 0, 0.2, StdDraw.PRINCETON_ORANGE);
    static Astre Terre = new Astre("Terre", 0.85,0, 2,4, 0.025, StdDraw.BOOK_BLUE);
    static Astre Mars = new Astre("Mars",1.0,0,2,7, 0.02, StdDraw.BOOK_RED);
    static Astre Venus = new Astre("Venus", 0.7,0,2,3, 0.025, StdDraw.LIGHT_GRAY);
    static Astre Mercure = new Astre("Mercure", 0.5,0, 2,1, 0.02, StdDraw.GRAY);
    static Astre Jupiter = new Astre("Jupiter", 1.2,0, 2,10,0.05, StdDraw.ORANGE);
    static Astre Saturne = new Astre("Saturne", 1.45,0, 2,15,0.05, StdDraw.YELLOW);
    static Astre Uranus = new Astre("Uranus", 1.675,0, 2,20,0.04,StdDraw.BOOK_LIGHT_BLUE);
    static Astre Neptune = new Astre("Neptune", 1.875,0, 2,30,0.04,StdDraw.BLUE);

    public static void main(String[] args) {
        StdDraw.clear(StdDraw.BLACK);
        Astre.placerAstre(Soleil.getTaille(),Soleil.getCouleur(),Soleil.getCoordX(),Soleil.getCoordY());
        Terre.ChangePosition((Math.PI)/2, Terre.getCoordX(), Terre.getCoordY());
        Astre.placerAstre(Terre.getTaille(),Terre.getCouleur(),Terre.getCoordX(),Terre.getCoordY());
        Astre.placerAstre(Mars.getTaille(),Mars.getCouleur(),Mars.getCoordX(),Mars.getCoordY());
        Astre.placerAstre(Venus.getTaille(),Venus.getCouleur(),Venus.getCoordX(),Venus.getCoordY());
        Astre.placerAstre(Mercure.getTaille(),Mercure.getCouleur(),Mercure.getCoordX(),Mercure.getCoordY());
        Astre.placerAstre(Jupiter.getTaille(),Jupiter.getCouleur(),Jupiter.getCoordX(),Jupiter.getCoordY());
        Astre.placerAstre(Saturne.getTaille(),Saturne.getCouleur(),Saturne.getCoordX(),Saturne.getCoordY());
        Astre.placerAstre(Uranus.getTaille(),Uranus.getCouleur(),Uranus.getCoordX(),Uranus.getCoordY());
        Astre.placerAstre(Neptune.getTaille(),Neptune.getCouleur(),Neptune.getCoordX(),Neptune.getCoordY());

    }

}
