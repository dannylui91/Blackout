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
        String message = Dialogue.getLivingLog(0);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void menuChoiceTwo(View view) {
        MainActivity.this.finish();
        System.exit(0);
    }
}
