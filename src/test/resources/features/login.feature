Feature:ortak adimlar

  Background:Automation sayfasina gitme
    Given kullanici "automation" sayfasina gider
  @tag
Scenario:Login ve logout olma

  Then  kullanici adresin dogru adres oldugunu teyit eder
  And   kullanici header daki signin butonuna tiklar
  When  kullanici Login to your account yazisinin goruntugunu teyit eder
  Then  kullanici login page de email kutusuna email girer
  And   kullanici loginpage de password kutusuna password girer
  When  kullanici login page de login butonuna tıklar
  Then  kullanici login oldukdan sonra  header da logged in as username yazisinin gorundugunu teyit eder
  When  kullanici header da logout butonuna basa
  And   kullanici loginPage sayfasina donuldugunu teyit eder

  Scenario: Ortak Pageler
    Given Home page sayfasina git
    Then Card page sayfasina git
    And Login sayfasina git
    Then Contact us sayfasina git
