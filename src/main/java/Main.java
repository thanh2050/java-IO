import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {

        FileSystem system = FileSystems.getDefault();
        Path original = system.getPath("D:\\Web\\Employee.xlsx");
        Path target1 = system.getPath("D:\\Web\\Employee1.xlsx");
        Path target2 = system.getPath("D:\\Web\\Employee2.xlsx");
        try {
            Files.copy(original, target1, StandardCopyOption.REPLACE_EXISTING);
            Files.copy(original, target2, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
    }
}