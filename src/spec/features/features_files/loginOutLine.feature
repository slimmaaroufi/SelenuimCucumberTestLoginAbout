@loginOutline
Feature: Je souhaite me connecter a l application avec plusieurs comptes

  Scenario Outline: Je souhaite me connecter a l application avec plusieurs comptes
    Given Je me connecte a l application Swag Labs
    When Je saisi le username "<username>"
    When Je saisi le password "<password>"
    And Je clique sur le bouton login
		Then Le message d erreur s affiche "<status>"


          Examples: 
      | username  | password | status  |
      | standard_user |     test | Epic sadface: Username and password do not match any user in this service |
      | namlocked_out_usere2 |     test | Epic sadface: Username and password do not match any user in this service |