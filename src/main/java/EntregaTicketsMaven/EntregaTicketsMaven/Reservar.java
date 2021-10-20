package EntregaTicketsMaven.EntregaTicketsMaven;

import javax.swing.JOptionPane;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class Reservar {
	private static Logger logger = LogManager.getLogger(Reservar.class);
	public static void main(String[] args) {
		
		
	Vagon vagon = new Vagon();
	Vagon vagon2 = new Vagon();
	
	
	int opcion, opcionVagon;
	boolean noReservar = false;
	boolean noVagon = false;
	
	vagon.CrearVagon();
	vagon2.CrearVagon();
	System.out.println(vagon.MuestraDisposicion() + vagon2.MuestraDisposicion());
	logger.info("El usuario ha entrado en el sistemas");
	do {
		do {
			
			opcionVagon= Integer.parseInt(JOptionPane.showInputDialog("introducir 1 para primer vagon \nintroducir 2 para segundo vagon \nintroducir 3 para salir"));
		}while(!(opcionVagon == 1) && !(opcionVagon == 2) && !(opcionVagon == 3) );
		
		switch(opcionVagon) {
		case 1:
			logger.info("El usuario ha elegido la primera opcion");
			do {
				do {
					
					opcion= Integer.parseInt(JOptionPane.showInputDialog("introducir 1 para consultar disposicion \nintroducir 2 para asignar un asiento libre \nintroducir 3 para elegirlo \nintroducir 4 para salir"));
				}while(!(opcion == 1) && !(opcion == 2) && !(opcion == 3) && !(opcion == 4));
				
				switch(opcion) {
				case 1:
					Tickets.consultarAsiento(vagon);
					break;
				case 2:
					Tickets.AsientoAleatorio(vagon);
					break;
				case 3:
					Tickets.reservarAsiento(vagon);
					break;
				case 4:
					noReservar = true;
				default:
					}
				 System.out.println(vagon.MuestraDisposicion());
				 System.out.println(vagon2.MuestraDisposicion());
		
			
			}while(noReservar == false);
			break;
		case 2:
			logger.info("El usuario ha elegido la tercera opcion");
			do {
				do {
					
					opcion= Integer.parseInt(JOptionPane.showInputDialog("introducir 1 para consultar disposicion, 2 para asignar un asiento libre, 3 para elegirlo, 4 para salir"));
				}while(!(opcion == 1) && !(opcion == 2) && !(opcion == 3) && !(opcion == 4));
				
				switch(opcion) {
				case 1:
					Tickets.consultarAsiento(vagon2);
					break;
				case 2:
					Tickets.AsientoAleatorio(vagon2);
					break;
				case 3:
					Tickets.reservarAsiento(vagon2);
					break;
				case 4:
					noReservar = true;
				default:
					}
				 System.out.println(vagon.MuestraDisposicion());
				 System.out.println(vagon2.MuestraDisposicion());
		
			
			}while(noReservar == false);
			break;
		case 3:
			logger.info("El usuario quiere salir de la aplicacion");
			noVagon = true;
			
		default:
				
		}
		}while(noVagon == false);
	
	}
}
