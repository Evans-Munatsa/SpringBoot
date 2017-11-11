package com.booster.API.domain.Services;

import com.booster.API.domain.models.Patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PatientService {

    private List<Patient> patients = new ArrayList<>(Arrays.asList(
            new Patient((long) 1, "Evans", "Munatsa", "gagamel@gmail.com", "79 Ventura", "7405", 23)
    ));

    public List<Patient> getAllPatients(){
        return  patients;
    }

    public Patient getPatient(String firstName){
        return patients.stream().filter(t -> t.getFirstName().equals(firstName)).findFirst().get();
    }


    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void updatePatient(long id, Patient patient) {
        for (int i = 0; i < patients.size(); i++){
            Patient t = patients.get(i);
            if (t.getId().equals(id)) {
                patients.set(i, patient);
                return;
            }
        }
    }

    public void deletePatient(long id) {
        patients.removeIf(t -> t.getId().equals(id));
    }
}
