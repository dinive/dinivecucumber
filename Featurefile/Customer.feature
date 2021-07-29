Feature: Customers

Scenario: Add a new Customer


Given User launch Chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And User enters Email as "admin@yourstore.com" and Password as "admin"
And Click on Login
Then Customer can view Dashboard
When User clicks on customer Menu
And click on customer menu dropdown
And click on add new button
Then user can view add new customer page
When user enter customer info
And click on save button
Then user can view "The new customer has been added successfully"
And close browser