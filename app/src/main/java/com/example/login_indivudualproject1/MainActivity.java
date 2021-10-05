package com.example.login_indivudualproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usernameEdit;
    EditText passwordEdit;
    String tempUsername;
    String tempPassword;
    String savedUsername;
    String savedPassword;
    String savedFname;
    String savedLname;
    String savedEmail;
    String savedDOB;
    Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent recString = getIntent();
        savedUsername = recString.getStringExtra("savedUsername");
        savedPassword = recString.getStringExtra("savedPassword");
        savedFname = recString.getStringExtra("savedFirstName");
        savedLname = recString.getStringExtra("savedLastName");
        savedEmail = recString.getStringExtra("savedEmail");
        savedDOB = recString.getStringExtra("savedDOB");



    }



    //enter login credentials
    public void showDialog(View view){
        dialog = new Dialog(MainActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.dialog);

        usernameEdit = dialog.findViewById(R.id.username_field);
        passwordEdit = dialog.findViewById(R.id.password_field);

        dialog.show();
    }


    public void successfulLogin(View view){
        Intent intent = new Intent(this, Access.class);
        intent.putExtra("firstName", savedFname);
        intent.putExtra("lastName", savedLname);
        intent.putExtra("email", savedEmail);
        intent.putExtra("dob", savedDOB);
        intent.putExtra("username", savedUsername);
        this.startActivity(intent);
    }


    // go to create account
    public void goToCreateAccount(View view) {
        Intent intent = new Intent(this, CreateAccount.class);
        this.startActivity(intent);

    }

    //check credential match
    public void checkCredentials(View view){
        tempUsername = usernameEdit.getText().toString();
        tempPassword = passwordEdit.getText().toString();

        if(tempUsername.equals(savedUsername) && tempPassword.equals(savedPassword)){
            successfulLogin(view);
        }
        else {
            Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_LONG).show();
        }

    }
}