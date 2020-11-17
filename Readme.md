## Prerequisite for test execution.

1. Java version: 8 or later
2. Maven version: 3.8.1
3. Chromedriver & Chrome browser version: 86

### Run the project command
- Clone git repo
```
git clone https://github.com/EkpesJames/com.reassured.regressiontest.git
```
- Change directory into just cloned 
```
cd com.reassured.regressiontest
```

- Run Maven
```
mvn verify
```

- Run TestNG
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