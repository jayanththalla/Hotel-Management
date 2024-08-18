# 🏨 Hotel Reservation System

Welcome to the **Hotel Reservation System**! This application is designed to help manage hotel bookings, reservations, and room assignments efficiently. The system is built using Java and demonstrates key object-oriented programming (OOP) concepts such as Classes, Inheritance, Encapsulation, and Polymorphism.

## 🌟 Key Concepts Used

### 🏢 Classes
- **Hotel**: Represents the hotel itself, managing a collection of rooms and reservations.
- **Room**: A general representation of any room in the hotel. Contains basic attributes like room number, type, and availability.
- **Reservation**: Handles the reservation details, including guest information, room assigned, and duration of stay.

### 🌱 Inheritance
- **SingleRoom**: A subclass of `Room`, representing a room specifically designed for single occupancy.
- **SuiteRoom**: A subclass of `Room`, representing a luxurious suite with more amenities.

### 🔐 Encapsulation
- **Reservation Details**: The details of a reservation (like guest information, check-in/check-out dates, etc.) are encapsulated within the `Reservation` class. This ensures that sensitive information is protected and only accessible through controlled methods.

### 🎭 Polymorphism
- **Booking Methods**: The system uses polymorphism to handle different types of room bookings. Whether it's a single room or a suite, the booking process can be managed uniformly through method overriding.

## 🛠️ Installation and Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/hotel-reservation-system.git
   ```
2. **Navigate to the project directory**:
   ```bash
   cd hotel-reservation-system
   ```
3. **Compile the project**:
   ```bash
   javac -d bin src/*.java
   ```
4. **Run the application**:
   ```bash
   java -cp bin Main
   ```

## 🚀 Usage

1. **Create Rooms**: Initialize the hotel with various types of rooms (SingleRoom, SuiteRoom).
2. **Make Reservations**: Use the system to make reservations for guests by specifying the room type, check-in, and check-out dates.
3. **View Reservations**: List all current reservations and their details.
4. **Manage Rooms**: Check room availability, assign rooms to guests, and handle check-ins/check-outs.


## 📚 OOP Concepts in Action

- **Encapsulation**: Guest and reservation details are protected within their respective classes.
- **Inheritance**: `SingleRoom` and `SuiteRoom` inherit common properties and methods from the `Room` class.
- **Polymorphism**: The `bookRoom` method demonstrates polymorphism by handling different room types seamlessly.

## 🙌 Contributions

Contributions are welcome! Feel free to fork the repository, make improvements, and submit a pull request.


