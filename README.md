# JAVA-learning-
Weight convertor: 
# Weight Converter (Java)

A simple console that converts weights between Kilograms, Grams, Pounds, and Ounces. Built as a beginner-level Java project using just `Scanner`, `if`/`switch` statements, and a few small helper methods.

## Features

- Kilograms → Pounds
- Pounds → Kilograms
- Kilograms → Grams
- Grams → Kilograms
- Pounds → Ounces
- Ounces → Pounds
- Menu loop so you can do multiple conversions in one run

## How to Run

You'll need Java installed (JDK 8 or later works fine).

```bash
javac WeightConverter.java
java WeightConverter
```

## Example

```
=== Weight Converter ===

1. Kilograms -> Pounds
2. Pounds -> Kilograms
3. Kilograms -> Grams
4. Grams -> Kilograms
5. Pounds -> Ounces
6. Ounces -> Pounds
7. Exit
Choose an option (1-7): 1
Enter the weight in kg: 70
70.00 kg = 154.32 lbs
```

## Conversion Factors Used

- 1 kg = 2.20462 lbs
- 1 kg = 1000 g
- 1 lb = 16 oz

## Project Structure

```
WeightConverter.java   # the whole program — one class, one main method, a few helper methods
README.md              # this file
```
