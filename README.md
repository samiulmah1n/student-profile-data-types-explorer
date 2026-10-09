# Student Profile & Data Types Explorer

A beginner-friendly Java console project covering variables, all 8 primitive data types, reference types, operators, arrays, type conversion, strings, classes, and keyboard input.

## Requirements
- Java JDK 8 or newer
- Terminal / Command Prompt

## Run
From the project root:

```bash
javac -d out src/StudentProfileExplorer.java
java -cp out StudentProfileExplorer
```

## What this project demonstrates
- Primitive types: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`
- Reference types: `String`, `String[]`, and a custom `Student` object
- Arithmetic operators: `+`, `-`, `*`, `/`, `%`
- Assignment and update: `=`, `+=`, `++`, `--`
- Comparison and logical operators: `>=`, `&&`
- Ternary operator: `condition ? value1 : value2`
- Type casting and widening conversion
- String methods: `toUpperCase()`, `length()`, `equals()`
- User input with `Scanner`, a constructor, fields, and a method

## Practice challenges
1. Try an average grade below 5 and then above 5.
2. Add a new item to the `skills` array.
3. Change `double exact = 9.75` and observe the cast to `int`.
4. Add a `boolean` or `int` field to the `Student` class.
5. Explain in your own words why `String` and `Student` are reference types.

## Upload to GitHub
Create an empty GitHub repository, then run these commands from this folder:

```bash
git init
git add .
git commit -m "Add student profile data types explorer"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/student-profile-data-types-explorer.git
git push -u origin main
```

Replace `YOUR-USERNAME` with your GitHub username.

## Repository description
Beginner Java project demonstrating variables, primitive and reference types, operators, arrays, and type conversion.
