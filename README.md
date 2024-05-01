# :sun_with_face: comma-project
----------------------------------------------------------------------------
프로젝트 기간 : 2024.03.12 ~ 2024.05.xx

## 개발 환경 세팅 - 주의사항
jdk : 17 version으로 맞추고 build

### application.properties 파일을 아래와 같이 수정 후 배포할 때는 커밋 하지말기
spring.application.name=comma<br>
spring.datasource.url=jdbc:mysql://192.168.0.154:3306/development<br>
spring.datasource.username=root<br>
spring.datasource.password=780525<br>

### 배포용 application.properties
spring.application.name=comma<br>
spring.datasource.url=jdbc:mysql://${DB_HOST}:${DB_PORT}/${DB_NAME}<br>
spring.datasource.username=${DB_USER}<br>
spring.datasource.password=${DB_PASSWORD}<br>
