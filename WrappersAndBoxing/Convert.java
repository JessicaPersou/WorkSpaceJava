import java.sql.SQLOutput;

public class Convert {
    public static void main(String[] args) {
        Integer age = 29; //autoboxing

        int ageUnboxing = age;
        System.out.println(ageUnboxing);

        int ageConvert = (int) age;
        System.out.println(ageConvert);

        String ageString = String.valueOf(25);
        System.out.println(ageString);

    }
}
