package wcs.dojo3;

import java.util.HashMap;

public class CharCount {


    public CharCount() {
    }

    public int count(String word, char letter) {

        char[] letters;
        int counter = 0;
        letters = word.toCharArray();

        for (char element : letters) {
            if( element == letter ) {
                counter += 1;
            }
        }

        return counter;

    }
    
    public HashMap countAllLetters(String word) {

        HashMap<Character, Integer> resultat = new HashMap<>();
        char[] alphabetTab;

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        alphabetTab = alphabet.toCharArray();


        for (char element : alphabetTab) {
            int count = count(word, element);
            if (count > 0) {
                resultat.put(element,count);
            }
        }

        return resultat;
        
    }

    public HashMap countAllLetters2(String word) {

        HashMap<Character, Integer> resultat = new HashMap<>();

        char[] letters;
        int counter = 0;
        letters = word.toCharArray();

        if (word != null) {
            for (char element : letters) {
                if (resultat.containsKey(element)) {
                    counter = resultat.get(element) + 1;
                    resultat.put(element,counter);
                } else {
                    resultat.put(element,1);
                }
                counter += 1;
            }
        }


        return resultat;

    }
}
