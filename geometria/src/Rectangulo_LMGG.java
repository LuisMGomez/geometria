
/**
 * @author Luis Manuel Gómez González
 * @version 1.2
 */
public class Rectangulo_LMGG extends FiguraGeometrica_LMGG {
	private double l1;
	private double l2;
	
	
	/**
	 * @param tipoFigura Tipo de figura Rectangulo. 
	 * @param lG Lado 1 o lado mas grande.
	 * @param lP Lado 2 o lado mas pequeño.
	 */
	public Rectangulo_LMGG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Calcula el area de un rectangulo
	 * @return Area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Calcula el perimetro de un rectangulo+
	 * @return Perimetro 
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
