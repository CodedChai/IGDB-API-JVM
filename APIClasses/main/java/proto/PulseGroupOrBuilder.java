// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface PulseGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.PulseGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>.google.protobuf.Timestamp createdAt = 2;</code>
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 2;</code>
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.proto.Game game = 3;</code>
   */
  boolean hasGame();
  /**
   * <code>.proto.Game game = 3;</code>
   */
  proto.Game getGame();
  /**
   * <code>.proto.Game game = 3;</code>
   */
  proto.GameOrBuilder getGameOrBuilder();

  /**
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.Timestamp publishedAt = 5;</code>
   */
  boolean hasPublishedAt();
  /**
   * <code>.google.protobuf.Timestamp publishedAt = 5;</code>
   */
  com.google.protobuf.Timestamp getPublishedAt();
  /**
   * <code>.google.protobuf.Timestamp publishedAt = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getPublishedAtOrBuilder();

  /**
   * <code>repeated .proto.Pulse pulses = 6;</code>
   */
  java.util.List<proto.Pulse> 
      getPulsesList();
  /**
   * <code>repeated .proto.Pulse pulses = 6;</code>
   */
  proto.Pulse getPulses(int index);
  /**
   * <code>repeated .proto.Pulse pulses = 6;</code>
   */
  int getPulsesCount();
  /**
   * <code>repeated .proto.Pulse pulses = 6;</code>
   */
  java.util.List<? extends proto.PulseOrBuilder> 
      getPulsesOrBuilderList();
  /**
   * <code>repeated .proto.Pulse pulses = 6;</code>
   */
  proto.PulseOrBuilder getPulsesOrBuilder(
      int index);

  /**
   * <code>repeated int32 tags = 7;</code>
   */
  java.util.List<java.lang.Integer> getTagsList();
  /**
   * <code>repeated int32 tags = 7;</code>
   */
  int getTagsCount();
  /**
   * <code>repeated int32 tags = 7;</code>
   */
  int getTags(int index);

  /**
   * <code>.google.protobuf.Timestamp updatedAt = 8;</code>
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updatedAt = 8;</code>
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updatedAt = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();
}
