package programs1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.List;
import java.util.Map.Entry;


public class TestEmployeeQuery {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        System.out.println("count Male Female Emp Org: " + countMaleFemaleEmpOrg(employeeList));
        System.out.println("print all dept: " + printAllDepartments(employeeList));
        System.out.println("avg Age of Male And Female Emp: " + avgAgeofMaleAndFemaleEmp(employeeList));
        System.out.println("details of highest paid employee: " + detailsOfHighestPaidEmployee(employeeList));
        System.err.println("names of all employees who have joined after 2015: " + detailsOfAllEmployeejoinedAfter2015(employeeList));
        System.err.println("Count the number of emp in each dept: " + countTheNoEmpInEachDept(employeeList));
        System.out.println("average salary of each department: " + avgSalOfEachDept(employeeList));
        System.err.println("details of youngest male employee in the product development department: " + youngestMaleEmpDetails(employeeList));
        System.err.println("most Senior Age Wise in the org: " + mostSeniorAgeWise(employeeList));
        System.out.println("most working experience in the org: " + mostWorkingExpInOrg(employeeList));
        System.out.println("No of male and female employees in the  sales and marketing team: " + noOfMaleAndFemaleInTheSalesDept(employeeList));
        System.err.println("average salary of male and female employees: " + avgSalOfMaleAndFemale(employeeList));
        System.out.println("count Emp Dept Wise: " + countEmpDeptWise(employeeList));
        employeeListByDepartment(employeeList);
        System.err.println("Average Salary and total salary of the whole Org: " + avgAndTotalSalary(employeeList));
        System.err.println("Oldest employee in the ORG: " + oldestEmpITheOrg(employeeList));
        seperateYoungerAndOlderAlternateWay(employeeList);
        System.err.println("Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.: " + seperateYoungerAndOlder(employeeList));

    }

    static Map<String, Long> countMaleFemaleEmpOrg(List<Employee> employeeList) {
        Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        return noOfMaleAndFemaleEmployees;
    }

    //Print the name of all departments in the organization?
    static Set<String> printAllDepartments(List<Employee> employeeList) {
        Set<String> allDeptName = employeeList.stream()
                .map(dept -> dept.department).distinct().collect(Collectors.toSet());
        return allDeptName;
    }

    //What is the average age of male and female employees?
    static Map<String, Double> avgAgeofMaleAndFemaleEmp(List<Employee> employeeList) {
        Map<String, Double> avgAge = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
        return avgAge;
    }

    //Get the details of highest paid employee in the organization?
    static Employee detailsOfHighestPaidEmployee(List<Employee> employeeList) {
        Optional<Employee> highestPaidEmp = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        return highestPaidEmp.get();
    }

    //Get the names of all employees who have joined after 2015?
    static List<String> detailsOfAllEmployeejoinedAfter2015(List<Employee> employeeList) {
        List<String> joinedAfter2015 = employeeList.stream().filter(joined -> joined.yearOfJoining > 2015)
                .map(name -> name.getName()).collect(Collectors.toList());
        return joinedAfter2015;
    }

    //Count the number of employees in each department?
    static Map<String, Long> countTheNoEmpInEachDept(List<Employee> employeeList) {
        Map<String, Long> noOfEmp = employeeList.stream().distinct()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        return noOfEmp;
    }

    //What is the average salary of each department?
    static Map<String, Double> avgSalOfEachDept(List<Employee> employeeList) {
        Map<String, Double> avgSal = employeeList.stream()
                .distinct()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        return avgSal;
    }

    //Get the details of youngest male employee in the product development department?
    static Employee youngestMaleEmpDetails(List<Employee> employeeList) {
        Optional<Employee> youngestMaleEmpDetails = employeeList.stream()
                .filter(dept -> dept.getDepartment() == "Product Development" && dept.getGender() == "Male")
                .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
        return youngestMaleEmpDetails.get();
    }

    //Who has the most senior age wise in the organization?
    static Employee mostSeniorAgeWise(List<Employee> employeeList) {
        Optional<Employee> mostWorkingExpInOrg = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)));
        return mostWorkingExpInOrg.get();
    }

    //Who has the most working experience in the organization?
    static Employee mostWorkingExpInOrg(List<Employee> employeeList) {
        Optional<Employee> mostWorkingExpInOrg = employeeList
                .stream()
                .sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        return mostWorkingExpInOrg.get();
    }

    //How many male and female employees are there in the sales and marketing team?
    static Map<String, Long> noOfMaleAndFemaleInTheSalesDept(List<Employee> employeeList) {
        Map<String, Long> noOfMaleAndFemaleInTheSalesDept = employeeList
                .stream()
                .filter(dept -> dept.getDepartment() == "Sales And Marketing")
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        return noOfMaleAndFemaleInTheSalesDept;
    }

    //What is the average salary of male and female employees?
    static Map<String, Double> avgSalOfMaleAndFemale(List<Employee> employeeList) {
        Map<String, Double> avgSalOfMaleAndFemale = employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        return avgSalOfMaleAndFemale;
    }

    // count emp dept wise?
    static Map<String, Long> countEmpDeptWise(List<Employee> employeeList) {
        Map<String, Long> avgSalOfMaleAndFemale = employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        return avgSalOfMaleAndFemale;
    }

    //List down the names of all employees in each department?
    static void employeeListByDepartment(List<Employee> employeeList) {
        Map<String, List<Employee>> employeeListByDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();
        for (Entry<String, List<Employee>> entry : entrySet) {
            System.out.println("--------------------------------------");
            System.out.println("Employees In " + entry.getKey() + " : ");
            System.out.println("--------------------------------------");
            List<Employee> list = entry.getValue();
            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }
    }

    //What is the average salary and total salary of the whole organization?
    private static Map<String, Double> avgAndTotalSalary(List<Employee> employeeList) {
        Double totalSalary = 0.0;
        Map<String, Double> map = new HashMap<>();
        List<Double> salary = employeeList.stream().map(employee -> employee.salary)
                .collect(Collectors.toList());
        for (Double value : salary) {
            totalSalary = totalSalary + value;
        }
        map.put("Total Salary", totalSalary);
        Double avgSal = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        map.put("Average Salery", avgSal);
        return map;
    }

    //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
    private static Map<String, List<String>> seperateYoungerAndOlder(List<Employee> employeeList) {
        Map<String, List<String>> map= new LinkedHashMap<>();
        List<String> belowOr25 = employeeList.stream()
                .filter(var -> var.age <= 25)
                .map(Employee::getName)
                .collect(Collectors.toList());
        List<String> above25 = employeeList.stream()
                .filter(var -> var.age > 25)
                .map(test -> test.name)
                .collect(Collectors.toList());
        map.put("younger or equal to 25", belowOr25);
        map.put("older than 25 years", above25);
        return map;
    }

    //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
    private static void seperateYoungerAndOlderAlternateWay(List<Employee> employeeList) {
        Set<Entry<Boolean, List<Employee>>> partition = employeeList.stream()
                .collect(Collectors.partitioningBy(e->e.age <= 25)).entrySet();
        for (Entry<Boolean, List<Employee>> entry : partition)
        {
            System.out.println("----------------------------");

            if (entry.getKey())
            {
                System.out.println("Employees older than 25 years :");
            }
            else
            {
                System.out.println("Employees younger than or equal to 25 years :");
            }

            System.out.println("----------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list)
            {
                System.out.println(e.getName());
            }
        }
    }

    //Who is the oldest employee in the organization? What is his age and which department he belongs to?
    private static Employee oldestEmpITheOrg(List<Employee> employeeList) {
        return employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
    }
}

