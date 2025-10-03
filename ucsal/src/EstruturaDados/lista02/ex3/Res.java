package EstruturaDados.lista02.ex3;

import java.time.LocalDate;

public class Res {

    int codigo;
    double leite;
    double alim;
    int mesNasc;
    int anoNasc;
    boolean abate;

    public Res(int codigo, double leite, double alim, int mesNasc, int anoNasc) {
        this.codigo = codigo;
        this.leite = leite;
        this.alim = alim;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.abate = false;
    }

    public boolean abate(){
        //ano atual - ano de nascimento
        int anoAtual = LocalDate.now().getYear();
        if (anoAtual - this.anoNasc >= 5 ||
                this.leite < 40 ||
                (this.leite >= 50 && this.leite < 70) && this.alim/7 >= 50){
            return true;

        }
        return false;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getLeite() {
        return leite;
    }

    public void setLeite(double leite) {
        this.leite = leite;
    }

    public double getAlim() {
        return alim;
    }

    public void setAlim(double alim) {
        this.alim = alim;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public boolean isAbate() {
        return abate;
    }

}


