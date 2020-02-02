
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class testCirculoParam {
	
	double radio;
	double resultadoPer;
	double resultadoAre;
	String tipoFigura;
	
	/* radio, resultado perimetro, resultado area, tipo de figura */
	public testCirculoParam(double radio, double resultadoPer
										 ,double resultadoAre, String tipoFigura){
		this.radio=radio;
		this.resultadoPer=resultadoPer;
		this.resultadoAre=resultadoAre;
		this.tipoFigura=tipoFigura;
	}
	
	@Parameters
	public static Collection<Object[]> testRadios(){
	
			return Arrays.asList(new Object[][] {
								{7,43.9824,153.9384,"Circulo"},
								{0,0,0,"Circulo"},
								{-3,18.8496,28.2744,"Circulo"}
							}  );
	}
	
	@Test
	public void testCirculoPerimetroArea() {
		
		double area;
		double perimetro;
		
		Circulo_LMGG circulo=new Circulo_LMGG(radio,tipoFigura);
		
		perimetro=circulo.perimetro();
		assertEquals(resultadoPer, perimetro,0);
		
		area=circulo.area();
		assertEquals(resultadoAre, area,0);
		
	}

}
