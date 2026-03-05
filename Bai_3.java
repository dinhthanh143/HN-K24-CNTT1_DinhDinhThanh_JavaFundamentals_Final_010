import java.util.Scanner;
import java.util.Stack;

//Kiểm tra chuỗi đối xứng
public class Bai_3 {
    static void run(Scanner sc) {
        System.out.println("===========Bài 3============");
        System.out.println("Mời nhập chuỗi: ");
        String input = sc.nextLine();
        if (input.isEmpty()) {
            System.out.println("chuỗi không được rỗng");
            return;
        }
        boolean isPalindrome = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                System.out.println(input + " Không là chuỗi đối xứng!");
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " Là chuỗi đối xứng!");
        }
        System.out.println("\n============================");
        sc.nextLine();
    }
}
