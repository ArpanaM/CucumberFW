Feature:Login Action
Scenario: On successful Login display a message as Login Successful for valid inputs
Given user is on home page
When user enters username 
And user enters password
And clicks on Submit button
Then validate User and display a message as Successful
And Close 