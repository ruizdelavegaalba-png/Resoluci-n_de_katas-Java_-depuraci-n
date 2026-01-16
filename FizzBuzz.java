public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Inicio del juego FizzBuzz");
        contarHastaCien(1);
    }
    public static void contarHastaCien(int numero) {
        if (numero > 100) {
            return; 
        }
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("FizzBuzz");
        } 
        else if (numero % 3 == 0) {
            System.out.println("Fizz");
        } 
        else if (numero % 5 == 0) {
            System.out.println("Buzz");
        } 
        else {
            System.out.println(numero);
        }
        contarHastaCien(numero + 1);
    }
}
