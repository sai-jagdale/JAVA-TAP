# Copilot Instructions for JAVA@TAP Workspace

## Project Overview
This is a simple Java project focused on the `Student` class, demonstrating object-oriented principles such as constructors (default, parameterized, copy) and basic usage in the `main` method. There are no external dependencies or complex architecture.

## Key Files
- `Student.java`: Contains the main logic and entry point. All code is in this file.
- `Sai.class`: Compiled output of a Java class (not source code).

## Developer Workflows
### Build & Run
- **Compile:** Use `javac Student.java` to compile the source file.
- **Run:** Use `java Student` to execute the program. The output will display student details using the constructors.
- No build scripts, test frameworks, or package managers are present.

### Debugging
- Debug by adding print statements in constructors or methods.
- No advanced debugging or logging frameworks are used.

## Coding Patterns & Conventions
- **Class Structure:**
  - All fields are public (no encapsulation).
  - Constructors demonstrate default, parameterized, and copy patterns.
  - The `main` method is used for demonstration and manual testing.
- **Naming:**
  - Class and field names use PascalCase (e.g., `Student`, `Name`).
- **No External Libraries:**
  - Only standard Java is used; no imports or dependencies.

## Integration Points
- No external integrations, APIs, or cross-component communication.

## Example Usage
```java
Student s1 = new Student(); // Default constructor
Student s2 = new Student("Ravi", 2, 45.67f, 11); // Parameterized constructor
Student s3 = new Student(s1); // Copy constructor
```

## How to Extend
- Add new fields or methods directly in `Student.java`.
- For additional classes, create new `.java` files and compile them together.

---
**If you add new files, workflows, or conventions, update this document to keep AI agents productive.**
