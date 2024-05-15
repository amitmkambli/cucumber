Feature: Contact Us Feature

  Scenario Outline: Contact us fields submit data using excel
    Given user navigates to contact us
    When user fill form from given sheetname "<SheetName>" and rownumber <RowNumber>
    And use clicks on send button
    Then it shows a sucessfull message "Success! Your details have been submitted successfully."

    Examples: 
      | SheetName | RowNumber |
      | contactus |         0 |
      | contactus |         1 |
