package day3_variables_and_data_types.reference;

public class Developer implements Employee{


    @Override
    public void work() {
        System.out.println("Developer is writing some code.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Developer is having some coffee.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Developer is attending the meeting.");
    }
}
