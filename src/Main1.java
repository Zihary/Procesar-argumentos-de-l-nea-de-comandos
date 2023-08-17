import java.util.HashSet;

public class Main1 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Debe proporcionar al menos 3 números como argumentos.");
            return;
        }

        int Sum = Integer.parseInt(args[0]);
        int[] numbers = new int[args.length - 1];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(args[i + 1]);
        }

        boolean encontrar = hasPairWithSum(numbers, Sum);

        if (encontrar) {
            System.out.println("Si, existen dos elementos en el arreglo que suman " + Sum);
        } else {
            System.out.println("No, no existen dos elementos en el arreglo que sumen " + Sum);
        }
    }

    public static boolean hasPairWithSum(int[] arr, int objetivo) {
        HashSet<Integer> complements = new HashSet<>();

        for (int num : arr) {
            if (complements.contains(num)) {
                return true;
            }
            complements.add(objetivo - num);
        }

        return false;
    }
}
