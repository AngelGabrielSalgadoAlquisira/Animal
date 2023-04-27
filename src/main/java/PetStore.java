import java.util.concurrent.Callable;
public class PetStore {
    public static void main(String[] args) {
        Cat gato = new Cat("Garfield", "Naranja", 5 , "gato");
        gato.toString();
        System.out.println(gato.sonido());

        dog perro = new dog("Firulais", "manchado", 3, "perro");
        perro.toString();
        System.out.println(perro.sonido());

        rooster gallo = new rooster("Claudio", "Blnaco con rojo", 1, "gallo");
        gallo.toString();
        System.out.println(gallo.sonido());



    }
}
