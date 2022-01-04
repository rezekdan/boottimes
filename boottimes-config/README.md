start with:
````
mvn clean spring-boot:run -Dspring-boot.run.profiles=local,native
````

how the test config properties were created via bash:

````
echo boottimes.testconfigs.testconfig{0..0}{0..9}{0..9}{0..9}{0..9}.{isSomeBoolean=true,someInteger=123,someDecimal=123.456,someString=aString} | xargs printf "%s\n" > src/main/resources/config/test-local.properties
````

execute modified command to test for higher amount of testconfigs > 10k
