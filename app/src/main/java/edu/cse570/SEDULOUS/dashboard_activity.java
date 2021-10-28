package edu.cse570.SEDULOUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard_activity extends AppCompatActivity {

    Button newGoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        newGoal = (Button) findViewById(R.id.NewGoalDasboardBtn);
        newGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard_activity.this, GoalTypes_activity.class);
                startActivity(intent);

                //Toast.makeText(MainActivity.this,"opening Dashboard", Toast.LENGTH_LONG).show();
            }
        });
    }
}