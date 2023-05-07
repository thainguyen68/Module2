package chua_baitap_19_04.io;

import java.util.ArrayList;
import java.util.List;

public interface IOFile<E> {
    void write(List<E> e, String path);

    ArrayList<E> read(String path);

    void writeBinary(List<E> e, String path);

    ArrayList<E> readBinary(String path);
}
