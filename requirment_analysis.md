### Requirement analysis questions

#### Story description
As a user I want to be able to add a list of strings.
I want to see the number of vowels in each of the strings that I have entered.
#### AC
1. I should see the number of vowels and consonant for each string in the order they are keyed in.
2. I should be able to add up to 4 strings at once.

### Questions and assumptions
- Q: What is the expected result if empty list is passed as input?
    - Assumption: output ```[]```
- Q: Is there any length limit of the string?
    - Assumption: string should be less than ```2 * Maximum Int (2,147,483,647)```
- Q: What is the expected result if empty string is passed in the array?
    - Assumption: ```[CountResult{word='', vowelCount=0}]```
- Q: Is there any limitations on string content, special characters, numbers etc.?
    - Assumption: ```No```
- Q: What is the expected result if more than 4 strings are passed as input?
    - Assumption: Exit code ```1``` and message ```Extra arguments passed.```
- Q: Is there any language requirements( latin, cyrillic, arabic, mandarin)?
    - Assumption: ```Latin```
- Q: How output should be formatted?
    - Assumption: ```[CountResult{word=<input string>, vowelCount=<number of vowels in the input>}]```
- Q: Should input be only in lowercase?
    - Assumption: ```Input is case insensitive```