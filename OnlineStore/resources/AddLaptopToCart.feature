Feature: CartTest

Scenario Outline: User search laptop and add to cart
Given user in home page
When user search for "<Laptop>"
And add first product to cart
And move to cart by clicking on cart icon
Examples:
	|Laptop|
	|Apple laptop|
	|Dell laptop|

