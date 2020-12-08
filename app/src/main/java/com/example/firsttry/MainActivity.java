  package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

  public class MainActivity extends AppCompatActivity {
     public void clickFunction(View view) {

       EditText myText = (EditText) findViewById(R.id.myText);
         EditText myText2 = (EditText) findViewById(R.id.myText2);
         Toast.makeText(MainActivity.this, "Hi there", Toast.LENGTH_SHORT).show();       //we use toast function to show that info on app screen.
         Toast.makeText(MainActivity.this, "welcome" + myText.getText().toString(), Toast.LENGTH_LONG).show();
         /* we need textfield and which allow us to take inf from there. */
         Log.i("Your name", myText.getText().toString()); //log is to write some info at event log.
         Log.i("Your surname" , myText2.getText().toString());
         Log.i("Congratulions","");
     }

  //protected can't be accessible from other classes or methods. void is a function which doesn't return any value
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
