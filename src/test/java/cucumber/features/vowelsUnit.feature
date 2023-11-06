Feature: Vowels count unit tests
    As a user I want to be able to add a list of strings.
    I want to see the number of vowels in each of the strings that I have entered.

    Scenario: Successful program execution lowercase arguments
      Given I have a VowelCounter
      When I passed arguments to getVowelListWithCount "test lowercase"
      Then the output result should be "[CountResult{word='test', vowelCount=1}, CountResult{word='lowercase', vowelCount=4}]"
    
    Scenario: Successful program execution uppercase arguments
      Given I have a VowelCounter
      When I passed arguments to getVowelListWithCount "TEST UPPERCASE"
      Then the output result should be "[CountResult{word='TEST', vowelCount=1}, CountResult{word='UPPERCASE', vowelCount=4}]"

    Scenario: Failure program execution more than 4 arguments
      Given I have a VowelCounter
      When I passed arguments to getVowelListWithCount "test more than four strings"
      Then the output result is null

    Scenario: Successful program execution for maximum of 4 arguments
      Given I have a VowelCounter
      When I passed arguments to getVowelListWithCount "one two three four"
      Then the output result should be "[CountResult{word='one', vowelCount=2}, CountResult{word='two', vowelCount=1}, CountResult{word='three', vowelCount=2}, CountResult{word='four', vowelCount=2}]"
    
     Scenario: Successful program execution for 1 argument
      Given I have a VowelCounter
      When I passed arguments to getVowelListWithCount "o!@#$&(_+^%$!)ne"
      Then the output result should be "[CountResult{word='o!@#$&(_+^%$!)ne', vowelCount=2}]"

    Scenario: Successful program execution empty string
      Given I have a VowelCounter
      When I passed arguments to getVowelListWithCount ""
      Then the output result should be "[CountResult{word='', vowelCount=0}]"   