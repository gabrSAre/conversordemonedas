import com.challencealura.conversordemonedas.BuscadorDeMonedas;
import com.challencealura.conversordemonedas.Scaners;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        //Instanciando la clase Scaners......................................................
        Scaners escaner = new Scaners();
        String monedaOrigen = escaner.ScannerLine("INGRESE LA MONEDA DE ORIGEN");
        String monedaDestino = escaner.ScannerLine("INGRESE LA MONEDA A LA QUE DESEA CONVERTR");
        double valorModena = escaner.ScannerDou("INGRESE EL VALOR QUE DESEA CONVERTIR");

        //Instanciando la clase BuscadorDeMonedas............................................
        BuscadorDeMonedas buscar = new BuscadorDeMonedas();
        String json=buscar.BuscadorDeMonedas(monedaOrigen,monedaDestino,valorModena);

        //Imprimiemdo el resultado del buscador.............................................
        System.out.println("El resultado de la convercion es: " + json);

    }
}
