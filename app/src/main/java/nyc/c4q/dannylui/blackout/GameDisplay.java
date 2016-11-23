package nyc.c4q.dannylui.blackout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GameDisplay extends AppCompatActivity {
    private static final int INPUT_ONE = 1;
    private static final int INPUT_TWO = 2;

    private TextView textView;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_display);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        textView = (TextView) findViewById(R.id.text_view);
        layout = (LinearLayout) findViewById(R.id.root_game_view);

        textView.setText(message);
        layout.setBackgroundResource(R.drawable.waking_up_bg);
    }


    public void choiceOne(View view){
        String message = GameLogic.getDialogue(INPUT_ONE);
        updateGameDisplay(message);
    }

    public void choiceTwo(View view) {
        String message = GameLogic.getDialogue(INPUT_TWO);
        updateGameDisplay(message);
    }

    private void updateGameDisplay(String message) {
        if(!GameLogic.gameOver) {
            textView.setText(message);
            layout.setBackgroundResource(GameLogic.imageResId);
        }
        else {
            setContentView(R.layout.activity_game_over);
            TextView textView = (TextView) findViewById(R.id.gameover_text_view);
            LinearLayout layout = (LinearLayout) findViewById(R.id.root_game_over_view);

            textView.setText(message);
            layout.setBackgroundResource(GameLogic.imageResId);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        GameLogic.resetGame();
    }
}
