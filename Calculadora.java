public class Calculadora{
    
    public Calculadora(){
    }

    public int calcularResultados(int[][] listaDeCompras){
        int resultado=0;
            for(int i=0;i<listaDeCompras.lenght;i++){
                resultado+=listaDeCompras[i][1]*listaDeCompras[i][2];  
            }
        return resultado;
    }
    
}