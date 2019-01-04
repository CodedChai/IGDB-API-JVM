// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf enum {@code proto.RegionLanguageEnum}
 */
public enum RegionLanguageEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>REGION_LANGUAGE_NULL = 0;</code>
   */
  REGION_LANGUAGE_NULL(0),
  /**
   * <code>EUROPE = 1;</code>
   */
  EUROPE(1),
  /**
   * <code>NORTH_AMERICA = 2;</code>
   */
  NORTH_AMERICA(2),
  /**
   * <code>AUSTRALIA = 3;</code>
   */
  AUSTRALIA(3),
  /**
   * <code>NEW_ZELAND = 4;</code>
   */
  NEW_ZELAND(4),
  /**
   * <code>JAPAN = 5;</code>
   */
  JAPAN(5),
  /**
   * <code>CHINA = 6;</code>
   */
  CHINA(6),
  /**
   * <code>ASIA = 7;</code>
   */
  ASIA(7),
  /**
   * <code>WORLDWIDE = 8;</code>
   */
  WORLDWIDE(8),
  /**
   * <code>HONG_KONG = 9;</code>
   */
  HONG_KONG(9),
  /**
   * <code>SOUTH_KOREA = 10;</code>
   */
  SOUTH_KOREA(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>REGION_LANGUAGE_NULL = 0;</code>
   */
  public static final int REGION_LANGUAGE_NULL_VALUE = 0;
  /**
   * <code>EUROPE = 1;</code>
   */
  public static final int EUROPE_VALUE = 1;
  /**
   * <code>NORTH_AMERICA = 2;</code>
   */
  public static final int NORTH_AMERICA_VALUE = 2;
  /**
   * <code>AUSTRALIA = 3;</code>
   */
  public static final int AUSTRALIA_VALUE = 3;
  /**
   * <code>NEW_ZELAND = 4;</code>
   */
  public static final int NEW_ZELAND_VALUE = 4;
  /**
   * <code>JAPAN = 5;</code>
   */
  public static final int JAPAN_VALUE = 5;
  /**
   * <code>CHINA = 6;</code>
   */
  public static final int CHINA_VALUE = 6;
  /**
   * <code>ASIA = 7;</code>
   */
  public static final int ASIA_VALUE = 7;
  /**
   * <code>WORLDWIDE = 8;</code>
   */
  public static final int WORLDWIDE_VALUE = 8;
  /**
   * <code>HONG_KONG = 9;</code>
   */
  public static final int HONG_KONG_VALUE = 9;
  /**
   * <code>SOUTH_KOREA = 10;</code>
   */
  public static final int SOUTH_KOREA_VALUE = 10;


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
  public static RegionLanguageEnum valueOf(int value) {
    return forNumber(value);
  }

  public static RegionLanguageEnum forNumber(int value) {
    switch (value) {
      case 0: return REGION_LANGUAGE_NULL;
      case 1: return EUROPE;
      case 2: return NORTH_AMERICA;
      case 3: return AUSTRALIA;
      case 4: return NEW_ZELAND;
      case 5: return JAPAN;
      case 6: return CHINA;
      case 7: return ASIA;
      case 8: return WORLDWIDE;
      case 9: return HONG_KONG;
      case 10: return SOUTH_KOREA;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RegionLanguageEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RegionLanguageEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RegionLanguageEnum>() {
          public RegionLanguageEnum findValueByNumber(int number) {
            return RegionLanguageEnum.forNumber(number);
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
    return proto.IGDBProtoFile.getDescriptor().getEnumTypes().get(1);
  }

  private static final RegionLanguageEnum[] VALUES = values();

  public static RegionLanguageEnum valueOf(
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

  private RegionLanguageEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.RegionLanguageEnum)
}

