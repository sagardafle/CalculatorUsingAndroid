package com.example.daffy.calculator_cmpe277_lab1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class CalculatorActivity extends AppCompatActivity {

    private TextView mResultsView;

    private Button mZeroButton;
    private Button mOneButton;
    private Button mTwoButton;
    private Button mThreeButton;
    private Button mFourButton;
    private Button mFiveButton;
    private Button mSixButton;
    private Button mSevenButton;
    private Button mEightButton;
    private Button mNineButton;

    private Button mAdditionButton;
    private Button mSubtractionButton;
    private Button mMultiplicationButton;
    private Button mDivisionButton;

    private Button mResetButton;
    private Button mComputeResults;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        mResultsView = (TextView)findViewById(R.id.results);

        /**
         * Listener for Digit - 0
         */

        mZeroButton = (Button)findViewById(R.id.digit_zero);
        mZeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mResultsView.append(mZeroButton.getText().toString());

            }
        });


        /**
         * Listener for Digit - 1
         */
        mOneButton = (Button)findViewById(R.id.digit_one);
        mOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "1 pressed");
                mResultsView.append(mOneButton.getText().toString());

            }
        });


        /**
         * Listener for Digit - 2
         */

        mTwoButton = (Button)findViewById(R.id.digit_two);
        mTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "2 pressed");
                mResultsView.append(mTwoButton.getText().toString());

            }
        });


        /**
         * Listener for Digit - 3
         */

        mThreeButton = (Button)findViewById(R.id.digit_three);
        mThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "3 pressed");
                mResultsView.append(mThreeButton.getText().toString());

            }
        });


        /**
         * Listener for Digit - 4
         */

        mFourButton = (Button)findViewById(R.id.digit_four);
        mFourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "4 pressed");
                mResultsView.append(mFourButton.getText().toString());

            }
        });


        /**
         * Listener for Digit - 5
         */

        mFiveButton = (Button)findViewById(R.id.digit_five);
        mFiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "5 pressed");
                mResultsView.append(mFiveButton.getText().toString());

            }
        });

        /**
         * Listener for Digit - 6
         */

        mSixButton = (Button)findViewById(R.id.digit_six);
        mSixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "6 pressed");
                mResultsView.append(mSixButton.getText().toString());

            }
        });

        /**
         * Listener for Digit - 7
         */

        mSevenButton = (Button)findViewById(R.id.digit_seven);
        mSevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "7 pressed");
                mResultsView.append(mSevenButton.getText().toString());

            }
        });


        /**
         * Listener for Digit - 8
         */

        mEightButton = (Button)findViewById(R.id.digit_eight);
        mEightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "8 pressed");
                mResultsView.append(mEightButton.getText().toString());

            }
        });

        /**
         * Listener for Digit - 9
         */

        mNineButton = (Button)findViewById(R.id.digit_nine);
        mNineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "9 pressed");
                mResultsView.append(mNineButton.getText().toString());

            }
        });




        /**
         * Listener for RESET
         */

        mResetButton = (Button)findViewById(R.id.reset);
        mResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "reset pressed");
                mResultsView.setText("");

            }
        });

        /**
         * Listener for Addition
         */

        mAdditionButton = (Button)findViewById(R.id.addition);
        mAdditionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "+ pressed");
                mResultsView.append(mAdditionButton.getText().toString());

            }
        });


        /**
         * Listener for Subtraction
         */

        mSubtractionButton = (Button)findViewById(R.id.subtraction);
        mSubtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "- pressed");
                mResultsView.append(mSubtractionButton.getText().toString());

            }
        });

        /**
         * Listener for Multiplication
         */

        mMultiplicationButton = (Button)findViewById(R.id.multiplication);
        mMultiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "* pressed");
                mResultsView.append(mMultiplicationButton.getText().toString());

            }
        });

        /**
         * Listener for Division
         */

        mDivisionButton = (Button)findViewById(R.id.division);
        mDivisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "/ pressed");
                mResultsView.append(mDivisionButton.getText().toString());

            }
        });


        /**
         * Listener for Compute
         */

        mComputeResults = (Button)findViewById(R.id.compute);
        mComputeResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "= pressed");
                //mResultsView.append(mComputeResults.getText().toString());

                performOperations(mResultsView.getText().toString());

            }

            private void performOperations(String operationString) {
                Log.d("myTag" , operationString);


                if(operationString.indexOf('+') > 0){
                    computeResults(operationString.split("\\+"), '+');
                }
                if(operationString.indexOf('-') > 0){
                    computeResults(operationString.split("-"), '-');
                }
                if(operationString.indexOf('*') > 0){
                    computeResults(operationString.split("\\*"), '*');
                }
                if(operationString.indexOf('/') > 0){
                    computeResults(operationString.split("/"), '/');
                }

            }

            private void computeResults(String[] numbers, char op) {
               // String result = numbers[0] + op + numbers[1];
                Log.d("numbers[0]" , numbers[0].toString());
                Log.d("numbers[1]" , numbers[1].toString());
                int result = 0;
                switch (op) {

                    case '+':
                        result = Integer.parseInt(numbers[0])  + Integer.parseInt(numbers[1]);
                        Log.d("finalresult" , String.valueOf(result));
                        mResultsView.append("  = " +String.valueOf(result));
                        break;

                    case '-':
                        result = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
                        Log.d("finalresult" , String.valueOf(result));
                        mResultsView.append("  = " +String.valueOf(result));
                        break;

                    case '*':
                        result = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
                        Log.d("finalresult" , String.valueOf(result));
                        mResultsView.append("  = " +String.valueOf(result));
                        break;

                    case '/':
                        result = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
                        Log.d("finalresult" , String.valueOf(result));
                        mResultsView.append("  = " +String.valueOf(result));
                        break;

                        }


            }

        });

    }

    @Override
    public void onSaveInstanceState(Bundle outState)
    {
//---save whatever you need to persist—
        outState.putString("stringtobesaved", mResultsView.getText().toString());
        super.onSaveInstanceState(outState);
    }


    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
//---retrieve the information persisted earlier---
        String saveddata = savedInstanceState.getString("stringtobesaved");
        mResultsView.append(String.valueOf(saveddata));
    }



}
