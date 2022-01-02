Feature: RedBus Page


Scenario: TC_BusSearch
Given enter start place
And enter destination
And enter date
And click search
And click after 6 pm
And click bus type as sleeper
And click seats available
And get the number of seats available
When click on view seats
Then take screenshot of page