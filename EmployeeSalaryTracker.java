import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryTracker {

    public static void main(String[] args) {
        // Use HashMap with Employee ID (Integer) as key and Salary (Double) as value
        Map<Integer, Double> employeeSalaries = new HashMap<>();

        // 1. Add 5 employees
        addEmployees(employeeSalaries);
        System.out.println("Initial Salaries: " + employeeSalaries);

        // 2. Update salary for an employee
        updateSalary(employeeSalaries, 102, 65000.0);
        System.out.println("Salaries after updating employee 102: " + employeeSalaries);

        // 3. Find employees with salary > 50000
        List<Integer> highPaidEmployees = findHighPaidEmployees(employeeSalaries, 50000.0);
        System.out.println("Employees with salary > 50000: " + highPaidEmployees);

        // 4. Find the highest salary employee
        findHighestSalaryEmployee(employeeSalaries);

        // 5. Sort map by salary
        Map<Integer, Double> sortedBySalary = sortMapBySalary(employeeSalaries);
        System.out.println("Map sorted by salary: " + sortedBySalary);
    }

    // 1. Add 5 employees
    public static void addEmployees(Map<Integer, Double> map) {
        map.put(101, 45000.0);
        map.put(102, 55000.0);
        map.put(103, 35000.0);
        map.put(104, 75000.0);
        map.put(105, 48000.0);
    }

    // 2. Update salary
    public static void updateSalary(Map<Integer, Double> map, Integer employeeId, Double newSalary) {
        if (map.containsKey(employeeId)) {
            map.put(employeeId, newSalary);
        } else {
            System.out.println("Employee ID " + employeeId + " not found.");
        }
    }

    // 3. Find employees with salary > 50000
    public static List<Integer> findHighPaidEmployees(Map<Integer, Double> map, Double minSalary) {
        return map.entrySet().stream()
                .filter(entry -> entry.getValue() > minSalary)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    // 4. Find the highest salary employee
    public static void findHighestSalaryEmployee(Map<Integer, Double> map) {
        Optional<Map.Entry<Integer, Double>> highestPaid = map.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (highestPaid.isPresent()) {
            System.out.println("Highest paid employee: ID " + highestPaid.get().getKey() + ", Salary "
                    + highestPaid.get().getValue());
        } else {
            System.out.println("No employees found.");
        }
    }

    // 5. Sort map by salary (returns a new LinkedHashMap to maintain order)
    public static Map<Integer, Double> sortMapBySalary(Map<Integer, Double> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new // Use LinkedHashMap to preserve the sorted order
                ));
    }
}