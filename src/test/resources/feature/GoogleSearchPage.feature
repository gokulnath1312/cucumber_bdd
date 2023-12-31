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
Feature: Google Page Search
  I want to use this template for my feature file
  
 Background: Launch App
Given User launch the google page

  @google @java
  Scenario: Search Java Tutorial
    
    When User search for Java tutorial
    Then Should display Java result page
    
    @google @selenium
    Scenario: Search Selenium Tutorial
   
    When User search for Selenium tutorial
    Then Should display Selnium result page
