public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Inicio del juego FizzBuzz");
        contarHastaCien(1);
    }
    public static void contarHastaCien(int numero) {
        //Método que hace que el programa pare en el 100 y que no siga hasta el 101,102,...
        if (numero > 100) {
            return; 
        }
        //Método que comprueba si el número es divisible por 3 o 5 y si lo es imprime FizzBuzz
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("FizzBuzz");
        } 
        //Método que comprueba si es divisible por 3 solo y si lo es imprime Fizz
        else if (numero % 3 == 0) {
            System.out.println("Fizz");
        } 
        //Método que comprueba si es divisible por 5 solo y si lo es imprime Buzz
        else if (numero % 5 == 0) {
            System.out.println("Buzz");
        } 
        //Si el número no cumple ningun método de arriba, imprime el número original
        else {
            System.out.println(numero);
        }
        //Método se llama a si mismo y le suma uno a ese número
        contarHastaCien(numero + 1);
    }
}
