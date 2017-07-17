package java_project;

public class Equipo {
	private String nombre;
	private Jugador[] plantilla;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the plantilla
	 */
	public Jugador[] getPlantilla() {
		return plantilla;
	}
	/**
	 * @param plantilla the plantilla to set
	 */
	public void setPlantilla(Jugador[] plantilla) {
		this.plantilla = plantilla;
	}
	
}
