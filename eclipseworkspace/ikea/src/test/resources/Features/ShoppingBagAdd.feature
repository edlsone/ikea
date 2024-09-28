Feature: Shopping Bag Add Item
  I want to add an item to the shopping bag and  verify it has been added

  Scenario: Add item to bag
    Given I have added an item to the shopping bag
    When I navigate to the shopping bag
    Then I verify that the item has been added to the shopping bag


