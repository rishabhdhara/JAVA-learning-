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

TEMPERATURE CONVERTOR:
# Temperature Converter (Java)

A simple command-line program that converts temperatures between Celsius,
Fahrenheit, and Kelvin.

## What it does

When you run the program, it shows a menu with 4 options:

1. Celsius to Fahrenheit
2. Fahrenheit to Celsius
3. Celsius to Kelvin
4. Kelvin to Celsius

You type a number to pick an option, enter a temperature, and it prints
the converted result.

## How to run it

You need Java installed on your computer.

### Step 1: Compile the program

Open a terminal in the folder with `TemperatureConverter.java` and run:

```
javac TemperatureConverter.java
```

This creates a file called `TemperatureConverter.class`.

### Step 2: Run the program

```
java TemperatureConverter
```

### Step 3: Follow the prompts

Example:

```
=================================
      TEMPERATURE CONVERTER
=================================
1. Celsius to Fahrenheit
2. Fahrenheit to Celsius
3. Celsius to Kelvin
4. Kelvin to Celsius
=================================
Enter your choice (1-4): 1
Enter temperature in Celsius: 100
100.0 Celsius = 212.0 Fahrenheit
```

## How the code works (in plain terms)

- `Scanner` is used to read what the user types into the terminal.
- The program asks for a choice (1-4), then uses `if / else if` statements
  to decide which conversion to run.
- Each conversion type (Celsius to Fahrenheit, etc.) has its own small
  method. This keeps `main()` from getting too cluttered and makes each
  formula easy to find and test on its own.
- The actual math uses the standard conversion formulas:
    - Celsius to Fahrenheit: `(C * 9/5) + 32`
    - Fahrenheit to Celsius: `(F - 32) * 5/9`
    - Celsius to Kelvin: `C + 273.15`
    - Kelvin to Celsius: `K - 273.15`

## Known limitations

- If you type something that isn't a number when it asks for input, the
  program will crash instead of showing a friendly error. Handling that
  properly needs try/catch, which is a nice next step once you're
  comfortable with the basics here.
- The program only runs one conversion per run — you have to restart it
  to do another.




# Tic Tac Toe :

My first tic-tac-toe game! Made while following Bro Code's Java tutorial on YouTube.

## How to run

```
javac TicTacToe.java
java TicTacToe
```

Player 1 is X, Player 2 is O. Type the number (1-9) of the spot you want to play, based on this layout:

```
1 | 2 | 3
---------
4 | 5 | 6
---------
7 | 8 | 9
```

## Features

- Two players take turns on the same computer
- Checks rows, columns, and diagonals for a win
- Detects a tie if the board fills up

## Known issues (will fix later)

- [ ] Typing a letter instead of a number crashes the game (need to add try/catch for bad input)
- [ ] Typing a number bigger than 9 also crashes it (forgot to check the upper bound in `isValidMove`)
- [ ] If the very last move of the game is also a winning move, it says "It's a tie!" instead of announcing the winner (checking tie before checking win)
- [ ] Board size and win conditions are hardcoded (3s and 9s everywhere) instead of using constants
- [ ] No way to play again after a game ends without restarting the program

## What I learned

- 2D arrays (`char[][]`)
- `Scanner` for reading input
- Converting a 1-9 number into row/col with `(choice - 1) / 3` and `(choice - 1) % 3`
- `static` methods and fields
