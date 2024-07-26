public class Cliente{

private int idUsuario;
private String datosBanc;
private String direcc;
private int cel;

public Cliente(int idUsuario, String datosBanc, String direcc, int cel) {
    this.idUsuario = idUsuario;
    this.datosBanc = datosBanc;
    this.direcc = direcc;
    this.cel = cel;
}
/*Metodos de manipulacion de datos */
public int getIdUsuario() {
    return idUsuario;
}
public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
}
public String getDatosBanc() {
    return datosBanc;
}
public void setDatosBanc(String datosBanc) {
    this.datosBanc = datosBanc;
}
public String getDirecc() {
    return direcc;
}
public void setDirecc(String direcc) {
    this.direcc = direcc;
}
public int getCel() {
    return cel;
}
public void setCel(int cel) {
    this.cel = cel;
}

/*Metodos */
public void reservacion(){
    //logica para que se calcule la hora de alquilada
}

}