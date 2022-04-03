Feature: Section Module

  #2
  @worldPage
  Scenario: Subscribe To Time
    Given Click on menu bar
    When Click on world
    And Post Click
    And Click on subscribe time
    And Click on select in digital
    Then Type Email
    Then Type Password

  #3
  @businessPage
  Scenario: Contact us at
    Given Click on menu bar
    When Click on Business


  #4
  @sciencePage
  Scenario: Share this story
    Given Click on menu bar
    When  Click on Science
    And Click Any Science Page Post
    Then Click Social Medias icon



