
import Modules.Staff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff("Mero Bhai", 20, 10000, 9877652, 5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of leaves");
        int leaves = sc.nextInt();
        staff.getsalary(leaves);
    }
}
