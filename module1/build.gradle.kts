group = rootProject.group
version = rootProject.version

plugins {
    kotlin("jvm")
}

val ktorVersion: String = "6.6.6"
dependencies {
  implementation(project(":module2"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testImplementation(libs.junit)
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.0")
    runtimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")



    tasks.test {
        useJUnitPlatform {
            includeTags("fast", "smoke & feature-a")
            // excludeTags("slow", "ci")
            includeEngines("junit-jupiter")
            // excludeEngines("junit-vintage")
        }
    }



}
