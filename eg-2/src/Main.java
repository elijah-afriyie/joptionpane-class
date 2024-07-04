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