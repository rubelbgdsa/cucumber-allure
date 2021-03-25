Feature: Verify Search Car in Craigslist
				So that i can the Car List
  
Scenario: Search Car
   
Given I am in the Craigslist login Page
When I Write Car in Search Box and hit Enter
Then I can see Car list
And I can check Camry Price