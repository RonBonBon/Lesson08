package edu.tomer.trivia;

import java.util.Arrays;

/**
 * Created by hackeru on 02/02/2017.
 */
public class Trivia {
    //properties:
    private String question;
    private String[] answers;
    private String correctAnswer;

    //constructor (alt + insert)
    public Trivia(String question, String[] answers, String correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    //methods:
    public void show() {
        System.out.println(question);
    }

    public void showAnswers() {
        for (int i = 0; i < answers.length; i++) {
            System.out.printf("%d)  %s\n", i + 1, answers[i]);
        }
    }
    public boolean check(int ans) {
        String userAnswer = answers[ans - 1];
        boolean isCorrect = userAnswer.equals(correctAnswer);

        System.out.println(isCorrect ?
                "Correct!" :
                "Wrong , the ans is " + correctAnswer);

        return isCorrect;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
