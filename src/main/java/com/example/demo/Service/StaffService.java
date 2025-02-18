package com.example.demo.Service;

import org.springframework.stereotype.Service;
import com.example.demo.Repository.StaffRepository;
import com.example.demo.models.Staff;
import java.util.List;
import java.util.Optional;

@Service
public class StaffService {
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff> getAllStaffs() {
        return staffRepository.findAll();
    }

    public Staff saveStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    public Optional<Staff> getStaffByUsername(String username) {
        return staffRepository.findByUsername(username);
    }
}