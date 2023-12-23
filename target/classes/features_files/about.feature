@about
Feature: Je souhaite tester la fonctionnalite de about de l application Swag labs
 ETQ utilisateur je souhaite tester la fonctionnalite de about de l application Swag Labs

  Background: 
    Given Je me connecte a l application Swag Labs
    And Je clique sur le burguer menu button
  @aboutCasPassant
  Scenario: Je souhaite tester la fonctionnalite de about avec un cas passant
    And Je clique sur le bouton About
    Then Je me redirige vers la page About
