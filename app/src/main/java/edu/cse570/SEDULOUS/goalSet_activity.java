package edu.cse570.SEDULOUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class goalSet_activity extends AppCompatActivity {

    Button setGoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_set);

        setGoal = (Button) findViewById(R.id.setGoal);
        setGoal.setOnClickListener(view -> {
            startActivity(new Intent(goalSet_activity.this, MainActivity.class));
            Toast.makeText(goalSet_activity.this,"Goal created", Toast.LENGTH_LONG).show();
        });
    }
}