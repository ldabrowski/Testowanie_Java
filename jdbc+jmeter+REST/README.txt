Uruchomienie:

1. W trzech osobnych oknach konsoli przejdź do lokalizacji proejktu!

2. W pierwszym oknie uruchom serwer - runHSQLDBServer.bat

3. W drugim uruchom klienta - runHSQLDBClient.bat

4. W trzecim uruchom serwer web z usług RESTową poleceniem - mvn jetty:run

5. Wpisz w pregladarkę adres: http://localhost:8080/restservicedemo/api/person/test
	Powinno być: "REST Service is running"

6. W kliencie bazy zrób INSERT rekordu

7. W przegladarce wpisz http://localhost:8080/restservicedemo/api/<nazwa tabeli>/<adres id wpisany przez INSERTA>
	Powinno pokazać dane wpisane wcześniej przez klienta

