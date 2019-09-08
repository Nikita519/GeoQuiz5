package com.android.shabalin.geoquiz;

public class Question {

    private int TextResId;
    private boolean CheckAnswer;
    private boolean AnswerTrue;

    public Question(int textResId, boolean answerTrue) {
        TextResId = textResId;
        AnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return TextResId;
    }

    public boolean isCheckAnswer() {
        return CheckAnswer;
    }

    public void setCheckAnswer(boolean checkAnswer) {
        CheckAnswer = checkAnswer;
    }

    public void setTextResId(int textResId) {
        TextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return AnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        AnswerTrue = answerTrue;
    }
}
