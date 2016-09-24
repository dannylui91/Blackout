package nyc.c4q.dannylui.blackout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "nyc.c4q.dannylui.blackout.CHOICE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menuChoiceOne(View view) {

        Intent intent = new Intent(this, GameDisplay.class);
        //Button button1 = (Button) findViewById(R.id.menu_button_one);
        String message = Dialogue.getLivingLog(0);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        //this.finish();
    }

    public void menuChoiceTwo(View view) {
        //suppose to quit app
//        onPause();
//        onStop();
//        onDestroy();
        System.exit(1);
    }







}
