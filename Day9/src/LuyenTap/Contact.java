package LuyenTap;

public class Contact {
    private String nameCont;
    private String phoneNumber;

    public Contact() {
    }

    public Contact(String name, String phoneNumber) {
        this.nameCont = name;
        this.phoneNumber = phoneNumber;
    }

    public String getNameCont() {
        return nameCont;
    }

    public void setNameCont(String nameCont) {
        this.nameCont = nameCont;
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
                "name1='" + nameCont + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
