# The key differences and roles of JDK, JVM, and JRE

| Component | Description | Purpose | Contains |
|-----------|-------------|---------|----------|
| **JDK (Java Development Kit)** | A software development kit used to develop Java applications. | It provides tools to compile, debug, and execute Java programs. | JRE, compilers (e.g., `javac`), debuggers, and development tools. |
| **JVM (Java Virtual Machine)** | An abstract machine that provides a runtime environment to execute Java bytecode. | It enables Java programs to run on any device or operating system. | Only responsible for running bytecode. It does not include any development tools. |
| **JRE (Java Runtime Environment)** | A runtime environment that allows running Java applications. | Provides the libraries and components required to run Java applications. | JVM, core libraries, and supporting files (does not include development tools like the compiler). |
