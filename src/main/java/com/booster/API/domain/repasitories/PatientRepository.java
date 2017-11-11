package com.booster.API.domain.repasitories;

import com.booster.API.domain.models.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
}
