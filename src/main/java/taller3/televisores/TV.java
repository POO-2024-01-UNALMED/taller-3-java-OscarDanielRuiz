package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	
	//Metodos get y set
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Marca getMarca() {
		return marca;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getCanal() {
		return canal;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public int getVolumen() {
		return volumen;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	public Control getControl() {
		return control;
	}
	
	//Metodos numTV
	
	public static void setNumTV(int num) {
		numTV = num;
	}
	public static int getNumTV() {
		return numTV;
	}
	
	//Metodos turn y estado
	
	public void turnOn() {
		if (estado != true) {
			estado = true;
		}
	}
	
	public void turnOff() {
		if (estado == true) {
			estado = false;
		}
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	//Metodos cambio de canal y volumen
	
	public void canalUp() {
		if (estado == true && canal < 120) {
			canal++;
		}
	}
	
	public void canalDown() {
		if (estado == true && canal > 1) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if (estado == true && volumen < 7) {
			volumen++;
		}
	}
	
	public void volumenDown() {
		if (estado == true && volumen > 0) {
			volumen--;
		}
	}
}
