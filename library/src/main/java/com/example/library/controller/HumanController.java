package com.example.library.controller;

import com.example.library.entity.Human;
import com.example.library.service.HumanService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/human")
public class HumanController {
  private final HumanService humanService;
  public HumanController(HumanService humanService) {
    this.humanService = humanService;
  }
  @GetMapping
  public List<Human> findAllController() {
    return humanService.findAllHuman();
  }

}
