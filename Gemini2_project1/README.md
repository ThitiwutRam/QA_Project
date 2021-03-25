# Unit Test for Open Source Software Projects

## By GEMINI-2

### Test Cases

#### 1.Signum
<b>Interfaced-based and Functionality-based Test</b><br>
<b>Goal</b>: To find the sign of the real number.<br>
<b>Identify testable functions</b>: Parser<br>
<b>Identify parameters, return types, return values, and exceptional behavior:</b><br>
○ Parameters: Input, Scope<br>
○ Return type: Double<br>
○ Return value: Sign of number <br>
○ Exceptional behavior: -<br>
<b>Model the input domain:</b><br> 
<ins>Develop characteristics</ins> <br>
C1 = Input is empty<br>
C2 = Scope is empty<br>
C3 = Sign value of input<br>
C4 = Input is decimal<br>
<ins>Partition characteristics</ins>
<table>
  <tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
  <tr><td>C1 = Input is empty</td><td>True</td><td>False</td><td></td></tr>
  <tr><td>C2 = Scope is empty</td><td>True</td><td>False</td><td></td></tr>
  <tr><td>C3 = Sign value of input</td><td>Negative</td><td>Positive</td><td>Zero</td></tr>
  <tr><td>C4 = Input is decimal</td><td>Yes</td><td>No</td><td></td></tr>
</table>
<ins>Identify(possible)values</ins>
<table>
  <tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
  <tr><td>C1 = Input is empty</td><td>""</td><td>sign(10)</td><td></td></tr>
  <tr><td>C2 = Scope is empty</td><td>""</td><td>BinaryOperation.EPSILON</td><td></td></tr>
  <tr><td>C3 = Sign value of input</td><td>sign(-99)</td><td>150</td><td>sign(0)</td></tr>
  <tr><td>C4 = Input is decimal</td><td>sign(50.2)</td><td>sign(60)</td><td></td></tr>
</table>
<b>Combine partitions into tests</b><br>
○ <b>Assumption</b>: ACoC<br>
○ <b>Test requirements -- the number of tests (upper bound)</b> =  2*2*3*2 = 24<br>
(True, True, Negative, Yes)<br>			
(True, True, Negative, No)<br>
(True, True, Zero, Yes)<br>
(True, True, Zero, No)<br>
(True, True, Positive, Yes)<br>
(True, True, Positive, No)<br><br>
(True, False, Negative, Yes)<br>
(True, False, Negative, No)<br>
(True, False, Zero, Yes)<br>
(True, False, Zero, No)<br>
(True, False, Positive, Yes)<br>
(True, False, Positive, No)<br><br>
(False, True, Negative, Yes)<br>
(False, True, Negative, No)<br>
(False, True, Zero, Yes)<br>
(False, True, Zero, No)<br>
(False, True, Positive, Yes)<br>
(False, True, Positive, No)<br><br>
(False, False, Negative, Yes)<br>
(False, False, Negative, No)<br>
(False, False, Zero, Yes)<br>
(False, False, Zero, No)<br>
(False, False, Positive, Yes)<br>
(False, False, Positive, No)<br><br>
○ <b>Eliminate redundant tests and infeasible tests</b><br>
(False, False, Negative, Yes)<br>
(False, False, Negative, No)<br>
(False, False, Zero, Yes)<br>
(False, False, Zero, No)<br>
(False, False, Positive, Yes)<br>
(False, False, Positive, No)<br><br>
<b>Derive test values</b><br><br>
<table>
  <tr><td>Test</td><td>Input</td><td>Expected Result</td></tr>
  <tr><td><b>T1</b> (False, False, Negative, Yes)</td><td>sign(-50.2)</td><td>-1</td></tr>
  <tr><td><b>T2</b> (False, False, Negative, No)</td><td>sign(-99)</td><td>-1</td></tr>
  <tr><td><b>T3</b> (False, False, Zero, Yes)</td><td>sign(0.0)</td><td>0</td></tr>
  <tr><td><b>T4</b> (False, False, Zero, No)</td><td>sign(0)</td><td>0</td></tr>
  <tr><td><b>T5</b> (False, False, Positive, Yes)</td><td>sign(50.2)</td><td>0</td></tr>
  <tr><td><b>T6</b> (False, False, Positive, No)</td><td>sign(60)</td><td>1</td></tr>
</table>


#### 2. Inverse Trigonometry 
<b>Interfaced-based and Functionality-based Test</b><br>
<b>Goal</b>: To find the inverse of trigonometry can be calculated properly.<br>
<b>Identify testable functions</b>: Parser<br>
<b>Identify parameters, return types, return values, and exceptional behavior:</b><br>
○ Parameters: Input, Scope<br>
○ Return type: Double<br>
○ Return value: The value of angles in radian <br>
○ Exceptional behavior: -<br>
<b>Model the input domain:</b><br> 
<ins>Develop characteristics</ins> <br>
C1 = Input is empty<br>
C2 = Scope is empty<br>
C3 = Input is decimal<br>
C4 = Type of input number<br>
C5 = Type of input value<br>
<ins>Partition characteristics</ins>
<table>
  <tr><td>Characteristic</td><td >b1</td><td>b2</td><td>b3</td></tr>
  <tr><td>C1 = Input is empty</td><td>True</td><td>False</td><td></td></tr>
  <tr><td>C2 = Scope is empty</td><td>True</td><td>False</td><td></td></tr>
  <tr><td>C3 = Input is decimal</td><td>Yes</td><td>No</td><td></td></tr>
  <tr><td>C4 = Type of input number</td><td>Radian</td><td>Degree</td><td></td></tr>
  <tr><td>C5 = Type of input value</td><td>arcsin</td><td>arccos</td><td>arctan</td></tr>
