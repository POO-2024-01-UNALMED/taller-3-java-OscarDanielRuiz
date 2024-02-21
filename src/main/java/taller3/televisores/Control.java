package taller3.televisores;

public class Control {
	private TV tv;
	
	public void setCanal(int canal) {
		if (tv.getEstado() == true && (canal <= 120 && canal >= 1)) {
			tv.setCanal(canal);
		}
	}
	
	public void canalUp() {
		if (tv.getEstado() == true && tv.getCanal() < 120) {
			tv.setCanal(tv.getCanal()+1);
		}
	}
	
	public void canalDown() {
		if (tv.getEstado() == true && tv.getCanal() > 1) {
			tv.setCanal(tv.getCanal()-1);
		}
	}
	
	public void setVolumen(int volumen) {
		if (tv.getEstado() == true && (volumen <= 7 && volumen >= 0)) {
			tv.setVolumen(volumen);
		}
	}
	
	public void volumenUp() {
		if (tv.getEstado() == true && tv.getVolumen() < 7) {
			tv.setVolumen(tv.getVolumen()+1);
		}
	}
	
	public void volumenDown() {
		if (tv.getEstado() == true && tv.getVolumen() > 0) {
			tv.setVolumen(tv.getVolumen()-1);
		}
	}
	
	public void turnON() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	public void setTV(TV tv) {
		this.tv = tv;
	}
	
	public TV getTV() {
		return tv;
	}
}
