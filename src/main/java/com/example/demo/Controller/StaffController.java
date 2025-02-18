package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.Service.StaffService;
import com.example.demo.models.Staff;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/staffs")
@CrossOrigin(origins = "*")
public class StaffController {
    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<Staff> getStaffs() {
        return staffService.getAllStaffs();
    }

    @PostMapping
    public Staff createStaff(@RequestBody Staff staff) {
        return staffService.saveStaff(staff);
    }

    @PostMapping("/login")
    public Optional<Staff> login(@RequestBody Staff staff) {
        return staffService.getStaffByUsername(staff.getUsername());
    }
}