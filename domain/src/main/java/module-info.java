module domain {
  requires spring.beans;
  requires spring.context;
  requires spring.data.commons;
  requires hibernate.jpa;
  requires hibernate.core;

  exports com.nwidart.service;
  exports com.nwidart.model;
}