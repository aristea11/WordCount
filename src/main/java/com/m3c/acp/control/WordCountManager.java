package com.m3c.acp.control;

import com.m3c.acp.model.BookReader;
import com.m3c.acp.model.WordSearch;
import java.util.*;


public class WordCountManager {

    HashMap<String, Integer> countMap = new HashMap<String, Integer>();


    public void beginProcess(){
        BookReader myReader = new BookReader();
        try {
            HashMap<String, Integer> map = myReader.readingBook("resources/aLargeFile");
            find3MostCommonWords(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public String[] find3MostCommonWords(HashMap<String, Integer> countMap){

        WordSearch search = new WordSearch();
        String[] words = search.mostCommonWords(countMap);
        return words;

    }







}

