// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface SocialMetricOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.SocialMetric)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>.proto.SocialMetricCategoryEnum category = 2;</code>
   */
  int getCategoryValue();
  /**
   * <code>.proto.SocialMetricCategoryEnum category = 2;</code>
   */
  proto.SocialMetricCategoryEnum getCategory();

  /**
   * <code>.google.protobuf.Timestamp createdAt = 3;</code>
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 3;</code>
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.proto.SocialMetricSource socialMetricSource = 4;</code>
   */
  boolean hasSocialMetricSource();
  /**
   * <code>.proto.SocialMetricSource socialMetricSource = 4;</code>
   */
  proto.SocialMetricSource getSocialMetricSource();
  /**
   * <code>.proto.SocialMetricSource socialMetricSource = 4;</code>
   */
  proto.SocialMetricSourceOrBuilder getSocialMetricSourceOrBuilder();

  /**
   * <code>int32 value = 5;</code>
   */
  int getValue();
}