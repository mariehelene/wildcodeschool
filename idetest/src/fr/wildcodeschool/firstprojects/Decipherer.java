package fr.wildcodeschool.firstprojects;

public class Decipherer {

	public static void main(String[] args) {
		
		String[] theMessages = {
	            "0@sn9sirppa@#?ia'jgtvryko1",
	            "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
	            "aopi?sedoht�m@#?sedhtmg+p9l!"
        };

        for (int i = 0; i < theMessages.length; i++) {
            System.out.println(decodeMessage(theMessages[i]));
        }

	}
	
	public static String decodeMessage(String message) {
        
        // keyNumber = longueur chaine divis�e par 2
        Integer keyNumber = message.length() / 2;

        // sous-cha�ne : pos. 6�me caract�re, longueur = keyNumber
        String sousChaine = message.substring(5, 5 + keyNumber);

        // remplace '@#?' par un espace
        sousChaine = sousChaine.replace ("@#?", " ");

        // inverse la cha�ne
        sousChaine = new StringBuilder(sousChaine).reverse().toString();

        return (sousChaine);

    }

}