</table>
<ins>Identify(possible)values</ins>
<table>
  <tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
  <tr><td>C1 = Input is empty</td><td>" "</td><td>asin(0.5)</td><td></td></tr>
  <tr><td>C2 = Scope is empty</td><td>" "</td><td>BinaryOperation.EPSILON</td><td></td></tr>
  <tr><td>C3 = Input is decimal</td><td>acos(30.2)</td><td>atan(65)</td><td></td></tr>
  <tr><td>C4 = Type of input number</td><td>acos(rad(30))</td><td>asin(deg(0.5236))</td><td></td></tr>
  <tr><td>C5 = Type of input value</td><td>asin(-20)</td><td>acos(0)</td><td>atan(10)</td></tr>
</table>
<b>Combine partitions into tests</b><br>
○ <b>Assumption</b>: ACoC<br>
○ <b>Test requirements -- the number of tests (upper bound)</b> =  2*2*2*2*3 = 48<br>
(True, True, Yes, Radian, arcsin)<br>					
(True, True, Yes, Radian, arccos)<br>
(True, True, Yes, Radian, arctan)<br>
(True, True, Yes, Degree, arcsin)<br>
(True, True, Yes, Degree, arccos)<br>
(True, True, Yes, Degree, arctan)<br><br>
(True, True, No, Radian, arcsin)<br>
(True, True, No, Radian, arccos)<br>
(True, True, No, Radian, arctan)<br>
(True, True, No, Degree, arcsin)<br>
(True, True, No, Degree, arccos)<br>
(True, True, No, Degree, arctan)<br><br>
(True, False, Yes, Radian, arcsin)<br>
(True, False, Yes, Radian, arccos)<br>
(True, False, Yes, Radian, arctan)<br>
(True, False, Yes, Degree, arcsin)<br>
(True, False, Yes, Degree, arccos)<br>
(True, False, Yes, Degree, arctan)<br><br>
(True, False, No, Radian, arcsin)<br>
(True, False, No, Radian, arccos)<br>
(True, False, No, Radian, arctan)<br>
(True, False, No, Degree, arcsin)<br>
(True, False, No, Degree, arccos)<br>
(True, False, No, Degree, arctan)<br><br>
(False, True, Yes, Radian, arcsin)<br>
(False, True, Yes, Radian, arccos)<br>
(False, True, Yes, Radian, arctan)<br>
(False, True, Yes, Degree, arcsin)<br>
(False, True, Yes, Degree, arccos)<br>
(False, True, Yes, Degree, arctan)<br><br>
(False, True, No, Radian, arcsin)<br>
(False, True, No, Radian, arccos)<br>
(False, True, No, Radian, arctan)<br>
(False, True, No, Degree, arcsin)<br>
(False, True, No, Degree, arccos)<br>
(False, True, No, Degree, arctan)<br><br>
(False, False, Yes, Radian, arcsin)<br>
(False, False, Yes, Radian, arccos)<br>
(False, False, Yes, Radian, arctan)<br>
(False, False, Yes, Degree, arcsin)<br>
(False, False, Yes, Degree, arccos)<br>
(False, False, Yes, Degree, arctan)<br><br>
(False, False, No, Radian, arcsin)<br>
(False, False, No, Radian, arccos)<br>
(False, False, No, Radian, arctan)<br>
(False, False, No, Degree, arcsin)<br>
(False, False, No, Degree, arccos)<br>
(False, False, No, Degree, arctan)<br><br>
○ <b>Eliminate redundant tests and infeasible tests</b><br>
(False, False, Yes, Radian, arcsin)<br>
(False, False, Yes, Radian, arccos)<br>
(False, False, Yes, Radian, arctan)<br>
(False, False, Yes, Degree, arcsin)<br>
(False, False, Yes, Degree, arccos)<br>
(False, False, Yes, Degree, arctan)<br>
(False, False, No, Degree, arcsin)<br>
(False, False, No, Degree, arccos)<br>
(False, False, No, Degree, arctan)<br>
(False, False, No, Radian, arcsin)<br>
(False, False, No, Radian, arccos)<br>
(False, False, No, Radian, arctan)<br><br>
<b>Derive test values</b><br><br>
<table>
  <tr><td>Test</td><td>Input</td><td>Expected Result</td></tr>
  <tr><td><b>T1</b> (False, False, Yes, Radian, arcsin)</td><td>asin(rad(-30.2))</td><td>-0.5551719515403636</td></tr>
  <tr><td><b>T2</b> (False, False, Yes, Radian, arccos)</td><td>acos(rad (0.0))</td><td>1.5707963267949</td></tr>
  <tr><td><b>T3</b> (False, False, Yes, Radian, arctan)</td><td>atan(rad(20.5))</td><td>0.3435999727109</td></tr>
  <tr><td><b>T4</b> (False, False, Yes, Degree, arcsin)</td><td>asin(deg(-0.7854))</td><td>NaN</td></tr>
  <tr><td><b>T5</b> (False, False, Yes, Degree, arccos)</td><td>acos(deg(0.0))</td><td>1.5707963267949</td></tr>
  <tr><td><b>T6</b> (False, False, Yes, Degree, arctan)</td><td>atan(deg(0.5236))</td><td>1.5374754087778</td></tr>
  <tr><td><b>T7</b> (False, False, No, Degree, arcsin)</td><td>asin(deg(-50))</td><td>NaN</td></tr>
  <tr><td><b>T8</b> (False, False, No, Degree, arccos)</td><td>acos(deg(0))</td><td>1.5707963267949</td></tr>
  <tr><td><b>T9</b> (False, False, No, Degree, arctan)</td><td>atan(deg(90))</td><td>1.5706024013249
