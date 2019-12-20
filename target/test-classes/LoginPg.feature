@tag
Feature: Validating the Login Page

  Background: Validating URL and LogIn
    Given User enter the URL and click LogIn

  @loginpage_sc1
  Scenario Outline: Validating login functionalities
    When User enter email_id and password "<email_id>""<password>"
    And User manually type captcha
    Then User click login button
    And User click logout button
    
    Examples: 
      | email_id            | password  |
      | chettagii@gmail.com | Himan#456 |
  
