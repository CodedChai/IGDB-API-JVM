// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf enum {@code proto.AchievementCategoryEnum}
 */
public enum AchievementCategoryEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ACHIEVEMENT_CATEGORY_NULL = 0;</code>
   */
  ACHIEVEMENT_CATEGORY_NULL(0),
  /**
   * <code>PLAYSTATION = 1;</code>
   */
  PLAYSTATION(1),
  /**
   * <code>XBOX = 2;</code>
   */
  XBOX(2),
  /**
   * <code>STEAM = 3;</code>
   */
  STEAM(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ACHIEVEMENT_CATEGORY_NULL = 0;</code>
   */
  public static final int ACHIEVEMENT_CATEGORY_NULL_VALUE = 0;
  /**
   * <code>PLAYSTATION = 1;</code>
   */
  public static final int PLAYSTATION_VALUE = 1;
  /**
   * <code>XBOX = 2;</code>
   */
  public static final int XBOX_VALUE = 2;
  /**
   * <code>STEAM = 3;</code>
   */
  public static final int STEAM_VALUE = 3;


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
  public static AchievementCategoryEnum valueOf(int value) {
    return forNumber(value);
  }

  public static AchievementCategoryEnum forNumber(int value) {
    switch (value) {
      case 0: return ACHIEVEMENT_CATEGORY_NULL;
      case 1: return PLAYSTATION;
      case 2: return XBOX;
      case 3: return STEAM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AchievementCategoryEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AchievementCategoryEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AchievementCategoryEnum>() {
          public AchievementCategoryEnum findValueByNumber(int number) {
            return AchievementCategoryEnum.forNumber(number);
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
    return proto.IGDBProtoFile.getDescriptor().getEnumTypes().get(0);
  }

  private static final AchievementCategoryEnum[] VALUES = values();

  public static AchievementCategoryEnum valueOf(
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

  private AchievementCategoryEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.AchievementCategoryEnum)
}

