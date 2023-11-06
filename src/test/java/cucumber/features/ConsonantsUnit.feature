Feature: Consonants count unit tests
    I want to see the number of Consonants in the strings that I have entered.

    Scenario: Successful program execution lowercase arguments
      Given I have a VowelCounter over "lowercase"
      When I call getConsonantsCount
      Then the output result should be 5

    Scenario: Successful program execution uppercase arguments
      Given I have a VowelCounter over "UPPERCASE"
      When I call getConsonantsCount
      Then the output result should be 5

    
     Scenario: Successful program execution for special chars argument
      Given I have a VowelCounter over "o!@#$&(_+^%$!)ne"
      When I call getConsonantsCount
      Then the output result should be 1

    Scenario: Successful program execution empty string
      Given I have a VowelCounter over ""
      When I call getConsonantsCount
      Then the output result should be 0