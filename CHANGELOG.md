# Changelog

## [Unreleased]

### Added

### Changed

`gradleTestKitTest` parameter `withDebug` value from `true` to `false`

### Deprecated

### Removed

### Fixed

### Updated

## [1.0.0-alpha.20] - 2022-06-28

### Changed

- all projects `sourceCompatibility` to `1.8`
- all projects `targetCompatibility` to `1.8`
- all projects `jvmTarget` to `1.8`

## [1.0.0-alpha.19] - 2022-06-27

### Added

- Gradle Extensions artifact: `com.javiersc.gradle:gradle-logging-extensions`
- Gradle Extensions artifact: `com.javiersc.gradle:gradle-miscellanea-extensions`
- Gradle Extensions artifact: `com.javiersc.gradle:gradle-project-extensions`
- Gradle Extensions artifact: `com.javiersc.gradle:gradle-properties-extensions`
- Gradle Extensions artifact: `com.javiersc.gradle:gradle-tasks-extensions`
- Gradle Extensions artifact: `com.javiersc.gradle:gradle-version-catalog-extensions`
- Gradle Test Extensions artifact: `com.javiersc.gradle:gradle-testkit-test-extensions`

### Changed

- Gradle Extensions artifact: `com.javiersc.gradle:gradle-extensions`
- Gradle Test Extensions artifact: `com.javiersc.gradle:gradle-test-extensions`

## [1.0.0-alpha.18] - 2022-06-26

### Added

- `Project.isSnapshot: Boolean`
- `Project.isNotSnapshot: Boolean`
- `Project.getProperty(name: String): String`
- `Project.getPropertyOrNull(name: String): String?`
- `Project.getStringProperty(name: String): String`
- `Project.getStringPropertyOrNull(name: String): String?`
- `Project.getIntProperty(name: String): Int`
- `Project.getIntPropertyOrNull(name: String): Int?`
- `Project.getLongProperty(name: String): Long`
- `Project.getLongPropertyOrNull(name: String): Long?`
- `Project.getBooleanProperty(name: String): Boolean`

## [1.0.0-alpha.17] - 2022-06-25

### Added

- `expectTaskOutcome: TaskOutcome` parameter to `GradleRunner.testConfigurationCache`

## [1.0.0-alpha.16] - 2022-06-25

### Changed

- `GradlewRunner.gradlewArgumentsFromTXT` function return type to `BuildResult`

## [1.0.0-alpha.15] - 2022-06-25

### Added

- `Project.module` getter
- `Project.library` getter
- `GradlewRunner.gradlewArgumentsFromTXT` function

## [1.0.0-alpha.14] - 2022-06-23

### Changed

- `gradlew` and `clean` return type from `Unit` to `BuildResult`

### Updated

- `io.kotest:kotest-assertions-core -> 5.3.1`
- `org.jetbrains.kotlinx:binary-compatibility-validator -> 0.10.1`
- `org.jetbrains.kotlinx:kotlinx-coroutines-core -> 1.6.3`

## [1.0.0-alpha.13] - 2022-06-14

### Added

- `GradleRunner.gradlew` function
- value argument to set the resulting task to `testBuildCache` and `testConfigurationCache`

## [1.0.0-alpha.12] - 2022-06-14

### Changed

- `gradleBuildCacheTestKitTest` is now `GradleRunner.testBuildCache`
- `gradleConfigurationCacheTestKitTest` is now `GradleRunner.testConfigurationCache`

### Removed

- `withArgumentsFromTXT` value argument from `gradleTestKitTest`

## [1.0.0-alpha.11] - 2022-06-14

### Fixed

- `gradleBuildCacheTestKitTest` and `gradleConfigurationCacheTestKitTest` task output is null always

## [1.0.0-alpha.10] - 2022-06-14

### Fixed

- invalid characters in `prefix` by replacing them with `--`
- unnecessary hyphen when `prefix` is blank in sandbox directories

## [1.0.0-alpha.9] - 2022-06-14

### Updated

- `com.javiersc.kotlin:kotlin-stdlib -> 0.1.0-alpha.5`

## [1.0.0-alpha.8] - 2022-06-14

### Added

- `TaskContainer.namedLazily` function
- `TaskContainer.maybeRegisterLazily` function
- `forUseAtConfigurationTime` function
- `GradleRunner.andWithProjectProperty` function
- `GradleRunner.andWithSystemProperty` function

## [1.0.0-alpha.7] - 2022-06-02

### Added

- `Project.isRootProject: Boolean` property

## [1.0.0-alpha.6] - 2022-05-22

### Fixed

- Invalidated `gradleBuildCacheTestKitTest` is not SUCCESS

## [1.0.0-alpha.5] - 2022-05-21

### Added

- `invalidate` function to `gradleBuildCacheTestKitTest`

### Removed

- `GradleRunner` receiver from `gradleConfigurationCacheTestKitTest` function
- `GradleRunner` receiver from `gradleBuildCacheTestKitTest` function

## [1.0.0-alpha.4] - 2022-05-21

### Added

- `GradleRunner.gradleConfigurationCacheTestKitTest` function
- `GradleRunner.gradleBuildCacheTestKitTest` function

## [1.0.0-alpha.3] - 2022-05-21

### Added

- `GradleRunner.clean` function which launch `clean` task

### Fixed

- `cleanBuildDirectory` function doesn't delete any subproject `build` directory

## [1.0.0-alpha.2] - 2022-05-21

### Added

- `andWithScan` function
- `andWithConfigurationCache` function
- `andWithNoBuildCache` function
- `andWithConfigurationCache` function
- `andWithNoConfigurationCache` function
- `andWithConfigurationCacheProblemsWarn` function
- `withArgumentsFromTXT` function
- `scan` and `addWithScan` functions
- `info` and `addWithInfo` functions
- `stacktrace` and `addWithStacktrace` functions
- `buildCache` and `addWithBuildCache` functions
- `noBuildCache`and `addWithNoBuildCache` functions
- `configurationCache` and `andWithConfigurationCache` functions
- `noConfigurationCache` and `andWithNoConfigurationCache` functions
- `configurationCacheProblemsWarn` and `andWithConfigurationCacheProblemsWarn` functions

### Changed

- all `with...` functions to `andWith...`
- `gradleTestKitTest` function uses `withArgumentsFromTXT` flag instead of list of arguments

## [1.0.0-alpha.1] - 2022-05-21

### Added

- `gradle-ext` project
- `gradle-testkit-ext` project