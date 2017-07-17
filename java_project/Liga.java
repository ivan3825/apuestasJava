package java_project;

public class Liga {
	private String Pais;
	private String denominacion;
	private int nEncuentros;
	private int nEquipos;
	private java.util.Date fecha_inicio;
	private java.util.Date fecha_fin;
	/**
	 * @return the pais
	 */
	public String getPais() {
		return Pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		Pais = pais;
	}
	/**
	 * @return the denominacion
	 */
	public String getDenominacion() {
		return denominacion;
	}
	/**
	 * @param denominacion the denominacion to set
	 */
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	/**
	 * @return the nEncuentros
	 */
	public int getnEncuentros() {
		return nEncuentros;
	}
	/**
	 * @param nEncuentros the nEncuentros to set
	 */
	public void setnEncuentros(int nEncuentros) {
		this.nEncuentros = nEncuentros;
	}
	/**
	 * @return the nEquipos
	 */
	public int getnEquipos() {
		return nEquipos;
	}
	/**
	 * @param nEquipos the nEquipos to set
	 */
	public void setnEquipos(int nEquipos) {
		this.nEquipos = nEquipos;
	}
	/**
	 * @return the fecha_inicio
	 */
	public java.util.Date getFecha_inicio() {
		return fecha_inicio;
	}
	/**
	 * @param fecha_inicio the fecha_inicio to set
	 */
	public void setFecha_inicio(java.util.Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	/**
	 * @return the fecha_fin
	 */
	public java.util.Date getFecha_fin() {
		return fecha_fin;
	}
	/**
	 * @param fecha_fin the fecha_fin to set
	 */
	public void setFecha_fin(java.util.Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	
}
