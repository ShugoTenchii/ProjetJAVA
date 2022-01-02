package HorlogeUniverselle;
import java.lang.*;
import SystemeSolaire.*;

import static SystemeSolaire.MonSystemeSolaire.Terre;

public class HorlogeUniverselle extends Thread{

    private int seconde;
    private boolean continuer;
    private int day = 0;
    private int combienDejour;

    public int getSeconde() {
        return seconde;
    }

    public int getCombienDejour(){
        return combienDejour;
    }

    public HorlogeUniverselle(int seconde, int combienDejour, int secondeToMillis){
        this.seconde = seconde * secondeToMillis;
        this.combienDejour = combienDejour;
        this.day = day;
    }

    public static void pause(long millis){
        try{
            Thread.sleep(millis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void run(){
        continuer = true;
        long UniversTime = System.currentTimeMillis();
        while (continuer){
            if(System.currentTimeMillis() == UniversTime + seconde){
                UniversTime = UniversTime + seconde;
                day = day + combienDejour;
                System.out.println("Jour = " + day);

            }
        }
    }



    public long getNombreDejour(){
        return day;
    }

    public void fin(){
        continuer=false;
    }
}
