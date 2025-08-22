plugins {
    kotlin("jvm") version "1.9.10"
    `maven-publish`
}

group = "com.github.Buildercgr"
version = "0.4.0"

repositories {
    mavenCentral()
}

dependencies {
}

publishing {
    publications {
        create<MavenPublication>("release") {
            from(components["java"])
        }
    }
}