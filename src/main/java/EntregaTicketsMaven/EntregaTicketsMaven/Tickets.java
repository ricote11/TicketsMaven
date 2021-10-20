package EntregaTicketsMaven.EntregaTicketsMaven;

import javax.swing.JOptionPane;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class Tickets {
	private static Logger logger = LogManager.getLogger(Tickets.class);
	public static void AsientoAleatorio(Vagon vagon)
	{
		
		int fila, columna;
		for(fila=0;fila<vagon.tamFilas;fila++) {
			for(columna=0;columna<vagon.tamColumnas;columna++) {
				
				if(!vagon.AsientosLibres(fila, columna)) 
					{
						vagon.Asignar(fila, columna);
						return;
					}
				
				
			}
			
		}
	}
	
	public static void reservarAsiento(Vagon vagon) {
		int fila, columna;
		do {
			do {
				fila = Integer.parseInt(JOptionPane.showInputDialog("Introduzca una filas del 0 al 3"));
			}while(fila <0 || fila >3);
			do {
				columna = Integer.parseInt(JOptionPane.showInputDialog("Introduzca una columna del 0 al 7"));
			}while(fila <0 || fila > 7);
			
			if(vagon.AsientosLibres(fila,columna)) {
				System.out.println("Ese asiento no est� disponible");
			}
		}while(vagon.AsientosLibres(fila,columna) == true);
		
	
		vagon.Asignar(fila,columna);
		
	}
	
	public static void consultarAsiento(Vagon vagon) {
		int fila, columna;
		do {
			fila = Integer.parseInt(JOptionPane.showInputDialog("Introduzca una filas del 0 al 3"));
		}while(fila <0 || fila >3);
		do {
			columna = Integer.parseInt(JOptionPane.showInputDialog("Introduzca una columna del 0 al 7"));
		}while(fila <0 || fila > 7);
		
		if(vagon.AsientosLibres(fila,columna)) {
			System.out.println("Ese asiento no est� disponible");
		}else {
			System.out.println( "Ese asiento est� disponible");
		}
	}

}
