plugins {
    id("java")
    id("maven-publish")
}

group = "me.callahandev"
version = "0.0.1"

repositories {
    maven("https://jitpack.io")
    mavenCentral()
}

dependencies {
    //
}
publishing {
    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                from(components["java"])
            }
        }
        repositories {
            maven {
                group = "me.callahandev"
                version = "0.0.1"
            }
        }
    }
}
