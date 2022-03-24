class Class {
    public static void main(String args[]) {
        Employee obj1 = new Employee("Robert", 1994, "64C-WallsStreet");
        Employee obj2 = new Employee("Sam", 2000, "68D-WallsStreet");
        Employee obj3 = new Employee("John", 1999, "26B-WallsStreet");

        System.out.println("Name    Year of joining    Address");
        obj1.display();
        obj2.display();
        obj3.display();
    }
}

class Employee {
    String name;
    int yearOfJoining;
    String address;
    Employee(String name, int year, String address) {
        this.name = name;
        this.yearOfJoining = year;
        this.address = address;
    }
    void display() {
        System.out.println(this.name+"    "+this.yearOfJoining+"        "+this.address);
    }
}