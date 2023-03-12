package pl.iwopusz.quiz.frontend;

import lombok.Data;

@Data
public class GameOptions {
    private int numberOfQuestions = 21;
    private Difficulty difficulty;
    private int categoryId;
}
