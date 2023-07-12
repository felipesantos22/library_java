package com.example.library.service;

import com.example.library.entity.Human;
import com.example.library.repository.HumanRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class HumanService {

  private final HumanRepository humanRepository;

  public HumanService(HumanRepository humanRepository) {
    this.humanRepository = humanRepository;
  }

  public List<Human> findAllHuman() {
    return humanRepository.findAll();
  }

}