</td></tr>
  <tr><td><b>T10</b> (False, False, No, Radian, arcsin)</td><td>asin(rad(-13))</td><td>-0.2288860870949</td></tr>
  <tr><td><b>T11</b> (False, False, No, Radian, arccos)</td><td>acos(rad(133))</td><td>NaN
</td></tr>
  <tr><td><b>T12</b> (False, False, No, Radian, arctan)</td><td>atan(rad(145))</td><td>1.1944837529119</td></tr>
</table>

#### 3. Trigonometry & Hyperbolic Trigonometry 
<b>Interfaced-based and Functionality-based Test</b><br>
<b>Goal</b>: To find whether the value of the trigonometry function is correct accordingly.<br>
<b>Identify testable functions</b>: Parser<br>
<b>Identify parameters, return types, return values, and exceptional behavior:</b><br>
○ Parameters: Input, Scope<br>
○ Return type: Double<br>
○ Return value: Trigonometry value<br>
○ Exceptional behavior: -<br>
<b>Model the input domain:</b><br> 
<ins>Develop characteristics</ins> <br>
C1 = Input is empty<br>
C2 = Scope is empty<br>
C3 = Input is decimal<br>
C4 = Type of input number<br>
C5 = Type of input value<br>
<ins>Partition characteristics</ins>
<table>
	<tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
	<tr><td>C1 = Input is empty</td><td>True</td><td>False</td><td></td></tr>
  	<tr><td>C2 = Scope is empty<br></td><td>True</td><td>False</td><td></td></tr>
  	<tr><td>C3 = Input is decimal</td><td>Yes</td><td>No</td><td></td></tr>
  	<tr><td>C4 = Type of input number</td><td>Radian</td><td>Degree</td><td></td></tr>
	<tr><td>C5 = Type of input value</td><td><0</td><td>=0</td><td>>0</td></tr>
</table>
<ins>Identify(possible)values</ins>
<table>
	<tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
  	<tr><td>C1 = Input is empty</td><td>""</td><td>sin(rad(90))</td><td></td></tr>
  	<tr><td>C2 = Scope is empty<br></td><td>""</td><td>BinaryOperation.EPSILON</td><td></td></tr>
  	<tr><td>C3 = Input is decimal</td><td>cos(0.575)</td><td>tanh(75)</td><td></td></tr>
  	<tr><td>C4 = Type of input number</td><td>sinh(rad(180))</td><td>cos(deg(0.64))</td><td></td></tr>
	<tr><td>C5 = Type of input value</td><td>cos(0.75)</td><td>sinh(0)</td><td>tan(1.98)</td></tr>
</table>
<b>Combine partitions into tests</b><br>
○ <b>Assumption</b>: PWC<br>
○ <b>Test requirements -- the number of tests (minimum)</b>= 2 * 3 = 6<br>
(True, True, Yes, Radian, <0),<br>
(True, False, No, Degree, =0),<br>
(True, True, Yes, Radian, >0),<br>
(False, True, Yes, Radian, <0),<br>
(False, False, No, Degree, =0),<br>
(False, True, Yes, Radian, >0),<br><br>
(False, True, No, Degree, =0),<br>
(True, False, Yes, Radian, <0),<br>
(True, False, Yes, Radian, >0),<br><br>
(False, False, Yes, Degree, =0),<br>
(True, True, No, Radian, <0),<br>
(True, True, No, Radian, >0),<br><br>
(False, False, No, Radian, =0),<br>
(True, True, No, Degree, <0),<br>
(True, True, No, Degree, >0),<br><br>
(False, False, No, Degree, <0),<br>
(True, True, Yes, Radian, =0),<br>
(False, False, No, Degree, >0)<br><br>
○ <b>Eliminate redundant tests and infeasible tests</b><br>
(False, False, Yes, Degree, =0),<br>
(False, False, No, Radian, =0),<br>
(False, False, No, Degree, =0),<br>
(False, False, No, Degree, <0),<br>
(False, False, No, Degree, >0)<br><br>
<b>Derive test values</b><br><br>
<table>
  <tr><td>Test</td><td>Input</td><td>Expected Result</td></tr>
  <tr><td><b>T1</b> (False, False, Yes, Degree, =0)</td><td>sinh(deg(0.00))</td><td>0</td></tr>
  <tr><td><b>T2</b> (False, False, No, Radian, =0)</td><td>cos(rad(0))</td><td>1</td></tr>
  <tr><td><b>T3</b> (False, False, No, Degree, =0)</td><td>tan(deg(0))</td><td>0</td></tr>
  <tr><td><b>T4</b> (False, False, No, Degree, <0)</td><td>tanh(deg(-12))</td><td>-1</td></tr>
  <tr><td><b>T4</b> (False, False, No, Degree, >0)</td><td>sin(deg(90))</td><td>-0.9540914674728181</td></tr>
