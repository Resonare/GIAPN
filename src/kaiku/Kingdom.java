package kaiku;

import java.util.ArrayList;

class Kingdom {
    String name;
    ArrayList<String> fiefs = new ArrayList<>();

    Kingdom(String _name){
        name = _name;
    }

    void buildFief(String name){
        Main.world.fiefs.put(name, new Fief(name));
        Main.world.fiefs.get(name).changeOwner(this.name);
    }
}
