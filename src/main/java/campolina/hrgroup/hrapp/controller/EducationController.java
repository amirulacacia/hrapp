package campolina.hrgroup.hrapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import campolina.hrgroup.hrapp.model.Education;
import campolina.hrgroup.hrapp.service.EducationService;

@RestController
@RequestMapping("/education")
public class EducationController {

    @Autowired
    private EducationService educationService;

    @PostMapping
    public Education createEducation(@RequestBody Education education) {
        return educationService.createEducation(education);
    }

    @GetMapping("/{educationId}")
    public Education getEducationById(@PathVariable Long educationId) {
        return educationService.getEducationById(educationId);
    }

    @GetMapping
    public List<Education> getAllEducations() {
        return educationService.getAllEducations();
    }

    @PutMapping("/{educationId}")
    public Education updateEducation(@RequestBody Education education,
                                     @PathVariable Long educationId) {
        return educationService.updateEducation(education);
    }

    @DeleteMapping("/{educationId}")
    public String deleteEducation(@PathVariable Long educationId) {
        return educationService.deleteEducation(educationId);
    }
}
