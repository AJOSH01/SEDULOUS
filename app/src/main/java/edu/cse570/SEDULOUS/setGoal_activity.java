package edu.cse570.SEDULOUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class setGoal_activity extends AppCompatActivity {

    Button addGoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_goal);

        addGoal = (Button) findViewById(R.id.AddGoalBtn);
        addGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(setGoal_activity.this, MainActivity.class);
                startActivity(intent);

                Toast.makeText(setGoal_activity.this,"Goal created", Toast.LENGTH_LONG).show();
            }
        });

    }
}