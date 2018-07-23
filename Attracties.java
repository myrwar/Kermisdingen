package Kermis;

public abstract class Attracties {

	    static String naam;
	    int prijsTicket;
	    

	}

	class Hawaii extends Attracties{
	    static int kaartje;

	    static int activeren(){
	        kaartje = ++kaartje;
	        naam = "De Hawaii";
	        System.out.println(naam + " draait rondjes!");
	        
	        return kaartje;
	    }
	}

	class Spin extends Attracties {
	    static int kaartje;

	    static int activeren(){
	        kaartje = ++kaartje;
	        naam = "De Spin";
	        System.out.println(naam + " gaat op en neer!");
	        
	        return kaartje;
	    }
	}

	class Ladder extends Attracties {
	    static int kaartje;
	    static int activeren(){
	        kaartje = ++kaartje;
	        naam = "De ladder";
	        System.out.println("Waag je kans op "+ naam + " en win prachtige prijzen!");
	        
	        return kaartje;
	    }
	}

	class Spiegelpaleis extends Attracties {
	    static int kaartje;
	    static int activeren(){
	       kaartje = ++kaartje;
	        naam = "Het spiegelpaleis";
	        System.out.println("Verdwaal in " +naam + " !");
	        
	        return kaartje;
	    }
	}

	class Botsauto extends Attracties {
	    static int kaartje;
	    static int activeren(){
	        kaartje = ++kaartje;
	        naam = "De Botsauto's";
	        System.out.println("Ga voor een ritje in " + naam);
	        
	        return kaartje;
	    }
	}

	class Spookhuis extends Attracties {
	    static int kaartje;
	    static int activeren(){
	        kaartje = ++kaartje;
	        naam = "Het Spookhuis";
	        System.out.println("Lekker griezelen in " + naam);
	        
	        return kaartje;
	    }

	}