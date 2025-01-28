package ex08;

public class Cliente {
    private int horas;
    public Cliente(int horas) {
        this.horas = horas;
    }
    public void setHoras(int horas) {
        if (0 <= horas && horas <= 24) 
            this.horas = horas;
    }
    public int getHoras() {
        return this.horas;
    }
}
