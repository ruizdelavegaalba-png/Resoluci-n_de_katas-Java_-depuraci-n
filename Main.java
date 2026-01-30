public class Main {
    public static void main(String[] args) {
    //Imprime por consola lo siguiente: 
        Tamagotchi miMascota = new Tamagotchi();

        System.out.println("Probando Tamagotchi");
        System.out.println("Jugando: " + miMascota.play());
        System.out.println("Comiendo: " + miMascota.eat());
        System.out.println("Durmiendo: " + miMascota.sleep());
        System.out.println("Estado final -> Hambre: " + miMascota.hunger + ", Energia: " + miMascota.energy + ", Humor: " + miMascota.mood);}
    
}
