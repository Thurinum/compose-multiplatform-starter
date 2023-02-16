# Compose Multiplatform Starter 
A cleaned up Jetpack Compose Multiplatform template for building cross-platform apps in Kotlin.  

The Compose MP scaffolder in IntelliJ is pretty flawed. This template provides a clean setup and corrects the following issues:

- Suppress unused import warnings in build files
- Address Android manifest warnings
- Address deprecated usage warnings
- Update Kotlin and Compose versions to 1.8.0 and 1.3.0
- Migrate androidTest file structure to the new Kotlin 1.8.0 convention
- Rename common packages to use the application's name
- Improve default Platform.kt to better demonstrate platform-specific code
- Remove preview file "DesktopApp", the Compose preview is no better than the emulator preview
- Create and store a run configuration for Desktop

Just refactor the package names and you're good to go.
