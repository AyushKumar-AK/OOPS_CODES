//create a class called employee that inherits from person1. The other data members of employee are: annual salary (double), the year the employee started to work (int), and the national insurance number (String). Implement the appropriate accessor and mutator methods.

public class employee extends person1 {
    String name;
    double annualSalary;
    int yearStarted;
    String nationalInsuranceNumber;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }
    double getAnnualSalary(){
        return annualSalary;
    }
    void setYearStarted(int yearStarted){
        this.yearStarted = yearStarted;
    }
    int getYearStarted(){
        return yearStarted;
    }
    void setNationalInsuranceNumber(String nationalInsuranceNumber){
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
    String getNationalInsuranceNumber(){
        return nationalInsuranceNumber;
    }
    
}
