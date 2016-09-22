package nyc.c4q.dannylui.blackout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameDisplay extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "nyc.c4q.dannylui.blackout.SCENECHOICE";

    public boolean isGameOver = false;

    public int input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    if (!isGameOver)
            setContentView(R.layout.activity_game_display);
    //    else
      //      setContentView(R.layout.activity_game_over);

        System.out.println("isGameOver: "+ isGameOver);

        Intent intent = getIntent();
        String message;
        if (intent.getStringExtra(MainActivity.EXTRA_MESSAGE) != null)
            message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        else
            message = intent.getStringExtra(GameDisplay.EXTRA_MESSAGE);

        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText(message);

        //startGame();
    }

    public void choiceOne(View view){
        //Intent intent = new Intent(this, GameDisplay.class);
        Button button1 = (Button) findViewById(R.id.button_one);
        //String message = Dialogue.getDeadLog(0); //hardcoded dialogue
        int input = Integer.parseInt(button1.getText().toString());
        String message = Blackout.getDialogue(input);
        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText(message);

        //if (Dialogue.deadLog.contains(message))
        //    isGameOver = true;

        //intent.putExtra(EXTRA_MESSAGE, message);
        //startActivity(intent);
    }

    public void choiceTwo(View view) {
        //Intent intent = new Intent(this, GameDisplay.class);
        Button button2 = (Button) findViewById(R.id.button_two);
        //String message = Dialogue.getLivingLog(1);  //hardcoded dialogue
        int input = Integer.parseInt(button2.getText().toString());
        //System.out.println("INPUT IS" + input);
        String message = Blackout.getDialogue(input);
        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText(message);

        //intent.putExtra(EXTRA_MESSAGE, message);
        //startActivity(intent);
    }

}
