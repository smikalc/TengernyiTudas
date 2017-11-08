package hu.examples.smikalcsanad.tengernyitudas;

/**
 * Created by Smikál Csanád on 17/11/07.
 */

public class QuizManager {

    public static QuizManager instance;

    private boolean firstQuizSuccess;
    private boolean secondQuizSuccess;
    //TODO other quiz succes booleans

    public QuizManager(){
        this.firstQuizSuccess = false;
        this.secondQuizSuccess = false;
        instance = this;
    }

    public void setFirstQuizSuccess(boolean success){
        this.firstQuizSuccess = success;
    }

    public boolean getFirstQuizSuccess(){
        return firstQuizSuccess;
    }

    public void setSecondQuizSuccess(boolean secondQuizSuccess) {
        this.secondQuizSuccess = secondQuizSuccess;
    }

    public static QuizManager getInstance() {
        return instance;
    }

}
