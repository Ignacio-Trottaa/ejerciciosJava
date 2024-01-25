public class numerosPrimos {
    public static void main(String[] args) {

        //Numeros primos
        //Son aquellos que tienen 2 divisores, 1 y su mismo numero

        //en el rango entre 2 y 100
        for (int i = 2; i <= 100; i++) {
            //todos los numeros son primos
            boolean numPrimo = true;
            for (int j = 2; j < i; j++) {
                //verifica si el numero actual (i) es divisible por otro numero diferente de 1 e i
                if (i % j == 0) {
                    //si encuentra otro divisidor deja de ser primo y para a ser false
                    numPrimo = false;
                    break;
                }
            }
            //si el numero sigue siendo primo sera true y se imprime por consola
            if (numPrimo) {
                System.out.println(i);
            }
        }
    }
}