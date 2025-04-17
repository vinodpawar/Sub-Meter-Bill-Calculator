# Sub Meter Bill Calculator

This Java program helps tenants calculate their electricity bills based on their usage in shared living spaces. The program takes input for the total bill amount and the individual tenant's consumption (in kWh) to compute the share of the bill that the tenant is responsible for.

## Features
- Calculates individual bill share based on sub-meter readings.
- Simple user interface for input and output.

## How It Works

1. The program takes the total electricity bill for the entire property.
2. The tenant's electricity usage is entered.
3. The program calculates the amount each tenant needs to pay based on their share of the total electricity consumed.

## Requirements

- Java 8 or later

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/vinodpawar/Sub-Meter-Bill-Calculator.git
   ```
2. Ensure Java is Installed
   If Java is not installed, download and install the Java Development Kit (JDK) from the [official JDK website](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html). You can verify the installation by running the
   following command:
   ```bash
   java -version
   ```


2. Compile the Java file:
   ```bash
   javac TenantLightBillCalculator.java
   ```

3. Run the program:
   ```bash
   java TenantLightBillCalculator
   ```

4. Follow the prompts to input the total bill and tenant's consumption.

## Sample Usage

```bash
Enter the total MSEB bill amount: 2548
Enter the MSEB units consumed: 127
Enter previous reading for Shop 1 and 2: 
Enter previous reading for Block 1:
Enter previous reading for Block 2:
Enter current reading for Shop 1 and 2:
Enter current reading for Block 1:
Enter current reading for Block 2:
```

## License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/vinodpawar/Sub-Meter-Bill-Calculator/blob/main/LICENSE) file for details.

## Contributing

If you'd like to contribute, feel free to fork the repository and submit a pull request. Please make sure to follow best practices and provide a detailed explanation of your changes.
