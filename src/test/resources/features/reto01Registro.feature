#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: TRegistro en sitio web
  Yo como usuarioquiero registrarme en el sitio web Aitomation Demo Site
  y verificar que se cargue la pantalla con un texto predeterminado

  @tags
  Scenario: Registro en el sitio web Demo Automation
    Given que Carlos quiere acceder a la Web Automation Demo Site
    When el realiza el registro en la pagina
    Then El verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the table Row

  @Registro
  Scenario Outline: Registro en el sitio web Demo Automation
    Given que Carlos quiere acceder a la Web Automation Demo Site
    When el realiza el registro en la pagina
      | <nombre> | <apellido> | <direccion> | <email> | <telefono> | <genero> | <hobbies> | <idioma> | <habilidades> | <pais> | <ciudad> | <fecchaNac> | <clave> | <confirmClave> |
    Then El verifica que se carga la pantalla con texto <texto>

    Examples: 
      | nombre | apellido | direccion | email         | telefono | genero | hobbies | idioma | habilidades | pais   | ciudad | fecchaNac | clave | confirmClave | texto                                           |
      | Ana    | Paez     | Belen     | ana@gmail.com |  4777878 | F      | Movies  | Arabic | Android     | Angola | India  |  19900810 |  1234 |         1234 | Double Click on Edit Icon to EDIT the table Row |
