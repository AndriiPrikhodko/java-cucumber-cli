Feature: Vowels count program
    As a user I want to be able to add a list of strings.
    I want to see the number of vowels in each of the strings that I have entered.

    Scenario: Successful program can be launched
        Given I have a compiled Jar program

    Scenario: Successful program execution lowercase arguments
        Given I have a compiled Jar program
        When I run the program with arguments "test lowercase"
        Then the program should exit with code 0
        And the program output should contain "[CountResult{word='test', vowelCount=1, consonantsCount=3}, CountResult{word='lowercase', vowelCount=4, consonantsCount=5}]"
    
    Scenario: Successful program execution uppercase arguments
        Given I have a compiled Jar program
        When I run the program with arguments "TEST UPPERCASE"
        Then the program should exit with code 0
        And the program output should contain "[CountResult{word='TEST', vowelCount=1, consonantsCount=3}, CountResult{word='UPPERCASE', vowelCount=4, consonantsCount=5}]"

    Scenario: Failure program execution more than 4 arguments
        Given I have a compiled Jar program
        When I run the program with arguments "test more than four strings"
        Then the program should exit with code 1
         And the program output should contain "Extra arguments passed."

    Scenario: Successful program execution for maximum of 4 arguments
        Given I have a compiled Jar program
        When I run the program with arguments "one two three four"
        Then the program should exit with code 1
        And the program output should contain "[CountResult{word='one', vowelCount=2, consonantsCount=1}, CountResult{word='two', vowelCount=1, consonantsCount=2}, CountResult{word='three', vowelCount=2, consonantsCount=3}, CountResult{word='four', vowelCount=2, consonantsCount=2}]"
    
    Scenario: Successful program execution empty string
        Given I have a compiled Jar program
        When I run the program with arguments ""
        Then the program should exit with code 0
        And the program output should contain "[CountResult{word='', vowelCount=0, consonantsCount=0}]"