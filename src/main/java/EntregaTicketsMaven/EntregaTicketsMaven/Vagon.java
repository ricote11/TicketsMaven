package EntregaTicketsMaven.EntregaTicketsMaven;

public class Vagon {

	public String vagon [][];
	public static int  tamFilas = 4;
	public static int tamColumnas = 8;
	
	
	public Vagon()
	{
		vagon = new String [tamFilas][tamColumnas];
		
	}
	public void CrearVagon() {
		int i,j;
		for(i=0;i<tamFilas;i++) {
			for(j=0;j<tamColumnas;j++) {
				vagon[i][j]=" L ";
			}
		}
	}
	
	public String MuestraDisposicion() {
		StringBuilder casillas= new StringBuilder(64);
		int i,j;
		for(i=0;i<tamFilas;i++) {
			for(j=0;j<tamColumnas;j++) {
				casillas.append(vagon[i][j]);
				if(j!=2) {
					casillas.append(" ");
				}
			}
			casillas.append("\n");
		}
		return casillas.toString();
	}
	public boolean AsientosLibres(int x, int y) {
		if(vagon[x][y].equalsIgnoreCase(" L ")) {
			return false;
		}else {
			return true;
		}
	}
	
	public void Asignar(int x, int y) {
		vagon[x][y] = " O ";
	}
	
	

		
	
}
