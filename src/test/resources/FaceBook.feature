Feature: To validate the login Functionality of the application
@Sanity
  Scenario: To validate the Login of FB webpage with valid email and invalid password
    Given To launch the Browser
    When To launch the URL
    And To pass the Valid email id to email text box
    And To pass the invalid pin to pass the password text box
    And To click the Login button
    Then To close the brower
@Sanity
  Scenario Outline: to Validate the login function of FB with Valid email id & Invalid Password
    Given to Launch the Browser
    When to Launch the Url
    And to Validate the "<Email>"email text box
    And to Validate the "<Password>"Password text box
    And to Click the Login button
    Then to close the browser

    Examples: 
      | Email         | Password     |
      | Sai@1234      | Lumi@34      |
      | Husain@345    | Hus@mech     |
      | Karthick@7894 | lum@453      |
      | Nafess@123    | jack@908     |
      | Greens@234    | jackuvar@786 |
