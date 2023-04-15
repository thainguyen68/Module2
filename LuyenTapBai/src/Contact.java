public class Contact {
    private static int idUp = 1;

    private int id;
    private String name;
    private String phoneNumber;

    public Contact() {
        this.id = idUp++;
    }

    public Contact(String name, String phoneNumber) {
        this.id = idUp++;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static int getIdUp() {
        return idUp;
    }

    public static void setIdUp(int idUp) {
        Contact.idUp = idUp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
