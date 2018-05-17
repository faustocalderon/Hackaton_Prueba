import java.util.Scanner;
import java.util.*;
public class Super{
	private int[][] listaProductos = {{1, 100},{2, 500},{3, 70}, {4, 800}, {5, 10000}};
	private int[][] factura;
	
	
	
	public void getProductos(){
		try{
		Scanner lector = new Scanner(System.in);  
		System.out.println("Digite cuantos productos quiere");
		int cProd=0;
		
			cProd = lector.nextInt();
			factura = new int[cProd][3];
		

		for(int k = 0; k < cProd; ++k){
			System.out.println("Digite el producto que quiere: \n1: Papas \n2: Zanahoria\n3: Camote\n4: Brocoli\n5: Caca\n");
			int in=0;
			
			in = lector.nextInt();
			
			System.out.println("Digite la cantidad que quiere:");
			int c=0;
			
			c= lector.nextInt();
			factura[k][0] = in;
			factura[k][1] = c;
			
		}
		lector.close();
		}
		catch(InputMismatchException ex){
			System.out.println("Error " + ex);
		};   
	}

	
	private void asignarPrecios(){
		boolean encontrado = false;
		int j = 0;
		for(int i = 0; i<factura.length; ++i){
			while(!encontrado){	
				if(factura[i][0] == listaProductos[j][0]){
					factura[i][2] = listaProductos[j][1];
					encontrado = true;
				}
				j++;
			}
			j=0;
			encontrado = false;
		}
	}
	
	public int[][] getFactura(){
		return factura;
	}
	
	public void imprimirFactura(int total){
		System.out.println("Producto\tCantidad\tPrecio unitario");
		for(int i = 0; i<factura.length; ++i){
			System.out.println(factura[i][0]+"\t"+factura[i][1]+"\t"+factura[i][2]);
		}
		System.out.println("Total\t\t"+ total);
	}
	
	
	public static void main(String [ ] args){
		Calculadora c = new Calculadora();
		Super s = new Super();
		s.getProductos();
		s.asignarPrecios();
		int total = c.calcularResultados(s.getFactura());
		s.imprimirFactura(total);
	}

}