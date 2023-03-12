import java.util.Scanner;

public class TowerOfHanoi {
  public static void main(String[] args) {
    TowerOfHanoi tower = new TowerOfHanoi();
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of disks: ");
    int n = input.nextInt();
    input.close();
    System.out.println("The moves are:");
    // L = left, M = middle, R = right
    tower.moveDisks(n, 'L', 'R', 'C');
  }
  void moveDisks(int n, char fromTower, char toTower, char auxTower) {
    if (n == 1) {
      System.out.println("Move disk " + n + " from " + fromTower + " to " +
                         toTower);
    } else {
      moveDisks(n - 1, fromTower, auxTower, toTower);
      System.out.println("Move disk " + n + " from " + fromTower + " to " +
                         toTower);
      moveDisks(n - 1, auxTower, toTower, fromTower);
    }
  }
}
