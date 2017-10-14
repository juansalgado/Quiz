package com.example.android.quiz;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    // Here declared global variables
    private int n = 0;
    String summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    //This method will be executed when the button is pressed

    public void summitOrder(View view) {


        //Here I ask if / else statements only of the calls you need,
        // with the results you get fill a variable with expositonal bits of 2.
        // (When I know how things are called in java I will do it in binary).

        int nunTot = 0;
        EditText nameField = (EditText) findViewById(R.id.name);
        Editable nameEditable = nameField.getText();
        summary = nameEditable.toString();
        if (summary.length() < 1) {
            summary = "John Doe";
        }
        EditText numberField = (EditText) findViewById(R.id.number);
        Editable numberEditable = numberField.getText();
        String aux = numberEditable.toString();


        if (aux.equals("87")) {
            n += 1;
            nunTot += 1;
            //price = Integer.parseInt(aux);

        }

        if (((RadioButton) findViewById(R.id.check_button2)).isChecked()) {
            n += 2;
            nunTot += 1;

        }

        if (((CheckBox) findViewById(R.id.check_button9)).isChecked() || ((CheckBox) findViewById(R.id.check_button10)).isChecked()) {
            n += 4;
            if (((CheckBox) findViewById(R.id.check_button3)).isChecked() || ((CheckBox) findViewById(R.id.check_button4)).isChecked() || ((CheckBox) findViewById(R.id.check_button5)).isChecked() || ((CheckBox) findViewById(R.id.check_button6)).isChecked() || ((CheckBox) findViewById(R.id.check_button7)).isChecked() || ((CheckBox) findViewById(R.id.check_button8)).isChecked()) {
                n -= 4;

            } else {
                if (((CheckBox) findViewById(R.id.check_button9)).isChecked() && ((CheckBox) findViewById(R.id.check_button10)).isChecked()) {
                    n += 8;
                    nunTot += 1;
                }

            }
        }

        if (((RadioButton) findViewById(R.id.check_button11)).isChecked()) {
            n += 16;
            nunTot += 1;
        }
        if (((RadioButton) findViewById(R.id.check_button14)).isChecked()) {
            n += 32;
            nunTot += 1;
        }

        if (((RadioButton) findViewById(R.id.check_button16)).isChecked()) {
            n += 64;
            nunTot += 1;
        }

        if (((RadioButton) findViewById(R.id.check_button19)).isChecked()) {
            n += 128;
            nunTot += 1;
        }


        if (((RadioButton) findViewById(R.id.check_button23)).isChecked()) {
            n += 256;
            nunTot += 1;
        }

        if (((RadioButton) findViewById(R.id.check_button29)).isChecked()) {
            n += 512;
            nunTot += 1;
        }

        if (((CheckBox) findViewById(R.id.check_button30)).isChecked()) {
            n += 1024;

        }
        if (((CheckBox) findViewById(R.id.check_button31)).isChecked()) {
            n += 2048;

        }
        if (((CheckBox) findViewById(R.id.check_button32)).isChecked()) {
            n += 4096;

        }
        if (((CheckBox) findViewById(R.id.check_button33)).isChecked()) {
            n += 8196;

        }

        if (((CheckBox) findViewById(R.id.check_button30)).isChecked() && ((CheckBox) findViewById(R.id.check_button31)).isChecked() && ((CheckBox) findViewById(R.id.check_button32)).isChecked() && ((CheckBox) findViewById(R.id.check_button33)).isChecked()) {
            nunTot += 1;
        }
        if (n > 0) {

            summary = summary + ":\n" + "you got " + nunTot + " questions";

            Toast.makeText(this, summary, Toast.LENGTH_LONG).show();
            n = 0;
            summary = "";

        } else {
            Toast.makeText(this, R.string.zero, Toast.LENGTH_LONG).show();


        }

    }
}