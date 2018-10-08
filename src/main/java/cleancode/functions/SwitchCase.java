package cleancode.functions;

import lombok.Data;

public class SwitchCase {
    public double calculatePay(Employee employee){
        switch (employee.getType()) {
            case HOURLY:
                return calculatHourlyPay(employee);
            case SALARIED:
                return calculateSalaryPay(employee);
            case COMMISSIONED:
                return calculateCommisionedPay(employee);
            default:
                throw new UnsupportedOperationException();
        }
    }

    private double calculatHourlyPay(Employee employee) {
        return 0;
    }

    private double calculateSalaryPay(Employee employee) {
        return 0;
    }

    private double calculateCommisionedPay(Employee employee) {
        return 0;
    }
}

@Data
class Employee{
    private EmployeeType type;


}
