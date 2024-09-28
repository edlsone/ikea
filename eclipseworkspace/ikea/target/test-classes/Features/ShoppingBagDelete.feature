Feature: Shopping Bag Delete Item
  I want to delete an item from the shopping bag and  verify it has been deleted

  Scenario: Delete item from bag
    Given I  added an item to the shopping bag
    When I delete the item from the shopping bag
    Then I verify the item is removed from the shopping bag
