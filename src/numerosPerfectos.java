public class numerosPerfectos {
    public static void main(String[] args) {

        //Numeros Perfectos
        //en el rango de 1 a 1000
        //Los numeros perfectos son aquellos que son la suma de sus divisores excluyendo al propio numero
        // 1 + 2 + 3 == 6 && 6 == numero perfecto
        for (int i = 1; i < 1000; i++) {
            int cont = 0;
            for (int j = 1; j < i; j++) {
                //verifica si el resto de (i) entre (j) da cero para saber los divisores
                if (i % j == 0) {
                    //suma los divisores de (i)
                    cont += j;
                }
            }
            //verifica si la suma de los divisores es igual al numero
            if (cont == i) {
                System.out.println(i);
            }
        }
    }
}
