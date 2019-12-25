package com.mirea;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> table = new HashMap<>();

        String[] words = {"word1", "word2", "word3", "word4", "word5",
                        "word6", "word7", "word8", "word9", "word10"};

        for(String c : words) {
            hashtabAdd(table, c);
        }

        System.out.println(table);
        hashtabDelete(table, "word3");
        System.out.println(table);
        System.out.println(hashtabLookup(table, 113319137));
    }

    static int hashtabHash(String word) {
        int hashCode = 17;
        hashCode = 37 * hashCode + (word == null ? 0 : word.hashCode());

        return hashCode;
    }

    static int hashtabInit() {
        return 0;
    }

    static HashMap hashtabAdd(HashMap<Integer, String> table, String word) {
        table.put(hashtabHash(word), word);

        return table;
    }

    static HashMap hashtabDelete (HashMap<Integer, String> table, String word) {
        table.remove(hashtabHash(word));
        return table;
    }

    static String hashtabLookup(HashMap<Integer, String> table, Integer key) {
        for (Integer i : table.keySet()) {
            if (key.equals(i)) {
                return table.get(key);
            }
        }
        return "";
    }
}
