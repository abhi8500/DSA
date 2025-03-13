package org.LLD.DesignPatterns.Prototype.Concept;

public class NormalStudent implements CloneableInterface<NormalStudent>{

    private long id;

    private String name;

    private double psp;

    private String gender;

    public NormalStudent(){

    }

    /**
     * Copy Constructor
     */
    public NormalStudent(NormalStudent student){
        this.id = student.id;
        this.name = student.name;
        this.psp = student.psp;
        this.gender = student.gender;
    }

    @Override
    public NormalStudent copy() {
        return new NormalStudent(this);
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPsp() {
        return psp;
    }

    public String getGender() {
        return gender;
    }

}
