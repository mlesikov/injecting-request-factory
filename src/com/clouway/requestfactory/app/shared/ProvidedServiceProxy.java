package com.clouway.requestfactory.app.shared;

import com.clouway.requestfactory.app.model.ProvidedService;
import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

/**
 * @author Miroslav Genov (mgenov@gmail.com)
 */
@ProxyFor(ProvidedService.class)
public interface ProvidedServiceProxy extends ValueProxy {

  String getName();

  void setName(String name);

  Double getPrice();

  void setPrice(Double price);

}
