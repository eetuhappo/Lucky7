import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        // Lucky7 harjoitus
        
        Random random = new Random();

        // Muuttujat
        int randomNumber1;
        int randomNumber2;
        int randomNumber3;

        // arvotaan kolme numeroa väliltä 1-10
        // jos jokin numero on 7 kerrotaan että voitit, muutoin että hävisit ja peli loppuu

        randomNumber1 = random.nextInt(10)+1;
        randomNumber2 = random.nextInt(10)+1;
        randomNumber3 = random.nextInt(10)+1;
        System.out.println("Arvotut numerot ovat: " + randomNumber1 + " " + randomNumber2 + " " + randomNumber3);

        if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7) {
            System.out.println("Voitit!");
        }
        else {
            System.out.println("Hävisit!");
        }

    }
}
