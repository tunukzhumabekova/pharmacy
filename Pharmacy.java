import java.util.Arrays;

public class Pharmacy {
    private String name;
    private String address;
    private Medicines[] medicines;
    private Worker[] worker;
    private Pharmacy[] Pharmacy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Medicines[] getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicines[] medicines) {
        this.medicines = medicines;
    }

    public Worker[] getWorker() {
        return worker;
    }

    public void setWorker(Worker[] worker) {
        this.worker = worker;
    }


    public Pharmacy(String name, String address, Medicines[] medicines, Worker[] worker) {
        this.name = name;
        this.address = address;
        this.medicines = medicines;
        this.worker = worker;
    }


    public Medicines updateMedicinePrice(String MedicineName, int newPrice) {

        for (int i = 0; i < medicines.length; i++) {
            Medicines medicine = medicines[i];
            if (medicine.getName().equals(MedicineName)) {
                medicine.setPrice(newPrice);
                return medicine;
            }

        }
        return null;
    }
    public void addMedicine(Medicines medicine) {
        Medicines[] newMedicines = new Medicines[medicines.length + 1];
        for (int i = 0; i < medicines.length; i++) {
            newMedicines[i] = medicines[i];
        }
        newMedicines[medicines.length] = medicine;
        medicines = newMedicines;
        System.out.println(medicines);
    }


    String  deleteMedicineByName(String medicineName) {
        for (int i = 0; medicines.length > i; i++) {
            if (medicines[i].getName().equals(medicineName)) {
                for (int j = i; j < medicines.length - 1; j++) {
                    medicines[j] = medicines[j + 1];
                }
                medicines[medicines.length - 1] = null;
                return "Medicine was deleted";
            }
        }
        return "Medicine was not deleted";
    }


    String deleteWorkerByName(String workerName) {
        for (int i = 0; i < worker.length; i++) {
            if (worker[i].getName().equals(workerName)){
            for (int j = i; j < worker.length - 1; j++) {
                worker[j] = worker[j + 1];
            }

                worker[worker.length - 1] = null;
                return "worker was  deleted";
            }
        }

    return "worker was not deleted";
}





        @Override
        public String toString () {
            return "Pharmacy{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", medicines=" + Arrays.toString(medicines) +
                    ", worker=" + Arrays.toString(worker) +
                    '}';
        }
    }

