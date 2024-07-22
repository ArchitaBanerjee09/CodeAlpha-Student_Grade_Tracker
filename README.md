# Student Grade Tracker

## Overview

The Student Grade Tracker is a Java application designed to track and manage student grades. Users can input student names and their corresponding grades, and the application calculates average, highest, and lowest grades. It demonstrates object-oriented programming concepts by using classes to represent students and manage their grades.

## Project Structure

The project consists of the following Java files:

1. **`Main.java`** - The entry point of the application. It handles user interactions, including input of student names and grades, and displays the calculated results.
2. **`Student.java`** - Represents a student with a name and grade. Provides methods to get and set the student's name and grade.
3. **`GradeTracker.java`** - Manages a list of `Student` objects. Provides functionality to add students, calculate the average grade, and determine the highest and lowest grades.
4. **`InputUtil.java`** - Utility class to handle user input via the console. Provides methods to read student names and grades.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor

### Setup

1. **Clone the Repository**

   ```bash
   git clone https://github.com/yourusername/student-grade-tracker.git
   cd student-grade-tracker
   ```

2. **Compile the Code**
   Navigate to the project directory and compile the Java files:
   ```bash
   javac -d bin src/com/tracker/*.java src/com/tracker/model/*.java src/com/tracker/util/*.java
   ```

## Usage

1. Starting the Application
   When you start the application, you will be welcomed with the following message:
   ```bash
   Welcome to the Student Grade Tracker!
   ```

2. Input Data
   - Enter the student’s name followed by their grade.
   - Repeat the process for multiple students.
   - Type exit as the student’s name to stop the input process.

3. Results
   After entering the student data, the application will display:
   - The average grade of all entered students.
   - The highest grade and the student who received it.
   - The lowest grade and the student who received it.

4. Exiting
   The application will end after displaying the results with the following message:
   ```bash
   Thank you for using the Student Grade Tracker!
   ```

## Files Overview

- `Main.java`: Contains the main method and logic for interacting with the user.
- `Student.java`: Defines the Student class with attributes for name and grade.
- `GradeTracker.java`: Manages a list of Student objects and provides methods for calculations.
- `InputUtil.java`: Provides methods for reading user input from the console.

