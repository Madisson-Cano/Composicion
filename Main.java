package Vehiculos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo carro = new Vehiculo(new Conducir());
        carro.mover();  

        Vehiculo avion = new Vehiculo(new Volar());
        avion.mover();  

        carro.setMovimiento(new Volar());
        carro.mover();  

	}

}
