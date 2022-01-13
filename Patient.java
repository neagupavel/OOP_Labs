package Lab6;

import java.util.Date;

public class Patient extends Person {
    private String id;

//    name, gender, birthDate are in the parent class

    private int age;
    private Date accepted;
    private History sickness;
    private String[] prescriptions;
    private String[] allergies;
    private String[] specialReqs;

    private OperationsStaff[] operationsStaffs;
}