 Feature: US_20 User management  Functionality

   Scenario: US_20 TC_01  view registered people info
     Given Navigate to medunna
     When Enter username and password and click login button
     And Admin, clicks Administirstor and clicks user management button
     When Admin, clicks view.

   Scenario: US_20 TC_02  edit existing user roles
     Given Navigate to medunna
     When Enter username and password and click login button
     And Admin, clicks Administirstor and clicks user management button
     When Admin clicks edit and changes roles from profile.