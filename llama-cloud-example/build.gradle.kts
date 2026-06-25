plugins {
    id("llama-cloud.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":llama-cloud-core"))
    implementation(project(":llama-cloud-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :llama-cloud-example:run` to run `Main`
    // Use `./gradlew :llama-cloud-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.llamacloud_prod.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
