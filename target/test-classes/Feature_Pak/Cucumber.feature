Feature:Validating the log in functionality
@Tc1
Scenario Outline:Validating with valid credentials
Given user launches the url and user is on the home page
And user clicking the sign in link
When user entering the valid"<Email_ID>" and valid "<Password>"
And user clicking the sign in button
When user is on the home page take screenshot
Then user should be able to logout of the page
Examples:
  |Email_ID                       |Password    |
  |mailformanojkaarthick@gmail.com|Manoj@638003|


    