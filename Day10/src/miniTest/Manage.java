package miniTest;

public interface Manage<E> {
    void create();

    void update();

    E deleteById();

    E getById();
}
