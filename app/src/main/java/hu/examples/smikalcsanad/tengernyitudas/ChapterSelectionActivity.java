package hu.examples.smikalcsanad.tengernyitudas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by Smikál Csanád on 17/10/23.
 */

public class ChapterSelectionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.story_activity);

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
    }

    private void startChapter(int chapterNumber){
        switch(chapterNumber){
            case 1:
                Intent intent = new Intent(getApplicationContext(), ChapterOneActivity.class);
                intent.putExtra("layout", R.layout.chapter_one);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
