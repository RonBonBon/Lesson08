package edu.tomer;

import edu.tomer.trivia.Deck;
import edu.tomer.trivia.Trivia;
import edu.tomer.utils.IO;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Deck d = new Deck();
        int score = 0;
        while (!d.isEmpty()) {
            Trivia q = d.nextQuestion();
            q.show();
            q.showAnswers();
            int userIndex = IO.getInt("Enter your answer:");
            boolean correct = q.check(userIndex);
            if(correct) {
                score++;
                System.out.println("Your score is: " + score);
            }
        }
    }


    public static ArrayList<Trivia> getQuestions() {
        ArrayList<Trivia> questions = new ArrayList<>();

        Trivia q1 = new Trivia("Whose the president of the US?",
                new String[]{"Obama", "Clinton", "Bush", "Trump"}, "Trump");

        Trivia q2 = new Trivia("A + B ?",
                new String[]{"AB", "22", "1", "0"}, "AB");


        questions.add(q1);
        questions.add(q2);
        return questions;
    }

}
