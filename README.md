# Impact CLI

A command-line interface application for Impact.com that displays the company logo in ASCII art.

## Project Structure

```
impact-cli/
├── src/
│   └── ImpactCLI.java          # Main application class
├── lib/                        # Dependencies directory
│   └── picocli-4.7.5.jar       # PicoCLI library
├── target/classes/             # Compiled classes
├── pom.xml                     # Maven build configuration
└── README.md                   # This file
```

## Building the Project

```bash
javac -cp lib/picocli-4.7.5.jar -d target src/ImpactCLI.java
```

## Running the Application

After building, run the application with:

```bash
java -cp target:lib/picocli-4.7.5.jar ImpactCLI
```

## Features

- Simple, clean project structure
- Maven-compatible build configuration
- PicoCLI integration for command-line interface
- ASCII art display of Impact.com logo