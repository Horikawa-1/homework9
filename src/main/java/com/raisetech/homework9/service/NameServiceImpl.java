package com.raisetech.homework9.service;

import com.raisetech.homework9.entity.Name;
import com.raisetech.homework9.mapper.NameMapper;
import javax.naming.NameNotFoundException;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NameServiceImpl implements com.raisetech.homework9.service.NameService {

  private final NameMapper nameMapper;

  public NameServiceImpl(NameMapper nameMapper) {
    this.nameMapper = nameMapper;
  }

  @Override
  public List<Name> findAll() {
    return nameMapper.findAll();
  }

  @Override
  public Name findById(int id) throws Exception {
    return nameMapper.findById(id)
        .orElseThrow(() -> new NameNotFoundException("ID:" + id + " Not Found"));
  }
}
