public class Reservacion {
    
    private String ModeloAuto;
    private String Marca;
    private String Matricula;
    private int Horas;
    private int Dias;
    private String Disponibilidad;
    
    public Reservacion(String modeloAuto, String marca, String matricula, int horas, int dias, String disponibilidad) {
        this.ModeloAuto = modeloAuto;
        this.Marca = marca;
        this.Horas = horas;
        this.Dias = dias;
        this.Matricula = matricula;
        this.Disponibilidad = disponibilidad;
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
    public int getHoras(){
        return Horas;
    }
    public void setHoras(int horas){
        Horas = horas;
    }
    public int getDias(){
        return dias;
    }
    public void setDias(int dias){
        Dias = dias;
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
    public int alquilerhora(){
        if(marca == toyota && modeloAuModeloAuto == hilux){
            int alqhora = getHoras()*50000;
            return alqhora;
        }
        if(marca == toyota && modelo == corolla){
            int alqhora = getHoras()*40000;
            return alqhora;
        }
        if(marca == mercedez && modelo == CLA){
            int alqhora = getHoras()*30000;
            return alqhora;
        }
        if(marca == mercedez && modelo == CLS){
            int alqhora = getHoras()*20000;
            return alqhora;
        }else{
            System.out.println("No se Encontro la Marca y Modelo del Auto");
        }
    }

    public int alquilerdia(){
        if(Marca == toyota && ModeloAuto == hilux){
            int alqdias = getDias()*150000;
            return alqdias;
        }
        if(marca == toyota && modelo == corolla){
            int alqdias = getDias()*140000;
            return alqdias;
        }
        if(marca == mercedez && modelo == CLA){
            int alqdias = getDias()*130000;
            return alqdias;
        }
        if(marca == mercedez && modelo == CLS){
            int alqdias = getDias()*120000;
            return alqdias;
        }else{
            System.out.println("No se Encontro la Marca y Modelo del Auto");
        }
    }

    public void entregaFechayHora(){
        //logica para que se calcule la hora de alquilada
    }
    
}