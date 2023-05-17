package sg.edu.rp.c346.id22027500.viewmodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Displaydetails extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming);
        tvAnswer = findViewById(R.id.textView);

        Intent intentReceived = getIntent();

        String code = intentReceived.getStringExtra("code");
        String course = intentReceived.getStringExtra("course");
        String name = intentReceived.getStringExtra("name");
        int acYear = intentReceived.getIntExtra("acYear",0);
        int sem = intentReceived.getIntExtra("sem", 0);
        String venue = intentReceived.getStringExtra("venue");



        tvAnswer.setText("Module Code: " + code + "\n" + "Module Course: " + course + "\n" + "Class Owner: " + name + "\n" + "Academic Year: " + acYear + "\n" + "Semester: " + sem + "\n" + "Venue: " + venue + "\n");





    }
}