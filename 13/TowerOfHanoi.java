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
    tower.move(n, 'L', 'M', 'R');
  }
  void move(int n, char from, char aux, char to) {
    if (n != 0) {
      // move n - 1 disks from from to aux
      move(n - 1, from, to, aux);
      // move the last disk from from to to
      System.out.println("=> " + n + " :- " + from + " -> " + to);
      // move n - 1 disks from aux to to
      move(n - 1, aux, from, to);
    }
  }

  // void move(int n, char from, char aux, char to) {
  //   if (n == 1) {
  //     System.out.println("=> " + n + " :- " + from + " -> " + to);
  //   } else {
  //     // move n - 1 disks from from to aux
  //     move(n - 1, from, to, aux);
  //     // move the last disk from from to to
  //     System.out.println("=> " + n + " :- " + from + " -> " + to);
  //     // move n - 1 disks from aux to to
  //     move(n - 1, aux, from, to);
  //   }
  // }
}
