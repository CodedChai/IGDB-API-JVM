// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface GameVersionFeatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GameVersionFeature)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>.proto.GameVersionFeatureCategoryEnum category = 2;</code>
   */
  int getCategoryValue();
  /**
   * <code>.proto.GameVersionFeatureCategoryEnum category = 2;</code>
   */
  proto.GameVersionFeatureCategoryEnum getCategory();

  /**
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>int32 position = 4;</code>
   */
  int getPosition();

  /**
   * <code>string title = 5;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 5;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>repeated .proto.GameVersionFeatureValue values = 6;</code>
   */
  java.util.List<proto.GameVersionFeatureValue> 
      getValuesList();
  /**
   * <code>repeated .proto.GameVersionFeatureValue values = 6;</code>
   */
  proto.GameVersionFeatureValue getValues(int index);
  /**
   * <code>repeated .proto.GameVersionFeatureValue values = 6;</code>
   */
  int getValuesCount();
  /**
   * <code>repeated .proto.GameVersionFeatureValue values = 6;</code>
   */
  java.util.List<? extends proto.GameVersionFeatureValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <code>repeated .proto.GameVersionFeatureValue values = 6;</code>
   */
  proto.GameVersionFeatureValueOrBuilder getValuesOrBuilder(
      int index);
}
