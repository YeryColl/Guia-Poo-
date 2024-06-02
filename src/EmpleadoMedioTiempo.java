public class EmpleadoMedioTiempo extends Empleado {

    private double salarioPorHora;
    private int HorasTrabajadasPorSemana;

    public EmpleadoMedioTiempo(String nombre, String numeroIdentificacion, double salarioPorHora, int HorasTrabajadasPorSemana){
       super(nombre, numeroIdentificacion);
       this.salarioPorHora = salarioPorHora;
       this.HorasTrabajadasPorSemana = HorasTrabajadasPorSemana;
    }

    @Override
    public double calcularSalario(){
        return salarioPorHora * HorasTrabajadasPorSemana * 4;
    }

}
