package org.LLD.DesignPatterns.Prototype.Concept;

public class IntelligentStudent extends NormalStudent {

    private int iq;

    public IntelligentStudent(){

    }
    public IntelligentStudent(IntelligentStudent is){
        super(is);
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }
}