</table>
#### 4. Average Test  
<b>Interfaced-based and Functionality-based Test</b><br>
<b>Goal</b>: To find if the average number can be calculated properly with other functions in it.<br>
<b>Identify testable functions</b>: Parser<br>
<b>Identify parameters, return types, return values, and exceptional behavior:</b><br>
○ Parameters: Input, Scope<br>
○ Return type: Double<br>
○ Return value: Average on inputs <br>
○ Exceptional behavior: -<br>
<b>Model the input domain:</b><br> 
<ins>Develop characteristics</ins> <br>
C1 = Input is empty<br>
C2 = Scope is empty<br>
C3 = Input is normal number<br>
C4 = Number of input<br>
<ins>Partition characteristics</ins>
<table>
  <tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td><td>b4</td></tr>
  <tr><td>C1 = Input is empty</td><td>True</td><td>False</td><td></td><td></td></tr>
  <tr><td>C2 = Scope is empty</td><td>True</td><td>False</td><td></td><td></td></tr>
  <tr><td>C3 = Input is normal number</td><td>Yes</td><td>No</td><td></td><td></td></tr>
  <tr><td>C4 = Number of input</td><td>0</td><td>1</td><td>2</td><td>>2</td></tr>
</table>
<ins>Identify(possible)values</ins>
<table>
  <tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td><td>b4</td></tr>
  <tr><td>C1 = Input is empty</td><td>""</td><td>Avg(3)</td><td></td><td></td></tr>
  <tr><td>C2 = Scope is empty</td><td>""</td><td>BinaryOperationSILON.EP</td><td></td><td></td></tr>
  <tr><td>C3 = Input is normal number</td><td>Avg(5)</td><td>Avg(sin(30))^3</td><td></td><td></td></tr>
  <tr><td>C4 = Number of input</td><td>()</td><td>(1)</td><td>(1,2)</td><td>(1,2,3,4)</td></tr></tr>
</table>
<b>Combine partitions into tests</b><br>
○ <b>Assumption</b>: MBBC<br>
<b>Base case</b>: (False, False, No, 2) (False, False, Yes, 2)<br>
○ <b>Test requirements -- the number of tests (upper bound)</b> =  12<br>
(False, False, No, 2)<br>
(True, False, No, 2),<br>
(False, True, No, 2),<br>
(False, False, No, 0),<br>
(False, False, No, 1),<br>
(False, False, No, >2)<br><br>
(False, False, Yes, 2),<br>
(True, False, Yes, 2),<br>
(False, True, Yes, 2),<br>
(False, False, Yes, 0),<br>
(False, False, Yes, 1),<br>
(False, False, Yes, >2)<br><br>
○ <b>Eliminate redundant tests and infeasible tests</b><br>
(False, False, No, 2), <br>
(False, False, No, 0),<br>
(False, False, No, 1), <br>
(False, False, No, >2)<br><br>
(False, False, Yes, 2), <br>
(False, False, Yes, 1), <br>
(False, False, Yes, >2)<br><br>
<b>Derive test values</b><br><br>
<table>
  <tr><td>Test</td><td>Input</td><td>Expected Result</td></tr>
  <tr><td><b>T1</b> (False, False, No, 2)</td><td>Avg(sin(30)^3, 5%3)<td>1.0625</td></tr>
  <tr><td><b>T2</b> (False, False, No, 0)</td><td>Avg()</td><td>0</td></tr>
  <tr><td><b>T3</b> (False, False, No, 1)</td><td>Avg(cos(45))^1)</td><td>0.7071067811865476</td></tr>
  <tr><td><b>T4</b> (False, False, No, >2)</td><td>Avg(sqrt(4),5+3,4*5,9^3)</td><td>189.75</td></tr>
  <tr><td><b>T5</b> (False, False, Yes, 2)</td><td>Avg(2,10)</td><td>6</td></tr>
  <tr><td><b>T6</b> (False, False, Yes, 1)</td><td>Avg(12)</td><td>12</td></tr>
  <tr><td><b>T7</b> (False, False, Yes, >2)</td><td>Avg(20,20,14)</td><td>18</td></tr>
</td></tr>
</table>

