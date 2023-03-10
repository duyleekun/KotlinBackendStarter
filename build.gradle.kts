import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.0.2"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.7.22"
	kotlin("kapt") version "1.7.22"
	kotlin("plugin.spring") version "1.7.22"
}

group = "vn.ycomm"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	// Spring framework
	implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
	implementation("org.springframework.boot:spring-boot-starter-webflux")
	implementation("org.springframework.boot:spring-boot-starter-security")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	implementation("org.springframework.boot:spring-boot-starter-validation")

	// Jackson
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

	// R2dbc driver
	implementation("com.github.jasync-sql:jasync-r2dbc-mysql:2.1.23")

	// flyway spring boot
	implementation("org.flywaydb:flyway-core:8.2.2")
	implementation("org.flywaydb:flyway-spring-boot-starter:8.2.2")
	//flyway r2dbc
	implementation("org.flywaydb:flyway-r2dbc:8.2.2")

	// memory db
	implementation("com.h2database:h2:1.4.200")


	// Kotlin
	implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")

	//swagger
	implementation("org.springdoc:springdoc-openapi-webflux-ui:1.6.9")
	implementation("org.springdoc:springdoc-openapi-kotlin:1.6.9")


	// Test
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("io.projectreactor:reactor-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
