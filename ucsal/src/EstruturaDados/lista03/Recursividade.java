package EstruturaDados.lista03;

public class Recursividade {


    public int calcularFatorial(int n){
        int fatorial = 1;
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * calcularFatorial(n - 1);

    }

    public int calcularFibonacci(int n){
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }

    public int calculaSoma(int n){
        if (n == 1) {
            return 1;
        }
        return n + calculaSoma(n - 1);
    }


}
