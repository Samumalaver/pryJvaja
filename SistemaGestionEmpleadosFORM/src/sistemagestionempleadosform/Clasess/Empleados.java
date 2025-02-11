/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempleadosform.Clasess;

/**
 *
 * @author USUARIO
 */
public class Empleados {
    private String nombre;
    private String ID;
    private String Salario;
    private String Departamento;

    public Empleados(String nombre, String ID, String Salario, String Departamento) {
        this.nombre = nombre;
        this.ID = ID;
        this.Salario = Salario;
        this.Departamento = Departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
    
    
}
