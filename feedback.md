### Code review feedback

- Re-Usability: the chosen program design does not support re-usability and violates SOLID principles, in particular
Open-Closed principle e. g. preventing adding extra sting characteristics to CountResult without using specific design patterns like Decorator or modifying class itself.
- Readability: the code lacks self-descriptive names of variables and classes, comments are absent either, depriving its readability.
- Performance: the time complexity can be assessed with loop complexity O(n) which is expected for this type of programs.
- Maintainability: the code requires documentation, testing and refactoring in order to avoid increase in technical debt. The debugging is difficult because of placing function calls in return statements better to use additional variable for this purpose.