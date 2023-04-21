package com.demo.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity2 extends AppCompatActivity {
    TextInputEditText edtusename, edtemail, edtpassword, edtconform;
    CardView cardregister;
    TextView txtlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        intiview();
    }

    private void intiview() {

        edtusename=findViewById(R.id.edtusename);
        edtemail=findViewById(R.id.edtemail);
        edtpassword=findViewById(R.id.edtpassword);
        edtconform=findViewById(R.id.edtconform);
        cardregister=findViewById(R.id.cardregister);
        txtlogin=findViewById(R.id.txtlogin);

        cardregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username,email,password,cpassword;
                username= edtusename.getText().toString();
                email=edtemail.getText().toString();
                password=edtpassword.getText().toString();
                cpassword=edtconform.getText().toString();

                if(username.isEmpty())
                {
                    Toast.makeText(LoginActivity2.this, "Please enter your username ", Toast.LENGTH_SHORT).show();
                }
                else if (email.isEmpty())
                {
                    Toast.makeText(LoginActivity2.this, "Please enter your email address ", Toast.LENGTH_SHORT).show();
                }
                else if (password.isEmpty())
                {
                    Toast.makeText(LoginActivity2.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                }
                else if (cpassword.isEmpty())
                {
                    Toast.makeText(LoginActivity2.this, "Please enter your conform password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent h=new Intent(LoginActivity2.this,PersonalDetailsActivity.class);
                    startActivity(h);
                }
            }
        });
        txtlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(LoginActivity2.this,PersonalDetailsActivity.class);
                startActivity(j);
            }
        });

    }
}