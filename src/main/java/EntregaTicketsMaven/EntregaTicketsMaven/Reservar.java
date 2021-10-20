package EntregaTicketsMaven.EntregaTicketsMaven;

import javax.swing.JOptionPane;

public class Reservar {
	
	public static void main(String[] args) {
		
		
	Vagon vagon = new Vagon();
	Vagon vagon2 = new Vagon();
	
	
	int opcion, opcionVagon;
	boolean noReservar = false;
	boolean noVagon = false;
	
	vagon.CrearVagon();
	vagon2.CrearVagon();
	System.out.println(vagon.MuestraDisposicion() + vagon2.MuestraDisposicion());
	
	do {
		do {
			
			opcionVagon= Integer.parseInt(JOptionPane.showInputDialog("introducir 1 para primer vagon \nintroducir 2 para segundo vagon \nintroducir 3 para salir"));
		}while(!(opcionVagon == 1) && !(opcionVagon == 2) && !(opcionVagon == 3) );
		
		switch(opcionVagon) {
		case 1:
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
			noVagon = true;
			
		default:
				
		}
		}while(noVagon == false);
	
	}
}
