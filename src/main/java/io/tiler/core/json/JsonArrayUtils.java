package io.tiler.core.json;

import org.vertx.java.core.json.JsonArray;

import java.util.Collection;

public final class JsonArrayUtils {
  private JsonArrayUtils() {
  }

  public static <T> JsonArray convertToJsonArray(Collection<T> collection) {
    JsonArray jsonArray = new JsonArray();
    collection.forEach(jsonArray::add);
    return jsonArray;
  }
}
