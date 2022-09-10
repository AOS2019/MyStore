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
public  abstract class  Item {
    private String description;
    private Double estimatedValue;
    
    private Condition condition;
    
    private RecordType recordType;
    
    public Item(String description, Double estimatedValue,
            Condition condition, RecordType recordType){
        this.description = description;
        this.estimatedValue = estimatedValue;
        this.condition = condition;
        this.recordType = recordType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(Double estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public RecordType getRecordType() {
        return recordType;
    }

    public void setRecordType(RecordType recordType) {
        this.recordType = recordType;
    }
    
    
   public abstract String itemMainDetails();
      
    
    
    public abstract String recordKind();
     
    
    
   public  String getItemDescription(){
       return "";
   }
     
   
   public  Double getPrice(){
       return estimatedValue;
   }
       
     

    @Override
    public String toString() {
        return "Item{" + "description=" + description + ", estimatedValue=" + estimatedValue + ", condition=" + condition + ", recordType=" + recordType + '}';
    }
   
   
}
