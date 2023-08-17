import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debe proporcionar una lista de numeros con un espacio de por medio");
            return;
        }

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + args[i] + "' no es un número entero válido.");
                return;
            }
        }

        int[] prefixSum = calcularPrefixSum(numbers);

        System.out.println("Lista de numeros: " + Arrays.toString(numbers));
        System.out.println("Suma prefija correspondiente: " + Arrays.toString(prefixSum));
    }

    public static int[] calcularPrefixSum(int[] numbers) {
        int[] prefixSum = new int[numbers.length];
        prefixSum[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + numbers[i];
        }

        return prefixSum;
    }
}