# Spring Boot Maven Starter

## Maven Lifecycle

validate > compile > test > package > verify > install > deploy

## Checkstyle

We use `google-java-format` style for our codebase

`google-java-format` is integrated with

- [intellij](https://plugins.jetbrains.com/plugin/8527-google-java-format/)
- [intellij-code-style](https://raw.githubusercontent.com/google/styleguide/gh-pages/intellij-java-google-style.xml)
- [eclipse](https://github.com/google/google-java-format/releases)
- [vscode](https://marketplace.visualstudio.com/items?itemName=shengchen.vscode-checkstyle)

By using plugin direct would cause conflict in the rules between the one configured in `spotless-maven` and the one from `google_checks.xml`, in particular, the indendention level

## Plugins

### Spotless

[spotless](https://github.com/diffplug/spotless) is used for code formatting

#### Usage

- `./mvnw spotless:check`
- `./mvnw spotless:apply`
- `./mvnw verify`

### Versions

- `./mvnw versions:display-dependency-updates`
- `./mvnw versions:display-property-updates`
- `./mvnw versions:display-plugins-updates`

The following command will update `pom.xml`

- `./mvnw versions:update-properties`
- `./mvnw versions:update-parent`

## Extensions

### Maven Profiler

- Run with `-Dprofile` command
  - `./mvnw verify -Dprofile`
- See [maven-survival-guide](https://github.com/rfichtner/maven-survival-guide) [maven-profiler](https://github.com/jcgay/maven-profiler)