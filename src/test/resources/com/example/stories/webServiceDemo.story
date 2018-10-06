

Scenario: create your first scenario

Given URL : https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false
When Send Request
Then Validate Name : Carbon credits
And Validate CanReList : true
And validate Promotion Name : Gallery and Description : 2x larger image



