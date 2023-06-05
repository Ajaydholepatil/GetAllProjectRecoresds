package org.mahagan.domain;

public class Employee {

    private int EmpId;
    private String EmpName;
    private int EmpAge;
    private String MobileNo;
    private String Email_Id;
    private String Location;

    public Employee() {

    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(int empAge) {
        EmpAge = empAge;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getEmail_Id() {
        return Email_Id;
    }

    public void setEmail_Id(String email_Id) {
        Email_Id = email_Id;
    }

    public Employee(int empId, String empName, int empAge, String mobileNo, String email_Id, String location) {
        EmpId = empId;
        EmpName = empName;
        EmpAge = empAge;
        MobileNo = mobileNo;
        Email_Id = email_Id;
        this.Location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", EmpName='" + EmpName + '\'' +
                ", EmpAge=" + EmpAge +
                ", MobileNo='" + MobileNo + '\'' +
                ", Email_Id='" + Email_Id + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }
}
