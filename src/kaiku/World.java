package kaiku;

import java.util.HashMap;

class World {
    private int SPEED = 1;
    HashMap<String, Kingdom> kingdoms = new HashMap<>();
    HashMap<String, Fief> fiefs = new HashMap<>();
    Thread gameThread;

    World(){
        gameThread = new Thread(() -> {
            long prevTime = System.currentTimeMillis();

            startInit();

            while (true){
                if (System.currentTimeMillis() - prevTime > 5000 / SPEED){
                    prevTime = System.currentTimeMillis();
                }
            }
        });


    }

    private void startInit(){
        createKingdom("Calradia");
        createFief("Capital");

        changeFiefOwner("Capital", "Calradia");
    }

    private void createKingdom(String name){
        kingdoms.put(name, new Kingdom(name));
    }

    private void createFief(String name){
        fiefs.put(name, new Fief(name));
    }

    private void changeFiefOwner(String name, String owner){
        fiefs.get(name).changeOwner(owner);
    }
}
