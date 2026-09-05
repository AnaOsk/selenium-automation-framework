elenium Automation Framework
Opis projekta

Ovaj projekt predstavlja okvir za automatsko testiranje web aplikacije korištenjem programskog jezika Java i Selenium WebDriver alata.

Za testiranje je korištena demo web aplikacija SauceDemo. Projekt je izrađen kao Maven projekt i koristi TestNG za organizaciju i pokretanje automatiziranih testova.

Cilj projekta je demonstrirati primjenu osnovnih i naprednih tehnika automatskog testiranja programske podrške.

Korištene tehnologije i alati

Projekt koristi sljedeće tehnologije:

Java 17
Selenium WebDriver
TestNG
Maven
WebDriverManager
Page Object Model
Explicit Wait
Git
GitHub
IntelliJ IDEA
Arhitektura projekta

Projekt je organiziran prema Page Object Model dizajnerskom obrascu.

Struktura projekta:

SeleniumAutomationFramework
│
├── src
│   ├── main
│   │   └── java
│   │       ├── pages
│   │       │   ├── LoginPage.java
│   │       │   ├── InventoryPage.java
│   │       │   └── CartPage.java
│   │       │
│   │       └── utils
│   │           └── DriverFactory.java
│   │
│   └── test
│       └── java
│           ├── base
│           │   └── BaseTest.java
│           │
│           └── tests
│               ├── LoginTest.java
│               ├── InventoryTest.java
│               └── CartTest.java
│
├── pom.xml
├── testng.xml
├── README.md
└── .gitignore
Testni slučajevi

U projektu je implementirano šest automatiziranih testnih slučajeva.

1. Uspješna prijava korisnika

Provjerava može li se korisnik uspješno prijaviti u aplikaciju koristeći ispravno korisničko ime i lozinku.

Korisnički podaci:

Korisničko ime: standard_user
Lozinka: secret_sauce

Očekivani rezultat:

Korisnik se uspješno prijavljuje i prikazuje se stranica s proizvodima.

2. Neuspješna prijava

Provjerava prikazuje li aplikacija odgovarajuću poruku o pogrešci kada korisnik unese neispravne podatke.

Očekivani rezultat:

Prikazuje se poruka da korisničko ime i lozinka nisu ispravni.

3. Provjera naslova stranice

Provjerava odgovara li naslov početne stranice očekivanom naslovu aplikacije.

Očekivani rezultat:

Naslov stranice sadrži tekst "Swag Labs".

4. Dodavanje proizvoda u košaricu

Test provjerava može li korisnik dodati proizvod u košaricu.

Koraci:

Korisnik se prijavljuje u aplikaciju.
Odabire proizvod Sauce Labs Backpack.
Klikne na gumb Add to Cart.
Provjerava se broj proizvoda u košarici.

Očekivani rezultat:

Broj proizvoda u košarici je 1.

5. Uklanjanje proizvoda iz košarice

Test provjerava može li korisnik ukloniti proizvod iz košarice.

Koraci:

Korisnik se prijavljuje.
Dodaje proizvod u košaricu.
Otvara košaricu.
Uklanja proizvod.

Očekivani rezultat:

Košarica je prazna.

6. Odjava korisnika

Test provjerava može li se korisnik uspješno odjaviti iz aplikacije.

Koraci:

Korisnik se prijavljuje.
Otvara navigacijski izbornik.
Klikne na Logout.

Očekivani rezultat:

Korisnik se vraća na stranicu za prijavu.

Pokretanje projekta
Preduvjeti

Za pokretanje projekta potrebno je imati instalirano:

Java JDK 17 ili noviji
IntelliJ IDEA
Maven
Google Chrome, Mozilla Firefox ili Microsoft Edge
Pokretanje pomoću IntelliJ IDEA
Klonirati ili preuzeti projekt.
Otvoriti projekt u IntelliJ IDEA.
Pričekati da Maven preuzme potrebne biblioteke.
Otvoriti datoteku testng.xml.
Desnim klikom odabrati opciju Run.
Pokretanje pomoću terminala

Projekt se može pokrenuti pomoću sljedeće naredbe:

mvn clean test
Cross Browser Testing

Projekt podržava pokretanje testova u više web preglednika:

Google Chrome
Mozilla Firefox
Microsoft Edge

Preglednik se može promijeniti u datoteci testng.xml.

Primjer za Chrome:

<parameter name="browser" value="chrome"/>

Primjer za Firefox:

<parameter name="browser" value="firefox"/>

Primjer za Microsoft Edge:

<parameter name="browser" value="edge"/>
Page Object Model

Projekt koristi Page Object Model (POM) dizajnerski obrazac.

Svaka web stranica predstavljena je zasebnom Java klasom:

LoginPage
InventoryPage
CartPage

Takav pristup omogućuje:

bolju organizaciju programskog koda
jednostavnije održavanje testova
ponovnu upotrebu programskog koda
odvajanje testne logike od elemenata korisničkog sučelja
Wait naredbe

U projektu se koriste Explicit Wait naredbe putem klase WebDriverWait.

Primjer:

wait.until(
ExpectedConditions.visibilityOfElementLocated(
usernameField
)
);

Explicit Wait omogućuje čekanje određenog elementa ili uvjeta prije nastavka izvršavanja testa.

WebDriverManager

WebDriverManager automatski upravlja WebDriver programima potrebnim za pokretanje različitih web preglednika.

Primjer:

WebDriverManager.chromedriver().setup();

Prednost korištenja WebDriverManagera je automatsko preuzimanje i konfiguriranje odgovarajuće verzije WebDrivera.

OOP principi

Projekt koristi objektno orijentirano programiranje.

Primjeri:

klase predstavljaju različite web stranice
enkapsulacija Selenium elemenata unutar Page Object klasa
nasljeđivanje klase BaseTest u testnim klasama
ponovno korištenje metoda
.gitignore

Datoteka .gitignore koristi se kako bi se spriječilo spremanje nepotrebnih datoteka u Git repozitorij.

Ignoriraju se:

IntelliJ IDEA konfiguracijske datoteke
Maven target direktorij
log datoteke
testni izvještaji
Zaključak

U projektu je izrađen okvir za automatsko testiranje web aplikacije korištenjem Selenium WebDrivera.

Implementirane su sljedeće napredne tehnike:

Page Object Model
Explicit Wait
WebDriverManager
Cross Browser Testing
Object Oriented Programming
Maven
TestNG
Git i GitHub
README.md
.gitignore

Projekt demonstrira organizirani pristup automatskom testiranju programske podrške i omogućuje jednostavno proširenje novim testnim slučajevima.