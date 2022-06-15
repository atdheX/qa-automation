package pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDetails {


    private Integer createdAt;

    private String employeeFirstname;

    private String employeeLastname;

    private String employeePhonenumbe;

    private String ademployeeEmaildress;

    private String citemployeeAddressy;

    private String stateemployeeDevLevel;

    private String employeeGender;

    private String employeeHireDate;

    private Boolean employeeOnleave;

    private List<Object> techStack = null;

    private List<Object> project = null;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public UserDetails() {
    }

    /**
     *
     * @param createdAt
     * @param employeePhonenumbe
     * @param ademployeeEmaildress
     * @param techStack
     * @param employeeLastname
     * @param stateemployeeDevLevel
     * @param employeeOnleave
     * @param citemployeeAddressy
     * @param project
     * @param employeeGender
     * @param employeeFirstname
     * @param employeeHireDate
     */
    public UserDetails(Integer createdAt, String employeeFirstname, String employeeLastname, String employeePhonenumbe, String ademployeeEmaildress, String citemployeeAddressy, String stateemployeeDevLevel, String employeeGender, String employeeHireDate, Boolean employeeOnleave, List<Object> techStack, List<Object> project) {
        super();
        this.createdAt = createdAt;
        this.employeeFirstname = employeeFirstname;
        this.employeeLastname = employeeLastname;
        this.employeePhonenumbe = employeePhonenumbe;
        this.ademployeeEmaildress = ademployeeEmaildress;
        this.citemployeeAddressy = citemployeeAddressy;
        this.stateemployeeDevLevel = stateemployeeDevLevel;
        this.employeeGender = employeeGender;
        this.employeeHireDate = employeeHireDate;
        this.employeeOnleave = employeeOnleave;
        this.techStack = techStack;
        this.project = project;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmployeeFirstname() {
        return employeeFirstname;
    }

    public void setEmployeeFirstname(String employeeFirstname) {
        this.employeeFirstname = employeeFirstname;
    }

    public String getEmployeeLastname() {
        return employeeLastname;
    }

    public void setEmployeeLastname(String employeeLastname) {
        this.employeeLastname = employeeLastname;
    }

    public String getEmployeePhonenumbe() {
        return employeePhonenumbe;
    }

    public void setEmployeePhonenumbe(String employeePhonenumbe) {
        this.employeePhonenumbe = employeePhonenumbe;
    }

    public String getAdemployeeEmaildress() {
        return ademployeeEmaildress;
    }

    public void setAdemployeeEmaildress(String ademployeeEmaildress) {
        this.ademployeeEmaildress = ademployeeEmaildress;
    }

    public String getCitemployeeAddressy() {
        return citemployeeAddressy;
    }

    public void setCitemployeeAddressy(String citemployeeAddressy) {
        this.citemployeeAddressy = citemployeeAddressy;
    }

    public String getStateemployeeDevLevel() {
        return stateemployeeDevLevel;
    }

    public void setStateemployeeDevLevel(String stateemployeeDevLevel) {
        this.stateemployeeDevLevel = stateemployeeDevLevel;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeHireDate() {
        return employeeHireDate;
    }

    public void setEmployeeHireDate(String employeeHireDate) {
        this.employeeHireDate = employeeHireDate;
    }

    public Boolean getEmployeeOnleave() {
        return employeeOnleave;
    }

    public void setEmployeeOnleave(Boolean employeeOnleave) {
        this.employeeOnleave = employeeOnleave;
    }

    public List<Object> getTechStack() {
        return techStack;
    }

    public void setTechStack(List<Object> techStack) {
        this.techStack = techStack;
    }

    public List<Object> getProject() {
        return project;
    }

    public void setProject(List<Object> project) {
        this.project = project;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}