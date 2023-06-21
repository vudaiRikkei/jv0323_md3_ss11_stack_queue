import java.util.Scanner;
import java.util.Stack;

/**Đề bài: viết 1 chương trình cho ta nhập số lượng các từ, sau đó sẽ cho chúng ta nhập từng từ
 *  rồi in ra theo thứ tự đảo ngược của các từ đó */
public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap văn bản");
        String str = sc.nextLine();
        String[] strings = str.split(" ");

        Stack<String> list = new Stack<>();
        for (int i = 0; i < strings.length; i++) {
            list.push(strings[i]);
        }
        while(!list.isEmpty()){
            System.out.println(list.pop());
        }
        System.exit(0);
    }
}
