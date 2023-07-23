public class Worker {
    String name;
    String jobTitle;
    int phone;
    int salary;
    int age;

    public Worker(String name, String jobTitle, int phone, int salary, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public static void printObjectInfo(String name, String jobTitle, int phone, int salary, int age) {

        System.out.println("Name: " + name);
        System.out.println("Job title: " + jobTitle);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    public static void addSalaryIf45(int age, int salary) {
        if (age > 45) {
            salary += 5000;
        }
    }

    public static void printObjectInfo(Worker[] workers) {
        for (Worker worker : workers) {
            System.out.println("Name: " + worker.name);
            System.out.println("Job title: " + worker.jobTitle);
            System.out.println("Phone: " + worker.phone);
            System.out.println("Salary: " + worker.salary);
            System.out.println("Age: " + worker.age);
            System.out.println("+++++++++++++++++++++");
        }
    }

    public static  void addSalaryIf45(Worker[] workers) {
        for (Worker worker : workers) {
            if (worker.getAge() > 35) {
                int newSalary = worker.getSalary() + 5000;
                worker.setSalary(newSalary);
            }
        }
    }

    public static void averageSalaryAge(Worker[] workers) {
        int sumSalary = 0;
        int sumAge = 0;
        for (Worker worker : workers) {
            sumSalary += worker.getSalary();
            sumAge += worker.getAge();
        }
        double avrSalary = sumSalary / workers.length;
        double avrAge = sumAge / workers.length;
        System.out.println("===========================");
        System.out.println("AVR Salary: " + avrSalary);
        System.out.println("===========================");
        System.out.println("AVR Age: " + avrAge);

    }
}




