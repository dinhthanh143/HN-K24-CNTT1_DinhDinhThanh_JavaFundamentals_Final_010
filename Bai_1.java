import java.util.*;

//Quản lí điểm lớp học
public class Bai_1 {
    static void run(Scanner sc) {
        List<Double> grades = new ArrayList<>();
        int pass = 0;
        int fail = 0;
        double total = 0;
        System.out.println("===========Bài 1============");
        System.out.println("Mời nhập số lượng điểm sinh viên: ");
        int count = 0;
        //Kiểm tra số lượng nhập vào
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Số lượng không hợp lệ (phải là số nguyên).");
                sc.nextLine();
            } else {
                count = sc.nextInt();
                if (count <= 0) {
                    System.out.println("Số lượng không hợp lệ (Phải lớn hơn 0)");
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Mời nhập điểm cho sinh viên thứ " + (i + 1));
            double grade = sc.nextDouble();
            grades.add(grade);
        }
        System.out.println("Danh sách điểm theo thứ tự tăng dần: ");
        //Sử dụng comparator để sort
        //grades.sort(Comparator.comparing(Double::doubleValue));

        //sắp xếp bubble
        for (int i = 0; i < grades.size(); i++) {
            for (int j = i + 1; j < grades.size(); j++) {
                if (grades.get(j) < grades.get(i)) {
                    double temp = grades.get(j);
                    grades.set(j, grades.get(i));
                    grades.set(i, temp);
                }
            }
        }
        for (double x : grades) {
            System.out.print(x + ", ");
            if (x < 5) {
                fail++;
            } else {
                pass++;
            }
            total += x;
        }
        System.out.println("\nĐiểm cao nhất: " + grades.getLast());
        System.out.printf("\nĐiểm TB:  %.2f \n", total / grades.size());
        System.out.println("Số sinh viên đậu: " + pass);
        System.out.println("Số sinh viên rớt: " + fail);
        System.out.println("============================");
        sc.nextLine();
    }
}
