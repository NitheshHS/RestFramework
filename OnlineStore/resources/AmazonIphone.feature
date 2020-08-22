Feature: view and get mobile price
@SmokeTest
Scenario Outline: Add differnt company phone to cart 
Given User in Amazon Home page
When user search for "<Mobile>"
And add first product to cart
And click on cart and get product price
Examples:
	|Mobile|
	|Iphone|
	|Redmi|

