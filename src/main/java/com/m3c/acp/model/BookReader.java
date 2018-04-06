package com.m3c.acp.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class BookReader {

    private HashMap<String, Integer> countMap = new HashMap<String, Integer>();

    public HashMap<String, Integer> readingBook(String fileName) throws Exception
    {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String currentLine = reader.readLine();

        while (currentLine != null)
        {
            String[] words = currentLine.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
            currentLine = reader.readLine();
            for (String word : words)
            {
                if ((word != null) && (word.length() != 0))
                {
                    if (countMap.containsKey(word)) {
                        countMap.put(word, countMap.get(word) + 1);
                    }
                    else {
                        countMap.put(word, 1);
                    }
                }
            }
        }
        return countMap;
    }


}
