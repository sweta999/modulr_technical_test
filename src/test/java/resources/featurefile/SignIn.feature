Feature: Login Test
  As a Modulr customer User want to sign in into Modulr Customer Portal to manange Modulr accounts

  Background: Modulr customers need to be able to login securely to our customer portal in order to take various actions
  against their Modulr accounts such as create payments, create and manage rules etc.
  Customer must be able to provide a username and password.
  The password must meet a standard that ensures it is not easily found out and we must manage incorrect passwords correctly
  so the customer is aware but the error must not give away too much detail.
  For example: telling the user specifically the password is incorrect or the username is incorrect as this could aid users with malicious intent.

#  //Test case : 1
  Scenario: Verfiy the error message if password field is empty
    Given User is on sign in page
    When  User enter username "Sweta.Jani2"
    And   User left password field empty ""
    And   User click on sign in button
    Then  User should see the field empty error message "This field is required"

#    //Test case : 1
  Scenario: Verfiy the error message if username field is empty
    Given User is on sign in page
    When  User left username field empty ""
    And   User enter password "Swetajani2021@"
    And   User click on sign in button
    Then  User should see the field empty error message "This field is required"

#  Scenario Outline: Verfiy the error message if username or password field is empty
#    Given User is on Modulr sign in page
#    When  User enter username "<username>"
#    And   User enter password "<password>"
#    And   User click on sign in button
#    Then  User should see the error message "<errormessage>"
#    Examples:
#      | username    | password       | errormessage           |
#      | Sweta.Jani2 |                | This field is required |
#      |             | Swetajani2021@ | This field is required |


#  // Test case : 2
  Scenario: Verfiy the error message with invalid credentials
    Given User is on sign in page
    When  User enter valid username "Sweta.Jani2"
    And   User enter invalid password "Swetajani2021@///"
    And   User click on sign in button
    Then  User should see the error message "The username or password is incorrect. Multiple incorrect sign-ins could result in your access being locked. If this does happen, you'll receive an email explaining how to reset your access."

#    // Test case : 2
  Scenario: Verfiy the error message with invalid credentials
    Given User is on sign in page
    When  User enter invalid username "Sweta.Jani2///"
    And   User enter valid password "Swetajani2021@"
    And   User click on sign in button
    Then  User should see the error message "The username or password is incorrect. Multiple incorrect sign-ins could result in your access being locked. If this does happen, you'll receive an email explaining how to reset your access."

#    // Test case : 3
  Scenario: User should login successfully with valid credentials
    Given User is on sign in page
    When  User enter valid username "Sweta.Jani2"
    And   User enter valid password "Swetajani2021@"
    And   User click on sign in button
    Then  User should sign in successfully to the account overview page

#    // Test case : 4   I don't know how to disable (sign in) button.
#  Scenario: Login button should be disabled to prevent duplicate request
#    Given I am on sign in page
#    When  I enter valid username "Sweta.Jani2"
#    And I enter valid password "Swetajani2021@"
#    And I click on sign in button

#  // Test case : 5
  Scenario: Verify User should navigate to Reset Access page to send request to reset password email
    Given User is on sign in page
    When  User enter valid username "Sweta.Jani2"
    And   User click on Fogotten password button
    Then  User should navigate to Reset access page


