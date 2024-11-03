package com.teachmeskills.lesson_10;

import com.teachmeskills.lesson_10.checks.CheckForDuplicates;
import com.teachmeskills.lesson_10.model.Card;
import com.teachmeskills.lesson_10.model.Client;

public class ApplicationRunner {
    public static void main(String[] args) {

        Card[] cards = {
                new Card(2642642, 123, "12345"),
                new Card(23043834, 123, "12345"),
                new Card(200, 456, "67890")
        };

        Client client = new Client(cards);
        CheckForDuplicates.checkDuplicateCards(client);
    }
}
