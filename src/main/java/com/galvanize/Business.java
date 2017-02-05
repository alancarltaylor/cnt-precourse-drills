package com.galvanize;

import java.util.*;


public class Business implements Addressable {

  private final String name;
  private final ArrayList<Address> addresses;

  public Business(String name){
    this.name = name;
    this.addresses = new ArrayList<>();
  }

  public String getName(){
    return name;
  }

  public List<Address> getAddresses(){
    return addresses;
  }

  public void addAddress(Address address){
    this.addresses.add(address);
  }

}
