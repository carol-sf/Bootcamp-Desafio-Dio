import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate localDate) {
        this.data = localDate;
    }
    

    @Override
    public String toString() {
        return "Mentoria [data=" + data + "]";
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
}