package Kermis;

import java.util.Scanner;

import java.util.ArrayList;

public class HoofdApp {
	
static public void main (String[]args) {
}
 	
public abstract class Attracties { 
    Attracties() {
        System.out.println("Welkom bij de kermis.");
    }

    String[] attracties = {"De Hawaii", "De Spin", "De Ladder", "Het Spiegelpaleis", "De Botsauto's", "Het Spookhuis"};
    double[] prijs = {250,225,275,320,290,500};
    
    void bestellen() {
    	Scanner scan = new Scanner(System.in);
    	int i = scan.nextInt();
    	System.out.println("In welke attractie zou je willen?");
        int x;
        for (x = 0; x < attracties.length; x++) {
            System.out.println((x + 1) + " - " + attracties[x] + " dit kost €" + (prijs[x]/100) + ".");
        }

        switch (i) {
            case 1:
                System.out.println("Je hebt een kaartje gekocht voor: " + attracties[(i-1)] + ", met een prijs van €" + (prijs[(i-1)]/100) + "0.");
                Hawaii.activeren();
                break;
            case 2:
                System.out.println("U heeft een kaartje gekocht voor " + attracties[(i-1)] + ", met een prijs van €" + (prijs[(i-1)]/100) + ".");
                Spin.activeren();
                break;
            case 3:
                System.out.println("U heeft een ticket gekocht voor " + attracties[(i-1)] + ", met een prijs van €" + (prijs[(i-1)]/100) + ".");
                Ladder.activeren();
                break;
            case 4:
                System.out.println("U heeft een ticket gekocht voor " + attracties[(i-1)] + ", met een prijs van €" + (prijs[(i-1)]/100) + "0.");
                Spiegelpaleis.activeren();
                break;
            case 5:
                System.out.println("U heeft een ticket gekocht voor " + attracties[(i-1)] + ", met een prijs van €" + (prijs[(i-1)]/100) + "0.");
                Botsauto.activeren();
                break;
            case 6:
                System.out.println("U heeft een ticket gekocht voor " + attracties[(i-1)] + ", met een prijs van €" + (prijs[(i-1)]/100) + "0.");
                Spookhuis.activeren();
                 break;
        }
    }
}

    }
    	
