package edu.cse570.SEDULOUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private TextView dashboard, goals, goal_setter, community, profile, subscription, tvsignOut;
    FirebaseAuth mAuth;


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
        tvsignOut = (TextView) findViewById(R.id.tvSignOut);


        mAuth = FirebaseAuth.getInstance();

        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,dashboard_activity.class);
                startActivity(intent);
            }
        });

        goals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, myGoals_activity.class);
                startActivity(intent);
            }
        });

        goal_setter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, goalTypes_activity.class);
                startActivity(intent);
            }
        });

        community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,community_activity.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,profile_activity.class);
                startActivity(intent);
            }
        });

        subscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,subscriptions_activity.class);
                startActivity(intent);
            }
        });

        tvsignOut.setOnClickListener(view -> {
            mAuth.signOut();
            startActivity(new Intent(MainActivity.this, loginPage_activity.class));
        });


    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser == null){
            startActivity(new Intent(MainActivity.this, loginPage_activity.class));
        }
    }

}