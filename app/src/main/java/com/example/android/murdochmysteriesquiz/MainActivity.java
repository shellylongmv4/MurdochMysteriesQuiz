package com.example.android.murdochmysteriesquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int finalScore = 0;

    //Declaring global varibales for all correct answers for EditText fields, RadioButtons and CheckBoxes
    //Question one
    private EditText answerQuestionOne;
    //Question two
    private CheckBox answerQuestionTwoCheckboxBegonia;
    private CheckBox answerQuestionTwoCheckboxMarigold;
    private CheckBox answerQuestionTwoCheckboxAzalea;
    private CheckBox answerQuestionTwoCheckboxEve;
    private CheckBox answerQuestionTwoCheckboxCharlotte;
    private CheckBox answerQuestionTwoCheckboxGrace;
    //Question three
    private RadioGroup answerQuestionThreeRadioGroup;
    private RadioButton answerQuestionThreeRadioButtonGillies;
    //Question four
    private EditText answerQuestionFour;
    //Question five
    private CheckBox answerQuestionFiveCheckboxTesla;
    private CheckBox answerQuestionFiveCheckboxFord;
    private CheckBox answerQuestionFiveCheckboxOakley;
    private CheckBox answerQuestionFiveCheckboxLondon;
    private CheckBox answerQuestionFiveCheckboxHoudini;
    private CheckBox answerQuestionFiveCheckboxWells;
    //Question six
    private EditText answerQuestionSix;
    //Question seven
    private RadioGroup answerQuestionSevenRadioGroup;
    private RadioButton answerQuestionSevenRadioButtonAlienist;
    //Question eight
    private RadioGroup answerQuestionEightRadioGroup;
    private RadioButton answerQuestionEightRadioButtonTrue;
    //Question nine
    private CheckBox answerQuestionNineCheckboxHatter;
    private CheckBox answerQuestionNineCheckboxCat;
    private CheckBox answerQuestionNineCheckboxQueen;
    private CheckBox answerQuestionNineCheckboxTurtle;
    private CheckBox answerQuestionNineCheckboxAlice;
    private CheckBox answerQuestionNineCheckboxFrog;
    //Question ten
    private EditText answerQuestionTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hide the keyboard during the start of the app
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //Initializing all findViewById global variables
        //Question one
        answerQuestionOne = (EditText) findViewById(R.id.answer_question_one_city_edittext_view);
        //Question two
        answerQuestionTwoCheckboxBegonia = (CheckBox) findViewById(R.id.answer_two_begonia_checkbox);
        answerQuestionTwoCheckboxMarigold = (CheckBox) findViewById(R.id.answer_two_marigold_checkbox);
        answerQuestionTwoCheckboxAzalea = (CheckBox) findViewById(R.id.answer_two_azalea_checkbox);
        answerQuestionTwoCheckboxEve = (CheckBox) findViewById(R.id.answer_two_eve_checkbox);
        answerQuestionTwoCheckboxCharlotte = (CheckBox) findViewById(R.id.answer_two_charlotte_checkbox);
        answerQuestionTwoCheckboxGrace = (CheckBox) findViewById(R.id.answer_two_grace_checkbox);
        //Question three
        answerQuestionThreeRadioGroup = (RadioGroup) findViewById(R.id.answer_three_criminal_radio_group);
        answerQuestionThreeRadioButtonGillies = (RadioButton) findViewById(R.id.answer_three_criminal_gillies_radiobutton);
        //Question four
        answerQuestionFour = (EditText) findViewById(R.id.answer_four_fingerprints_edittext_view);
        //Question five
        answerQuestionFiveCheckboxTesla = (CheckBox) findViewById(R.id.answer_five_historical_figures_tesla_checkbox);
        answerQuestionFiveCheckboxFord = (CheckBox) findViewById(R.id.answer_five_historical_figures_ford_checkbox);
        answerQuestionFiveCheckboxOakley = (CheckBox) findViewById(R.id.answer_five_historical_figures_oakley_checkbox);
        answerQuestionFiveCheckboxLondon = (CheckBox) findViewById(R.id.answer_five_historical_figures_london_checkbox);
        answerQuestionFiveCheckboxHoudini = (CheckBox) findViewById(R.id.answer_five_historical_figures_houdini_checkbox);
        answerQuestionFiveCheckboxWells = (CheckBox) findViewById(R.id.answer_five_historical_figures_wells_checkbox);
        //Question six
        answerQuestionSix = (EditText) findViewById(R.id.answer_six_hobby_edittext_view);
        //Question seven
        answerQuestionSevenRadioGroup = (RadioGroup) findViewById(R.id.answer_seven_psychologist_radio_group);
        answerQuestionSevenRadioButtonAlienist = (RadioButton) findViewById(R.id.answer_seven_alienist_radiobutton);
        //Question eight
        answerQuestionEightRadioGroup = (RadioGroup) findViewById(R.id.answer_eight_nudist_radio_group);
        answerQuestionEightRadioButtonTrue = (RadioButton) findViewById(R.id.answer_eight_nudist_true_radiobutton);
        //Question nine
        answerQuestionNineCheckboxHatter = (CheckBox) findViewById(R.id.answer_nine_wonderland_hatter_checkbox);
        answerQuestionNineCheckboxCat = (CheckBox) findViewById(R.id.answer_nine_wonderland_cat_checkbox);
        answerQuestionNineCheckboxQueen = (CheckBox) findViewById(R.id.answer_nine_wonderland_queen_checkbox);
        answerQuestionNineCheckboxTurtle = (CheckBox) findViewById(R.id.answer_nine_wonderland_turtle_checkbox);
        answerQuestionNineCheckboxAlice = (CheckBox) findViewById(R.id.answer_nine_wonderland_alice_checkbox);
        answerQuestionNineCheckboxFrog = (CheckBox) findViewById(R.id.answer_nine_wonderland_frog_checkbox);
        //Question ten
        answerQuestionTen = (EditText) findViewById(R.id.answer_ten_greenfairy_edittext_view);
    }

    /**
     * This method calculates the score when user clicks the Submit Answers button.
     */
    public void submitAnswers (View view){
        //Checks for the answer to Question one (an EditText View)
        String answerOne = answerQuestionOne.getText().toString();
            if (answerOne.equalsIgnoreCase("Toronto")) {
               finalScore = finalScore + 1;
            }

        //Checks for the answer to Question two (a CheckBox View)
        if (answerQuestionTwoCheckboxBegonia.isChecked() && answerQuestionTwoCheckboxMarigold.isChecked() &&
                answerQuestionTwoCheckboxAzalea.isChecked() && !answerQuestionTwoCheckboxEve.isChecked() &&
                !answerQuestionTwoCheckboxCharlotte.isChecked() && !answerQuestionTwoCheckboxGrace.isChecked()) {
            finalScore = finalScore + 1;
        }

        //Checks for the answer to Question three (a RadioButton View)
        if (answerQuestionThreeRadioButtonGillies.isChecked()) {
            finalScore = finalScore + 1;
        }

        //Checks for the answer to Question four (an EditText View)
        String answerFour = answerQuestionFour.getText().toString();
        if (answerFour.equalsIgnoreCase("Marks")) {
            finalScore = finalScore + 1;
        }

        //Checks for the answer to Question five (a CheckBox View)
        if (answerQuestionFiveCheckboxTesla.isChecked() && answerQuestionFiveCheckboxFord.isChecked() &&
                answerQuestionFiveCheckboxOakley.isChecked() && answerQuestionFiveCheckboxLondon.isChecked() &&
                answerQuestionFiveCheckboxHoudini.isChecked() && answerQuestionFiveCheckboxWells.isChecked()) {
            finalScore = finalScore + 1;
        }

        //Checks for the answer to Question six (an EditText View)
        String answerSix = answerQuestionSix.getText().toString();
        if (answerSix.equalsIgnoreCase("Painting")) {
            finalScore = finalScore + 1;
        }

        //Checks for the answer to Question seven (a RadioButton View)
        if (answerQuestionSevenRadioButtonAlienist.isChecked()) {
            finalScore = finalScore + 1;
        }

        //Checks for the answer to Question eight (a RadioButton View)
        if (answerQuestionEightRadioButtonTrue.isChecked()) {
            finalScore = finalScore + 1;
        }

        //Checks for the answer to Question nine (a Checkbox View)
        if (answerQuestionNineCheckboxHatter.isChecked() && answerQuestionNineCheckboxCat.isChecked() &&
                !answerQuestionNineCheckboxQueen.isChecked() && !answerQuestionNineCheckboxTurtle.isChecked() &&
                !answerQuestionNineCheckboxAlice.isChecked() && !answerQuestionNineCheckboxFrog.isChecked()) {
            finalScore = finalScore + 1;
        }

        //Checks for the answer to Question ten (an EditText View)
        String answerTen = answerQuestionTen.getText().toString();
        if (answerTen.equalsIgnoreCase("Absinthe")) {
            finalScore = finalScore + 1;
        }

        //Toast message with score
        if (finalScore >=5){
            Toast.makeText(getBaseContext(), "Fantastic Job!  Your score is: " + finalScore + " out of 10.",
               Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getBaseContext(), "Your score is: " + finalScore + " out of 10. Try Again!",
               Toast.LENGTH_LONG).show();
        }

    }

    public void resetQuiz (View view){
        //Reset score to zero
        finalScore = 0;
        //Question one reset (a TextEdit view)
        answerQuestionOne.setText("");
        //Question two reset (a CheckBox view)
        answerQuestionTwoCheckboxBegonia.setChecked(false);
        answerQuestionTwoCheckboxMarigold.setChecked(false);
        answerQuestionTwoCheckboxAzalea.setChecked(false);
        answerQuestionTwoCheckboxEve.setChecked(false);
        answerQuestionTwoCheckboxCharlotte.setChecked(false);
        answerQuestionTwoCheckboxGrace.setChecked(false);
        //Question three reset (a RadioGroup view)
        answerQuestionThreeRadioGroup.clearCheck();
        //Question four reset (a TextEdit view)
        answerQuestionFour.setText("");
        //Question five reset (a CheckBox view)
        answerQuestionFiveCheckboxTesla.setChecked(false);
        answerQuestionFiveCheckboxFord.setChecked(false);
        answerQuestionFiveCheckboxOakley.setChecked(false);
        answerQuestionFiveCheckboxLondon.setChecked(false);
        answerQuestionFiveCheckboxHoudini.setChecked(false);
        answerQuestionFiveCheckboxWells.setChecked(false);
        //Question six reset (a TextEdit view)
        answerQuestionSix.setText("");
        //Question seven reset (a RadioGroup view)
        answerQuestionSevenRadioGroup.clearCheck();
        //Question eight reset (a RadioGroup view)
        answerQuestionEightRadioGroup.clearCheck();
        //Question nine reset (a CheckBox view)
        answerQuestionNineCheckboxHatter.setChecked(false);
        answerQuestionNineCheckboxCat.setChecked(false);
        answerQuestionNineCheckboxQueen.setChecked(false);
        answerQuestionNineCheckboxTurtle.setChecked(false);
        answerQuestionNineCheckboxAlice.setChecked(false);
        answerQuestionNineCheckboxFrog.setChecked(false);
        //Question ten reset (a TextEdit view)
        answerQuestionTen.setText("");
    }
}




