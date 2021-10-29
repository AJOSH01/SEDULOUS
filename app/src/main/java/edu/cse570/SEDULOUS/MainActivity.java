package edu.cse570.SEDULOUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView dashboard, goals, goal_setter, community, profile, subscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        dashboard = (TextView) findViewById(R.id.dashboard);
        goals = (TextView) findViewById(R.id.MyGoals);
        goal_setter = (TextView) findViewById(R.id.GoalSetter);
        community = (TextView) findViewById(R.id.Community);
        profile = (TextView) findViewById(R.id.Profile);
        subscription = (TextView) findViewById(R.id.Subscription);


        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,dashboard_activity.class);
                startActivity(intent);

                //Toast.makeText(MainActivity.this,"opening Dashboard", Toast.LENGTH_LONG).show();

            }
        });

        goals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, myGoals_activity.class);
                startActivity(intent);

                //Toast.makeText(MainActivity.this,"opening My Goals", Toast.LENGTH_LONG).show();
            }
        });

        goal_setter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, goalTypes_activity.class);
                startActivity(intent);

                //Toast.makeText(MainActivity.this,"opening Goal Setters", Toast.LENGTH_LONG).show();
            }
        });

        community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,community_activity.class);
                startActivity(intent);

                //Toast.makeText(MainActivity.this,"opening Community", Toast.LENGTH_LONG).show();
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,profile_activity.class);
                startActivity(intent);

                //Toast.makeText(MainActivity.this,"opening Profile", Toast.LENGTH_LONG).show();
            }
        });

        subscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,subscriptions_activity.class);
                startActivity(intent);

                //Toast.makeText(MainActivity.this,"opening Subscription", Toast.LENGTH_LONG).show();
            }
        });


    }

}