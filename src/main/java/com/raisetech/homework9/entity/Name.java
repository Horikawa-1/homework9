package com.raisetech.homework9.entity;

import lombok.Value;

public class Name {

  private final int id;
  private final String name;

  public Name(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}