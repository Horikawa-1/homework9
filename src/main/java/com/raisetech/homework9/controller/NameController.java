package com.raisetech.homework9.controller;

import java.util.List;
import com.raisetech.homework9.service.NameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

  private final NameService nameService;

  public NameController(NameService nameService) {
    this.nameService = nameService;
  }

  @GetMapping("/names")
  public List<NameResponse> getNames() {
    return nameService.findAll().stream().map(NameResponse::new).toList();
  }

  @GetMapping("/names/{id}")
  public NameResponse getNameById(@PathVariable("id") int id) throws Exception {
    return new NameResponse(nameService.findById(id));
  }
}