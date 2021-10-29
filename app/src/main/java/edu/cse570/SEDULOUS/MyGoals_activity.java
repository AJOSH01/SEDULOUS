package edu.cse570.SEDULOUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MyGoals_activity extends AppCompatActivity {

    TextView GoalCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_goals);
        GoalCategory= (TextView)findViewById(R.id.GoalCategory1);
        GoalCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyGoals_activity.this, Goals_activity.class);
                startActivity(intent);

                //Toast.makeText(MyGoals_activity.this,"opening Dashboard", Toast.LENGTH_LONG).show();
            }
        });
    }
}