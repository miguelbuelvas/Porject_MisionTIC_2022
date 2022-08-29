public class MovimientoDinero {
    int mov_monto;
    char sim_monto;
    String concepto_mov;
    String user_mov;

    public MovimientoDinero(int mov_monto, char sim_monto, String concepto_mov, String user_mov) {
        this.mov_monto = mov_monto;
        this.sim_monto = sim_monto;
        this.concepto_mov = concepto_mov;
        this.user_mov = user_mov;
    }

    public int getMov_monto() {
        return mov_monto;
    }

    public void setMov_monto(int mov_monto) {
        this.mov_monto = mov_monto;
    }

    public char getSim_monto() {
        return sim_monto;
    }

    public void setSim_monto(char sim_monto) {
        this.sim_monto = sim_monto;
    }

    public String getConcepto_mov() {
        return concepto_mov;
    }

    public void setConcepto_mov(String concepto_mov) {
        this.concepto_mov = concepto_mov;
    }

    public String getUser_mov() {
        return user_mov;
    }

    public void setUser_mov(String user_mov) {
        this.user_mov = user_mov;
    }
}
