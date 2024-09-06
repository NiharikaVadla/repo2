Feature: Test for Google application


  Scenario: Test for google title
    Given Open the Google application
    When User capturescurrent page title
    Then Title should match
