Feature: DataTable ve Senario Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline:itemCategory Create and Delete

    And Click on the Element in LeftNav
      | Inventory    |
      | Setup        |
      | itemCategories |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name> |

    And Click on the Element in Dialog
      | UserType   |
      | <selections>|
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name     | | selections |
      | fuN1K111 | | teacher    |
      | fuN1K211 | | Administrator |
      | fuN1K311 | | Student |
      | fuN1K411 | | Everyone |
      | fuN1K511 | | EmployeeRole |