package com.example.android.Quiz_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // this hides the keyboard from displaying after apllication has started
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }


    public void text_score(View view) {

        //----------------------------------------------------------------------------------
        //      Question 1 answer is question_1choice1
        //----------------------------------------------------------------------------------
        /**
         *this calculate if the answer for Question 1 is correct
         */
        //finding the correct answer  for Question_1 by the view
        RadioButton question_1choice1 = (RadioButton) this.findViewById(R.id.question1_choice1);
        //checking if the correct answer is checked
        Boolean answer_1 = question_1choice1.isChecked();
        //making score_1 an integer
        int score_1;
        // using a statement that if the correct answer is clicked 1 should be added to the score
        if (answer_1) {
            score_1 = 1;
        } else {
            score_1 = 0;

        }


        //---------------------------------------------------------------------------------
        //Question 2 and the answer is andriod debug bridge
        //---------------------------------------------------------------------------------
        //this find the view of the input or edit text
        EditText question2_answer = (EditText) findViewById(R.id.question2_answer);
        //this takes the answer and turns the whole words into lower case to avoid
        //errors of capital letter or small letter
        String answer_2 = question2_answer.getText().toString().toLowerCase();
        //this makes score_2 an integer
        int score_2;
        //this is an if statement saying if the answer is correct the correct points should
        //be given
        if (answer_2.equals("android debug bridge")) {
            score_2 = 1;
        } else {
            score_2 = 0;
        }

        //----------------------------------------------------------------------------------
        //Qustion 3 answer is question3_choice1,question3_choice2,question3_choice3,
        //question3_choice4
        //----------------------------------------------------------------------------------
        //This finds the view of the checkbox question3_choice1
        CheckBox question3_choice1 = (CheckBox) findViewById(R.id.question3_choice1);
        //This finds the view of the checkbox question3_choice2
        CheckBox question3_choice2 = (CheckBox) findViewById(R.id.question3_choice2);
        //This finds the view of the checkbox question3_choice3
        CheckBox question3_choice3 = (CheckBox) findViewById(R.id.question3_choice3);
        //This finds the view of the checkbox question3_choice4
        CheckBox question3_choice4 = (CheckBox) findViewById(R.id.question3_choice4);
        //checking if question3_choice1 is checked and making it have a Boolean value
        Boolean answer3_choice1 = question3_choice1.isChecked();
        //checking if question3_choice2 is checked and making it have a Boolean value
        Boolean answer3_choice2 = question3_choice2.isChecked();
        //checking if question3_choice3 is checked and making it have a Boolean value
        Boolean answer3_choice3 = question3_choice3.isChecked();
        //checking if question3_choice4 is checked and making it have a Boolean value
        Boolean answer3_choice4 = question3_choice4.isChecked();
        //making score_3 an integer
        int score_3;
        //this is an if statement checking if all the correct boxes are clicked and then
        //returns the appropiate mark
        if (answer3_choice1 && answer3_choice2 && answer3_choice3 && answer3_choice4) {
            score_3 = 1;
        } else {
            score_3 = 0;
        }

        //---------------------------------------------------------------------------------
        //Question 4 answer is Application not responding
        //---------------------------------------------------------------------------------
        //this find the view of the input or edit text of the view id question4_answer
        EditText question4_answer = (EditText) findViewById(R.id.question4_answer);
        //this takes the answer and turns the whole words into lower case to avoid
        //errors of capital letter or small letter
        String answer_4 = question4_answer.getText().toString().toLowerCase();
        //this makes score_4 an integer
        int score_4;
        //this is an if statement saying if the answer is correct the correct points should
        //be given
        if (answer_4.equals("application not responding")) {
            score_4 = 1;
        } else {
            score_4 = 0;
        }

        //------------------------------------------------------------------------------------
        //Question 5 answer is question5_choice 3
        //------------------------------------------------------------------------------------
        //this finds the view of question5_choice3
        RadioButton question5_choice3 = (RadioButton) this.findViewById(R.id.question5_choice3);
        //checking if the correct answer is checked
        Boolean answer_5 = question5_choice3.isChecked();
        //making score_5 an integer
        int score_5;
        // using a statement that if the correct answer is clicked 1 should be added to the score
        if (answer_5) {
            score_5 = 1;
        } else {
            score_5 = 0;
        }

        //--------------------------------------------------------------------------------------
        //Question 6 answer is question6_choice1
        //--------------------------------------------------------------------------------------
        //this finds the view of question5_choice3
        RadioButton question6_choice1 = (RadioButton) this.findViewById(R.id.question6_choice1);
        //checking if the correct answer is checked
        Boolean answer_6 = question6_choice1.isChecked();
        //making score_5 an integer
        int score_6;
        // using a statement that if the correct answer is clicked 1 should be added to the score
        if (answer_6) {
            score_6 = 1;
        } else {
            score_6 = 0;
        }

        //---------------------------------------------------------------------------------------
        //Question 7 answer is
        //---------------------------------------------------------------------------------------
        //This finds the view of the checkbox question7_choice1
        CheckBox question7_choice1 = (CheckBox) findViewById(R.id.question7_choice1);
        //This finds the view of the checkbox question7_choice2
        CheckBox question7_choice2 = (CheckBox) findViewById(R.id.question7_choice2);
        //This finds the view of the checkbox question7_choice3
        CheckBox question7_choice3 = (CheckBox) findViewById(R.id.question7_choice3);
        //checking if question7_choice1 is checked and making it have a Boolean value
        Boolean answer7_choice1 = question7_choice1.isChecked();
        //checking if question7_choice2 is checked and making it have a Boolean value
        Boolean answer7_choice2 = question7_choice2.isChecked();
        //checking if question7_choice3 is checked and making it have a Boolean value
        Boolean answer7_choice3 = question7_choice3.isChecked();
        //making score_7 an integer
        int score_7;
        //this is an if statement checking if all the correct boxes are clicked and then
        //returns the appropiate mark
        if (answer7_choice1 && answer7_choice2 && answer7_choice3) {
            score_7 = 1;
        } else {
            score_7 = 0;
        }

        /**
         * getting the final score for the app
         */
        int final_score = score_1 + score_2 + score_3 + score_4 + score_5 + score_6 + score_7;
        //making the result variable a string so it can be reusable
        String result;

        /**
         * using an if statement to declare diferrent response for each given score
         */
        if (final_score == 1) {
            result = "Bad you scored " + final_score + " out of 7 questions";
        } else if (final_score == 2) {
            result = "Try again you scored " + final_score + " out of 7 questions";
        } else if (final_score == 3) {
            result = "Fair you scored " + final_score + " out of 7 questions";
        } else if (final_score == 4) {
            result = "Not bad you scored " + final_score + " out of 7 questions";
        } else if (final_score == 5) {
            result = "Almost there! you scored " + final_score + " out of 7 questions";
        } else if (final_score == 6) {
            result = "So close you scored " + final_score + " out of 7 questions";
        } else if (final_score == 7) {
            result = "WOW! Perfect score, you scored " + final_score + " out of 7 questions";
        } else {
            result = "Worst you got " + final_score + " out of 7 questions";
        }

        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
    }


}
