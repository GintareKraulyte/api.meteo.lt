Feature: Login

  @Ready
  Scenario: Heading
    Given I select "chrome"
    When header is visible
    Then heading is visible

  Scenario Outline: Test places
    Given I select "chrome"
    When I scroll to "<Element>" element
    Then I see places description
    Examples:
      | Element |
      | child(14) |

  Scenario Outline: Test places-code
    Given I select "chrome"
    When I scroll to "<Element>" element
    Then I see place-code description
  Examples:
    | Element |
    | child(21) |

  Scenario Outline: Test forecasts
    Given I select "chrome"
    When I scroll to "<Element>" element
    Then I see forecasts description
    Examples:
      | Element |
      | child(29) |

  Scenario Outline: Test forecast-type
    Given I select "chrome"
    When I scroll to "<Element>" element
    Then I see forecast-type description
    Examples:
      | Element |
      | child(37)  |

