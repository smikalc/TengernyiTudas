package hu.examples.smikalcsanad.tengernyitudas;

import android.view.View;

/**
 * Created by Smikál Csanád on 17/11/07.
 */

public class QuizAnswerButtonOnClickListener implements View.OnClickListener {

    private String buttonType;
    private String rightAnswer;
    private int quizNumber;
    private QuizManager manager;

    public QuizAnswerButtonOnClickListener(String type, String answer, QuizManager aManager, int aNumber){
        this.buttonType = type;
        this.rightAnswer = answer;
        this.quizNumber = aNumber;
        this.manager = aManager;
    }

    @Override
    public void onClick(View v) {
        if(this.buttonType.equals(this.rightAnswer)){
            switch(quizNumber){
                case 1:
                    manager.setFirstQuizSuccess(true);
                    break;
                case 2:
                    manager.setSecondQuizSuccess(true);
                    break;
                default:
                    break;
                //TODO other quizes...
            }
        }
    }
}
