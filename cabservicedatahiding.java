class EmpData {
    private String empName;
    private String empAddress;

    // Corrected method name and parameter types
    void setValues(String empName, String empAddress) {
        this.empName = empName;
        this.empAddress = empAddress;
    }

    // Corrected getter methods
    public String getEmpName() {
        return empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }
}

public class cabservicedatahiding {
    public static void main(String[] args) {
        EmpData in = new EmpData();

        // Corrected method call
        in.setValues("XYZ", "pqrs");

        // Corrected method call and formatting
        System.out.println("Emp Name: " + in.getEmpName() + "\n" + "Emp Address: " + in.getEmpAddress());
    }
}
