package org.launchcode.javawebdevtechjobsauthentication.controllers;

import org.launchcode.javawebdevtechjobsauthentication.models.data.EmployerRepository;
import org.launchcode.javawebdevtechjobsauthentication.models.data.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class EmployerController {

    @Autowired
    private EmployerRepository employerRepository;

}


