class Class {
    public static void main(String args[]) {
        Employee obj1 = new Employee("Robert", 1994, "64C-WallsStreet", 9568.25);
        Employee obj2 = new Employee("Sam", 2000, "68D-WallsStreet", 95684.235);
        Employee obj3 = new Employee("John", 1999, "26B-WallsStreet", 100456.265);

        System.out.println("Name    Year of joining    Address    Salary");
        obj1.display();
        obj2.display();
        obj3.display();
    }
}

class Employee {
    String name;
    int yearOfJoining;
    String address;
    double salary;
    Employee(String name, int year, String address, double salary) {
        this.name = name;
        this.yearOfJoining = year;
        this.address = address;
        this.salary = salary;
    }
    void display() {
        System.out.println(this.name+"    "+this.yearOfJoining+"        "+this.address+"    "+this.salary);
    }
}
