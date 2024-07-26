public class Agencia {
    /*Atributos */
    private String empresa;
    private int tel_emp;
    private int ncuentabanc;
    
    /*Constructor */
    public Agencia(String empresa, int tel_emp, int ncuentabanc) {
        this.empresa = empresa;
        this.tel_emp = tel_emp;
        this.ncuentabanc = ncuentabanc;
    }
/*Metodos de manipulacion de datos */
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public int getTel_emp() {
        return tel_emp;
    }
    public void setTel_emp(int tel_emp) {
        this.tel_emp = tel_emp;
    }
    public int getNcuentabanc() {
        return ncuentabanc;
    }
    public void setNcuentabanc(int ncuentabanc) {
        this.ncuentabanc = ncuentabanc;
    }
    
    /*Metodos */
    public void alquilerdeAutos(){
        //logica para que se calcule la hora de alquilada
    }
}
