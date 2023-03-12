package com.raisetech.homework9.service;

import com.raisetech.homework9.entity.Name;
import com.raisetech.homework9.exception.NameNotFoundException;
import com.raisetech.homework9.mapper.NameMapper;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NameServiceImpl implements NameService {

  private final NameMapper nameMapper;

  public NameServiceImpl(NameMapper nameMapper) {
    this.nameMapper = nameMapper;
  }

  @Override
  public List<Name> findAll() {
    return nameMapper.findAll();
  }

  @Override
  public Name findById(int id) {
    return nameMapper.findById(id)
        .orElseThrow(() -> new NameNotFoundException("ID:" + id + " Not Found"));
  }
}
