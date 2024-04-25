import com.challencealura.conversordemonedas.fusion.ConversorDeMonedas;
import com.challencealura.conversordemonedas.utilitarios.MensajesDeOpcion;
import com.challencealura.conversordemonedas.utilitarios.Scaners;

public class Principal {
    public static void main(String[] args){
        //Instanciando la clase escaner...........................................................
        Scaners escaner = new Scaners();

        boolean salir =false;
        int parametro=0;
        double valor=0;

        while (!salir){
            //Instanciando la clase MensajesDeOpción...................................
            MensajesDeOpcion mensaje = new MensajesDeOpcion();
            mensaje.mensajes();
            parametro= escaner.ScannerInt();

            //Instanciando la clase com.challencealura.conversordemonedas.fusion.ConversorDeMonedas
            ConversorDeMonedas conversor = new ConversorDeMonedas();

            switch (parametro){

                case 1:

                    valor= escaner.ScannerDou("Ingresa el valor que deseas convertir");
                    conversor.conversorDeMonedas("USD","ARS",valor);

                break;


                case 2:

                    valor= escaner.ScannerDou("Ingresa el valor que deseas convertir");
                    conversor.conversorDeMonedas("ARS","USD",valor);

                break;


                case 3:

                    valor= escaner.ScannerDou("Ingresa el valor que deseas convertir");
                    conversor.conversorDeMonedas("USD","BRL",valor);

                break;


                case 4:

                    valor= escaner.ScannerDou("Ingresa el valor que deseas convertir");
                    conversor.conversorDeMonedas("BRL","USD",valor);

                break;


                case 5:

                    valor= escaner.ScannerDou("Ingresa el valor que deseas convertir");
                    conversor.conversorDeMonedas("USD","COP",valor);

                break;


                case 6:

                    valor= escaner.ScannerDou("Ingresa el valor que deseas convertir");
                    conversor.conversorDeMonedas("COP","USD",valor);

                break;


                case 7:

                    salir=true;

                break;

                default:

                    System.out.println("¡Debe elegir una opción entre 1 y 7!");

            }
        }
    }
}






//DTMLJC+
