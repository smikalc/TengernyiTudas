package hu.examples.smikalcsanad.tengernyitudas;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Smikál Csanád on 17/10/25.
 */

public class FirstQuizActivity extends Activity {

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

        TextView questionView= (TextView)findViewById(R.id.quiz_question);
        questionView.setText("Miért jó a HCI?");

        manager = QuizManager.getInstance();
        //instantiate answer buttons
        answerA = (Button)findViewById(R.id.answer_a);
        answerB = (Button)findViewById(R.id.answer_b);
        answerC = (Button)findViewById(R.id.answer_c);
        answerD = (Button)findViewById(R.id.answer_d);

        //instantiate onClickListeners
        buttonAOnClickListener = new QuizAnswerButtonOnClickListener("A", RightAnswers.FIRST_QUIZ_RIGHT_ANSWER,
                this.manager, 1);
        buttonBOnClickListener = new QuizAnswerButtonOnClickListener("B", RightAnswers.FIRST_QUIZ_RIGHT_ANSWER,
                this.manager, 1);
        buttonCOnClickListener = new QuizAnswerButtonOnClickListener("C", RightAnswers.FIRST_QUIZ_RIGHT_ANSWER,
                this.manager, 1);
        buttonDOnClickListener = new QuizAnswerButtonOnClickListener("D", RightAnswers.FIRST_QUIZ_RIGHT_ANSWER,
                this.manager, 1);

        answerA.setOnClickListener(buttonAOnClickListener);
        answerB.setOnClickListener(buttonBOnClickListener);
        answerC.setOnClickListener(buttonCOnClickListener);
        answerD.setOnClickListener(buttonDOnClickListener);
    }
}
