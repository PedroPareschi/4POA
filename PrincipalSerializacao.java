package funcionario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PrincipalSerializacao {
    public static void main(String[] args) {
        Funcionario p = new Funcionario("Clara", 30, 1450.41, "1234987565156");
        try {
            FileOutputStream arqOSer = new FileOutputStream("c:/a/clara.ser");
            ObjectOutputStream oOSer = new ObjectOutputStream(arqOSer);
            oOSer.writeObject(p);
            oOSer.close();
            System.out.println("---------------Antes de alterar idade-------------");
            System.out.println(p);
            p.setSalario(2000.00);
            System.out.println("---------------Depois de alterar idade-------------");
            System.out.println(p);
           
           
            FileInputStream arqISer = new FileInputStream("c:/a/clara.ser");
            ObjectInputStream iOSer = new ObjectInputStream(arqISer);
            p = (Funcionario) iOSer.readObject();
            iOSer.close();
           
           
            System.out.println("---------------Depois de recuperar os valores-------------");
            System.out.println(p);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
