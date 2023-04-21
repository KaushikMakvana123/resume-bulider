package com.demo.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PrintActivity extends AppCompatActivity {
    TextView txtName1,txtAddress1,txtEmail1,txtPhone1,txtBirth1,txtGender1,txtWebsite1,txtLinked1,txtCource1,txtSchool1,txtScore1
            ,txtYear1,txtCompany1,txtJob1,txtStart1,txtEnd1,txtDetail1,txtSkill1,txtObjective1,txtReferences1,txtTitle1,txtcompany1,txtemail1,txtphone1;
    String Name,Address,Email,Phone,Birth,Gender,Website,Linked,Cource,School,Score,Year,Company,Job,Start,End,Detail,Skill,Objective,References,Title,company,email,phone;

    ImageView ImgBack;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);
        initview();


        ImgBack = findViewById(R.id.ImgBack);


        ImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PrintActivity.this,PersonalDetailsActivity.class);
                startActivity(i);
            }
        });

        if(getIntent()!=null)
        {
            Name = getIntent().getStringExtra("Name") ;
            Address = getIntent().getStringExtra("Address") ;
            Email = getIntent().getStringExtra("Email");
            Phone = getIntent().getStringExtra("Phone");
            Birth = getIntent().getStringExtra("Birth");
            Gender = getIntent().getStringExtra("Gender");
            Website = getIntent().getStringExtra("Website");
            Linked = getIntent().getStringExtra("Linked");
            Cource = getIntent().getStringExtra("Cource");
            School = getIntent().getStringExtra("School");
            Score = getIntent().getStringExtra("Score");
            Year = getIntent().getStringExtra("Year");
            Company = getIntent().getStringExtra("Company");
            Job = getIntent().getStringExtra("Job");
            Start = getIntent().getStringExtra("Start");
            End = getIntent().getStringExtra("End");
            Detail = getIntent().getStringExtra("Detail");
            Skill = getIntent().getStringExtra("Skill");
            Objective = getIntent().getStringExtra("Objective");
            References = getIntent().getStringExtra("References");
            Title = getIntent().getStringExtra("Title");
            company = getIntent().getStringExtra("company");
            email = getIntent().getStringExtra("email");
            phone = getIntent().getStringExtra("phone");


            txtName1.setText(Name);
            txtAddress1.setText(Address);
            txtEmail1.setText(Email);
            txtPhone1.setText(Phone);
            txtBirth1.setText(Birth);
            txtGender1.setText(Gender);
            txtWebsite1.setText(Website);
            txtLinked1.setText(Linked);
            txtCource1.setText(Cource);
            txtSchool1.setText(School);
            txtScore1.setText(Score);
            txtYear1.setText(Year);
            txtCompany1.setText(Company);
            txtJob1.setText(Job);
            txtStart1.setText(Start);
            txtEnd1.setText(End);
            txtDetail1.setText(Detail);
            txtSkill1.setText(Skill);
            txtObjective1.setText(Objective);
            txtReferences1.setText(References);
            txtTitle1.setText(Title);
            txtcompany1.setText(company);
            txtemail1.setText(email);
            txtphone1.setText(phone);



        }

    }

    private void initview() {
        txtName1 = findViewById(R.id.txtName1);
        txtAddress1 = findViewById(R.id.txtAddress1);
        txtEmail1 = findViewById(R.id.txtEmail1);
        txtPhone1 = findViewById(R.id.txtPhone1);
        txtBirth1 = findViewById(R.id.txtBirth1);
        txtGender1 = findViewById(R.id.txtGender1);
        txtWebsite1 = findViewById(R.id.txtWebsite1);
        txtLinked1 = findViewById(R.id.txtLinked1);
        txtCource1 = findViewById(R.id.txtCource1);
        txtSchool1 = findViewById(R.id.txtSchool1);
        txtScore1 = findViewById(R.id.txtScore1);
        txtYear1 = findViewById(R.id.txtYear1);
        txtCompany1 = findViewById(R.id.txtCompany1);
        txtJob1 = findViewById(R.id.txtJob1);
        txtStart1 = findViewById(R.id.txtStart1);
        txtEnd1 = findViewById(R.id.txtEnd1);
        txtDetail1 = findViewById(R.id.txtDetail1);
        txtSkill1 = findViewById(R.id.txtSkill1);
        txtObjective1 = findViewById(R.id.txtObjective1);
        txtReferences1 = findViewById(R.id.txtReferences1);
        txtTitle1 = findViewById(R.id.txtTitle1);
        txtcompany1 = findViewById(R.id.txtcompany1);
        txtemail1 = findViewById(R.id.txtemail1);
        txtphone1 = findViewById(R.id.txtphone1);
    }
}







