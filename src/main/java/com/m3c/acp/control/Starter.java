package com.m3c.acp.control;

public class Starter {

    public static void main( String[] args ) throws Exception {

        long startTime = System.nanoTime();
        WordCountManager wordCountManager = new WordCountManager();
        wordCountManager.beginProcess();
        long endTime = System.nanoTime();
        System.out.println("Time taken to run: "+(endTime-startTime)/1000000000.0+" seconds");
    }
}
