# Automated Web Testing using Selenium
## By Gemini-2
### Website: https://www.javatpoint.com/
We choose this website because this website is very helpful for everyone. It helps provide a clear explaination with a good examples.

#### Test Cases:

##### 1. Click Button Function
&emsp;&emsp;a. This test case checks the button ‘Java’ by using the found element and clicking the button.<br> 
&emsp;&emsp;b. The steps performed are:<br>
&emsp;&emsp;&emsp;1. Launch Chrome and direct it to the baseUrl.<br>
&emsp;&emsp;&emsp;2. Find the linked text element called ‘Java’<br>
&emsp;&emsp;&emsp;3. Click the button ‘Java’<br>
&emsp;&emsp;c. The expected output from this function is the website will be able to click the button ‘Java’. <br> 

##### 2. Scroll Down Function
&emsp;&emsp;a. This test case checks the vertical scrolling bar of the website by using the function scrollBy and entering the valid input pixel.<br> 
&emsp;&emsp;b. The steps performed are:<br>
&emsp;&emsp;&emsp;1. Launch Chrome and direct it to the baseUrl.<br>
&emsp;&emsp;&emsp;2. Execute the script, scrollBy(0,3000), which scrolls the window down vertically by 3000 pixels.<br>
&emsp;&emsp;c. The expected output is the 3000-pixel scrolled down the window. 

##### 3. Redirecting to Youtube Function
&emsp;&emsp;a. This test case checks the ‘redirect to Javatpoint YouTube subscription confirmation’ function by finding the link text element.<br> 
&emsp;&emsp;b. The steps performed are:<br>
&emsp;&emsp;&emsp;1. Launch Chrome and direct it to the baseUrl.<br>
&emsp;&emsp;&emsp;2. Find the link text element named ‘Join Now’ and click it.<br>
&emsp;&emsp;c. The expected output is the redirect to the Javatpoint YouTube page subscription confirmation pop-up. <br> 

##### 4. Search Box Function
&emsp;&emsp;a. This test case checks the search box of the website by sending inputs and clicks search.<br> 
&emsp;&emsp;b. The steps performed are:<br>
&emsp;&emsp;&emsp;1. Launch Chrome and direct it to the baseUrl.<br>
&emsp;&emsp;&emsp;2. Find the element id called ‘gsc-i-id1’.<br>
&emsp;&emsp;&emsp;3. Send the key ‘Java’.<br>
&emsp;&emsp;&emsp;4. Find the button called ‘gsc-search-button’.<br>
&emsp;&emsp;&emsp;5. Click the button.<br>
&emsp;&emsp;c. The expected output is that the website will be able to retrieve the key and redirect to where the search key leads it to be.<br> 

##### 5. Click Card Function
&emsp;&emsp;a. This test case checks the click card function by using findElement.<br> 
&emsp;&emsp;b. The steps performed are:<br>
&emsp;&emsp;&emsp;1. Launch Chrome and direct it to the baseUrl.<br>
&emsp;&emsp;&emsp;2. Find the element by xpath ‘ https://www.javatpoint.com/apache-solr' and click it.<br>
&emsp;&emsp;c. The expected output is the website is directed to a webpage of the specified link.<br> 

##### 6. Go to Previous Page and the Next Page Function
&emsp;&emsp;a. This test case checks the previous page and the next page button by clicking the button.<br> 
&emsp;&emsp;b. The steps performed are:<br>
&emsp;&emsp;&emsp;1. Launch Chrome and direct it to the baseUrl.<br>
&emsp;&emsp;&emsp;2. Find the linked text element called ‘Core Java’.<br>
&emsp;&emsp;&emsp;3. Find the linked text element called ‘next → ‘.<br>
&emsp;&emsp;&emsp;4. Find the linked text element called ‘<- previous’.<br>
&emsp;&emsp;c. The expected output is the website will be able to redirect to the next page and able to redirect to the previous page as well.<br>

##### 7. Go to the Top of the Website Function
&emsp;&emsp;a. This test case checks the ‘go to top’ of the page function by using the scrollBy function and clinking the go to top button.<br> 
&emsp;&emsp;b. The steps performed are:<br>
&emsp;&emsp;&emsp;1. Launch Chrome and direct it to the baseUrl.<br>
&emsp;&emsp;&emsp;2. Scroll the window down for 15000 pixels using the scrollBy function.<br>
&emsp;&emsp;&emsp;3. Click the button by finding an element with ‘myBtn’ id.<br>
&emsp;&emsp;c. The expected output is the window will be scrolled down then scrolled up to the top again.<br>

##### 8. Get the Title Function
&emsp;&emsp;a. This test case checks the page title using getTitle function.<br> 
&emsp;&emsp;b. The steps performed are:<br>
&emsp;&emsp;&emsp;1. Launch Chrome and direct it to the baseUrl.<br>
&emsp;&emsp;&emsp;2. Get the page title using the function getTitle.<br>
&emsp;&emsp;c. The expected output is the title of the page.<br>

##### 9. Invalid Subscribe Function
emsp;&emsp;a. This test case checks the subscribe function by entering an invalid email input.<br> 
&emsp;&emsp;b. The steps performed are:<br>
&emsp;&emsp;&emsp;1. Launch Chrome and direct it to the baseUrl.<br>
&emsp;&emsp;&emsp;2. Find a web element named email.<br>
&emsp;&emsp;&emsp;3. Input an invalid email address, ‘example’ in the sendKeys function.<br>
&emsp;&emsp;c. The expected output is unsuccessful subscription due to invalid email.<br>

##### 10. Valid Subscribe Function
&emsp;&emsp;a. This test case checks the subscribe function by entering a valid email input.<br> 
&emsp;&emsp;b. The steps performed are:<br>
&emsp;&emsp;&emsp;1. Launch Chrome and direct it to the baseUrl.<br>
&emsp;&emsp;&emsp;2. Find a web element named email.<br>
&emsp;&emsp;&emsp;3. Input a valid email address, ‘examples@gmail.com’ in the sendKeys function.<br>
&emsp;&emsp;c. The expected output is the confirmation text.<br>

##### 11. Get Tag H1 Function
&emsp;&emsp;a. This test case checks the get H1 tag function by finding the element with tag H1.<br> 
&emsp;&emsp;b. The steps performed are:<br>
&emsp;&emsp;&emsp;1. Launch Chrome and direct it to the baseUrl.<br>
&emsp;&emsp;&emsp;2. Find a link text element named ‘Java’ and click it.<br>
&emsp;&emsp;&emsp;3. Find an element with tag H1.<br>
&emsp;&emsp;c. The expected output is the text with H1 tag in the log message.<br>
