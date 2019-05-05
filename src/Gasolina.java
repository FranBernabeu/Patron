
public class Gasolina extends Decorador {

	public Gasolina(Venta venta) {
		super(venta);
	}

	public String getDescripcion() {
		return getVenta().getDescripcion()+"+Motor gasolina";
	}

	public int getPrecio() {
		return getVenta().getPrecio()+1500;
	}

}
