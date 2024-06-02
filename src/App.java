public class App {
    public static void main(String[] args) throws Exception {
        
        Empleado[] empleados = new Empleado[2];

        empleados[0] = new EmpleadoTiempoCompleto("Juan Perez", "123", 48000.0);
        empleados[1] = new EmpleadoMedioTiempo("Maria Lopez", "456", 15.0, 20);

        for (Empleado empleado : empleados) {
        System.out.println("Empleado: " + empleado.getNombre() + ", El salario mensual: $" + empleado.calcularSalario());
        }

        
       System.out.println("\n");
       for (int i = 0; i < empleados.length; i++) {
        System.out.println("Empleado" + empleados[i].getNombre() + ", Salario mensual: " + empleados[i].calcularSalario());
       }

    }
}