#### 5. Minimum and Maximum Number  
<b>Interfaced-based and Functionality-based Test</b><br>
<b>Goal</b>: To find if the minimum or maximum number can be found properly with other functions in it.<br>
<b>Identify testable functions</b>: Parser<br>
<b>Identify parameters, return types, return values, and exceptional behavior:</b><br>
○ Parameters: Input, Scope<br>
○ Return type: Double<br>
○ Return value: Min or Max on inputs <br>
○ Exceptional behavior: -<br>
<b>Model the input domain:</b><br> 
<ins>Develop characteristics</ins> <br>
C1 = First input is empty<br>
C2 = Second input is empty<br>
C3 = Scope is empty<br>
C4 = First Input is normal number<br>
C5 = Second Input is normal number<br>
C6 = Type of operation<br>
<ins>Partition characteristics</ins>
<table>
  <tr><td>Characteristic</td><td>b1</td><td>b2</td></tr>
  <tr><td>C1 = First input is empty</td><td>True</td><td>False</td></tr>
  <tr><td>C2 = Second input is empty</td><td>True</td><td>False</td></tr>
  <tr><td>C3 = Scope is empty</td><td>True</td><td>False</td></tr>
  <tr><td>C4 = First Input is normal number</td><td>Yes</td><td>No</td></tr>
  <tr><td>C5 = Second Input is normal number</td><td>Yes</td><td>No</td></tr>
  <tr><td>C6 = Type of operation</td><td>Min</td><td>Max</td></tr>
</table>
<ins>Identify(possible)values</ins>
<table>
  <tr><td>Characteristic</td><td>b1</td><td>b2</td></tr>
  <tr><td>C1 = First input is empty</td><td>""</td><td>1</td></tr>
  <tr><td>C2 = Second input is empty</td><td>""</td><td>2</td></tr>
  <tr><td>C3 = Scope is empty</td><td>""</td><td>BinaryOperation.EPSILON</td></tr>
  <tr><td>C4 = First Input is normal number</td><td>3</td><td>3.4*7^1</td></tr>
  <tr><td>C5 = Second Input is normal number</td><td>4</td><td>sqrt(5)*log(10)</td></tr>
  <tr><td>C6 = Type of operation</td><td>min()</td><td>max()</td></tr></tr>
</table>
<b>Combine partitions into tests</b><br>
○ <b>Assumption</b>: MBBC<br>
<b>Base case</b>: (False, False,False, Yes, Yes, Min) (False, False,False, Yes, Yes, Max)<br>
○ <b>Test requirements -- the number of tests (upper bound)= 12</b> <br>
Base(False, False,False, Yes, Yes, Min),<br> 
(True, False,False, Yes, Yes, Min),<br>
(False, True,False, Yes, Yes, Min),<br>
(False, False,True, Yes, Yes, Min),<br>
(False, False,False,No, Yes, Min),<br>
(False, False,False, Yes, No, Min)<br><br>
(False, False,False, Yes, Yes, Max),<br>
(True, False,False, Yes, Yes, Max),<br>
(False, True, False,Yes, Yes, Max),<br>
(False, False,True, Yes, Yes, Max),<br>
(False, False,False,No, Yes, Max),<br>
(False, False,False, Yes, No, Max)<br><br>
○ <b>Eliminate redundant tests and infeasible tests</b><br>
(False, False,False, Yes, Yes, Min),<br>
(False, False,False,No, Yes, Min),<br>
(False, False,False, Yes, No, Min)<br><br>
(False, False,False, Yes, Yes, Max),<br>
(False, False,False,No, Yes, Max),<br>
(False, False,False, Yes, No, Max)<br><br>
<b>Derive test values</b><br><br>
<table>
  <tr><td>Test</td><td>Input</td><td>Expected Result</td></tr>
  <tr><td><b>T1</b> (False, False,False, Yes, Yes, Min)</td><td>min(3,4)</td><td>3</td></tr>
  <tr><td><b>T2</b> (False, False,False,No, Yes, Min)</td><td>min(log(80),8)</td><td>1.903089987</td></tr>
  <tr><td><b>T3</b> (False, False,False, Yes, No, Min)</td><td>min(15,sqrt(4))</td><td>2</td></tr>
  <tr><td><b>T4</b> (False, False,False, Yes, Yes, Max)</td><td>max(10,15)</td><td>15</td></tr>
  <tr><td><b>T5</b> (False, False,False,No, Yes, Max)</td><td>max(5*3+8,1)</td><td>23</td></tr>
  <tr><td><b>T6</b> (False, False,False, Yes, No, Max)</td><td>max(10,2^3)</td><td>10</td></tr>
</td></tr>
</table>

#### 6. Round, Floor, Ceiling 
<b>Interfaced-based and Functionality-based Test</b><br>
<b>Goal</b>: To find the value when applying round, floor, and ceiling functions.<br>
<b>Identify testable functions</b>: Parser<br>
<b>Identify parameters, return types, return values, and exceptional behavior:</b><br>
○ Parameters: Input, Scope<br>
○ Return type: Double<br>
○ Return value: round, floor, and ceiling value<br>
○ Exceptional behavior: -<br>
<b>Model the input domain:</b><br> 
<ins>Develop characteristics</ins> <br>
C1 = Input value is empty<br>
C2 = Value is decimal<br>
C3 = Decimal value<br>
C4 = Total input value <br>
C5 = Scope is empty<br>
<ins>Partition characteristics</ins>
<table>
  <tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
	<tr><td>C1 = Input value is empty</td><td>True</td><td>False</td><td></td></tr>
  	<tr><td>C2 = Value is decimal</td><td>True</td><td>False</td><td></td></tr>
  	<tr><td>C3 = Decimal value</td><td><0.5</td><td>0.5</td><td>>0.5</td></tr>
  	<tr><td>C4 = Total input value </td><td><0</td><td>0</td><td>>0</td></tr>
 	<tr><td>C5 = Scope is empty</td><td>True</td><td>False</td><td></td></tr>
