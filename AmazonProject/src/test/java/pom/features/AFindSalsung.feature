Feature: Shop samsung TV

  Scenario:  Verification of  Samsung TV
    
    
    Given open Amazon page
    When Click on the hamburger menu
    And Click on the TV, Appliances and Electronics link under Shop by Department section
    When click on Televisions under Tv, Audio & Cameras sub section
    And check 'samsung' under Brands
    And Sort the Samsung results with price High to Low
    Then Click on the second highest priced item
    And Switch the Window
    Then Assert that “About this item” section is present
   
