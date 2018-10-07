Web service validation stories

Narrative:
In order to validate response from https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false URI
As a developer, QA
I want to validate Name , CanReList and promotion name and description

Scenario: Validate  Name , CanReList and promotion name and description

Given URL : https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false
When Send Request
Then Validate Name : Carbon credits
And Validate CanReList : true
And validate Promotion Name : Gallery and Description : 2x larger image



