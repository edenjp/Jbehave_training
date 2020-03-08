Narrative:
As a user
I want to make a matematic operation
So that I can get the result of two members

Scenario: adition
Given a calculator class with the operation sign as <sign>
When I give the first number as <number1>
And I give the second number as <number2>
Then I should get the result as <result>

Examples:
|sign|number1|number2|result|
|+   |3      |9      |12    |
|+   |4      |9      |13    |


Scenario: subtraction
Given a calculator class with the operation sign as <sign>
When I give the first number as <number1>
And I give the second number as <number2>
Then I should get the result as <result>

Examples:
|sign|number1|number2|result|
|-   |13     |9      |4     |


Scenario: multiplication
Given a calculator class with the operation sign as <sign>
When I give the first number as <number1>
And I give the second number as <number2>
Then I should get the result as <result>

Examples:
|sign|number1|number2|result|
|*   |3      |9      |27    |

Scenario: division
Given a calculator class with the operation sign as <sign>
When I give the first number as <number1>
And I give the second number as <number2>
Then I should get the result as <result>

Examples:
|sign|number1|number2|result|
|/   |8      |2      |4     |