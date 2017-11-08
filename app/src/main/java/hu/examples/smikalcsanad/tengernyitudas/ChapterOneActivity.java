package hu.examples.smikalcsanad.tengernyitudas;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Smikál Csanád on 17/10/25.
 */

public class ChapterOneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.chapter_one);

        TextView chapterText = (TextView)findViewById(R.id.firstChapterText);
        chapterText.setMovementMethod(new ScrollingMovementMethod());

        final Button backButton = (Button)findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button playButton = (Button)findViewById(R.id.readLoudly);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = new MediaPlayer();
                try{
                    mp.setDataSource("android.resource://TengernyiTudas/res/raw/chapter_one.m4a");
                    mp.prepare();
                    mp.start();
                }catch(Exception e){
                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG);
                    e.printStackTrace();
                }
            }
        });

    }
}
