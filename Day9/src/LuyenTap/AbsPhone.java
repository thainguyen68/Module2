package LuyenTap;

public abstract class AbsPhone {
    public abstract void insertPhone(Contact contact);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String newPhone);


    public abstract void  display();
    public AbsPhone() {
    }
}
