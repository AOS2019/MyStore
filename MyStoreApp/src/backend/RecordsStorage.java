/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;


import java.util.ArrayList;

import java.util.List;


/**
 *
 * @author FOyeyipo
 */
public class RecordsStorage implements IRecordsStorage {

    
    
//    Map<String, Item> recordsStorage;
    
   List<Item> recordsStorage;

    
    List<Item> sortedRecords;
    Item aRecord;
    double totalValue;

    public RecordsStorage() {
//        aRecord = new Item("A dress for dinner", 30.00, Condition.VERYGOOD, RecordType.TEXTILE);
//         IteaRecord = new Item("Male cloths to compliment Tie", 100.0, Condition.GOOD, RecordType.NONE);
//        Kind of confuse of probaly create a cont
        this.recordsStorage = new ArrayList();
        
    }
    
    public Item find(String description){
        for(Item it: recordsStorage){
            if(it.getDescription().equalsIgnoreCase(description)){
                return it;
            }
            
        }
                    return  null;

    }
    
    @Override
    public boolean   add(Item record) {
       
        if(record != null){
       Item  existingRecord =   find(record.getDescription());
       if(existingRecord !=null){
           return false;
       }
           recordsStorage.add(record);
              return true;

        }
     
            return false;
    }
    
    public boolean delete(String description){
        Item item =  find(description);
         if(item == null){
              return false;
         }
        recordsStorage.remove(item);
     
        return true;
    }

    
    public List<Item> getSortedItems(RecordType recordType){
        totalValue = 0;
        List<Item> sortedRecords = new ArrayList();
         for(Item item : recordsStorage){
             
             if(item.getRecordType() == recordType){
                 totalValue = totalValue + item.getEstimatedValue();
                 sortedRecords.add(item);
             }else if(item.getRecordType() == RecordType.ALL){
               totalValue = totalValue + item.getEstimatedValue();
                sortedRecords.add(item);
             }
         }
        
        return sortedRecords;
    }
    @Override
    public String retrieveRecordToDisplay(RecordType recordType) {
        StringBuilder stringBuilder = new StringBuilder();
         List<Item> sortedItems  = getSortedItems(recordType);
         for(Item item : sortedItems){
             stringBuilder.append(item);
             stringBuilder.append(",");
                 
             }
           
       double totalValue =  sortedItems.stream().map((item) -> item.getEstimatedValue()).mapToDouble(Double::doubleValue).sum();
         stringBuilder.append("Total Value = " + totalValue);
             return stringBuilder.toString();
         }
    }
    
      

