plugins {
    id("java")
}

group = "org.toy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.hibernate:hibernate-core:6.4.2.Final")
    implementation("javax.xml.bind:jaxb-api:2.3.1")
    implementation("org.postgresql:postgresql:42.7.2")
    implementation("ch.qos.logback:logback-classic:1.4.14")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}