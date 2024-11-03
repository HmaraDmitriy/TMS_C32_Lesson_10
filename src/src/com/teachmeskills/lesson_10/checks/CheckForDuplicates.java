package com.teachmeskills.lesson_10.checks;

import com.teachmeskills.lesson_10.model.Card;
import com.teachmeskills.lesson_10.model.Client;

public class CheckForDuplicates {

    public static void checkDuplicateCards(Client client) {
        Card[] cards = client.getCards();

        if (cards == null || cards.length == 0) {
            System.out.println("The client does not have a single card.");
            return;
        }

        boolean hasDuplicates = false;

        for (int i = 0; i < cards.length; i++) {
            int duplicateCount = 1;
            if (cards[i] == null) continue;

            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].getCardNumber().equals(cards[j].getCardNumber()) && cards[i].getCvv() == cards[j].getCvv()) {
                    duplicateCount++;
                    cards[j] = null;
                }
            }

            if (duplicateCount > 1) {
                hasDuplicates = true;
                System.out.println("The client has" + duplicateCount + " identical cards with a number "
                + cards[i].getCardNumber() + " and CVV " + cards[i].getCvv());
            }
        }

        if (!hasDuplicates) {
            System.out.println("The client does not have identical cards.");
        }
    }
}
