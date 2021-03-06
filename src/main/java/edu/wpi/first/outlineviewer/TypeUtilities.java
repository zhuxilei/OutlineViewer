package edu.wpi.first.outlineviewer;

import java.util.Optional;

/**
 * Utilities dealing with the type system.
 */
public final class TypeUtilities {

  private TypeUtilities() {
    throw new UnsupportedOperationException("This is a utility class!");
  }

  /**
   * If 'value' can be cast into 'cls',
   * returns an Optional of that casted value. Otherwise, returns Empty.
   */
  public static <T> Optional<T> optionalCast(Object value, Class<T> cls) {
    return cls.isAssignableFrom(value.getClass())
        ? Optional.of(cls.cast(value))
        : Optional.empty();
  }
}