</table>
<ins>Identify(possible)values</ins>
<table>
   <td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
	<tr><td>C1 = Input value is empty</td><td>""</td><td>round(10), floor(10), ceiling(10)</td><td></td></tr>
  	<tr><td>C2 = Value is decimal</td><td>round(2.5), floor(2.5), ceiling(2.5)</td><td>round(2), floor(2), ceiling(2)</td><td></td></tr>
  	<tr><td>C3 = Decimal value</td><td>round(4.2), floor(4.2), ceiling(4.2)</td><td>round(4.5), floor(4.5), ceiling(4.5)</td><td>round(4.7), floor(4.7), ceiling(4.7)</td></tr>
  	<tr><td>C4 = Total input value </td><td>round(-2.4), floor(-2.4), ceiling(-2.4)</td><td>round(0), floor(0), ceiling(0)</td><td>round(3), floor(3), ceiling(3)</td></tr>
 	<tr><td>C5 = Scope is empty</td><td>""</td><td>BinaryOperation.EPSILON</td><td></td></tr>
</table>
<b>Combine partitions into tests</b><br>
○ <b>Assumption</b>: ECC<br>
○ <b>Test requirements -- the number of tests (upper bound)</b>= 3 <br>
(True, True, <0.5, 0,True),<br>
(False, False, 0.5, <0, False),<br>
(False, Falase, >0.5, >0, False)<br><br>
○ <b>Eliminate redundant tests and infeasible tests</b><br>
(False, False, 0.5, <0, False),<br>
(False, Falase, >0.5, >0, False)<br><br>
<b>Derive test values</b><br><br>
<b>Round</b>
<table>
  <tr><td>Test</td><td>Input</td><td>Expected Result</td></tr>
  <tr><td><b>T1</b> (False, Falase, 0.5, <0, False)</td><td>round(-1.5)</td><td>-1</td></tr>
  <tr><td><b>T2</b> (False, Falase, >0.5, >0, False)</td><td>round(2.6)</td><td>3</td></tr>
</table>
<b>Floor</b>
<table>
	<tr><td>Test</td><td>Input</td><td>Expected Result</td></tr>
  	<tr><td><b>T1</b> (False, Falase, 0.5, <0, False)</td><td>floor(-1.5)</td><td>-2</td></tr>
  	<tr><td><b>T2</b> (False, Falase, >0.5, >0, False)</td><td>floor(2.6)</td><td>2</td></tr>
</table>
<b>Ceiling</b>
<table>
	<tr><td>Test</td><td>Input</td><td>Expected Result</td></tr>
  	<tr><td><b>T1</b> (False, Falase, 0.5, <0, False)</td><td>ceil(-1.5)</td><td>-1</td></tr>
  	<tr><td><b>T2</b> (False, Falase, >0.5, >0, False)</td><td>ceil(2.6)</td><td>3</td></tr>
</td></tr>
</table>

#### 7. Square Root 
<b>Interfaced-based and Functionality-based Test</b><br>
<b>Goal</b>: To find the value when applying square root function.<br>
<b>Identify testable functions</b>: Parser<br>
<b>Identify parameters, return types, return values, and exceptional behavior:</b><br>
○ Parameters: Input, Scope<br>
○ Return type: Double<br>
○ Return value: Square root value<br>
○ Exceptional behavior: -<br>
<b>Model the input domain:</b><br> 
<ins>Develop characteristics</ins> <br>
C1 = Input is empty<br>
C2 = Input value<br>
C3 = Input is decimal<br>
C4 = Scope is empty<br>
<ins>Partition characteristics</ins>
<table>
	<tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
	<tr><td>C1 = Input is empty</td><td>True</td><td>False</td><td></td></tr>
  	<tr><td>C2 = Input value</td><td><0</td><td>0</td><td>>0</td></tr>
  	<tr><td>C3 = Input is decimal</td><td>True</td><td>False</td><td></td></tr>
  	<tr><td>C4 = Scope is empty</td><td>True</td><td>False</td><td></td></tr>
</table>
<ins>Identify(possible)values</ins>
<table>
	<tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
  <tr><td>C1 = Input is empty</td><td>""</td><td>10</td><td></td></tr>
  <tr><td>C2 = Input value</td><td>-5</td><td>0</td><td>16</td></tr>
  <tr><td>C3 = Input is decimal</td><td>4.6</td><td>4</td><td></td></tr>
  <tr><td>C4 = Scope is empty</td><td>""</td><td>BinaryOperation.EPSILON</td><td></td></tr>
</table>
<b>Combine partitions into tests</b><br>
○ <b>Assumption</b>: ECC<br>
○ <b>Test requirements -- the number of tests (upper bound)</b>= 3<br>
(True, 0, True, True),<br>
(False, <0, False, False),<br>
(False, >0, True, False)<br><br>
○ <b>Eliminate redundant tests and infeasible tests</b><br>
(False, <0, False, False),<br>
(False, >0, True, False)<br><br>
<b>Derive test values</b><br><br>
<table>
  <tr><td>Test</td><td>Input</td><td>Expected Result</td></tr>
  <tr><td><b>T1</b> (False, <0, False, False)</td><td>sqrt(-16)</td><td>NaN</td></tr>
  <tr><td><b>T2</b> (False, >0, True, False)</td><td>sqrt(6.4)</td><td>2.5298221281347035</td></tr>
