# Java 2D Array Input with JOptionPane

This project demonstrates a Java program that uses `JOptionPane` to get user input for a 2D array and prints the values using nested `for` loops.

## Getting Started

Create a file named `Main.java` and paste the following code:

```java
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        // Get values for each position in the array
        arr[0][0] = Integer.parseInt(JOptionPane.showInputDialog("Enter # at position 1"));
        arr[0][1] = Integer.parseInt(JOptionPane.showInputDialog("Enter # at position 2"));
        arr[0][2] = Integer.parseInt(JOptionPane.showInputDialog("Enter # at position 3"));
        arr[1][0] = Integer.parseInt(JOptionPane.showInputDialog("Enter # at position 4"));
        arr[1][1] = Integer.parseInt(JOptionPane.showInputDialog("Enter # at position 5"));
        arr[1][2] = Integer.parseInt(JOptionPane.showInputDialog("Enter # at position 6"));
        arr[2][0] = Integer.parseInt(JOptionPane.showInputDialog("Enter # at position 7"));
        arr[2][1] = Integer.parseInt(JOptionPane.showInputDialog("Enter # at position 8"));
        arr[2][2] = Integer.parseInt(JOptionPane.showInputDialog("Enter # at position 9"));

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
```

Open a terminal and navigate to the directory containing `Main.java`. Compile the program using the following command:

```sh
javac Main.java
```

Run the program with the following command:

```sh
java Main
```

## Notes

- `JOptionPane` is used to get user input for each element of the 2D array.
- The input values are parsed into integers and assigned to the respective positions in the array.
- Nested `for` loops are used to print the values of the 2D array.
- The outer loop iterates over the rows, and the inner loop iterates over the columns, printing each value followed by a space.

```

```
