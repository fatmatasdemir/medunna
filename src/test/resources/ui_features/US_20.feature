 Feature: US_20 User management  Functionality

   Background:
     Given Navigate to medunna
     When  username and password and click login button
     And Admin, clicks Administirstor and clicks user management button

   Scenario: US_20 TC_01  view registered people info

     When Admin, clicks view.

   Scenario: US_20 TC_02  edit existing user roles

     When Admin clicks edit and changes roles from profile.