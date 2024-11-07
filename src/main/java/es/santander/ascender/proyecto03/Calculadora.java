package es.santander.ascender.proyecto03;

public class Calculadora {
    public long sumar(long sumando1, long sumando2) {
        return sumando1 + sumando2; 
    }

    public long restar(long substraendo, long minuendo) {
        return substraendo - minuendo;
    }

    public long multiplicar(long factor1, long factor2){
        return factor1 * factor2;
    }
    public long dividir(long dividendo, long divisor) {
        return dividendo / divisor;
    }

    public void presentarTablaMultiplicar(int numero) {

        for ( int i = 0 ; i <= 10 ; i = i + 1) {
            System.out.println(i * numero);
         
        }
    
    }
    


    public int[] CalcularTablaMultiplicar(int numero) {
        int[] tablaDeMultiplicar = new int[11];
        for (int i = 0 ; i <= 10; i++) {
            tablaDeMultiplicar[i] = i * numero;
        }
        return tablaDeMultiplicar;
    }

    
    public int[] CalcularTablaMultiplicarConWhile(int numero) {
        //Creo el array
        int[] tablaDeMultiplicar = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int i = 0;
        while (i <= tablaDeMultiplicar.length -1) {
            tablaDeMultiplicar[i] = numero * i;
            i = i +1;
        }

        //Retorno el array con tabla de multiplicar
        return tablaDeMultiplicar;

    }
    


    public int[] CalcularTablaMultiplicarConDoWhile(int numero) {
        //Creo el array 
        int[] tablaDeMultiplicar = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int i = 0;
        do{
            tablaDeMultiplicar[i] = numero * i;
            i = i +1;
        } while (i <= tablaDeMultiplicar.length -1);

        //Retorno el array con tabla de multiplicar
        return tablaDeMultiplicar;
    }
    

    

    private void jugarConArrays(int numero) {
        int[] resultados = null;

        int[] borrame = new int[11];

        borrame[0] = 3;

        borrame[4] = 6;
        System.out.println(borrame.length);

        borrame[7] = borrame [0] + borrame[4];
        

        System.out.println(borrame[7]);
    }
}