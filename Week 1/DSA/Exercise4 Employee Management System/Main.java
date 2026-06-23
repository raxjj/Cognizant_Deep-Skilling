public class Main {

    public static void main(
            String[] args) {


        EmployeeOperations.addEmployee(

                new Employee(
                        101,
                        "Raj",
                        "Developer",
                        50000
                )
        );


        EmployeeOperations.addEmployee(

                new Employee(
                        102,
                        "Aman",
                        "Tester",
                        45000
                )
        );


        EmployeeOperations.searchEmployee(
                101
        );


        EmployeeOperations.traverseEmployees();


        EmployeeOperations.deleteEmployee(
                102
        );
    }
}