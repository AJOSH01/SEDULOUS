package edu.cse570.SEDULOUS;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class createUser_activity extends AppCompatActivity {

    Button registerBtn;
    EditText etEmail, etName, etPass;
    TextView tvLogin;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);

        registerBtn = findViewById(R.id.registerBtn);
        etEmail = findViewById(R.id.etEmail);
        etName = findViewById(R.id.etName);
        etPass = findViewById(R.id.etPassword);
        tvLogin = findViewById(R.id.tvLogin);

        mAuth = FirebaseAuth.getInstance();

        registerBtn.setOnClickListener(view ->{
            createUser();
        });

        tvLogin.setOnClickListener(view ->{
            startActivity(new Intent(createUser_activity.this,loginPage_activity.class));
        });

    }

    private void createUser() {
        String name = etName.getText().toString();
        String email = etEmail.getText().toString();
        String pass = etPass.getText().toString();

        if (TextUtils.isEmpty(name)){
            etName.setError("name cannot be empty");
            etName.requestFocus();
        }else if (TextUtils.isEmpty(email)){
            etEmail.setError("Email cannot be empty");
            etEmail.requestFocus();
        }
        else if (TextUtils.isEmpty(pass)){
            etPass.setError("Password cannot be empty");
            etPass.requestFocus();
        }else{
            mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(createUser_activity.this, "User registered successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(createUser_activity.this, loginPage_activity.class));
                    }else{
                        Toast.makeText(createUser_activity.this, "Registration Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}