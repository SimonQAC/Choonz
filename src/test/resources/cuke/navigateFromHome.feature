Feature: Can I navigate to other pages from the HomePage?

  Scenario: Access the Playlist page
    Given I am on the HomePage
    When I click the Playlist tab
    Then I will land on the Playlist Page
	
	Scenario: Access the Artist page
	  Given I am on the HomePage
    When I click the Artist tab
    Then I will land on the Artist Page
    
  Scenario: Access the Album page
	  Given I am on the HomePage
    When I click the Album tab
    Then I will land on the Album Page
    
  Scenario: Access the Genre page
	  Given I am on the HomePage
    When I click the Genre tab
    Then I will land on the Genre Page

  Scenario: Access the Track page
	  Given I am on the HomePage
    When I click the Track tab
    Then I will land on the Track Page
    
    
    