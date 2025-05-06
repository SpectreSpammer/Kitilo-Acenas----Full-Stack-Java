package day3_variables_and_data_types.reference;

public class MainReference {
    public static void main(String[] args) {

        //creating the object
        Employee manager = new Manager();
        Employee developer = new Developer();
        Employee designer = new Designer();

        //storing the object inside of the array
        Employee[] employees = { manager,designer,developer};

        //foreach
        for (Employee employee : employees){
            employee.work();
            employee.takeBreak();
            employee.attendMeeting();
            System.out.println();
        }

    }
}
