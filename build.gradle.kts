buildscript {
	repositories {
		mavenCentral()
		maven("https://repo.spring.io/milestone")
		maven("https://repo.spring.io/snapshot")
        maven("http://dl.bintray.com/jetbrains/spek")
    }

	dependencies {
		classpath("org.springframework.boot:spring-boot-gradle-plugin:2.0.0.BUILD-SNAPSHOT")
        classpath("org.junit.platform:junit-platform-gradle-plugin:1.0.0")
        classpath("org.jetbrains.spek:spek-api:1.1.5")
        classpath("org.jetbrains.spek:spek-junit-platform-engine:1.1.5")
        classpath("org.junit.platform:junit-platform-runner:1.0.0")
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
    plugin("org.junit.platform.gradle.plugin")
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
    testCompile("org.jetbrains.spek:spek-api:1.1.5")
    testCompile("org.junit.platform:junit-platform-runner:1.0.1")
    testRuntime("org.jetbrains.spek:spek-junit-platform-engine:1.1.5")
}