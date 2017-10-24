package com.tokkalo.lms;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Context applicationContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createNewLoan(View view) {
        Intent intent = new Intent(MainActivity.this, CreateLoanActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void viewAllLoans(View view) {
        Intent intent = new Intent(MainActivity.this, ViewAllLoansActivity.class);
        MainActivity.this.startActivity(intent);
    }
}
