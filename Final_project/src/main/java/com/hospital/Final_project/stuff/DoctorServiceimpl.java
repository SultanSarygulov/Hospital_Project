package com.hospital.Final_project.stuff;

import com.hospital.Final_project.stuff.DoctorModel;

import java.util.List;

public class DoctorServiceimpl implements DoctorService{
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
