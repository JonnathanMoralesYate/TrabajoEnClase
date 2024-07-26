public class Reservacion {
    
    private String ModeloAuto;
    private String Marca;
    private String Matricula;
    private String Disponibilidad;
    
    public Reservacion(String modeloAuto, String marca, String matricula, String disponibilidad) {
        ModeloAuto = modeloAuto;
        Marca = marca;
        Matricula = matricula;
        Disponibilidad = disponibilidad;
    }
/*Metodos de manipulacion de datos */
    public String getModeloAuto() {
        return ModeloAuto;
    }
    public void setModeloAuto(String modeloAuto) {
        ModeloAuto = modeloAuto;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getMatricula() {
        return Matricula;
    }
    public void setMatricula(String matricula) {
        Matricula = matricula;
    }
    public String getDisponibilidad() {
        return Disponibilidad;
    }
    public void setDisponibilidad(String disponibilidad) {
        Disponibilidad = disponibilidad;
    }
/*Metodos */
    public void alquilerhora(){
        //logica para que se calcule por hora de alquilada
    }

    public void alquilerdia(){
        //logica para que se calcule por dia de alquilada
    }

    public void entregaFechayHora(){
        //logica para que se calcule la hora de alquilada
    }
    
}
