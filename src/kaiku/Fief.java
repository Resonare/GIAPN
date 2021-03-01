package kaiku;

class Fief {
    String owner;
    String name;
    int prosperity;

    Fief(String _name){
        owner = null;
        name = _name;
        prosperity = 100;
    }

    void changeOwner(String name){
        if (owner != null)
            Main.world.kingdoms.get(owner).fiefs.remove(this.name);

        Main.world.kingdoms.get(name).fiefs.add(this.name);
        owner = name;
    }

    void calculate(){
        prosperity++;
    }
}
