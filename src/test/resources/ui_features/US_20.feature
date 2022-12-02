 Feature: US_20 User management  Functionality

   Background:
     Given Navigate to medunna
     When  username "Team02" and password "team02@12345" and click login button
     And Admin, clicks Administirstor and clicks user management button
   @US19_20_21
   Scenario: US_20 TC_01  view registered people info
     When Admin, clicks view.

   @US19_20_21
   Scenario: US_20 TC_02  edit existing user roles
     When Admin clicks edit and changes roles from profile.


     Scenario: US_20 TC_03 delete users
       When Then Admin can deleted users