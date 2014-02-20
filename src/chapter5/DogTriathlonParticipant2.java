
/**
 * File Name:   DogTriathalonParticipant
 * Written by:  Aaron Arlotti
 * Written on:  Feb 19, 2014
 * Class:       Intro to Programming - ONT 187
 * Instructor:  Mark Forder
 * Book page:   
 */

package chapter5;

import chapter4.*;

public class DogTriathlonParticipant2 {
    private final int NUM_EVENTS;
    private static int totalCumulativeScore = 0;

    private String name;
    private int obedienceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double avg;
    private boolean scoresAgree;


    public DogTriathlonParticipant2(String name, int numEvents, int score1, int score2, int score3){
        int totalNot0 = 0;
        if(score1 != 0)
            totalNot0 = totalNot0 + 1;
        if(score2 != 0)
            totalNot0 = totalNot0 + 1;
        if(score3 != 0)
            totalNot0 = totalNot0 + 1;
        
        
        // compare the number of events to the total of nonzero scores and set the boolean variable scoresAgree
        if(scoresAgree)
        {
            obedienceScore = score1;
            conformationScore = score2;
            agilityScore = score3;
        }
        else
        {
            obedienceScore = 0;
            conformationScore = 0;
            agilityScore = 0;
        }
            
        
            this.name = name;
            NUM_EVENTS = numEvents;
            obedienceScore = score1;
            conformationScore =score2;
            agilityScore = score3;

            total = obedienceScore + conformationScore + agilityScore;
            if(NUM_EVENTS == 0)
                avg = 0;
            else
                avg =(double) total / NUM_EVENTS;
            totalCumulativeScore = totalCumulativeScore + total;
}

    public void display(){
            System.out.println(name + " participated in " + NUM_EVENTS + " events and has an average score of " + avg);
            System.out.println("  " + name + " has a total score of " + total + " bringing the cumulative score to " + totalCumulativeScore);
            if(!scoresAgree)
                System.out.println("Notice! Number of events for " + name + "does not agree with the scores reported.");
    
    }
}
