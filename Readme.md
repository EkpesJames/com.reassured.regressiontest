### Prerequisite for test execution.
```
- Java version: 8 or later
```
- Maven version: 3.8.1
```
- Chromedriver & Chrome browser version: 86
```
- IDE: Intellij or Eclipse
```
### Run the project command
- Clone git repo
```
git clone https://github.com/EkpesJames/com.reassured.regressiontest.git
```
- Change directory into just cloned 
```
cd com.reassured.regressiontest
```

- Run test using Maven
```
mvn verify
```

- Run test using TestNG
```
mvn verify -Dsurefire.suiteXmlFiles=quote-module.xml
```

#### Screen shots location
```
src/test/resources/screenshots
```

### Cucumber html Report location
```
reports/html-reports/cucumber-html-reports/
```