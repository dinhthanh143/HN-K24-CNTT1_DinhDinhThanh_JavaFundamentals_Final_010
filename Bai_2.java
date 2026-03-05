import java.util.*;

//Thống k tần suất xuất hiện của từ
public class Bai_2 {
    static void run(Scanner sc) {
        Map<Character, Integer> map = new HashMap<>();
        System.out.println("===========Bài 2============");
        System.out.println("Mời nhập chuỗi: ");
        String input = sc.nextLine();
        if (input.isEmpty()) {
            System.out.println("Chuỗi không được trống");
            return;
        }

        for (Character s : input.toLowerCase().toCharArray()) {
            if (s == ' ') continue;
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int max = 0;
        Character maxChar = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character c = entry.getKey();
            int val = entry.getValue();
            if (val > max) {
                max = val;
                maxChar = c;
            }
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("Từ xuất hiện nhiều nhất : " + maxChar);
        System.out.println("Số lần xuất hiện: " + max + " Lần");
        System.out.println("Các từ sau khi được sắp xếp: ");

        Character[] list = new Character[map.size()];
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            list[count++] = entry.getKey();
        }
        //Sắp xếp bubble
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    Character temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
        System.out.println("Danh sách các từ sau khi được sắp xếp: ");
        for (Character x : list) {
            System.out.print(x + ", ");
        }
        System.out.println("\n============================");
        sc.nextLine();
    }
}
