package edu.cse570.SEDULOUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class goalTypes_activity extends AppCompatActivity {

    TextView educationGoal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_types);

        educationGoal = (TextView) findViewById(R.id.EducationGoal);
        educationGoal.setOnClickListener(view -> {
            startActivity(new Intent(goalTypes_activity.this, goalSet_activity.class));
        });

    }
}