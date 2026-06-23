public class EmployeeOperations {

    static Employee[] employees =
            new Employee[5];

    static int totalEmployees = 0;



    // Add Employee

    static void addEmployee(
            Employee employee) {

        if (totalEmployees
                < employees.length) {

            employees[totalEmployees]
                    = employee;

            totalEmployees++;

            System.out.println(
                    "Employee added."
            );
        }
    }



    // Search Employee

    static Employee searchEmployee(
            int employeeId) {

        for (int currentIndex = 0;
             currentIndex < totalEmployees;
             currentIndex++) {


            if (employees[currentIndex]
                    .employeeId
                    == employeeId) {

                return employees[currentIndex];
            }
        }

        return null;
    }



    // Traverse Employees

    static void traverseEmployees() {

        for (int currentIndex = 0;
             currentIndex < totalEmployees;
             currentIndex++) {


            System.out.println(

                    employees[currentIndex]
                    .name
            );
        }
    }



    // Delete Employee

    static void deleteEmployee(
            int employeeId) {


        for (int currentIndex = 0;
             currentIndex < totalEmployees;
             currentIndex++) {


            if (employees[currentIndex]
                    .employeeId
                    == employeeId) {


                for (int nextIndex =
                     currentIndex;

                     nextIndex
                     < totalEmployees - 1;

                     nextIndex++) {


                    employees[nextIndex]
                            = employees[nextIndex + 1];
                }


                totalEmployees--;

                System.out.println(
                        "Employee deleted."
                );

                return;
            }
        }
    }
}