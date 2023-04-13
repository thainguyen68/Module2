
package btvnDaChua;
public class Person
//implements Comparable<Person>
{
    private static int INDEX = 0;
    private int id;
    private String name;
    private int age;
    private String gender;
    private Address address;

    public Person() {
    }

    public Person(int id, String name, int age, String gender, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Person(String name, int age, String gender, Address address) {
        this.id = ++INDEX;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address=" + address.getName() +
                '}';
    }

//    @Override
//    public int compareTo(Person o) {
//        return this.name.compareTo(o.getName());
//    }
}
