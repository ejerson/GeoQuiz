package edu.cnm.deepdive.explore.geoquiz;

public class Question {

  private int mTextResId;
  private boolean mAnswerTrue;

  private Question(int textResId, boolean answerTrue) {
    mTextResId = textResId;
    mAnswerTrue = answerTrue;
  }

  private int getTextResId() {
    return mTextResId;
  }

  public void setTextResId(int textResId) {
    mTextResId = textResId;
  }

  private boolean isAnswerTrue() {
    return mAnswerTrue;
  }

  private void setAnswerTrue(boolean answerTrue) {
    mAnswerTrue = answerTrue;
  }
}
