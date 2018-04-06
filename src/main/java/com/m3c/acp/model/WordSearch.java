package com.m3c.acp.model;

import java.text.DecimalFormat;
import java.util.HashMap;

public class WordSearch {

    public String[] mostCommonWords(HashMap<String, Integer> countMap){

        String[] topWord = new String[3];

        for ( String eachWord : countMap.keySet()){
            if (topWord[0]==null || countMap.get(eachWord)> countMap.get(topWord[0])){
                topWord[2]=topWord[1];
                topWord[1]=topWord[0];
                topWord[0]=eachWord;
            }
            else if (topWord[1]==null || countMap.get(eachWord)> countMap.get(topWord[1])){
                topWord[2]=topWord[1];
                topWord[1]=eachWord;
            }
            else if(topWord[2]==null || countMap.get(eachWord)> countMap.get(topWord[2])){
                topWord[2]=eachWord;
            }
        }

        for (int i=0; i<3; i++) {
            DecimalFormat df = new DecimalFormat("###,###,###");
            int wordFrequency = countMap.get(topWord[i]);
            System.out.println(topWord[i] + " ("+ df.format(wordFrequency) + " times)");
        }
        return topWord;
    }

}
