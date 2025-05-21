package sumeet;

public class general {
    public class Employee {
        private int empid;
        private String ename;

        public Employee(int empid, String ename) {
            this.empid = empid;
            this.ename = ename;
        }

        public double earnings(double basic) {
            double DA = 0.8 * basic;
            double HRA = 0.15 * basic;
            double earnings = basic + DA + HRA;
            return earnings;
        }
    }

    public Employee createEmployee(int empid, String ename) {
        return new Employee(empid, ename);
    }
}