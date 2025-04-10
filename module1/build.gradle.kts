import buildutils.configureDetekt
import buildutils.configureDiktat
import buildutils.createDetektTask
import buildutils.createDiktatTask

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
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")



    tasks.test {

            useJUnitPlatform()
    }

    configureDiktat()
    configureDetekt()

}

createDiktatTask()
createDetektTask()