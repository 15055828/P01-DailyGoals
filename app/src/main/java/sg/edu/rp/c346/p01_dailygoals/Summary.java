package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");
        TextView tv1 = (TextView)findViewById(R.id.textView7);
        TextView tv2 = (TextView)findViewById(R.id.textView8);
        TextView tv3 = (TextView)findViewById(R.id.textView9);
        TextView tv4 = (TextView)findViewById(R.id.textView10);
        tv1.setText("Read up on materials before class : " + info[0]);
        tv2.setText("Arrive on time so as not to miss important part of the lesson : " + info[1]);
        tv3.setText("Attempt the problem myself : " + info[2]);
        tv4.setText("Reflection : "+ info[3]);
    }
}
