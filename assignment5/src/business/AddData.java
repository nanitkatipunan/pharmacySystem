/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;


public class AddData {
    
    public void setInitialValues(PharmacyDirectory pharmacyDirectory)
            
    {
        PharmacyDirectory pharmaDirectory = pharmacyDirectory;
        
       Pharmacy fuentesPharmacy = new Pharmacy();
               
       Pharmacy geverolaPharmacy = new Pharmacy();
       
               
       fuentesPharmacy.setStoreName("fuentesPharmacy");
       geverolaPharmacy.setStoreName("geverolaPharmacy");
        
       pharmaDirectory.addPharmacy(fuentesPharmacy);
      pharmaDirectory.addPharmacy(geverolaPharmacy);
        Drug drug1 = new Drug();
        
        
        //drug1.setDrugID(1);
        drug1.setDrugName("Bioflu");
        drug1.setDrugType("paracetemol");
        drug1.setComposition("paracetemol ");
        drug1.setDrugAvailibility(240);
        drug1.setDrugPrice(20);
        drug1.setDrugDescription("used for fever");
        drug1.setExpirationDate("20-05-2018");
        drug1.setManufacturedDate("10-09-2015");
        fuentesPharmacy.getDrugCatalog().addDrugs(drug1);
        
        Drug drug2 = new Drug();
        //drug2.setDrugID(2);
        drug2.setDrugName("Amoxicilin");
        drug2.setDrugType("antibacteria");
        drug2.setComposition("antibacteria");
        drug2.setDrugAvailibility(40);
        drug2.setDrugPrice(10);
        drug2.setDrugDescription("used for cough");
        drug2.setExpirationDate("2-10-2020");
        drug2.setManufacturedDate("1-10-2015");
        fuentesPharmacy.getDrugCatalog().addDrugs(drug2);
        
         Drug drug3 = new Drug();
        //drug2.setDrugID(2);
        drug3.setDrugName("Aspirin");
        drug3.setDrugType("pain reliever");
        drug3.setComposition("pain reliever");
        drug3.setDrugAvailibility(60);
        drug3.setDrugPrice(20);
        drug3.setDrugDescription("used for body pain");
        drug3.setExpirationDate("24-10-2021");
        drug3.setManufacturedDate("14-10-2015");
        fuentesPharmacy.getDrugCatalog().addDrugs(drug3);
        
          Drug drug4 = new Drug();
        //drug2.setDrugID(2);
        drug4.setDrugName("Acular");
        drug4.setDrugType("ketorolac tromethamine");
        drug4.setComposition("ketorolac tromethamine");
        drug4.setDrugAvailibility(20);
        drug4.setDrugPrice(50);
        drug4.setDrugDescription("used for allergies");
        drug4.setExpirationDate("20-8-2023");
        drug4.setManufacturedDate("10-8-2016");
        fuentesPharmacy.getDrugCatalog().addDrugs(drug4);
        
        Drug drug12 = new Drug();
        //drug12.setDrugID(3); 
        drug12.setDrugName("Cetaphil");
        drug12.setDrugType("cetaphil");
        drug12.setComposition("antacid ");
        drug12.setDrugAvailibility(70);
        drug12.setDrugPrice(25);
        drug12.setDrugDescription("used for allergy");
        drug12.setExpirationDate("20-7-2018");
        drug12.setManufacturedDate("10-7-2013");
        geverolaPharmacy.getDrugCatalog().addDrugs(drug12);
        
        Drug drug13 = new Drug();
        //drug12.setDrugID(3); 
        drug13.setDrugName("Alaxan");
        drug13.setDrugType("alaxan");
        drug13.setComposition("alaxan ");
        drug13.setDrugAvailibility(100);
        drug13.setDrugPrice(12);
        drug13.setDrugDescription("used for body pain");
        drug13.setExpirationDate("20-2-2018");
        drug13.setManufacturedDate("14-2-2015");
        geverolaPharmacy.getDrugCatalog().addDrugs(drug13);
        
        Drug drug14 = new Drug();
        //drug12.setDrugID(3); 
        drug14.setDrugName("Rexidol");
        drug14.setDrugType("antibacterial");
        drug14.setComposition("antibacterial ");
        drug14.setDrugAvailibility(40);
        drug14.setDrugPrice(15);
        drug14.setDrugDescription("used for cough");
        drug14.setExpirationDate("20-10-2018");
        drug14.setManufacturedDate("10-10-2015");
        geverolaPharmacy.getDrugCatalog().addDrugs(drug14);
        
    }
    public void setStoreInitialValues(StoreDirectory storeDirectory){
        StoreDirectory sd = storeDirectory;
        
        Store store1 = new Store();
        
        Store store2 = new Store();
        
        
        store1.setStoreName("Store 1");
        store1.setStoreLocation("Boston");
        sd.addStore(store1);
        
        store2.setStoreName("Store 2");
        store2.setStoreLocation("New york");
        sd.addStore(store2);
        
       
    }
                
}
