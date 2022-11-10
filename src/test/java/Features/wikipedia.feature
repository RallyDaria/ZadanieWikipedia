Feature:Wyszukiwanie fraz

  Scenario Outline:
    Given Uzytkownik jest na stronie "www.wikipedia.org"
    When Uzytkownik wpisuje <fraza> w pole wyszukiwania
    And  Uzytkownik klika przycisk Szukaj
    Then <tekst> zostaje poprawnie wyszukana

    Examples:
      | fraza | tekst |
      | bdd   | bdd   |
      |       |       |
      |       |       |