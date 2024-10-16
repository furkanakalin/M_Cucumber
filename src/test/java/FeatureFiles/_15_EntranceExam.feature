Feature: DataTable ve Senario Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Exam Create and Delete

    And Click on the Element in LeftNav
      | EntranceExams |
      | esetup        |
      | entranceexams |

    And Click on the Element in Dialog
      | addButton |


    And User sending the keys in Dialog
      | nameInput | <name> |

    And Click on the Element in Dialog
      | academicperiod |
      | internship     |
      | gradelevel     |
      | <selections>   |
      | Save           |

    Then Success message should be displayed

    And Click on the Element in Dialog
      | backbutton |

    And User sending the keys in Dialog
      | SearchInput | <name> |

    And Click on the Element in Dialog
      | searchButton |
      | deleteButton |
      | accandDelButton |

    Then Success message should be displayed

    Examples:
      | name     |  | selections |
      | fuak1957 |  | luciano    |
      | fuak1958 |  | golff      |
      | fuak1959 |  | valentine  |
      | fuak1960 |  | carman     |