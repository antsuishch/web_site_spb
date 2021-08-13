
# Automation UI тесты для сайта https://spb.tele2.ru/
## Используемый стек:
![java](https://user-images.githubusercontent.com/46926736/125160894-01fb9980-e188-11eb-956c-4dbf77339d15.png)
![idea](https://user-images.githubusercontent.com/46926736/125160909-0922a780-e188-11eb-8b82-03b8d48be750.png)
![gradle](https://user-images.githubusercontent.com/46926736/125160914-0aec6b00-e188-11eb-8d78-792dc4fda636.png)
![jUnit5](https://user-images.githubusercontent.com/46926736/125160917-0d4ec500-e188-11eb-9986-790638982928.png)
![rest-assured_logo](https://user-images.githubusercontent.com/46926736/125160921-1049b580-e188-11eb-8465-5b63fbb13d78.png)
![selenide](https://user-images.githubusercontent.com/46926736/125160924-12137900-e188-11eb-91fa-28f828336d5c.png)
![jenkins](https://user-images.githubusercontent.com/46926736/125160927-13dd3c80-e188-11eb-9349-5ab09a4f27ee.png)
![Selenoid](https://user-images.githubusercontent.com/46926736/125160928-150e6980-e188-11eb-9a08-0394fa8bd425.png)
![github](https://user-images.githubusercontent.com/46926736/125160932-18095a00-e188-11eb-9b1a-3ebcf63dab1f.png)
![allure-logo](https://user-images.githubusercontent.com/46926736/125160934-1b9ce100-e188-11eb-8891-5dc8a4ba2308.png)
![allure-testops](https://user-images.githubusercontent.com/46926736/125160973-5d2d8c00-e188-11eb-8537-730ff6ea5e26.png)
![jira-logo](https://user-images.githubusercontent.com/46926736/125160975-63236d00-e188-11eb-8615-6ef6ba29ac9d.png)
![telegram-logo](https://user-images.githubusercontent.com/46926736/125160976-6585c700-e188-11eb-8eae-eb426e581d2f.png)

Java, IntelliJ IDEA, Gradle, JUnit5, Rest-Assured, Selenide, Jenkins, Selenoid, Github, Allure Reports, Allure TestOps, Jira, Telegram (уведомления)
## Пример запуска
Для удаленного запуска необходимо заполнить файл remote.properties или передать параметры в командной строке:

* browser (default chrome)
* browserVersion (default 91.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)

Запуск с использованием файла remote.properties:
```bash
gradle clean test
```

Запуск с ручным указанием параметров:
```bash
gradle clean test -Dbrowser=chrome -DbrowserVersion=91.0 -DbrowserSize=1920x1080 -DbrowserMobileView= -DremoteDriverUrl=selenoid.autotests.cloud -DremoteDriverUser=user1 -DremoteDriverPassword=1234 -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=2
```

