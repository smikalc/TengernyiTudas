package hu.examples.smikalcsanad.tengernyitudas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by Smikál Csanád on 17/11/07.
 */

public class SecondQuizActivity extends Activity {

    private Button answerA;
    private Button answerB;
    private Button answerC;
    private Button answerD;

    private QuizAnswerButtonOnClickListener buttonAOnClickListener;
    private QuizAnswerButtonOnClickListener buttonBOnClickListener;
    private QuizAnswerButtonOnClickListener buttonCOnClickListener;
    private QuizAnswerButtonOnClickListener buttonDOnClickListener;

    private QuizManager manager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.quiz);

        manager = QuizManager.getInstance();
        //instantiate answer buttons
        //TODO texts should be in a resource file
        answerA = (Button)findViewById(R.id.answer_a);
        //answerA.setText("A");
        answerB = (Button)findViewById(R.id.answer_b);
        //answerA.setText("B");
        answerC = (Button)findViewById(R.id.answer_c);
        //answerA.setText("B");
        answerD = (Button)findViewById(R.id.answer_d);
        //answerA.setText("B");

        //instantiate onClickListeners
        buttonAOnClickListener = new QuizAnswerButtonOnClickListener("A", RightAnswers.SECOND_QUIZ_RIGHT_ANSWER,
        this.manager, 2);
        buttonAOnClickListener = new QuizAnswerButtonOnClickListener("B", RightAnswers.SECOND_QUIZ_RIGHT_ANSWER,
        this.manager, 2);
        buttonAOnClickListener = new QuizAnswerButtonOnClickListener("C", RightAnswers.SECOND_QUIZ_RIGHT_ANSWER,
        this.manager, 2);
        buttonAOnClickListener = new QuizAnswerButtonOnClickListener("D", RightAnswers.SECOND_QUIZ_RIGHT_ANSWER,
        this.manager, 2);
        }
}
