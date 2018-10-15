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
    When traduce la palabra hello de Ingles a Espanol
    Then El deberia ver la palabra Hola en la pantalla
    

  @Dinamico
  Scenario Outline: Taducir del Ingles al Espanol
    Given El usuario quiere usar el traductor de google
    When traduce la palabra <value> de Ingles a Espanol
    Then El deberia ver la palabra <status> en la pantalla

    Examples: 
       | value | status|
       |Hello  | Hola  |
       |Table  | Mesa |
