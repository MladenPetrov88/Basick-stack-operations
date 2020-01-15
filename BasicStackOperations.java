import javax.management.StandardEmitterMBean;
import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < Integer.parseInt(input[0]); i++) {
            int numbers = scanner.nextInt();
            stack.push(numbers);
        }

        for (int i = 0; i < Integer.parseInt(input[1]); i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println("0");
        }

        int min = Integer.MAX_VALUE;
        if (stack.contains(Integer.parseInt(input[2]))) {
            System.out.println("true");
        } else {
            for (Integer item : stack) {
                if (item < min) {
                    min = item;
                    System.out.println(item);
                }
            }
        }

    }
}
