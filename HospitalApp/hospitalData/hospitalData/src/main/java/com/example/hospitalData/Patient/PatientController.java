package com.example.hospitalData.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class PatientController {
    private PatientService patientService;
    @Autowired
    public void showResultServiceController(PatientService patientService){
        this.patientService = patientService;
    }

    @GetMapping("/add-patient")
    public String showAddPatientForm(Model model) {
        model.addAttribute("Patient", new Patient());
        return "addPage";
    }
    @PostMapping("/add-patient")
    public String addPatient(@RequestParam(required = false) String name,
                             @RequestParam(required = false) Integer age
                             ) {
        if (StringUtils.isEmpty(name) || age == null) {
            return "error";
        }
        Patient patient = new Patient();
        patient.setName(name);
        patient.setAge(age);

        patientService.savePatient(patient);
        return "redirect:/success-add";
    }

    @GetMapping("/success-add")
    public String successfulAddingPatient() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://analytics:8083/update";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(headers);
        restTemplate.exchange(url, HttpMethod.POST, entity, Void.class);
        return "successPage";
    }
}
