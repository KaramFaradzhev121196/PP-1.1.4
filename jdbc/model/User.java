package jm.task.core.jdbc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

import static java.util.Objects.hash;

@Entity
@Table(name = "USERSDB")
public class User {
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private Byte age;

    public User() {

    }

    public User(String name, String lastName, Byte age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        User user = (User) obj;
        return
                (Objects.equals(name, user.name)
                        || (name != null && name.equals(user.getName()))) && (Objects.equals(lastName, user.lastName)
                        || (lastName != null && lastName.equals(user.getLastName())
                ));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = (int) (prime * result + (hash(name)+hash(lastName)));
        result = prime * result + ((lastName == null) ? 0 : (lastName.hashCode() >>> 31));
        return result;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{id: " + id
                + ", name: " + name
                + ", lastName: " + lastName
                + ", age: " + age
                + "}";
    }
}
