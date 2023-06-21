import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/**  Viết chương trình sử dụng queue để lưu trữ và in ra các phần tử của một danh sách đầu vào. */
public class BT1 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Binh");
        queue.offer("Hai");
        queue.offer("Hieu");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println(queue);
    }
}
