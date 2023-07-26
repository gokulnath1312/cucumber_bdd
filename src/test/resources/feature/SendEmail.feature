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
Feature: Send Email
  I want to validate email

@tag1
Scenario Outline: send email to user
   Given user must launch the application
   When user should send email to register
   """
   Hello <user>
   
   Welcome to our community !...
   
   click on the below link for registration...
   
   """
      Examples:
   |user|
   |John|
   |test|
