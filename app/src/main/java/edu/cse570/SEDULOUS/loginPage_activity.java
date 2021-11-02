package edu.cse570.SEDULOUS;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class loginPage_activity extends AppCompatActivity {

    private TextView register;
    private Button loginBtn;
    private EditText etEmail, etPass;

    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        register = (TextView) findViewById(R.id.Register);
        loginBtn = (Button) findViewById(R.id.loginBtn);
        etEmail = (EditText) findViewById(R.id.LPetEmail);
        etPass = (EditText) findViewById(R.id.LPetPass);

        mAuth = FirebaseAuth.getInstance();

        loginBtn.setOnClickListener(view -> {
            loginUser();
        });

        register.setOnClickListener(view -> {
            startActivity(new Intent(loginPage_activity.this, createUser_activity.class));
        });


    }
        private void loginUser () {
            String email = etEmail.getText().toString();
            String password = etPass.getText().toString();

            if (TextUtils.isEmpty(email)) {
                etEmail.setError("Email cannot be empty");
                etEmail.requestFocus();
            } else if (TextUtils.isEmpty(password)) {
                etPass.setError("Password cannot be empty");
                etPass.requestFocus();
            } else {
                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(loginPage_activity.this, "User logged in successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(loginPage_activity.this, MainActivity.class));
                        } else {
                            Toast.makeText(loginPage_activity.this, "Log in Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        }
}

