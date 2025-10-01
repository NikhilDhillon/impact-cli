# impact-cli

A simple Java command-line interface (CLI) application.

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Building

To build the project, run:

```bash
mvn clean package
```

This will create an executable JAR file in the `target/` directory.

## Usage

Run the CLI application using:

```bash
java -jar target/impact-cli-1.0-SNAPSHOT.jar <command> [options]
```

### Available Commands

- **hello [name]** - Print a greeting message
  ```bash
  java -jar target/impact-cli-1.0-SNAPSHOT.jar hello
  java -jar target/impact-cli-1.0-SNAPSHOT.jar hello John
  ```

- **version** - Print the version number
  ```bash
  java -jar target/impact-cli-1.0-SNAPSHOT.jar version
  ```

- **help** - Show the help message
  ```bash
  java -jar target/impact-cli-1.0-SNAPSHOT.jar help
  ```

## Examples

```bash
# Show help
java -jar target/impact-cli-1.0-SNAPSHOT.jar

# Greet the world
java -jar target/impact-cli-1.0-SNAPSHOT.jar hello

# Greet someone specific
java -jar target/impact-cli-1.0-SNAPSHOT.jar hello Alice

# Show version
java -jar target/impact-cli-1.0-SNAPSHOT.jar version
```

## Testing

Run the tests using:

```bash
mvn test
```
