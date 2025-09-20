import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Lucky7 harjoitus
        
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        // Muuttujat
        
        int randomNumber1;
        int randomNumber2;
        int randomNumber3;
        int money;
        String playAgain;

        // Pelin alussa pelaaja syöttää haluamansa rahamäärän. Yksi kierros maksaa 1 euron.
        // arvotaan kolme numeroa väliltä 1-10
        // jos jokin numero on 7 voittaa 2 euroa, 2x7 voittaa 5 euroa ja 3x7 voittaa 10 euroa.
        // Peli loppuu kun pelaajalla ei ole rahaa.

        System.out.println("Pelataan lucky 7 peliä. Yksi kierros maksaa 1 euron. Syötä haluamasi rahamäärä");
        money = Integer.parseInt(in.nextLine());
        System.out.println("Sinulla on rahaa " + money + " euroa");
        do {
            randomNumber1 = random.nextInt(10)+1;
            randomNumber2 = random.nextInt(10)+1;
            randomNumber3 = random.nextInt(10)+1;
            money = money - 1;
            System.out.println("Arvotut numerot ovat: " + randomNumber1 + " " + randomNumber2 + " " + randomNumber3);

                
            if (randomNumber1 == 7 && randomNumber2 == 7 && randomNumber3 == 7) {
                money = money + 10;
                System.out.println("Voitit 10 euroa. Sinulla on rahaa jäljellä " + money + " euroa.");
            }
                        else if (randomNumber1 == 7 && randomNumber2 == 7 || randomNumber1 == 7 && randomNumber3 == 7 || randomNumber2 == 7 && randomNumber3 == 7) {
                money = money + 5;
                System.out.println("Voitit 5 euroa. Sinulla on rahaa jäljellä " + money + " euroa.");
            }
                        else if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7) {
                money = money + 2;
                System.out.println("Voitit 2 euroa. Sinulla on rahaa jäljellä " + money + " euroa.");
            }
            else {
                System.out.println("Hävisit! Sinulla on rahaa jäljellä " + money + " euroa.");
            }
            if (money == 0) {
            System.out.println("Peli päättyi.");
            break;
            }
            System.out.println("Pelataanko uudestaan (K/E)?");
            playAgain = in.nextLine();
            
        }
        while (playAgain.equalsIgnoreCase("K") && money > 0);
               
        
    }
}
