package fr.wildcodeschool.idetest;

public class Decipherer {

	public static void main(String[] args) {
		
		String[] theMessages = {
	            "0@sn9sirppa@#?ia'jgtvryko1",
	            "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
	            "aopi?sedohtém@#?sedhtmg+p9l!"
        };

        for (int i = 0; i < theMessages.length; i++) {
            System.out.println(decodeMessage(theMessages[i]));
        }

	}
	
	public static String decodeMessage(String message) {
        
        // keyNumber = longueur chaine divisée par 2
        Integer keyNumber = message.length() / 2;

        // sous-chaîne : pos. 6ème caractère, longueur = keyNumber
        String sousChaine = message.substring(5, 5 + keyNumber);

        // remplace '@#?' par un espace
        sousChaine = sousChaine.replace ("@#?", " ");

        // inverse la chaîne
        sousChaine = new StringBuilder(sousChaine).reverse().toString();

        return (sousChaine);

    }

}
