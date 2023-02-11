package hospital.personas;

public class Empleado extends Persona{

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    private String codEmpleado;

    public String getNumHorasExtras() {
        return numHorasExtras;
    }

    public void setNumHorasExtras(String numHorasExtras) {
        this.numHorasExtras = numHorasExtras;
    }

    private String numHorasExtras;

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    private String fechaIngreso;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    private String area;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    private String cargo;


}
