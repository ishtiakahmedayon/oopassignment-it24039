# oopassignment-it24039

## What are the steps you have followed to run a HelloWorld.java Program on CMD

Running a Java program from the Command Prompt (CMD) involves several steps. Here's a comprehensive guide:

### Prerequisites

1. **Install Java Development Kit (JDK)**
   - Download the latest JDK from Oracle's official website or adopt OpenJDK
   - Run the installer and follow the installation wizard
   - Note the installation path (e.g., `C:\Program Files\Java\jdk-17`)

2. **Set Environment Variables**
   - Open System Properties → Advanced → Environment Variables
   - Add `JAVA_HOME` variable pointing to your JDK installation directory
   - Add `%JAVA_HOME%\bin` to the PATH variable
   - This allows you to run `java` and `javac` commands from any directory

### Steps to Run HelloWorld.java on CMD

#### Step 1: Create the HelloWorld.java File

Create a file named `HelloWorld.java` with the following content:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Important Notes:**
- The filename must match the class name (HelloWorld.java)
- Java is case-sensitive
- Save the file in a directory you can easily navigate to

#### Step 2: Open Command Prompt

- Press `Win + R` to open the Run dialog
- Type `cmd` and press Enter
- Or search for "Command Prompt" in the Start menu

#### Step 3: Navigate to the Directory Containing HelloWorld.java

Use the `cd` command to change directory:

```cmd
cd C:\path\to\your\java\file
```

For example:
```cmd
cd C:\Users\YourName\Documents\JavaPrograms
```

**Tip:** You can use `dir` command to list files in the current directory to verify HelloWorld.java is present.

#### Step 4: Compile the Java Program

Use the `javac` (Java Compiler) command to compile the source code:

```cmd
javac HelloWorld.java
```

**What happens:**
- If successful, this creates a `HelloWorld.class` file in the same directory
- This `.class` file contains the bytecode that the Java Virtual Machine (JVM) can execute
- If there are syntax errors, the compiler will display error messages

**Verify compilation:**
```cmd
dir
```
You should see both `HelloWorld.java` and `HelloWorld.class` files.

#### Step 5: Run the Compiled Java Program

Use the `java` command to run the program:

```cmd
java HelloWorld
```

**Important:**
- Do NOT include the `.class` extension when running
- Use only the class name: `HelloWorld`
- The class name is case-sensitive

#### Step 6: View the Output

If everything is correct, you should see:

```
Hello, World!
```

### Common Issues and Solutions

1. **'javac' is not recognized as an internal or external command**
   - Solution: JDK is not installed or PATH is not set correctly
   - Verify installation: `java -version` and `javac -version`
   - Re-check environment variables

2. **Error: Could not find or load main class HelloWorld**
   - Solution: Make sure you're in the correct directory
   - Ensure the filename matches the class name exactly
   - Check that HelloWorld.class exists

3. **Error: class HelloWorld is public, should be declared in a file named HelloWorld.java**
   - Solution: Rename your file to exactly match the class name

4. **Compilation errors**
   - Solution: Check your code syntax
   - Ensure all brackets, parentheses, and semicolons are properly placed
   - Check for typos in keywords like `public`, `class`, `static`, etc.

### Summary of Commands

```cmd
# Navigate to directory
cd C:\path\to\java\file

# Compile the Java file
javac HelloWorld.java

# Run the compiled program
java HelloWorld
```

### Additional Tips

- Always compile before running (after any code changes)
- Keep your Java source files organized in project directories
- Use an IDE like Eclipse, IntelliJ IDEA, or VS Code for larger projects
- The JDK includes the JRE (Java Runtime Environment), so you don't need to install both separately