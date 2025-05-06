package day3_variables_and_data_types.reference;

public class Designer implements Employee{


    @Override
    public void work() {
        System.out.println("Designer is designing the projects.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Designer having his short walk.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Designer is presenting the design in the meeting.");
    }
}
