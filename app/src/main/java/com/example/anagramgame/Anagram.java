package com.example.anagramgame;


import java.util.Random;

public class Anagram {
    public static final Random RANDOM = new Random();
    public static final String[] WORDS = {"FOX","ICE","EAT","TEN","PEN","RAT","MOON","KITE","GOLD","ATE","FOOL","SLEEP","TOLD","MOTION","TODAY","CALL","WALK","STAND"};

    public static String randomWord() {
        return WORDS[RANDOM.nextInt(WORDS.length)];
    }

    public static String shuffleWord(String word) {
        if (word != null && !"".equals(word)) {
            char a[] = word.toCharArray();

            for (int i = 0; i < a.length; i++) {
                int j = RANDOM.nextInt(a.length);
                char tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
            return new String(a);
        }
        return word;
    }
}

