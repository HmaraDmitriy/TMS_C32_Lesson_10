package com.teachmeskills.lesson_10;

import com.teachmeskills.lesson_10.checks.CheckForDuplicates;
import com.teachmeskills.lesson_10.model.Card;
import com.teachmeskills.lesson_10.model.Client;

public class ApplicationRunner {
    public static void main(String[] args) {

        Card[] cards = {
                new Card(2642642, 123, "12345"),
                new Card(23043834, 123, "12345"),
                new Card(2000, 456, "67890"),
                new Card(26277, 324, "67890"),
                new Card(27257, 456, "55555"),
                new Card(897556, 465, "55555"),
                new Card(897556, 465, "55555"),
                new Card(897556, 465, "55555")
        };

        Client client = new Client(cards);
        client.setCards(cards);
        int count = CheckForDuplicates.getDuplicateCard(null);
        int count2 = CheckForDuplicates.getDuplicateCard(cards);

        System.out.println(count);
        System.out.println(count2);
    }
}
