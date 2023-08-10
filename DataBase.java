import java.util.Arrays;

public class DataBase {
    private Pharmacy[] Pharmacies;

    public DataBase() {

    }

    public DataBase(Pharmacy[] pharmacies) {
        Pharmacies = pharmacies;
    }

    public Pharmacy[] getPharmacies() {
        return Pharmacies;
    }

    public void setPharmacies(Pharmacy[] pharmacies) {
        Pharmacies = pharmacies;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "Pharmacies=" + Arrays.toString(Pharmacies) +
                '}';
    }

    Medicines[] getAllMedicinesByPharmacyName(String pharmacyName) {
        for (Pharmacy pharmacy : Pharmacies) {
            if (pharmacy.getName().equals(pharmacyName)) {
                return pharmacy.getMedicines();
            }
        }
        return null;
    }


    Worker[] getAllWorkersByPharmacyAddress(String address) {
        for (Pharmacy pharmacy : Pharmacies) {
            if (pharmacy.getAddress().equals(address)) {
                return pharmacy.getWorker();
            }
        }
        return null;
    }


    Pharmacy getPharmacyByWorkerName(String workerName) {
        for (Pharmacy pharmacy : Pharmacies) {
            Worker[] workers = pharmacy.getWorker();
            for (Worker worker : workers) {
                if (worker.getName().equals(workerName)) {
                    return pharmacy;
                }
            }
        }
        return null;
    }


    String addMedicinesToPharmacy(String pharmacyName, Medicines medicines) {
        for (int i = 0; i < Pharmacies.length; i++) {
            if (Pharmacies[i].getName().equalsIgnoreCase(pharmacyName)) {
                Medicines[] oldMedicines = Pharmacies[i].getMedicines();
                for (int j = 0; j < oldMedicines.length; j++) {
                    if (oldMedicines[j].getName().equalsIgnoreCase(medicines.getName())) {
                        return "This medicine already exists";
                    }
                }
                Medicines[] newMedicines = new Medicines[oldMedicines.length + 1];
                for (int j = 0; j < oldMedicines.length; j++) {
                    newMedicines[j] = oldMedicines[j];
                }
                newMedicines[oldMedicines.length] = medicines;
                Pharmacies[i].setMedicines(newMedicines);
                return "Medicine added: " + Arrays.toString(newMedicines);
            }
        }
        return "Pharmacy not found";
    }

}




