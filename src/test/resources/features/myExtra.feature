#Author: alrpena@bancolombia.com.co


Feature: Aprendiendo a automatizar en MyExtra
  @CasoExitoso
  Scenario: Ingresar a MyExtra
    Given Ique Rafa desea realizar consultan en AS400, Rafa abre MyExtra
    When el ingresa sus credenciales 
    And navega en un menu
    Then verifica que inicio sesion correctamente
 

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
