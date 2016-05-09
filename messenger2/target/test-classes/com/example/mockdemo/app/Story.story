Scenario: message is sent
Given servers address by <server>
And message by <message>
When message can be send
And messenger sends message
Then the result should be equal <result>

Examples:
|server|message|result|
|inf.ug.edu.pl|some message|0|

Scenario:
Given servers address by <server>
And good connection
When connection is tested
Then result should equal <result>

Examples:
|server|result|
|inf.ug.edu.pl|0|
