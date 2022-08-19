Feature: Bill pay Func
  Background:
    Given Navigate to parabank
    When enter username password
    Then User should login successfuliy
    And BillPay Click

    Scenario Outline: Bilpayy
      When user send payeename as "<payeeName>" amount as "<amount>" payeeAddress as "<payeeAddress>" payeeZip as "<payeeZip>"
      And fill in other billing information
      And Send Payöemt Button
      Then verify invoice has been paid
      Examples:
        | payeeName | amount | payeeAddress | payeeZip |
        | Elektrik  | 85     | karaman mh   | 16130    |
        | Su        | 45     | besevler mh  | 16200    |
        | Dogalgaz  | 120    | ataevler mh  | 16450    |