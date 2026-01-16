public class Tamagotchi {
    int hunger = 4;
    int energy = 4;
    int mood = 4;

    public static void main(String[] args) {
        Tamagotchi miMascota = new Tamagotchi();

        System.out.println("Probando Tamagotchi");
        System.out.println("Jugando: " + miMascota.play());
        System.out.println("Comiendo: " + miMascota.eat());
        System.out.println("Comiendo: " + miMascota.eat());
        System.out.println("Durmiendo: " + miMascota.sleep());
        System.out.println("Estado final -> Hambre: " + miMascota.hunger + ", Energía: " + miMascota.energy + ", Humor: " + miMascota.mood);
    }
    public String play() {
        hunger = hunger + 1;
        mood = mood + 1;
        energy = energy - 1;
        return obtenerEstado("jugar");
    }
    public String eat() {
        hunger = hunger - 2;
        energy = energy - 1;
        return obtenerEstado("comer");
    }

    public String sleep() {
        energy = energy + 2;
        return "(-_-) zZZ"; 
    }
    public String obtenerEstado(String accion) {
        if (energy <= 0) {
            return "(-_-) zZZ";
        }
        if (mood > 8) {
            return ":-)";
        }
        if (energy < 3) {
            return "(-_-)";
        }
        if (mood < 2) {
            return "ఠ_ఠ";
        }
        return ":-|";
    }
}