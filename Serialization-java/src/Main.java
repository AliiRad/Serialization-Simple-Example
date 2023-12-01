/*
 + Created By AliRad
 + Time   : 12/1/2023 AT 7:28 AM
 + Github : https://github.com/AliiRad
*/

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ali","Rad");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.ser"))){
            objectOutputStream.writeObject(person);
            System.out.println("Object wrote on person.ser successfully !");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.ser"))){
            Person deserializePerson = (Person) objectInputStream.readObject();
            System.out.println("Person Object deserialized Successfully !");
            System.out.println("Deserialized Object (Person) : \n"+deserializePerson);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
