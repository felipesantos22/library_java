package com.example.library.service;
import com.example.library.entity.Address;
import com.example.library.repository.AddressRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

  private final AddressRepository addressRepository;

  public AddressService(AddressRepository addressRepository) {
    this.addressRepository = addressRepository;
  }

  public List<Address> findAllAddress() {
    return addressRepository.findAll();
  }


}