</table>

#### 8. Exponential 
<b>Interfaced-based and Functionality-based Test</b><br>
<b>Goal</b>: To find whether the value of the exponential function is correct accordingly.<br>
<b>Identify testable functions</b>: Parser<br>
<b>Identify parameters, return types, return values, and exceptional behavior:</b><br>
○ Parameters: Input, Scope<br>
○ Return type: Double<br>
○ Return value: Exponential of that value<br>
○ Exceptional behavior: -<br>
<b>Model the input domain:</b><br> 
<ins>Develop characteristics</ins> <br>
C1 = Input is empty<br>
C2 = Input type<br>
C3 = Scope is empty<br>
C4 = Input is decimal<br>
<ins>Partition characteristics</ins>
<table>
	<tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
	<tr><td>C1 = Input is empty</td><td>True</td><td>False</td><td></td></tr>
  	<tr><td>C2 = Input type<br></td><td>Positive</td><td>Negative</td><td>Zero</td></tr>
  	<tr><td>C3 = Scope is empty</td><td>True</td><td>False</td><td></td></tr>
  	<tr><td>C4 = Input is decimal</td><td>Yes</td><td>No</td><td></td></tr>
</table>
<ins>Identify(possible)values</ins>
<table>
	<tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
  <tr><td>C1 = Input is empty</td><td>""</td><td>1</td><td></td></tr>
  <tr><td>C2 = Input type<br></td><td>21</td><td>-13</td><td>0</td></tr>
  <tr><td>C3 = Scope is empty</td><td>""</td><td>BinaryOperation.EPSILON</td><td>0</td></tr>
  <tr><td>C4 = Input is decimal</td><td>33.2</td><td>10</td><td></td></tr>
</table>
<b>Combine partitions into tests</b><br>
○ <b>Assumption</b>: BCC<br>
<b>Base case: (False,Positive,False,Yes)</b><br>
○ <b>Test requirements -- the number of tests (upper bound)</b>= 1+1+2+1+1 = 6<br>
Base(False,Positive,False,Yes),<br>
(True,Positive,False,Yes),<br>
(False,Negative,False,Yes),<br>
(False,Zero,False,Yes),<br>
(False,Positive,True,Yes),<br>
(False,Positive,False,No)<br><br>
○ <b>Eliminate redundant tests and infeasible tests</b><br>
(False,Positive,False,Yes),<br>
(False,Negative,False,Yes),<br>
(False,Zero,False,Yes),<br>
(False,Positive,False,No)<br><br>
<b>Derive test values</b><br><br>
<table>
  <tr><td>Test</td><td>Input</td><td>Expected Result</td></tr>
  <tr><td><b>T1</b> (False,Positive,False,Yes)</td><td>exp(2.5)</td><td>12.182493960703473</td></tr>
  <tr><td><b>T2</b> (False,Negative,False,Yes)</td><td>exp(-3.2)</td><td>0.04076220397836621</td></tr>
  <tr><td><b>T3</b> (False,Zero,False,Yes)</td><td>exp(0)</td><td>1.0</td></tr>
  <tr><td><b>T4</b> (False,Positive,False,No)</td><td>exp(5)</td><td>148.4131591025766</td></tr>
</table>

#### 9. Logarithm 
<b>Interfaced-based and Functionality-based Test</b><br>
<b>Goal</b>: To obtain the value of the logarithmic function.<br>
<b>Identify testable functions</b>: Parser<br>
<b>Identify parameters, return types, return values, and exceptional behavior:</b><br>
○ Parameters: Input, Scope<br>
○ Return type: Double<br>
○ Return value: Logarithmic function value<br>
○ Exceptional behavior: -<br>
<b>Model the input domain:</b><br> 
<ins>Develop characteristics</ins> <br>
C1 = Input is empty<br>
C2 = Scope is empty<br>
C3 = Input type<br>
C4 = Input is decimal<br>
<ins>Partition characteristics</ins>
<table>
	<tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
	<tr><td>C1 = Input is empty</td><td>True</td><td>False</td><td></td></tr>
  	<tr><td>C2 = Scope is empty</td><td>Empty</td><td>Not empty</td><td></td></tr>
  	<tr><td>C3 = Input type</td><td>Positive</td><td>Negative</td><td>Zero</td></tr>
  	<tr><td>C4 = Input is decimal</td><td>Yes</td><td>No</td><td></td></tr>
</table>
<ins>Identify(possible)values</ins>
<table>
	<tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
  <tr><td>C1 = Input is empty</td><td>""</td><td>88</td><td></td></tr>
  <tr><td>C2 = Scope is empty</td><td>""</td><td>BinaryOperation.EPSILON</td><td></td></tr>
  <tr><td>C3 = Input type</td><td>1500</td><td>-10</td><td>0</td></tr>
  <tr><td>C4 = Input is decimal</td><td>999.99</td><td>1234</td><td></td></tr>
