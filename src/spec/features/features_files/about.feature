@about
Feature: Je souhaite tester la fonctionnalite de about de l application Swag labs
 ETQ utilisateur je souhaite tester la fonctionnalite de about de l application Swag Labs


  @aboutCasPassant
  Scenario: Je souhaite tester la fonctionnalite de about avec un cas passant
  	Given Je me connecte a l application Swag Labs
    When Je clique sur le burguer menu button
    And Je clique sur le bouton About
    Then Je me redirige vers la page About
