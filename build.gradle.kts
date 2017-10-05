buildscript {
	repositories {
		mavenCentral()
		maven("https://repo.spring.io/milestone")
		maven("https://repo.spring.io/snapshot")
	}

	dependencies {
		classpath("org.springframework.boot:spring-boot-gradle-plugin:2.0.0.BUILD-SNAPSHOT")
	}
}

plugins {
	val kotlinVersion = "1.1.51"
	id("org.jetbrains.kotlin.jvm") version kotlinVersion
	id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
	id("org.jetbrains.kotlin.plugin.noarg") version kotlinVersion
	id("io.spring.dependency-management") version "1.0.3.RELEASE"
}

apply {
	plugin("kotlin")
	plugin("kotlin-spring")
	plugin("kotlin-jpa")
	plugin("org.springframework.boot")
}

version = "1.0.0-SNAPSHOT"

repositories {
	mavenCentral()
	maven("https://repo.spring.io/milestone")
	maven("https://repo.spring.io/snapshot")
}

dependencies {
	compile("org.springframework.boot:spring-boot-starter-web")
    compile("org.springframework:spring-web")
	compile("org.jetbrains.kotlin:kotlin-stdlib")
	compile("org.jetbrains.kotlin:kotlin-reflect")
	testCompile("org.springframework.boot:spring-boot-starter-test")
    testCompile("junit:junit")
}

