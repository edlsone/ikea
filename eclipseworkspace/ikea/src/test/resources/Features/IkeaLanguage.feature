
Feature: Test IKEA home page language
	I want to verify that the home page is working in different languages
  
  Scenario Outline: Verify that IKEA home page URL for "<url>" language is "<language>"
    Given Browser is open
    When I naviagate to url "<url>" 
    Then  I verify that the IKEA home page language "<language>" is correct

    Examples: 
      | url  | language |
      | https://www.ikea.com/us/en/ |     EN |
      | https://www.ikea.com/us/es/ |     ES |
	
