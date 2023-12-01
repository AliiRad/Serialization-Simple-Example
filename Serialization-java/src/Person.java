/*
 + Created By AliRad
 + Time   : 12/1/2023 AT 7:26 AM
 + Github : https://github.com/AliiRad
*/

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String family;

    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }
}
