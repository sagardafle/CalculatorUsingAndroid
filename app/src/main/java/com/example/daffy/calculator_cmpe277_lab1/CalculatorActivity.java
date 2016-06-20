package com.example.daffy.calculator_cmpe277_lab1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;


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
    private Button mDecimalButton;

    private Button mAdditionButton;
    private Button mSubtractionButton;
    private Button mMultiplicationButton;
    private Button mDivisionButton;

    private Button mResetButton;
    private Button mComputeResults;

    AlphaAnimation buttonClick = new AlphaAnimation(1F, 1.2F);


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
                v.startAnimation(buttonClick);
                mResultsView.append(mZeroButton.getText().toString());
                enableAllButtons(mResultsView.getText().toString());
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
                enableAllButtons(mResultsView.getText().toString());


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
                enableAllButtons(mResultsView.getText().toString());


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
                enableAllButtons(mResultsView.getText().toString());


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
                enableAllButtons(mResultsView.getText().toString());


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
                enableAllButtons(mResultsView.getText().toString());


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
                enableAllButtons(mResultsView.getText().toString());


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
                enableAllButtons(mResultsView.getText().toString());


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
                enableAllButtons(mResultsView.getText().toString());


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
                enableAllButtons(mResultsView.getText().toString());

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
                disableAllButtons();

            }
        });

        /**
         * Listener for Addition
         */

        mAdditionButton = (Button)findViewById(R.id.addition);
        mAdditionButton.setEnabled(false);
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
        mSubtractionButton.setEnabled(false);
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
        mMultiplicationButton.setEnabled(false);
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
        mDivisionButton.setEnabled(false);
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
        mComputeResults.setEnabled(false);

        mComputeResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myTag" , "= pressed");
                String expression = mResultsView.getText().toString();

                //add spaces between the operands as required by the BODMAS parser
                if(expression.indexOf('+') > 0)   expression = expression.replace("+", " + ");
                else if (expression.indexOf('-') > 0) expression =  expression.replaceAll("-", " - ");
                else if (expression.indexOf('*') > 0) expression = expression.replaceAll("\\*", " * ");
                else expression = expression.replaceAll("/", " / ");

                Log.d("modified expression" , expression);

                float answer = expressionEvaluater(expression);

                Log.d("FinalAns" , Float.toString(answer));

                if(answer%1 == 0) { //the float value does not contains a decimal, so round it to integer and display
                    Log.d("IN" , " IF FOR MOD");
                    String boldanswer = "<b><i>" + Integer.toString(Math.round(answer)) + "</i></b> " ;
                    //       dddd if(boldanswer.length() >10) boldanswer = boldanswer.substring(0,8);
                    mResultsView.append(" =" + Html.fromHtml(boldanswer));
                } else {
                    Log.d("IN" , " ELSE FOR MOD");
                    String boldanswer = "<b><i>" + Float.toString(answer) + "</i></b> " ;
                    mResultsView.append(" =" +Html.fromHtml(boldanswer));
                }
            }

            private float expressionEvaluater(String expression) {
                Log.d("The expression is " ,expression);

                //perform chain operations like : "2+3=5 *5=25 +10" = ?"

                if(expression.indexOf("=") >0 ){
                    String[] temp = expression.split("=");
                    Log.d("Array length " , String.valueOf(temp.length));
                    expression = temp[temp.length-1]; //getting the last most operation(25+10) in above example
                    Log.d("Splitted operation is ",expression);
                }
                char[] tokens = expression.toCharArray();


                // Stack for numbers: 'digits'
                Stack<Float> digits = new Stack<Float>();

                // Stack for Operators: 'operators'
                Stack<Character> operators = new Stack<Character>();


                for (int i = 0; i < tokens.length; i++)
                {
                    // Current token is a whitespace, skip it
                    if (tokens[i] == ' ')
                        continue;

                    if(tokens[i] == '.')
                        digits.push(Float.parseFloat(String.valueOf(tokens[i])));


//                    // Current token is a number, push it to stack for numbers
//                    if (tokens[i] >= '0' && tokens[i] <= '9')
//                    {
//                        StringBuffer sbuf = new StringBuffer();
//                        // There may be more than one digits in number
//                        while ((i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') )
//                            sbuf.append(tokens[i++]);
//                        digits.push(Float.parseFloat(sbuf.toString()));
//                    }

                    // Current token is an opening brace, push it to 'operators'
                     if (tokens[i] == '(')
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



                    // Current token is a number, push it to stack for numbers
                    else
                    {
                        StringBuffer sbuf = new StringBuffer();
                        // There may be more than one digits in number
                        while ((i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') )
                            sbuf.append(tokens[i++]);
                        digits.push(Float.parseFloat(sbuf.toString()));
                    }
                }

                Log.d("OGI Digits stack",digits.toString());
                for(int l=0;l<digits.size();l++){
                    Log.d("Stack contents++++", String.valueOf(digits.get(l)));
                }
                ArrayList<Float> arrlist = new ArrayList<Float>();
                arrlist = new ArrayList(digits);
                if(arrlist.size()%2 !=0){
                    Log.d("Arraylist[0]" , String.valueOf(Math.round(arrlist.get(0))));
                    Log.d("Arraylist[1]" , String.valueOf(Math.round(arrlist.get(1))));
                    String temp = String.valueOf(Math.round(arrlist.get(0))) + '.' + String.valueOf(Math.round(arrlist.get(1)));
                    arrlist.set( 0, Float.valueOf(temp));
                    arrlist.remove(1);
                }
                digits.removeAllElements();
                digits.addAll(arrlist);
                Log.d("ArrayList ---------", arrlist.toString());
                 Log.d("Operators stack",operators.toString());

                // Entire expression has been parsed at this point, apply remaining
                // operators to remaining digits
                while (!operators.empty())
                    digits.push(applyOp(operators.pop(), digits.pop(), digits.pop()));

                // Top of 'digits' contains result, return it
                float finalans = digits.pop();

                //Setting the precision to two digits
                BigDecimal roundfinalValue = new BigDecimal(finalans).setScale(2,BigDecimal.ROUND_HALF_UP);

                Log.d("digits Stack final ans" , roundfinalValue.toString());

                return Float.valueOf(roundfinalValue.toString());
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
            private float applyOp(char op, float b, float a)
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
                        {
                            mResultsView.append(" = Invalid operation" );
                            break;
                            //throw new
                                    //UnsupportedOperationException("Cannot divide by zero");

                        }
                        return a / b;
                }
                return 0;
            }
        });
    }

    private void enableAllButtons(String checkString) {
        Log.d("IN", "enableAllButtons");
        Log.d("checkString", checkString);

        if      (checkString.length()>0 )   {
            mAdditionButton.setEnabled(true);
            mSubtractionButton.setEnabled(true);
            mMultiplicationButton.setEnabled(true);
            mDivisionButton.setEnabled(true);

            /**
             * Code to enable the "=" button after the operator and operand has been added
             */

            if(checkString.indexOf('+') > 0) {
                String[] inputarray = checkString.split("\\+");
                if((inputarray[0].length() >0) && (inputarray[1].length())>0){
                    mComputeResults.setEnabled(true);
                }
            }


            if(checkString.indexOf('-') > 0) {
                String[] inputarray = checkString.split("-");
                if((inputarray[0].length() >0) && (inputarray[1].length())>0){
                    mComputeResults.setEnabled(true);
                }
            }

            if(checkString.indexOf('*') > 0) {
                String[] inputarray = checkString.split("\\*");
                if((inputarray[0].length() >0) && (inputarray[1].length())>0){
                    mComputeResults.setEnabled(true);
                }
            }


            if(checkString.indexOf('/') > 0) {
                String[] inputarray = checkString.split("/");
                if((inputarray[0].length() >0) && (inputarray[1].length())>0){
                    mComputeResults.setEnabled(true);
                }
            }
        }
    }


    /**
     * disables the operator buttons and the equals button
     */

    private void disableAllButtons() {
        Log.d("IN", "disableAllButtons");

        mAdditionButton.setEnabled(false);
        mSubtractionButton.setEnabled(false);
        mMultiplicationButton.setEnabled(false);
        mDivisionButton.setEnabled(false);
        mComputeResults.setEnabled(false);
    }


    /**
     * Save and restore the data on screen rotate
     * @param outState
     */


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
        if (saveddata.length()>0) enableAllButtons(saveddata); //enable the buttons in landscape mode
    }
}