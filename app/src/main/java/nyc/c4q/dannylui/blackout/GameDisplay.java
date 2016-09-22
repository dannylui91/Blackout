package nyc.c4q.dannylui.blackout;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GameDisplay extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "nyc.c4q.dannylui.blackout.SCENETEXT";
    public static final String EXTRA_IMAGE = "nyc.c4q.dannylui.blackout.SCENEIMAGE";

    public boolean isGameOver = false;

    public int input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_display);

        Intent intent = getIntent();
        String message;
        if (intent.getStringExtra(MainActivity.EXTRA_MESSAGE) != null)
            message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        else
            message = intent.getStringExtra(GameDisplay.EXTRA_MESSAGE);

        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText(message);

        LinearLayout layout = (LinearLayout) findViewById(R.id.root_game_view);
        layout.setBackgroundResource(R.drawable.waking_up_bg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("GameDisplay", "onDestroy: CLICKED BACK BUTTON?");
        Blackout.gameOver = false;
        Blackout.gameLevel = 0;
        Blackout.convergingPath = false;
        Blackout.imageResId = R.drawable.under_construction_bg;
    }

    public void choiceOne(View view){
        Button button1 = (Button) findViewById(R.id.button_one);
        int input = Integer.parseInt(button1.getText().toString());
        String message = Blackout.getDialogue(input);

        if(Blackout.gameOver) {
            System.out.println("GAME OVER");
            setContentView(R.layout.activity_game_over);
            TextView textView = (TextView) findViewById(R.id.gameover_text_view);
            textView.setText(message);

            LinearLayout layout = (LinearLayout) findViewById(R.id.root_game_over_view);
            layout.setBackgroundResource(Blackout.imageResId);
        }
        else {
            System.out.println("NOT GAMEOVER");
            setContentView(R.layout.activity_game_display);
            TextView textView = (TextView) findViewById(R.id.text_view);
            textView.setText(message);

            LinearLayout layout = (LinearLayout) findViewById(R.id.root_game_view);
            layout.setBackgroundResource(Blackout.imageResId);
        }
    }

    public void choiceTwo(View view) {
        Button button2 = (Button) findViewById(R.id.button_two);
        int input = Integer.parseInt(button2.getText().toString());
        String message = Blackout.getDialogue(input);

        if(Blackout.gameOver) {
            System.out.println("GAME OVER");
            setContentView(R.layout.activity_game_over);
            TextView textView = (TextView) findViewById(R.id.gameover_text_view);
            textView.setText(message);

            LinearLayout layout = (LinearLayout) findViewById(R.id.root_game_over_view);
            layout.setBackgroundResource(Blackout.imageResId);
        }
        else {
            System.out.println("NOT GAMEOVER");
            setContentView(R.layout.activity_game_display);
            TextView textView = (TextView) findViewById(R.id.text_view);
            textView.setText(message);

            LinearLayout layout = (LinearLayout) findViewById(R.id.root_game_view);
            layout.setBackgroundResource(Blackout.imageResId);
        }

    }

}
