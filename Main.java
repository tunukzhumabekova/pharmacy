import java.util.Arrays;

public class Main {
        public static void main(String[] args) {

            Medicines medicines0 =new Medicines("Ибупрофен",20,10);
            Medicines medicines1 =new Medicines("тайлол-хот",80,70);
            Medicines medicines2 =new Medicines("цитрамон",41,30);
            Medicines medicines3 =new Medicines("мезим",35,25);
            Medicines medicines4 =new Medicines("ибуфен",400,63);
            Medicines medicines5 =new Medicines("цинепар",86,50);
            Medicines medicines6 =new Medicines("парецетамол",60,30);
            Medicines medicines7 =new Medicines("витамин с",90,50);
            Medicines medicines8 =new Medicines("линекс",150,90);
            Medicines[] medicinesA1={medicines1,medicines2};
            Medicines[] medicinesA2={medicines3,medicines4,medicines5};
            Medicines[] medicinesA3={medicines6,medicines7,medicines8};
            Worker worker0=new Worker("John",18,"John@gmail");
            Worker worker1=new Worker("Alice",25,"Alice@gmail");
            Worker worker2=new Worker("Bob",22,"Bob@gmail");
            Worker worker3=new Worker("Frank",30,"Frank@gmail");
            Worker worker4=new Worker("lima",35,"Lima@gmail.com");
            Worker worker5=new Worker("Grace",30,"Grace@gmail");
            Worker[]workersA1={worker0,worker1};
            Worker[]workersA2={worker2,worker3};
            Worker[]workersA3={worker4,worker5};
            Pharmacy pharmacy=new Pharmacy("Neman","Aitmatov 25",medicinesA1,workersA1);
            Pharmacy pharmacy1=new Pharmacy("Lekar","Chui 51",medicinesA2,workersA2);
            Pharmacy pharmacy2=new Pharmacy("Aibolit" ,"kiev 90",medicinesA3,workersA3);
            Pharmacy[] pharmacies={pharmacy,pharmacy1,pharmacy2};
            DataBase dataBase=new DataBase(pharmacies);
        System.out.println(Arrays.toString(dataBase.getAllMedicinesByPharmacyName("Neman")));
        System.out.println(Arrays.toString(dataBase.getAllWorkersByPharmacyAddress("Aitmatov 25")));
        System.out.println(Arrays.toString(new Pharmacy[]{dataBase.getPharmacyByWorkerName("John")}));
                System.out.println(pharmacy.updateMedicinePrice("Ибупрофен", 80));
                 System.out.println(pharmacy.deleteWorkerByName("Alice"));
             System.out.println(pharmacy.deleteMedicineByName("Ибупрофен"));
                System.out.println(Arrays.toString(new String[]{dataBase.addMedicinesToPharmacy("Neman", medicines0)}));
        }


    }


