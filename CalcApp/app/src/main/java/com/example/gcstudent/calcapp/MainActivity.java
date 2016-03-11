package com.example.gcstudent.calcapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    String text1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // TextView edit = (TextView)findViewById(R.id.TextView1);
    //edit.setText(total);
    public void ButtonClick(View v){
        TextView edit = (TextView)findViewById(R.id.textView1);
        switch (v.getId()){

            case R.id.OneButton:
                text1 = text1 + "1 ";
                edit.setText(text1);
            break;
            case R.id.TwoButton:
                text1 = text1 + "2 ";
                edit.setText(text1);
                break;
            case R.id.ThreeButton:
                text1 = text1 + "3 ";
                edit.setText(text1);
                break;
            case R.id.FourButton:
                text1 = text1 + "4 ";
                edit.setText(text1);
                break;
            case R.id.FiveButton:
                text1 = text1 + "5 ";
                edit.setText(text1);
                break;
            case R.id.SixButton:
                text1 = text1 + "6 ";
                edit.setText(text1);
                break;
            case R.id.SevenButton:
                text1 = text1 + "7 ";
                edit.setText(text1);
                break;
            case R.id.EightButton:
                text1 = text1 + "8 ";
                edit.setText(text1);
                break;
            case R.id.NineButton:
                text1 = text1 + "9 ";
                edit.setText(text1);
                break;

            // function buttons
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            case R.id.AddButton:
                text1 = text1 + "+ ";
                edit.setText(text1);


                break;
            case R.id.SubButton:
                text1 = text1 + "- ";
                edit.setText(text1);


                break;
            case R.id.MultButton:
                text1 = text1 + "* ";
                edit.setText(text1);


                break;
            case R.id.DivButton:
                text1 = text1 + "/ ";
                edit.setText(text1);


                break;
            case R.id.ClearButton:
                text1 = "";
                edit.setText(text1);
                break;
            case R.id.EqualButton:



                break;
        }

    }

















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
