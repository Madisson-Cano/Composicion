package Vehiculos;

public class Vehiculo {
	
	 private Moverse movimiento;

	    public Vehiculo(Moverse movimiento) {
	        this.movimiento = movimiento;
	    }

	    public void mover() {
	        movimiento.mover();
	    }

	    public void setMovimiento(Moverse movimiento) {
	        this.movimiento = movimiento;
	    }

}
