package caso.pkg1;
import javax.swing.JOptionPane;
public class Caso1 {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        String nombreDeCliente = "";
        int cedulaDeCliente = 0;
        int numeroDeFactura = 0;
        double montoDeLaFactura = 0;
        String mesDeLaFactura = "";
        int anoDeLaFactura = 0 ;
        int estadoDeLaFactura = 0;
        double noPagadas = 0;
        
        
        int condicionDeSalida = 1;
        String pregunta;
        pregunta = JOptionPane.showInputDialog("dseas agregar una factura: si= z & no presione cualquier tecla");
        
        if (pregunta == "z") {
            condicionDeSalida = condicionDeSalida - 1;
        }
        while ( condicionDeSalida > 0 ) {
        
            String x = "";
            x = JOptionPane.showInputDialog("Introduzca el nombre del cliente");
            nombreDeCliente = nombreDeCliente + x;

            String y ="";
            int cedula = 0;
            y = JOptionPane.showInputDialog("Ingrese la cedula del cliente"); 
            cedula = (int) Double.parseDouble(y);
            cedulaDeCliente = cedulaDeCliente + cedula;

            String z ="";
            int factura = 0;
            z = JOptionPane.showInputDialog("Ingrese el numero de factura"); 
            factura = (int) Double.parseDouble(z);
            numeroDeFactura = numeroDeFactura + factura;

            String w ="";
            int monto = 0;
            w = JOptionPane.showInputDialog("Ingrese el monto de la factura"); 
            monto = (int) Double.parseDouble(w);
            montoDeLaFactura = montoDeLaFactura + monto;

            String v = "";
            v = JOptionPane.showInputDialog("Introduzca el mes de la factura");
            mesDeLaFactura = mesDeLaFactura + v;
            
            String e ="";
            int ano = 0;
            e = JOptionPane.showInputDialog("Ingrese el ano de la factura "); 
            ano = (int) Double.parseDouble(e);
            anoDeLaFactura = anoDeLaFactura + ano;
            
            String h ="";
            int estado = 0; 
            h = JOptionPane.showInputDialog("Ingrese el estado de la factura 1 pagada & 2 no pagadas"); 
            estado = (int) Double.parseDouble(h);
            anoDeLaFactura = anoDeLaFactura + estado;
            
            if (estado == 2) {
                noPagadas = noPagadas + monto;
            }
        }
        double plan = 0;
        
        plan = ((noPagadas*0.5)+ noPagadas)/6;
        System.out.println("El ususario debe de pagar un totyal de" + plan + "Esto en un plaso de 6 meses");
                
    }
    
}
