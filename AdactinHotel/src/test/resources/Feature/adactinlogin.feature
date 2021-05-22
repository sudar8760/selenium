Feature: verify Adactin Details
  Scenario: Verify Adactin login with valid credentials
    Given user should be in adactin page
    When user should enter "<username>" and "<password>"
    And user should click login
    And user should enter the values in "<Location>""<Hotels>""<Room Type>""<Number of Rooms>""<Check In Date>""<Check Out Date>""<Adults per Room>"and"<Children per Room>"
   And click search button
    Then Verify the message
    
    Examples:
|username|password|Location|Hotels |Room Type |Number of Rooms|Check In Date|Check Out Date|
|karthi007|Karthi@1989|Sydney|Hotel Hervey|Double|2 - Two|10/05/2021|13/05/2021|

