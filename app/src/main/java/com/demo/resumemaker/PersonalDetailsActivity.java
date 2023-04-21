package com.demo.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class PersonalDetailsActivity extends AppCompatActivity {

    ImageView ImgBack,ImgAdd;

    TextInputEditText txtName,txtAddress,txtEmail,txtPhone,txtBirth,txtGender,txtWebsite,txtLinked,
            txtCource,txtSchool,txtScore,txtYear,txtCompany,txtJob,txtStart,txtEnd,txtDetail,txtSkill,txtObjective,txtReferences,txtTitle,txtcompany,txtemail,txtphone;


    ImageView ImgSubmit;

    int SELECT_PICTURE = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);
        initview();
    }

    private void initview() {
        ImgBack = findViewById(R.id.ImgBack);
        ImgAdd = findViewById(R.id.ImgAdd);
        txtName = findViewById(R.id.txtName);
        txtAddress = findViewById(R.id.txtAddress);
        ImgSubmit = findViewById(R.id.ImgSubmit);
        txtEmail = findViewById(R.id.txtEmail);
        txtPhone = findViewById(R.id.txtPhone);
        txtBirth = findViewById(R.id.txtBirth);
        txtGender = findViewById(R.id.txtGender);
        txtWebsite = findViewById(R.id.txtWebsite);
        txtLinked = findViewById(R.id.txtLinked);
        txtCource = findViewById(R.id.txtCource);
        txtSchool = findViewById(R.id.txtSchool);
        txtScore = findViewById(R.id.txtScore);
        txtYear = findViewById(R.id.txtYear);
        txtCompany = findViewById(R.id.txtCompany);
        txtJob = findViewById(R.id.txtJob);
        txtStart = findViewById(R.id.txtStart);
        txtEnd = findViewById(R.id.txtEnd);
        txtDetail = findViewById(R.id.txtDetail);
        txtSkill = findViewById(R.id.txtSkill);
        txtObjective = findViewById(R.id.txtObjective);
        txtReferences = findViewById(R.id.txtReferences);
        txtTitle = findViewById(R.id.txtTitle);
        txtcompany = findViewById(R.id.txtcompany);
        txtemail = findViewById(R.id.txtemail);
        txtphone = findViewById(R.id.txtphone);





        ImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PersonalDetailsActivity.this,LoginActivity2.class);
                startActivity(i);
            }
        });

        ImgSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name =  txtName.getText().toString();
                String Address =  txtAddress.getText().toString();
                String Email =  txtEmail.getText().toString();
                String Phone =  txtPhone.getText().toString();
                String Birth =  txtBirth.getText().toString();
                String Gender =  txtGender.getText().toString();
                String Website =  txtWebsite.getText().toString();
                String Linked =  txtLinked.getText().toString();
                String Cource =  txtCource.getText().toString();
                String School =  txtSchool.getText().toString();
                String Score =  txtScore.getText().toString();
                String Year =  txtYear.getText().toString();
                String Company =  txtCompany.getText().toString();
                String Job =  txtJob.getText().toString();
                String Start =  txtStart.getText().toString();
                String End =  txtEnd.getText().toString();
                String Detail =  txtDetail.getText().toString();
                String Skill =  txtSkill.getText().toString();
                String  Objective =  txtObjective.getText().toString();
                String  References =  txtReferences.getText().toString();
                String  Title =  txtTitle.getText().toString();
                String  company =  txtcompany.getText().toString();
                String  email =  txtemail.getText().toString();
                String  phone =  txtphone.getText().toString();







                Intent i = new Intent(PersonalDetailsActivity.this,PrintActivity.class);
                i.putExtra("Name",Name);
                i.putExtra("Address",Address);
                i.putExtra("Email",Email);
                i.putExtra("Phone",Phone);
                i.putExtra("Birth",Birth);
                i.putExtra("Gender",Gender);
                i.putExtra("Website",Website);
                i.putExtra("Linked",Linked);
                i.putExtra("Cource",Cource);
                i.putExtra("School",School);
                i.putExtra("Score",Score);
                i.putExtra("Year",Year);
                i.putExtra("Company",Company);
                i.putExtra("Job",Job);
                i.putExtra("Start",Start);
                i.putExtra("End",End);
                i.putExtra("Detail",Detail);
                i.putExtra("Skill",Skill);
                i.putExtra("Objective",Objective);
                i.putExtra("References",References);
                i.putExtra("Title",Title);
                i.putExtra("company",company);
                i.putExtra("email",email);
                i.putExtra("phone",phone);


                startActivity(i);


            }
        });


        ImgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setType("image/*");
                i.setAction(Intent.ACTION_GET_CONTENT);

                // pass the constant to compare it
                // with the returned requestCode
                startActivityForResult(Intent.createChooser(i, "Select Picture"), SELECT_PICTURE);
            }
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {

            // compare the resultCode with the
            // SELECT_PICTURE constant
            if (requestCode == SELECT_PICTURE) {
                // Get the url of the image from data
                Uri selectedImageUri = data.getData();
                if (null != selectedImageUri) {
                    // update the preview image in the layout
                    ImgAdd.setImageURI(selectedImageUri);
                }
            }
        }
    }
}