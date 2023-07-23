public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Petr","Director",2323,32323,23);

        Worker.printObjectInfo(worker1.name,worker1.jobTitle,worker1.phone, worker1.salary, worker1.age);

        Worker [] workers = new Worker[5];
        workers[0]=new Worker("Ivan","manager",332,2332,50);
        workers[1]=new Worker("Petr","manager",332,2332,50);
        workers[2]=new Worker("Vova","manager",332,2332,30);
        workers[3]=new Worker("Masha","account",332,2332,30);
        workers[4]=new Worker("Fedor","Head",332,2332,30);

        Worker.addSalaryIf45(36,1000);
//        Worker.addSalaryIf45(workers);
//        Worker.printObjectInfo(workers);
        Worker.averageSalaryAge(workers);
        Head.addSalaryIf45(workers);
        Worker.printObjectInfo(workers);

    }



}