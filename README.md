# ksb2-aop-domowe

Napisz aplikację, która będzie udostępniała prosty interfejs API. Każdy kto odwoła się do metody GET otrzyma listę filmów (nazwa, rok producent). 
Natomiast odwołanie się do metody POST, która umożliwia na dodawanie filmu do listy, a dodatkowo spowoduje WYSŁANIE MAILA z wykorzystaniem ASPEKU.

To jak wysłać maila poprzez mechanizm dostarczony przez Spring jest Twoją pracą domową, która wymaga od Ciebie researchu.

Pamiętaj, że wysyłka maila ma odbywać się z wykorzystaniem aspektu! Zastosuj odpowiednia poradę po dodaniu nowego elementu do listy ?

=========================================

Skorzystano z zależności Springboota : _<artifactId>spring-boot-starter-mail</artifactId>_

Konfiguracja dla serwera SMTP Gmail:

![image](https://github.com/monikaRegula/ksb2-aop-domowe/assets/33186866/d2a210a1-e137-4423-8c3a-6d59a7325941)

Dodane hasło jest hasłem wygenerowanym dla dodanej aplikacji dla mojego konta Google

Konto Google > Bezpieczeństwo > Weryfikacja dwuetapowa > Hasla do aplikacji [tutorial 3-cia minuta:](https://www.youtube.com/watch?v=ugIUObNHZdo)

=====================================

Jak stworzyłam aspekt wysyłania maila?

Nowa anotacja @SendAnEmail jako **punkt przecięcia(Pointcut)** -miejsce wywołania porady

![image](https://github.com/monikaRegula/ksb2-aop-domowe/assets/33186866/b5d4a773-5b5f-48a4-9e6c-249ea45c6f64)


Nowa klasa z **poradą (Advice)** @After - porada wykonuje się po wskazanej metodzie biznesowej

![image](https://github.com/monikaRegula/ksb2-aop-domowe/assets/33186866/cbcd14dc-f674-45ce-8909-368a4baedc2a)

=====================================
Po uruchomieniu aplikacji oraz utworzeniu nowego obiektu Video:

![image](https://github.com/monikaRegula/ksb2-aop-domowe/assets/33186866/873425b4-3084-476a-b694-33d7c93dbdce)

![image](https://github.com/monikaRegula/ksb2-aop-domowe/assets/33186866/68135644-ee7c-48ba-95ce-ae853e340bf7)






