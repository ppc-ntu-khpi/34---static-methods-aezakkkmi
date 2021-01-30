package test;
import domain.Exercise;
/**
 * 
 * @author God
 */
public class TestResult {
/**
 * А також в 13-у рядку потрібно змінити на свій потрібний текст для шифрування.
 * @param args - аргумент
 */
    public static void main(String[] args) {
         String mesage = "Не волнуйтесь, если что-то не работает. Если бы всё работало, вас бы уволили.";
    System.out.println(mesage+":");     
    byte[] m;
        m = Exercise.encrypt(mesage, "stack_overlow");
    for (byte i : m) System.out.print(i);
    System.out.println();
    }
}
