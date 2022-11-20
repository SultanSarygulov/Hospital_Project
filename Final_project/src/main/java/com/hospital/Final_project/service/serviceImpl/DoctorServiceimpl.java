package com.hospital.Final_project.service.serviceImpl;

import com.hospital.Final_project.model.DoctorModel;
import com.hospital.Final_project.repository.DoctorRepository;
import com.hospital.Final_project.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
    public void saveDoctor(DoctorModel doctorModel){
        this.doctorRepository.save(doctorModel);
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
