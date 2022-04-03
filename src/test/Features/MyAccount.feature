Feature: My Account Module

  Background: common step
    Given click mail sign in
    When put valid email and password
    When click my account

  #15
  @baseURL
  Scenario: Manage Account
    Given click manage account
    And click print account
    And click subscription account
    And select country
    Then link subscription click


  #16
  @baseURL
  Scenario: help center Page
    Given click help center
    And your account all link click
    Then subscription management all link click


  #17
  @baseURL
  Scenario: Sign Out
    Given click sign out


    #18
  @baseURL
  Scenario: Search Data
    Given click search icon
    When put search data
    And click search button
    Then search post click

  #19
  @baseURL
  Scenario: Time 100 Page
    Given Click on menu bar
    When click time page
    Then click entertainment page