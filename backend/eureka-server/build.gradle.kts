val caffeineVersion = "3.2.0"

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server")
    implementation("org.springframework.cloud:spring-cloud-starter-config")
    implementation("com.github.ben-manes.caffeine:caffeine:${caffeineVersion}")
}
