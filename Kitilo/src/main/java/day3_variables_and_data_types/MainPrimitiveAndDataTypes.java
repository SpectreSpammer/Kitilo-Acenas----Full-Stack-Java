package day3_variables_and_data_types;

public class MainPrimitiveAndDataTypes {
    public static void main(String[] args) {

        //8 bit
        byte age = 29;
        System.out.println("byte: " + age);

        //16 bit
        short deptCode = 12345;
        System.out.println("short: " + deptCode);

        char performanceRating = 'B';
        System.out.println("char: " + performanceRating);

        //32 bit
        int id = 1234567890;
        System.out.println("int: " + id);

        float hourlyRate = 1500.123456789f;
        System.out.println("float: " + hourlyRate);

        //64 bit
        long uuid = 1234567890123456789L;
        System.out.println("long: " + uuid);

        double salary = 50000.123456789f;
        System.out.println("double: " + salary);


        //boolean
        boolean isFte = true;
        System.out.println("boolean: " + isFte);

        //String
        String name  = "Kitilo";
        System.out.println("String: " + name);
    }
}
