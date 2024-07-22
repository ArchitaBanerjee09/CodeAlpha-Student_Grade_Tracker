# Student Grade Tracker

This Java program allows a teacher to enter students' grades and compute their average, highest, and lowest scores. The program uses an `ArrayList` to store the student data and the `Scanner` class for user input.

## Features

- Accepts grades as input from the user.
- Computes the average of the grades.
- Identifies the highest grade.
- Identifies the lowest grade.

## Requirements

- Java Development Kit (JDK) 8 or higher

## Usage

1. Compile the program:
    ```sh
    javac Task1.java
    ```

2. Run the program:
    ```sh
    java Task1
    ```

3. Enter student grades one by one. Type `-1` to stop entering grades.

4. The program will output the average, highest, and lowest grades.

## Example

```sh
Enter student grades. Type -1 to stop:
Enter grade: 85
Enter grade: 90
Enter grade: 78
Enter grade: -1
Average grade: 84.33333333333333
Highest grade: 90
Lowest grade: 78
```

## Libraries

- `java.util.ArrayList:` Provides a resizable array implementation that is part of the Java Collections Framework.
- `java.util.Scanner:` A simple text scanner that can parse primitive types and strings using regular expressions. It is used here for reading input from the standard input stream.
