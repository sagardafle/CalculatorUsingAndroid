package com.example.daffy.calculator_cmpe277_lab1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                mResultsView.append(mEightButton.getText().toString()) ;

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
                mResultsView.append(" " +mAdditionButton.getText().toString() + " ");

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
                mResultsView.append(" " +mSubtractionButton.getText().toString() + " ");

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
                mResultsView.append(" " +mMultiplicationButton.getText().toString() + " ");

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
                mResultsView.append(" " +mDivisionButton.getText().toString() + " ");

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

                 String expression = mResultsView.getText().toString();
                //String expression = "100 * 2 + 12 ";

                int answer = expressionEvaluater(expression);
                Log.d("FinalAns" , Integer.toString(answer));
                mResultsView.append(" = " +Integer.toString(answer));
                //performOperations(mResultsView.getText().toString());
            }

            private int expressionEvaluater(String expression) {
                Log.d("The expression is " ,expression);
                char[] tokens = expression.toCharArray();

                // Stack for numbers: 'digits'
                Stack<Integer> digits = new Stack<Integer>();

                // Stack for Operators: 'operators'
                Stack<Character> operators = new Stack<Character>();

                for (int i = 0; i < tokens.length; i++)
                {
                    // Current token is a whitespace, skip it
                    if (tokens[i] == ' ')
                        continue;

                    // Current token is a number, push it to stack for numbers
                    if (tokens[i] >= '0' && tokens[i] <= '9')
                    {
                        StringBuffer sbuf = new StringBuffer();
                        // There may be more than one digits in number
                        while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                            sbuf.append(tokens[i++]);
                        digits.push(Integer.parseInt(sbuf.toString()));
                    }

                    // Current token is an opening brace, push it to 'operators'
                    else if (tokens[i] == '(')
                        operators.push(tokens[i]);

                        // Closing brace encountered, solve entire brace
                    else if (tokens[i] == ')')
                    {
                        while (operators.peek() != '(')
                            digits.push(applyOp(operators.pop(), digits.pop(), digits.pop()));
                        operators.pop();
                    }

                    // Current token is an operator.
                    else if (tokens[i] == '+' || tokens[i] == '-' ||
                            tokens[i] == '*' || tokens[i] == '/')
                    {
                        // While top of 'operators' has same or greater precedence to current
                        // token, which is an operator. Apply operator on top of 'operators'
                        // to top two elements in digits stack
                        while (!operators.empty() && hasPrecedence(tokens[i], operators.peek()))
                            digits.push(applyOp(operators.pop(), digits.pop(), digits.pop()));

                        // Push current token to 'operators'.
                        operators.push(tokens[i]);
                    }
                }

                // Entire expression has been parsed at this point, apply remaining
                // operators to remaining digits
                while (!operators.empty())
                    digits.push(applyOp(operators.pop(), digits.pop(), digits.pop()));

                // Top of 'digits' contains result, return it
                int finalans = digits.pop();
                Log.d("digits Stack" , Integer.toString(finalans));
                return finalans;
            }



            // Returns true if 'op2' has higher or same precedence as 'op1',
            // otherwise returns false.
            private boolean hasPrecedence(char op1, char op2)
            {

                Log.d("In ","hasPrecedence method");
                if (op2 == '(' || op2 == ')')
                    return false;
                if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
                    return false;
                else
                    return true;
            }

            // A utility method to apply an operator 'op' on operands 'a'
            // and 'b'. Return the result.
            private int applyOp(char op, int b, int a)
            {
                Log.d("In ","applyOp method");
                switch (op)
                {
                    case '+':
                        return a + b;
                    case '-':
                        return a - b;
                    case '*':
                        return a * b;
                    case '/':
                        if (b == 0)
                            throw new
                                    UnsupportedOperationException("Cannot divide by zero");
                        return a / b;
                }
                return 0;
            }



//
//
//
//
//
//            private void performOperations(String operationString) {
//                Log.d("myTag" , operationString);
//
//
//                if(operationString.indexOf('+') > 0){
//                    computeResults(operationString.split("\\+"), '+');
//                }
//                if(operationString.indexOf('-') > 0){
//                    computeResults(operationString.split("-"), '-');
//                }
//                if(operationString.indexOf('*') > 0){
//                    computeResults(operationString.split("\\*"), '*');
//                }
//                if(operationString.indexOf('/') > 0){
//                    computeResults(operationString.split("/"), '/');
//                }
//
//            }
//
//            private void computeResults(String[] numbers, char op) {
//                Log.d("numbers[0]" , numbers[0].toString());
//                Log.d("numbers[1]" , numbers[1].toString());
//                int result = 0;
//                switch (op) {
//
//                    case '+':
//                        result = Integer.parseInt(numbers[0])  + Integer.parseInt(numbers[1]);
//                        Log.d("finalresult" , String.valueOf(result));
//                        mResultsView.append("  = " +String.valueOf(result));
//                        break;
//
//                    case '-':
//                        result = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
//                        Log.d("finalresult" , String.valueOf(result));
//                        mResultsView.append("  = " +String.valueOf(result));
//                        break;
//
//                    case '*':
//                        result = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
//                        Log.d("finalresult" , String.valueOf(result));
//                        mResultsView.append("  = " +String.valueOf(result));
//                        break;
//
//                    case '/':
//                        result = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
//                        Log.d("finalresult" , String.valueOf(result));
//                        mResultsView.append("  = " +String.valueOf(result));
//                        break;
//
//                        }
//            }
//
//
//




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
