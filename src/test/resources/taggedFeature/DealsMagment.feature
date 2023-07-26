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
@FeatureDeal
Feature: Deal Management

@SmokeTest @RegressionTest
  Scenario: Create a Deal
    Given User is logged in
    When User create a Deal

@RegressionTest
  Scenario: Update a Deal
    Given User is logged in
    When User update a Deal

@SmokeTest
  Scenario: Delete a Deal
    Given User is logged in
    When User delete a Deal.
