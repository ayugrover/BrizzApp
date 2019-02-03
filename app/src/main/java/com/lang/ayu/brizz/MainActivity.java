package com.lang.ayu.brizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton btn1,btn2,btn3,btn4,btn5,btn6;
    Button submit;
    RadioGroup group1,group2;
    CheckBox box1,box2,box3,box4;
    EditText text1,text2,text3,text4,text5;
    int correct = 0;
    int wrong = 0;
    String answers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box1 = (CheckBox) findViewById(R.id.cBox3_1);
        box2 = (CheckBox) findViewById(R.id.cBox3_2);
        box3 = (CheckBox) findViewById(R.id.cBox3_3);
        box4 = (CheckBox) findViewById(R.id.cBox3_4);

        text1 = (EditText) findViewById(R.id.Edit1);
        text2 = (EditText) findViewById(R.id.Edit2);
        text3 = (EditText) findViewById(R.id.Edit3);
        text4 = (EditText) findViewById(R.id.Edit4);
        text5 = (EditText) findViewById(R.id.Edit5);

        btn1 = (RadioButton) findViewById(R.id.rButton2_1);
        btn2 = (RadioButton) findViewById(R.id.rButton2_2);
        btn3 = (RadioButton) findViewById(R.id.rButton2_3);

        submit = (Button) findViewById(R.id.submit);

        group1 = (RadioGroup) findViewById(R.id.rGroup1);


        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                box1 = (CheckBox) findViewById(R.id.cBox3_1);
                box2 = (CheckBox) findViewById(R.id.cBox3_2);
                box3 = (CheckBox) findViewById(R.id.cBox3_3);
                box4 = (CheckBox) findViewById(R.id.cBox3_4);

                text1 = (EditText) findViewById(R.id.Edit1);
                text2 = (EditText) findViewById(R.id.Edit2);
                text3 = (EditText) findViewById(R.id.Edit3);
                text4 = (EditText) findViewById(R.id.Edit4);
                text5 = (EditText) findViewById(R.id.Edit5);

                btn1 = (RadioButton) findViewById(R.id.rButton2_1);
                btn2 = (RadioButton) findViewById(R.id.rButton2_2);
                btn3 = (RadioButton) findViewById(R.id.rButton2_3);
                btn4 = (RadioButton) findViewById(R.id.rButton8_1);
                btn5 = (RadioButton) findViewById(R.id.rButton8_2);
                btn6 = (RadioButton) findViewById(R.id.rButton8_3);

                submit = (Button) findViewById(R.id.submit);

                group1 = (RadioGroup) findViewById(R.id.rGroup1);

                if (btn1.isChecked()) {
                    wrong = wrong + 1;
                }
                if (btn2.isChecked()) {
                    wrong = wrong + 1;
                }
                if (btn3.isChecked()) {
                    correct = correct + 1;
                }
                if (btn4.isChecked()) {
                    wrong = wrong + 1;
                }
                if (btn5.isChecked()) {
                    correct = correct + 1;
                }
                if (btn6.isChecked()) {
                    wrong = wrong + 1;
                }
                if (box1.isChecked()) {
                    correct = correct + 1;
                }
                if (box2.isChecked()) {
                    correct = correct + 1;
                }
                if (box3.isChecked()) {
                    correct = correct + 1;
                }
                if (box4.isChecked()) {
                    wrong = wrong + 1;

                }


                String ans1 = text1.getText().toString();

                if (ans1.equalsIgnoreCase("COLLAGEN")) {
                    correct = correct + 1;
                } else {
                    wrong = wrong + 1;
                }
                String ans2 = text2.getText().toString();
                if (ans2 == "MENDELEEV") {
                    correct = correct + 1;
                } else {
                    wrong = wrong + 1;
                }

                String ans3 = text3.getText().toString();

                if (ans3 == "@string/ans3") {
                    correct = correct + 1;
                } else {
                    wrong = wrong + 1;
                }

                String ans4 = text4.getText().toString();

                if (ans4 == "SILVER") {
                    correct = correct + 1;
                } else {
                    wrong = wrong + 1;
                }

                String ans5 = text5.getText().toString();

                if (ans5 == "SOLUTE") {
                    correct = correct + 1;
                } else {
                    wrong = wrong + 1;
                }


                TextView quantity = (TextView) findViewById(R.id.correct);
                quantity.setText("Correct: " + correct);
                TextView quantity1 = (TextView) findViewById(R.id.wrong);
                quantity1.setText("Wrong:" + wrong);
                answers = "1.Collagen";
                answers += "2.Chlorine";
                answers += "3.Protium ,Deutrium,Tritium";
                answers += "4.Mendeleev";
                answers += "5.Carbon and hydrogen";
                answers += "6.Silver";
                answers += "7.Solute";
                answers += "8.Magnesium";
                answers += "Score:" + correct;
                Toast toast;

                {
                    toast = Toast.makeText(getApplicationContext(), answers, Toast.LENGTH_LONG);
                }
                toast.show();
            }

        });
    }
                    // The onClear button
                    public void onClear(View view) {

                        if (view.getId() == R.id.clearall) {
                            correct = 0;
                            wrong = 0;
                            group1.clearCheck();
                            group2.clearCheck();

                            box1.setChecked(false);
                            box2.setChecked(false);
                            box3.setChecked(false);
                            box4.setChecked(false);

                            text1.setText("");
                            text2.setText("");
                            text3.setText("");
                            text4.setText("");
                            text5.setText("");
                        }
                    }

}