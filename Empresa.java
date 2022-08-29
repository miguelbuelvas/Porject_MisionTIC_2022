public class Empresa {
    String nombre_empresa;
    String direc_empresa;
    String tel_empresa;
    String nit_empresa;

    public Empresa(String nombre_empresa, String direc_empresa, String tel_empresa, String nit_empresa) {
        this.nombre_empresa = nombre_empresa;
        this.direc_empresa = direc_empresa;
        this.tel_empresa = tel_empresa;
        this.nit_empresa = nit_empresa;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getDirec_empresa() {
        return direc_empresa;
    }

    public void setDirec_empresa(String direc_empresa) {
        this.direc_empresa = direc_empresa;
    }

    public String getTel_empresa() {
        return tel_empresa;
    }

    public void setTel_empresa(String tel_empresa) {
        this.tel_empresa = tel_empresa;
    }

    public String getNit_empresa() {
        return nit_empresa;
    }

    public void setNit_empresa(String nit_empresa) {
        this.nit_empresa = nit_empresa;
    }
}
