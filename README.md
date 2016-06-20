# CalculatorUsingAndroid
This is my first android application where I have built an arithmatic calculatorusing Android.

##Some of the features pertaining to android : 
1. Makes use of android development components like the **LinearLayout, TextView and Buttons**.
2. The app is **responsive** ( works in portrait as well as landscape mode) .
3. The app is designed to work even if the *device is rotated*  
By default, when the screen is rotated the activity is killed and restarted. 
To make sure no data is lost, I've saved and restored the data using the lifecycle methods like **"onSaveInstanceState" and "onRestoreInstanceState"**

###Screenshots:

![alt text](https://github.com/sagardafle/CalculatorUsingAndroid/blob/master/Screenshots/Screenshot%20from%202016-06-20%2001-28-35.png "The homescreen of calculator in portrait mode") 

![alt text](https://github.com/sagardafle/CalculatorUsingAndroid/blob/master/Screenshots/Screenshot%20from%202016-06-20%2001-31-59.png "Performed some basic calculation in the app. The app is capable to perform the chain operations. A division,multiplicaiton and addition has been performed in this case") 

![alt text](https://github.com/sagardafle/CalculatorUsingAndroid/blob/master/Screenshots/Screenshot%20from%202016-06-20%2001-40-36.png "The homescreen of calculator in landscape mode") 

![alt text](https://github.com/sagardafle/CalculatorUsingAndroid/blob/master/Screenshots/Screenshot%20from%202016-06-20%2001-41-23.png "The buttons and the entire layout are resized to make sure that the entire app behaves as expected. Capable to restore the data on screen orientation.") 

####ERROR Handling:

Few corner-cases have been handled like :
* 1. x/0 returns an "Invalid operation" error to the user.
* 2. The operator(+,/,+,-) buttons are disabled till the user enters atleast one digit.
* 3. The equals(=) button is disabled until the user enters two operands and atleast one single operator.
* 4. If user performs operations like "a//b" or "a++b" then the equals(=) button is disabled. 
* 5. The float output is converted to integer , if required. E.g 10/5 returns 2 instead of 2.0 .

