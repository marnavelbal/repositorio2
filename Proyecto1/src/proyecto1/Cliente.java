/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Dell
 */
public class Cliente extends Persona {

    private int numCliente;

    public Cliente(int numCliente, String nombre, int edad) {
        super(nombre, edad);
        this.numCliente = numCliente;
    }

    public Cliente() {
    }

    /**
     * @return the numCliente
     */
    public int getNumCliente() {
        return numCliente;
    }

    /**
     * @param numCliente the numCliente to set
     */
    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

}
