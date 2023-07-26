#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Feature
  I want to use this feature for my login validation file

 # @tag1
 # Scenario: Login
#   Given user is on Login page
#  When user enters login credentails
 # Then should display the home page
 
 
#  @tag1
 # Scenario: Login
 #  Given user is on Login page
 #  When user enters login "tomsmith" and "SuperSecretPassword!" credentails
 #  Then should display the home page


  @tag2
  Scenario Outline: Login
   Given user is on Login page
   When user enters login "<username>" and "<password>" credentails
   Then should display the home page
   
   Examples:
   | username | password |
   | tomsmith | SuperSecretPassword! |
   | testuser1| testpassword|



  @tag3
  Scenario: Login
   Given user is on Login page
   When user enters login  credentails
    | tomsmith | SuperSecretPassword! |
   Then should display the home page

  @tag3
  Scenario: Login
   Given user is on Login page
   When user enters login  credentails
   | username | password |
   | tomsmith | SuperSecretPassword! |
   | testuser1| testpassword|
   Then should display the home page

   
   
   