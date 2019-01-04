// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface AgeRatingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.AgeRating)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>.proto.AgeRatingCategoryEnum category = 2;</code>
   */
  int getCategoryValue();
  /**
   * <code>.proto.AgeRatingCategoryEnum category = 2;</code>
   */
  proto.AgeRatingCategoryEnum getCategory();

  /**
   * <code>repeated .proto.AgeRatingContentDescription contentDescriptions = 3;</code>
   */
  java.util.List<proto.AgeRatingContentDescription> 
      getContentDescriptionsList();
  /**
   * <code>repeated .proto.AgeRatingContentDescription contentDescriptions = 3;</code>
   */
  proto.AgeRatingContentDescription getContentDescriptions(int index);
  /**
   * <code>repeated .proto.AgeRatingContentDescription contentDescriptions = 3;</code>
   */
  int getContentDescriptionsCount();
  /**
   * <code>repeated .proto.AgeRatingContentDescription contentDescriptions = 3;</code>
   */
  java.util.List<? extends proto.AgeRatingContentDescriptionOrBuilder> 
      getContentDescriptionsOrBuilderList();
  /**
   * <code>repeated .proto.AgeRatingContentDescription contentDescriptions = 3;</code>
   */
  proto.AgeRatingContentDescriptionOrBuilder getContentDescriptionsOrBuilder(
      int index);

  /**
   * <code>.proto.AgeRatingRatingEnum rating = 4;</code>
   */
  int getRatingValue();
  /**
   * <code>.proto.AgeRatingRatingEnum rating = 4;</code>
   */
  proto.AgeRatingRatingEnum getRating();

  /**
   * <code>string ratingCoverUrl = 5;</code>
   */
  java.lang.String getRatingCoverUrl();
  /**
   * <code>string ratingCoverUrl = 5;</code>
   */
  com.google.protobuf.ByteString
      getRatingCoverUrlBytes();

  /**
   * <code>string synopsis = 6;</code>
   */
  java.lang.String getSynopsis();
  /**
   * <code>string synopsis = 6;</code>
   */
  com.google.protobuf.ByteString
      getSynopsisBytes();
}
