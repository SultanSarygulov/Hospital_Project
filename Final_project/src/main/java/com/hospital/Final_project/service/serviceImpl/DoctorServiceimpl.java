package com.hospital.Final_project.service.serviceImpl;

import com.hospital.Final_project.model.DoctorModel;
import com.hospital.Final_project.repository.DoctorRepository;
import com.hospital.Final_project.service.DoctorService;

import java.util.List;

public class DoctorServiceimpl implements DoctorService {
    private DoctorRepository doctorRepository;

    public DoctorServiceimpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public List<DoctorModel> getAllstuff(){
        return doctorRepository.findAll();
    }

    @Override
    public DoctorModel saveDoctor(DoctorModel doctorModel){
        return doctorRepository.save(doctorModel);
    }

//    @Override
//    public DoctorModel deleteDoctor(DoctorModel doctorModel){
//        return doctorRepository.delete(doctorModel);
//    }

    @Override
    public DoctorModel getDoctorById(Long id) {
        return doctorRepository.findById(id).get();
    }
}
