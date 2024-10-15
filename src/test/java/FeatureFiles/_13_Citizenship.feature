Feature: DataTable ve Senario Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline:  CitizenShip Create and Delete

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name>  |
      | shortName | <short> |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name    |  | short |
      | fuN1K111 |  | fuN1K111  |
      | fuN1K211 |  | fuN1K211  |
      | fuN1K311 |  | fuN1K311  |
      | fuN1K411 |  | fuN1K411  |