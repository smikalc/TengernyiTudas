package hu.examples.smikalcsanad.tengernyitudas;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Smikál Csanád on 17/10/25.
 */

public class QuizSelectionActivity extends Activity {

    private QuizManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.story_activity);

        manager = new QuizManager();

        Button firstChapter = (Button)findViewById(R.id.chapter_one);
        Button secondChapter = (Button)findViewById(R.id.chapter_two);
        Button thirdChapter = (Button)findViewById(R.id.chapter_three);
        Button fourthChapter = (Button)findViewById(R.id.chapter_four);
        Button fifthChapter = (Button)findViewById(R.id.chapter_five);
        Button sixthChapter = (Button)findViewById(R.id.chapter_six);
        Button seventhChapter = (Button)findViewById(R.id.chapter_seven);

        firstChapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChapter(1);
            }
        });
        secondChapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChapter(2);
            }
        });
    }

    private void startChapter(int chapterNumber){
        switch(chapterNumber){
            case 1:
                Intent intent1 = new Intent(getApplicationContext(), FirstQuizActivity.class);
                intent1.putExtra("layout", R.layout.quiz);
                startActivity(intent1);
                break;
            case 2:
                String success = "";
                if(manager.getFirstQuizSuccess())
                    success = "true";
                else
                    success = "false";
                Toast.makeText(getApplicationContext(), success, Toast.LENGTH_LONG).show();

                if(manager.getFirstQuizSuccess()){
                   Toast.makeText(getApplicationContext(), "aséldk", Toast.LENGTH_LONG);
                    Intent intent2 = new Intent(getApplicationContext(), SecondQuizActivity.class);
                    intent2.putExtra("layout", R.layout.quiz);
                    startActivity(intent2);
                    break;
                }
                else{
                    Toast.makeText(getApplicationContext(), "asdfasdfasfd",
                           Toast.LENGTH_LONG).show();
                    break;
                }
            default:
                break;
        }

    }
}
