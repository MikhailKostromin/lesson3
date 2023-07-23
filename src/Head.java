public class Head extends Worker{
    public Head(String name, String jobTitle, int phone, int salary, int age) {
        super(name, jobTitle, phone, salary, age);
    }

    public static void addSalaryIf45(Worker[] workers){
        for (Worker worker:workers){
            if(!(worker.getJobTitle()=="Head")){
                int newSalary = worker.getSalary() + 10000;
                worker.setSalary(newSalary);
            }
        }

    }

}
