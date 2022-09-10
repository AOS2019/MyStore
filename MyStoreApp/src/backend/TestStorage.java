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

public class TestStorage {
    
    
    
    
   
  
 public static void main(String[] args) {
        // TODO code application logic here
        RecordsStorage recordsStorage = new RecordsStorage();
        
        TextileItem coat = new TextileItem(TextileType.COAT, "Blue", "TunrBell", TextileSize.MEDIUM, 
   "Its suit a guy",100.00, Condition.USED,RecordType.TEXTILE);
   
 TextileItem blouse = new TextileItem(TextileType.BLOUSE, "Pink", "TunrBell", TextileSize.SMALL, 
   "Its suit a Lady",10.00, Condition.NEW,RecordType.TEXTILE);
 
 
 ObjectItem household = new ObjectItem(ObjectType.HOUSEHOLD , "Its suit a guy",
   100.00, Condition.USED,RecordType.OTHER);
 
 
  ObjectItem forscrap = new ObjectItem(ObjectType.TOOLS, "Its suit a guy",
   68.00, Condition.FORSCRAP,RecordType.OTHER);
  
  
  
        
        recordsStorage.add(coat);
          recordsStorage.add(blouse);
           recordsStorage.add(household);
            recordsStorage.add(forscrap);
            
           
            
//            System.out.println("First Items "+ coat+"2nd Item  "+blouse );
       
            
            System.out.println(" Textile Items =," +recordsStorage.retrieveRecordToDisplay(RecordType.TEXTILE));
            System.out.println("ObjectType Items =, "+ recordsStorage.retrieveRecordToDisplay(RecordType.OTHER));
           System.out.println("All RecordTpe"+ recordsStorage.retrieveRecordToDisplay(RecordType.OTHER));
            
    }
  
}
