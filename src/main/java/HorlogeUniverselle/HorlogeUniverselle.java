package HorlogeUniverselle;
import java.lang.*;

public class HorlogeUniverselle extends Thread{

    private long seconde;
    private boolean continuer;
    private int day = 0;
    private int combienDejour;

    public HorlogeUniverselle(long seconde, int combienDejour){
        this.seconde = seconde * 1000;
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
        return day * seconde;
    }

    public void fin(){
        continuer=false;
    }
}
