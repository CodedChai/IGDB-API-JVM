// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf enum {@code proto.PageSubCategoryEnum}
 */
public enum PageSubCategoryEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PAGE_SUB_CATEGORY_NULL = 0;</code>
   */
  PAGE_SUB_CATEGORY_NULL(0),
  /**
   * <code>USER = 1;</code>
   */
  USER(1),
  /**
   * <code>GAME = 2;</code>
   */
  GAME(2),
  /**
   * <code>COMPANY = 3;</code>
   */
  COMPANY(3),
  /**
   * <code>CONSUMER = 4;</code>
   */
  CONSUMER(4),
  /**
   * <code>INDUSTRY = 5;</code>
   */
  INDUSTRY(5),
  /**
   * <code>E_SPORTS = 6;</code>
   */
  E_SPORTS(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PAGE_SUB_CATEGORY_NULL = 0;</code>
   */
  public static final int PAGE_SUB_CATEGORY_NULL_VALUE = 0;
  /**
   * <code>USER = 1;</code>
   */
  public static final int USER_VALUE = 1;
  /**
   * <code>GAME = 2;</code>
   */
  public static final int GAME_VALUE = 2;
  /**
   * <code>COMPANY = 3;</code>
   */
  public static final int COMPANY_VALUE = 3;
  /**
   * <code>CONSUMER = 4;</code>
   */
  public static final int CONSUMER_VALUE = 4;
  /**
   * <code>INDUSTRY = 5;</code>
   */
  public static final int INDUSTRY_VALUE = 5;
  /**
   * <code>E_SPORTS = 6;</code>
   */
  public static final int E_SPORTS_VALUE = 6;


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
  public static PageSubCategoryEnum valueOf(int value) {
    return forNumber(value);
  }

  public static PageSubCategoryEnum forNumber(int value) {
    switch (value) {
      case 0: return PAGE_SUB_CATEGORY_NULL;
      case 1: return USER;
      case 2: return GAME;
      case 3: return COMPANY;
      case 4: return CONSUMER;
      case 5: return INDUSTRY;
      case 6: return E_SPORTS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PageSubCategoryEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PageSubCategoryEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PageSubCategoryEnum>() {
          public PageSubCategoryEnum findValueByNumber(int number) {
            return PageSubCategoryEnum.forNumber(number);
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
    return proto.IGDBProtoFile.getDescriptor().getEnumTypes().get(18);
  }

  private static final PageSubCategoryEnum[] VALUES = values();

  public static PageSubCategoryEnum valueOf(
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

  private PageSubCategoryEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.PageSubCategoryEnum)
}

