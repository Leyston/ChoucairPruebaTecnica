# Autor: LeystonOnate

  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
    @scenario1
    Scenario Outline: Search for an automation course
      Given than alex wants to learn automation at the academy Choucair
        | strUser   | strPassword   |
        | <strUser> | <strPassword> |
      When he search for the course on the Choucair academy platform
        | srtCourse   |
        | <srtCourse> |
      Then he finds the course called resources
        | srtCourse   |
        | <srtCourse> |
      Examples:
        | strUser    | strPassword   | srtCourse                             |
        | 1098783745 | Choucair2021* | Prueba Técnica - Analista Bancolombia |


