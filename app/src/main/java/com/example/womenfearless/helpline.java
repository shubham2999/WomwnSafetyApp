package com.example.womenfearless;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class helpline extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);
    }

    public void distress(View v){
        Intent i1 = new Intent(Intent.ACTION_DIAL);
        i1.setData(Uri.parse("tel:1091"));
        startActivity(i1);
    }


    public void domestic(View view) {
        Intent i2 = new Intent(Intent.ACTION_DIAL);
        i2.setData(Uri.parse("tel:181"));
        startActivity(i2);
    }

    public void police(View view) {
        Intent i3 = new Intent(Intent.ACTION_DIAL);
        i3.setData(Uri.parse("tel:100"));
        startActivity(i3);
    }

    public void student(View view) {
        Intent i4 = new Intent(Intent.ACTION_DIAL);
        i4.setData(Uri.parse("tel:1098"));
        startActivity(i4);
    }
}
