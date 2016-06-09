Uruchomienie:
 
 
 1. W trzech osobnych oknach konsoli przejdź do lokalizacji proejktu!
 
 
 2. W pierwszym oknie uruchom serwer - runHSQLDBServer.bat lub runHSQLDBServer.sh
 
 
 3. W drugim uruchom klienta - runHSQLDBClient.bat lub runHSQLDBClient.sh

 
 4. W trzecim uruchom serwer web z usług RESTową poleceniem - mvn jetty:run

 
5. Wpisz w pregladarkę adres: http://localhost:8080/restservicedemo/api/rocket/testRocket
 	Powinno być: "REST Service is running"
 
 
 6. W kliencie bazy stwórz nowy rekord według wzorca Rocket - INSERT
 
 
7. W przegladarce wpisz http://localhost:8080/restservicedemo/api/rocket/<adres id wpisany przez INSERTA>
 	Powinno pokazać dane wpisane wcześniej przez klienta

	
8. W przegladarce wpisz http://localhost:8080/restservicedemo/api/mark/<marka>
	Powinno pokazać wpisaną markę rakiet
