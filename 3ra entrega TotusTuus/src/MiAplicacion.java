
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fapal
 */
public class MiAplicacion {
    
    private static MiAplicacion instancia;
    private List<Cliente> listaDeClientes = new ArrayList<>();

    
    public List<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }
    
    public MiAplicacion() {
        
    }
    
    public static MiAplicacion getInstancia() {
        if (instancia == null) {
            instancia = new MiAplicacion();
        }
        return instancia;
    }
    
    public void crearYAgregarCliente(String nombre, String nit, String direccion) {
        // Crea un nuevo cliente con los datos proporcionados
        Cliente nuevoCliente = new Cliente(nombre, nit, direccion);
        
        // Agrega el cliente a la lista de clientes
        listaDeClientes.add(nuevoCliente);
        
        for (Cliente cliente : listaDeClientes) {
            System.out.println(listaDeClientes.indexOf(cliente) + 1);
            System.out.println("Nombre: "+cliente.getNombre()+"\n"+" Nit: "+cliente.getNit()+"\n" + " Dirección: "+cliente.getDireccion()+"\n");
        }
        
    }
    
    public List<Cliente> mostrar() {
        return listaDeClientes;
    }
    
    /*

    public void agregarCliente(Cliente cliente) {
        listaDeClientes.add(cliente);
    }
    
    public void actualizarLista() {
        
        for (Cliente cliente : listaDeClientes) {
            System.out.println(listaDeClientes.indexOf(this)+1);
            System.out.println("Nombre: "+cliente.getNombre()+"\n"+" Nit: "+cliente.getNit()+"\n" + " Dirección: "+cliente.getDireccion()+"\n");
        }
        
    }
    */
    
/*
    public MiAplicacion guardar() {
        MiAplicacion app = new MiAplicacion();

        // Iniciar depuración
        System.out.println("App creada y no nula: " + (app != null));

        RegistrarNuevoCliente clienteFrame = new RegistrarNuevoCliente(app);
        clienteFrame.setVisible(true);

        // Verificar si app se vuelve nula
        System.out.println("Después de crear RegistrarNuevoCliente: " + (app != null));
        
        return app;
    
    
    }
*/
}
