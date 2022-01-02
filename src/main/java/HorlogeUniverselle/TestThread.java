package HorlogeUniverselle;

public class TestThread {

    public static void main(String[] args) {


        HorlogeUniverselle Horloge =
                new HorlogeUniverselle(1, 10, 1000);

        Horloge.start();

        HorlogeUniverselle.pause(30000);
        Horloge.fin();

        System.out.println("Nombre de jour = " + Horloge.getNombreDejour() + "ms");
    }

}
