
Feature: Login

Scenario: Successfully login with valid credentials
			Given User lunch chrome browser
			When User enter the URL as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
			And User enter the username as "admin@yourstore.com" and password as "admin"
			When User click on login button
			Then Verify the Page title should be "Dashboard / nopCommerce administration"
			When User click on logout button
			Then Verify the Page title should be "Your store. Login"
			And Close the browser

