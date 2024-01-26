import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee implements Serializable {
    private transient int empid;
    private String name;
    private int salary;
    Employee() {}
    Employee(int empid, String name, int salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;

    }
    public String toString() {
        return empid + " " + name + " " + salary + "\n";
    }
}

class SerializationDemo  {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee(101, "Ram", 590);
        Employee e2 = new Employee(102, "Sita", 470);
        Employee e3 = new Employee(103, "Lax", 450);

        //Serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(args[0]));

        oos.writeObject(e1);
        oos.writeObject(e2);
        oos.writeObject(e3);
        oos.flush();
        oos.close();

        //Deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(args[0]));
        Employee e4 = (Employee) ois.readObject();
        Employee e5 = (Employee) ois.readObject();
        Employee e6 = (Employee) ois.readObject();
        System.out.println(e4 + "" + e5 + "" + e6);
    }
}