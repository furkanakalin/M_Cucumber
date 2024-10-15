Feature: Cities Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create and Delete Cities

    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | Cities     |

    And Click on the Element in Dialog
      | addButtons |
      | countrySelect |
      | countryOption |

    And User sending the keys in Dialog
      | nameInput | ismetcity1 |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | ismetcity1 |

    Then Success message should be displayed