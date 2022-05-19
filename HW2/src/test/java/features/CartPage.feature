Feature: Cart Page

  Scenario:Category selection on the home page
    Given Open Website of LCW
    When Select baby category
    When Select Subcategory of baby
    When The first product is added to the favourite.
    When Go to the favorite page
    Then checked that the favorite product is on the page.