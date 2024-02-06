package model.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Departament implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

    public Departament(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Departament() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departament that = (Departament) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Departament{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
