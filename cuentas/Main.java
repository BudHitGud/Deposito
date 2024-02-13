package cuentas;
/**
 * La clase Main es la entrada principal del programa y donde se ejecuta el unico metodo
 */
public class Main {

    public static void main(String[] args) 
    {
    	//pese a que el ejercicicio no lo indica, incluyo un parametro float en la llamada al metodo para que no de error (1.3f)
        operativa_cuenta(1.3f);
    }
/**
 * El metodo operativa_cuenta crea una cuenta ficticia y realiza dos operaciones a modo de muestra, imprimiendo el estado
 * @param cantidad  Este parametro deberia ser usado dentro de los metodos retirar o ingresar pero todavia no esta redactado el codigo.
 *
    @see CCuenta.ingresar();
    @see CCuenta.retirar();
    */
	private static void operativa_cuenta(float cantidad) 
	{
		CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try 
        {
            cuenta1.retirar(2300);
        } 
        catch (Exception e) 
        {
            System.out.print("Fallo al retirar");
        }
        
        try
        {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(685);
        } 
        catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
        
        //Incluir estas dos lineas |v| para ver si ejecuta los dos: try();
       // saldoActual = cuenta1.estado();
       // System.out.println("El saldo actual es"+ saldoActual );
	}
}
