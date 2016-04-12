package org.rabix.bindings.protocol.zero.bean;

import org.rabix.bindings.model.ApplicationPort;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ZeroPort extends ApplicationPort {
  
  public ZeroPort(String id) {
    this(id, null, null, null, null);
  }
  
  @JsonCreator
  public ZeroPort(@JsonProperty("id") String id, @JsonProperty("default") Object defaultValue, @JsonProperty("type") Object schema, @JsonProperty("scatter") Boolean scatter, @JsonProperty("linkMerge") String linkMerge) {
    super(id, defaultValue, schema, scatter, linkMerge);
  }
  
  public String getId() {
    return id;
  }

}
