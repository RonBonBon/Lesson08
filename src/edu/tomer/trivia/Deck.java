package edu.tomer.trivia;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by hackeru on 06/02/2017.
 */
public class Deck {

    //properties:
    private ArrayList<Trivia> cards = QuestionsService.getQuestions();

    //constructor:
    public Deck(){
        shuffle();
    }



    //methods
    public void shuffle(){
        ArrayList<Trivia> shuffled = new ArrayList<>();
        Random r  = new Random();

        while (cards.size() > 0){
            int randIndex = r.nextInt(cards.size());
            Trivia card = cards.remove(randIndex);
            shuffled.add(card);
        }
        cards = shuffled;
    }

    public int size(){
        return cards.size();
    }

    public boolean isEmpty(){
        return cards.size() == 0;
    }

    public Trivia nextQuestion(){
        Trivia card = cards.remove(0);
        return card;
    }
}
