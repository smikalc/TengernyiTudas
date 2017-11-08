package hu.examples.smikalcsanad.tengernyitudas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button storyButton;
    private Button quizButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this should hide the title...but it doesn't
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        storyButton = (Button)findViewById(R.id.storyButton);
        quizButton = (Button)findViewById(R.id.quizButton);

        storyButton.setVisibility(View.VISIBLE);
        quizButton.setVisibility(View.VISIBLE);

        storyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startStoryActivity();
            }
        });

        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuizActivity();
            }
        });
    }

    private void startStoryActivity(){
        Intent intent = new Intent(getApplicationContext(), ChapterSelectionActivity.class);
        intent.putExtra("layout", R.layout.story_activity);
        startActivity(intent);
    }

    private void startQuizActivity(){
        Intent intent = new Intent(getApplicationContext(), QuizSelectionActivity.class);
        intent.putExtra("layout", R.layout.story_activity);
        startActivity(intent);
    }
}
