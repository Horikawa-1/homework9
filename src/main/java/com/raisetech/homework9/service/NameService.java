package com.raisetech.homework9.service;

import com.raisetech.homework9.entity.Name;
import java.util.List;

public interface NameService {

  List<Name> findAll();

  Name findById(int id) throws Exception;
}
