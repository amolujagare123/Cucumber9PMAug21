Feature:  Another login scenarios

  @login
  Scenario: to test the functionality of login button for valid inputs on stock page
    Given login page should be opened
    When we enter "admin" and "admin123"
    And we click on login button
    Then we redirect to home page

  @login
  Scenario: to test the functionality of login button for invalid inputs on stock page
    Given login page should be opened
    #When we enter invalid username and valid password
    When we enter "xyz" and "xyz"
    And we click on login button
    Then we should get error

  @login
  Scenario: to test the functionality of login button for blank inputs on stock page
    Given login page should be opened
    When we enter "" and ""
    And we click on login button
    Then we should get another error


    @userReg
    Scenario: to test the functionality of submit button
      Given Add User page should be opened
      When  I enter below Data
      |amol| amol@gmail.com |7878787 |pune |
      And I click on submit button
      Then data should be addded


      @UserInfo
      Scenario Outline: to test the user info page
        Given I am on user info addition page
        When I enter <name> , <phone> , <email>
        And click on save
        Then user should be added
        Examples:
          | name | phone   | email |
          | Amol | 3232323 | amol@gmail.com |
          | Omkar |15454 | omkar@gmail.com |
          | Hemangi | 76767 | hemangi@gmail.com |
          | John | 12568 | john@gmail.com |
          | Chetan | 97656 | chetan@gmail.com |
          | Avinash | 123566 | avinash@gmail.com |