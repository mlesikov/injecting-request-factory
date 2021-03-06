package com.clouway.requestfactory.app.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Miroslav Genov (mgenov@gmail.com)
 */
public class Customer {
  private Long id;

  @NotNull
  @Size(min=3, max=16)
  private String name;
  private Date installationDate;
  private Long version;
  private Integer age;

  private List<ProvidedService> services = new ArrayList<ProvidedService>();

  @SuppressWarnings("unused")
  public Customer() {
  }

  public Customer(Long id, String name, Date installationDate, Integer age, Long version) {
    this.id = id;
    this.name = name;
    this.installationDate = installationDate;
    this.age = age;
    this.version = version;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getInstallationDate() {
    return installationDate;
  }

  public void setInstallationDate(Date installationDate) {
    this.installationDate = installationDate;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public Long getVersion() {
    return version;
  }

  public String getName() {
    return name;
  }

  public List<ProvidedService> getServices() {
    return services;
  }

  public void setServices(List<ProvidedService> services) {
    this.services = services;
  }
}
