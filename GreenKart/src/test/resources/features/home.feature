Feature:Search functionality on home page 
 
 Background:
 Given User is opened the application
 And the user is on home screen
  
 Scenario:Seach product successfully with valid keyword

 When User enters product name "B" on search box
 Then relevant search result should be displayed
 And result shows items that contains letter "B"
 
 Scenario: Unsuccessful search when user enters invalid keyword
 When User enters product name as "xyz" in the search box.
 Then a message "Sorry, no products matched your search!" should displayed
 
 