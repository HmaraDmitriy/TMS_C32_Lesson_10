package com.teachmeskills.lesson_10.checks;

import com.teachmeskills.lesson_10.model.Card;

public class CheckForDuplicates {

    public static int getDuplicateCard(Card[] cards){

        if(cards == null){
            System.out.println("The client has no cards");
            return -1;
        } else if(cards.length == 1){
            System.out.println("The client has only one card");
            return 0;
        } else {
            int countDuplicate = 0;

            for (int i = 0; i < cards.length; i++) {
                for(int j = i + 1; j < cards.length; j++){
                    System.out.println("Compare card = " + cards[i] + " with card = " + cards[j]);
                    if(cards[i].equals(cards[j])){
                        System.out.println("The cards are equal");
                        countDuplicate++;
                        System.out.println("Already have duplicates = " + countDuplicate);
                    } else {
                        System.out.println("The cards are not equal");
                    }
                    System.out.println("---------------------");
                }
                System.out.println("==========================");

                if(countDuplicate > 0){
                    break;
                }
            }
            return countDuplicate;
        }
    }
}
