# Doctor-Patient Management System

This project is a Java application designed to manage doctor and patient records. It allows users to add new doctors, register patients, and save their information to files. The system is built using object-oriented programming principles, ensuring encapsulation, inheritance, polymorphism, and abstraction.

## Project Structure

```
doctor-patient-management
├── src
│   ├── Main.java
│   ├── model
│   │   ├── Person.java
│   │   ├── Doctor.java
│   │   └── Patient.java
│   ├── service
│   │   ├── DoctorService.java
│   │   └── PatientService.java
│   └── util
│       └── FileHandler.java
├── README.md
```

## Features

- **Add New Doctor Records**: Users can input details for new doctors, including their specialization.
- **Register New Patients**: Users can register patients with their specific information and link them to doctors.
- **Display Lists**: The application can display lists of all doctors and patients.
- **File Management**: The system can save doctor and patient information to files and retrieve it when needed.

## Setup Instructions

1. Clone the repository to your local machine.
2. Navigate to the `src` directory.
3. Compile the Java files using a Java compiler.
4. Run the `Main.java` file to start the application.

## Usage

Upon running the application, users will be prompted to add doctors and register patients. The system will guide users through the process, allowing them to view and manage records efficiently.

## OOP Concepts Used

- **Encapsulation**: Protects data related to doctors and patients.
- **Inheritance**: The `Doctor` and `Patient` classes inherit common attributes from the `Person` class.
- **Polymorphism**: Methods like `displayInfo` are overridden in subclasses to show information specific to doctors and patients.
- **Abstraction**: The `Person` class serves as a blueprint for shared attributes and behaviors.

## Conclusion

This Doctor-Patient Management System is a comprehensive solution for managing healthcare records, leveraging Java's object-oriented features to ensure a robust and maintainable codebase.