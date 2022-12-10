# Spring Boot Maven Starter

## Maven Lifecycle

validate > compile > test > package > verify > install > deploy

## Config

### VSCode

Launch Settings > Java > Maven:Download Sources > Tick

### EditorConfig

See [.editorconfig](.editorconfig)

## Plugins

### Spotless

[spotless](https://github.com/diffplug/spotless) is used for code style and formatting

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
