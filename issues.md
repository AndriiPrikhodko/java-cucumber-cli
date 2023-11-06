### Issues found

1. According to the report from cucumber program is case sensitive and number of vowels in the string is not calculated correctly. (AC1)

Steps:
    Launch the program passing uppercase word as an argument e. g. ```TEST```

Expected result: ```[CountResult{word='TEST', vowelCount=1, consonantsCount=3}]```
Actual result: ```[CountResult{word='TEST', vowelCount=0, consonantsCount=3}]```

2. According to the cucumber report program does not accept 4 words as an input and returns an error. (AC2)

Steps:
    Launch program with input ```one two three four```

Expected result: ```"[CountResult{word='one', vowelCount=2, consonantsCount=1}, CountResult{word='two', vowelCount=1, consonantsCount=2}, CountResult{word='three', vowelCount=2, consonantsCount=3}, CountResult{word='four', vowelCount=2, consonantsCount=2}]"```
Actual result: ```Extra arguments passed.```
