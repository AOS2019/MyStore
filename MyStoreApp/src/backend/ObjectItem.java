/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author FOyeyipo
 */
public class ObjectItem extends Item {
    
    private ObjectType objectType;

    public ObjectItem(ObjectType objectType, String description, Double estimationValue, Condition condition, RecordType recordType) {
        super(description, estimationValue, condition, recordType);
        this.objectType = objectType;
    }

    
    
    @Override
    public String itemMainDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String recordKind() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "ObjectItem{" + "objectType=" + objectType + '}';
    }
    
    
    
}
