public class Tamagotchi {
    //puntos de vida
    int hunger = 4;
    int energy = 4;
    int mood = 4;
<<<<<<< HEAD
=======

    public static void main(String[] args) {
        Tamagotchi miMascota = new Tamagotchi();

        System.out.println("Probando Tamagotchi");
        System.out.println("Jugando: " + miMascota.play());
        System.out.println("Comiendo: " + miMascota.eat());
        System.out.println("Durmiendo: " + miMascota.sleep());
        System.out.println("Estado final -> Hambre: " + miMascota.hunger + ", Energia: " + miMascota.energy + ", Humor: " + miMascota.mood);
    }
>>>>>>> 82f5c33343aeb16ca6abfd276dc526e9e7a69834
    public String play() {
        //Función: Aumenta el hambre (+1) y el humor (+1), pero gasta energía (-1).
        hunger = hunger + 1;
        mood = mood + 1;
        energy = energy - 1;
        return obtenerEstado("jugar");
    }
    public String eat() {
        //Función: Reduce el hambre (-2) pero gasta un poco de energía (-1).
        hunger = hunger - 2;
        energy = energy - 1;
        return obtenerEstado("comer");
    }

    public String sleep() {
        //Función: Solo aumenta la energía (+2). 
        energy = energy + 2;
        return "(-_-) zZZ"; 
    }
    public String obtenerEstado(String accion) {
        // Función: muestra la carita que debe mostrar según la energía y humor
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
<<<<<<< HEAD
    
=======
>>>>>>> 82f5c33343aeb16ca6abfd276dc526e9e7a69834
}
