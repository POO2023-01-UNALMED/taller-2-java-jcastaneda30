package taller;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento asientos[];
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	boolean pirata = true;
	String mensaje;
	public int cantidadAsientos() {
		int cantidad = 0;
		for (int i=0; i<asientos.length;i++) {
			if (asientos[i]!=null) {
				cantidad++;
			}
		}
		return cantidad;
	}
	public String verificarIntegridad(){
		if (motor.registro==registro) {
			for (int i=0; i<asientos.length;i++) {
			if (asientos[i]!=null) {
				if(registro!=asientos[i].registro) {
					pirata = false; 
					break;
				}
			}
		}
		if (pirata==false) {
			mensaje  = "Las piezas no son originales";
		}else {
			mensaje = "Auto original";
		}
		
	}
		return mensaje;
	}
}
