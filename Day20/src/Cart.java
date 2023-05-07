import java.time.LocalDate;

public class Cart {
    private int id;
    private String name;
    private LocalDate date;
    private boolean isPaid;

    public Cart() {
    }

    public Cart(String name) {
        this.id = 1;
        this.name = name;
        this.date = LocalDate.now();
        this.isPaid = false;

    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    @Override
    public String toString() {
        return id + "," + name + ","+ date  ;
    }
}
