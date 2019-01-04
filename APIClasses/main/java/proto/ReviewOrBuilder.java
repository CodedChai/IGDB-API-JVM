// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface ReviewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Review)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>.proto.ReviewCategoryEnum category = 2;</code>
   */
  int getCategoryValue();
  /**
   * <code>.proto.ReviewCategoryEnum category = 2;</code>
   */
  proto.ReviewCategoryEnum getCategory();

  /**
   * <code>string conclusion = 3;</code>
   */
  java.lang.String getConclusion();
  /**
   * <code>string conclusion = 3;</code>
   */
  com.google.protobuf.ByteString
      getConclusionBytes();

  /**
   * <code>string content = 4;</code>
   */
  java.lang.String getContent();
  /**
   * <code>string content = 4;</code>
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>.google.protobuf.Timestamp createdAt = 5;</code>
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 5;</code>
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.proto.Game game = 6;</code>
   */
  boolean hasGame();
  /**
   * <code>.proto.Game game = 6;</code>
   */
  proto.Game getGame();
  /**
   * <code>.proto.Game game = 6;</code>
   */
  proto.GameOrBuilder getGameOrBuilder();

  /**
   * <code>string introduction = 7;</code>
   */
  java.lang.String getIntroduction();
  /**
   * <code>string introduction = 7;</code>
   */
  com.google.protobuf.ByteString
      getIntroductionBytes();

  /**
   * <code>int32 likes = 8;</code>
   */
  int getLikes();

  /**
   * <code>string negativePoints = 9;</code>
   */
  java.lang.String getNegativePoints();
  /**
   * <code>string negativePoints = 9;</code>
   */
  com.google.protobuf.ByteString
      getNegativePointsBytes();

  /**
   * <code>.proto.Platform platform = 10;</code>
   */
  boolean hasPlatform();
  /**
   * <code>.proto.Platform platform = 10;</code>
   */
  proto.Platform getPlatform();
  /**
   * <code>.proto.Platform platform = 10;</code>
   */
  proto.PlatformOrBuilder getPlatformOrBuilder();

  /**
   * <code>string positivePoints = 11;</code>
   */
  java.lang.String getPositivePoints();
  /**
   * <code>string positivePoints = 11;</code>
   */
  com.google.protobuf.ByteString
      getPositivePointsBytes();

  /**
   * <code>string slug = 12;</code>
   */
  java.lang.String getSlug();
  /**
   * <code>string slug = 12;</code>
   */
  com.google.protobuf.ByteString
      getSlugBytes();

  /**
   * <code>string title = 13;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 13;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>.google.protobuf.Timestamp updatedAt = 14;</code>
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updatedAt = 14;</code>
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updatedAt = 14;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>string url = 15;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 15;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>.proto.User user = 16;</code>
   */
  boolean hasUser();
  /**
   * <code>.proto.User user = 16;</code>
   */
  proto.User getUser();
  /**
   * <code>.proto.User user = 16;</code>
   */
  proto.UserOrBuilder getUserOrBuilder();

  /**
   * <code>.proto.Rate userRating = 17;</code>
   */
  boolean hasUserRating();
  /**
   * <code>.proto.Rate userRating = 17;</code>
   */
  proto.Rate getUserRating();
  /**
   * <code>.proto.Rate userRating = 17;</code>
   */
  proto.RateOrBuilder getUserRatingOrBuilder();

  /**
   * <code>.proto.ReviewVideo video = 18;</code>
   */
  boolean hasVideo();
  /**
   * <code>.proto.ReviewVideo video = 18;</code>
   */
  proto.ReviewVideo getVideo();
  /**
   * <code>.proto.ReviewVideo video = 18;</code>
   */
  proto.ReviewVideoOrBuilder getVideoOrBuilder();

  /**
   * <code>int32 views = 19;</code>
   */
  int getViews();
}