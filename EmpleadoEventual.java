package hospital.personas;

public class EmpleadoEventual extends Empleado{
    public double getHonorariosHora() {
        return honorariosHora;
    }

    public void setHonorariosHora(double honorariosHora) {
        this.honorariosHora = honorariosHora;
    }

    private double honorariosHora;

    public String getFechaTerminoContrato() {
        return fechaTerminoContrato;
    }

    public void setFechaTerminoContrato(String fechaTerminoContrato) {
        this.fechaTerminoContrato = fechaTerminoContrato;
    }

    private String fechaTerminoContrato;
}
