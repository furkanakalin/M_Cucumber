Feature: DataTable ve Senario Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline:Exam Create and Delete

    And Click on the Element in LeftNav
      | EntranceExam  |
      | esetup        |
      | entranceexams |

    And Click on the Element in Dialog
      | addButton      |

    And User sending the keys in Dialog
      | nameInput |  | <name> |

    And Click on the Element in Dialog
      | academicperiod |
      | internship     |
      | gradelevel     |
      | <selections>   |
      | Save           |

    Then Success message should be displayed

    And User delete the element from dialog
      | <name> |

    Examples:
      | name     |  | selections |
      | fuak1907 |  | luciano    |
      | fuak1908 |  | golff      |
      | fuak1909 |  | valentine  |
      | fuak1910 |  | carman     |

    Then Success message should be displayed