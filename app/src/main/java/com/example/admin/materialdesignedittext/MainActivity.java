package com.example.admin.materialdesignedittext;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextInputLayout emailTextInputLayout, passwordTextInputLayout;
    EditText email, password;
    Button signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// get the reference of View's
        emailTextInputLayout = (TextInputLayout) findViewById(R.id.emailTextInputLayout);
        passwordTextInputLayout = (TextInputLayout) findViewById(R.id.passwordTextInputLayout);
        email = (EditText) findViewById(R.id.emailEditText);
        password = (EditText) findViewById(R.id.passwordEditText);
        signIn = (Button) findViewById(R.id.signInButton);
// perform click event on sign In Button
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validate(email, emailTextInputLayout) && validate(password, passwordTextInputLayout)) {

                    Toast.makeText(getApplicationContext(), "Login is done Successfully ", Toast.LENGTH_LONG).show();

                }
            }
        });
    }

    // validate fields
    private boolean validate(EditText editText, TextInputLayout textInputLayout) {
        if (editText.getText().toString().trim().length() > 0) {
            return true;
        }
        editText.requestFocus(); // set focus on fields
        textInputLayout.setError("Please fill the fields.!!!");


        return false;
    }






}
