package edu.cse570.SEDULOUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class goalTypes_activity extends AppCompatActivity {

    TextView educationGoal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_types);

        educationGoal = (TextView) findViewById(R.id.EducationGoal);
        educationGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(goalTypes_activity.this, setGoal_activity.class);
                startActivity(intent);

                //Toast.makeText(MainActivity.this,"opening Dashboard", Toast.LENGTH_LONG).show();
            }
        });
    }
}