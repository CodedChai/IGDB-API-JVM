// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf enum {@code proto.FeedCategoryEnum}
 */
public enum FeedCategoryEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FEED_CATEGORY_NULL = 0;</code>
   */
  FEED_CATEGORY_NULL(0),
  /**
   * <code>PULSE_ARTICLE = 1;</code>
   */
  PULSE_ARTICLE(1),
  /**
   * <code>COMING_SOON = 2;</code>
   */
  COMING_SOON(2),
  /**
   * <code>NEW_TRAILER = 3;</code>
   */
  NEW_TRAILER(3),
  /**
   * <code>USER_CONTRIBUTED_ITEM = 5;</code>
   */
  USER_CONTRIBUTED_ITEM(5),
  /**
   * <code>USER_CONTRIBUTIONS_ITEM = 6;</code>
   */
  USER_CONTRIBUTIONS_ITEM(6),
  /**
   * <code>PAGE_CONTRIBUTED_ITEM = 7;</code>
   */
  PAGE_CONTRIBUTED_ITEM(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FEED_CATEGORY_NULL = 0;</code>
   */
  public static final int FEED_CATEGORY_NULL_VALUE = 0;
  /**
   * <code>PULSE_ARTICLE = 1;</code>
   */
  public static final int PULSE_ARTICLE_VALUE = 1;
  /**
   * <code>COMING_SOON = 2;</code>
   */
  public static final int COMING_SOON_VALUE = 2;
  /**
   * <code>NEW_TRAILER = 3;</code>
   */
  public static final int NEW_TRAILER_VALUE = 3;
  /**
   * <code>USER_CONTRIBUTED_ITEM = 5;</code>
   */
  public static final int USER_CONTRIBUTED_ITEM_VALUE = 5;
  /**
   * <code>USER_CONTRIBUTIONS_ITEM = 6;</code>
   */
  public static final int USER_CONTRIBUTIONS_ITEM_VALUE = 6;
  /**
   * <code>PAGE_CONTRIBUTED_ITEM = 7;</code>
   */
  public static final int PAGE_CONTRIBUTED_ITEM_VALUE = 7;


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
  public static FeedCategoryEnum valueOf(int value) {
    return forNumber(value);
  }

  public static FeedCategoryEnum forNumber(int value) {
    switch (value) {
      case 0: return FEED_CATEGORY_NULL;
      case 1: return PULSE_ARTICLE;
      case 2: return COMING_SOON;
      case 3: return NEW_TRAILER;
      case 5: return USER_CONTRIBUTED_ITEM;
      case 6: return USER_CONTRIBUTIONS_ITEM;
      case 7: return PAGE_CONTRIBUTED_ITEM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FeedCategoryEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FeedCategoryEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FeedCategoryEnum>() {
          public FeedCategoryEnum findValueByNumber(int number) {
            return FeedCategoryEnum.forNumber(number);
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
    return proto.IGDBProtoFile.getDescriptor().getEnumTypes().get(11);
  }

  private static final FeedCategoryEnum[] VALUES = values();

  public static FeedCategoryEnum valueOf(
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

  private FeedCategoryEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.FeedCategoryEnum)
}

