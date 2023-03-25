//test employee class in testemployee.java

public class testemployee {
    public static void main(String[] args){
        employee e = new employee();
        e.setName("John");
        e.setAnnualSalary(100000);
        e.setYearStarted(2019);
        e.setNationalInsuranceNumber("123456789");
        System.out.println("Name: " + e.getName());
        System.out.println("Annual Salary: " + e.getAnnualSalary());
        System.out.println("Year Started: " + e.getYearStarted());
        System.out.println("National Insurance Number: " + e.getNationalInsuranceNumber());
    }
}
    

