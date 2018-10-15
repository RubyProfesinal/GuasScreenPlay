#Author: alrpena@bancolombia.com
#Keywords Summary :
#languaje: es
#Scenario: Business rule through list of steps with arguments.
Feature: Traductor de Google
  Yo como usuario quiero ingresar al traductor de google 
  a traducir palabras entre diferentes idiomas

  @Guia3
  Scenario: Taducir del Ingles al Espanol
    Given El usuario quiere usar el traductor de google
    When traduce la palabra table de Ingles a Espanol
    Then El deberia ver la palabra mesa en la pantalla
    

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