</table>
<b>Combine partitions into tests</b><br>
○ <b>Assumption</b>: PWC<br>
○ <b>Test requirements -- the number of tests (upper bound)</b>= 3*2=6<br>
<b>Pair</b>:<br>
	C1C2: (True, Empty) (True, Not empty) (False, Empty) (False, Not empty)<br>
	C2C3: (Empty, Positive) (Empty, Negative) (Empty, Zero) (Not empty, Positive) (Not empty, Negative) (Not empty, Zero)<br>
	C3C4: (Positive, Yes) (Positive, No) (Negative, Yes) (Negative, No) (Zero, Yes) (Zero, No)<br>
	C1C3: (True, Positive) (True, Negative) (True, Zero) (False, Positive) (False, Negative) (False, Zero)<br>
	C1C4: (True, Yes) (True, No) (False, Yes) (False, No)<br>
	C2C4: (Empty, Yes) (Empty, No) (Not empty, Yes) (Not empty, No)<br>
<b>Test requirements</b>:<br>
(True, Empty, Positive, Yes)<br>
(False, Not Empty, Negative, Yes)<br>
(False, Empty, Zero, No)<br>
(True, Not Empty, Zero, No)<br>
(True, Not Empty, Negative, No)<br>
(False, Not Empty, Positive, No)<br>
(False, Empty, Negative, No)<br>
(False, Not Empty, Zero, Yes)<br><br>
○ <b>Eliminate redundant tests and infeasible tests</b><br>
(False, Not Empty, Negative, Yes)<br>
(False, Not Empty, Positive, No)<br>
(False, Not Empty, Zero, Yes)<br><br>
<b>Derive test values</b><br><br>
<table>
  <tr><td>Test</td><td>Input</td><td>Expected Result</td></tr>
  <tr><td><b>T1</b> (False, Not Empty, Negative, Yes)</td><td>log(-19.5)</td><td>NaN</td></tr>
  <tr><td><b>T2</b> (False, Not Empty, Positive, No)</td><td>log(10400)</td><td>4.017033339298781</td></tr>
  <tr><td><b>T3</b> (False, Not Empty, Zero, Yes)</td><td>log(0.0)</td><td>-Infinity</td></tr>
</table>

#### 10. Natural Logarithm 
<b>Interfaced-based and Functionality-based Test</b><br>
<b>Goal</b>: To obtain the value of the natural logarithmic function.<br>
<b>Identify testable functions</b>: Parser<br>
<b>Identify parameters, return types, return values, and exceptional behavior:</b><br>
○ Parameters: Input, Scope<br>
○ Return type: Double<br>
○ Return value: Natural logarithmic function value<br>
○ Exceptional behavior: -<br>
<b>Model the input domain:</b><br> 
<ins>Develop characteristics</ins> <br>
C1 = Input is empty<br>
C2 = Scope is empty<br>
C3 = Input type<br>
C4 = Input is decimal<br>
<ins>Partition characteristics</ins>
<table>
	<tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
	<tr><td>C1 = Input is empty</td><td>True</td><td>False</td><td></td></tr>
  	<tr><td>C2 = Scope is empty</td><td>Empty</td><td>Not empty</td><td></td></tr>
  	<tr><td>C3 = Input type</td><td>Positive</td><td>Negative</td><td>Zero</td></tr>
  	<tr><td>C4 = Input is decimal</td><td>Yes</td><td>No</td><td></td></tr>
</table>
<ins>Identify(possible)values</ins>
<table>
	<tr><td>Characteristic</td><td>b1</td><td>b2</td><td>b3</td></tr>
  <tr><td>C1 = Input is empty</td><td>""</td><td>21</td><td></td></tr>
  <tr><td>C2 = Scope is empty</td><td>""</td><td>BinaryOperation.EPSILON</td><td></td></tr>
  <tr><td>C3 = Input type</td><td>2897</td><td>-92</td><td>0</td></tr>
  <tr><td>C4 = Input is decimal</td><td>123.45</td><td>930</td><td></td></tr>
</table>
<b>Combine partitions into tests</b><br>
○ <b>Assumption</b>: BCC<br>
<b>Base case: (False, Not empty, Positive, Yes)</b><br>
○ <b>Test requirements -- the number of tests (upper bound)</b>= 1 + (1+1+2+1) = 6<br>
Base(False, Not empty, Positive, Yes),<br>
(False, Not empty, Positive, No),<br>
(False, Not empty, Negative, Yes),<br>
(False, Not empty, Zero, Yes),<br>
(False, Empty, Positive, Yes),<br>
(True, Not empty, Positive, Yes)<br><br>
○ <b>Eliminate redundant tests and infeasible tests</b><br>
(False, Not empty, Positive, Yes),<br>
(False, Not empty, Positive, No),<br>
(False, Not empty, Negative, Yes),<br>
(False, Not empty, Zero, Yes)<br><br>
<b>Derive test values</b><br><br>
<table>
  <tr><td>Test</td><td>Input</td><td>Expected Result</td></tr>
  <tr><td><b>T1</b> (False, Not empty, Positive, Yes)</td><td>ln(2755.67)</td><td>7.921415886212478</td></tr>
  <tr><td><b>T2</b> (False, Not empty, Positive, No)</td><td>ln(404)</td><td>6.0014148779611505</td></tr>
  <tr><td><b>T3</b> (False, Not empty, Negative, Yes)</td><td>ln(-1678.33)</td><td>NaN</td></tr>
  <tr><td><b>T4</b> (False, Not empty, Zero, Yes)</td><td>ln(0.0)</td><td>-Infinity</td></tr>
</table>
