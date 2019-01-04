// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf enum {@code proto.ReviewCategoryEnum}
 */
public enum ReviewCategoryEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>REVIEW_CATEGORY_NULL = 0;</code>
   */
  REVIEW_CATEGORY_NULL(0),
  /**
   * <code>TEXT = 1;</code>
   */
  TEXT(1),
  /**
   * <code>VIDEO = 2;</code>
   */
  VIDEO(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>REVIEW_CATEGORY_NULL = 0;</code>
   */
  public static final int REVIEW_CATEGORY_NULL_VALUE = 0;
  /**
   * <code>TEXT = 1;</code>
   */
  public static final int TEXT_VALUE = 1;
  /**
   * <code>VIDEO = 2;</code>
   */
  public static final int VIDEO_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ReviewCategoryEnum valueOf(int value) {
    return forNumber(value);
  }

  public static ReviewCategoryEnum forNumber(int value) {
    switch (value) {
      case 0: return REVIEW_CATEGORY_NULL;
      case 1: return TEXT;
      case 2: return VIDEO;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ReviewCategoryEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ReviewCategoryEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ReviewCategoryEnum>() {
          public ReviewCategoryEnum findValueByNumber(int number) {
            return ReviewCategoryEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return proto.IGDBProtoFile.getDescriptor().getEnumTypes().get(20);
  }

  private static final ReviewCategoryEnum[] VALUES = values();

  public static ReviewCategoryEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ReviewCategoryEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.ReviewCategoryEnum)
}

