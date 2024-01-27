plugins {
    java
    id("org.springframework.boot") version "3.2.1"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "com.coffeeculture"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.flywaydb:flyway-core")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.3.0")
    //implementation("org.springframework.boot:spring-boot-starter-validation")
    //implementation("jakarta.servlet:jakarta.servlet-api:6.0.0")
    compileOnly ("org.projectlombok:lombok")
    annotationProcessor ("org.projectlombok:lombok")
    implementation("org.postgresql:postgresql")
    //implementation("io.springfox:springfox-boot-starter:3.0.0")
    //implementation("io.springfox:springfox-swagger2:3.0.0")
    //implementation("io.springfox:springfox-swagger-ui:3.0.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
