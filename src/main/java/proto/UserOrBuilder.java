// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional string battlenet = 2;</code>
   */
  java.lang.String getBattlenet();
  /**
   * <code>optional string battlenet = 2;</code>
   */
  com.google.protobuf.ByteString
      getBattlenetBytes();

  /**
   * <code>optional .proto.ColorColorEnum color = 3;</code>
   */
  int getColorValue();
  /**
   * <code>optional .proto.ColorColorEnum color = 3;</code>
   */
  proto.ColorColorEnum getColor();

  /**
   * <code>optional .google.protobuf.Timestamp createdAt = 4;</code>
   */
  boolean hasCreatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp createdAt = 4;</code>
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp createdAt = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>optional string discord = 5;</code>
   */
  java.lang.String getDiscord();
  /**
   * <code>optional string discord = 5;</code>
   */
  com.google.protobuf.ByteString
      getDiscordBytes();

  /**
   * <code>optional string facebook = 6;</code>
   */
  java.lang.String getFacebook();
  /**
   * <code>optional string facebook = 6;</code>
   */
  com.google.protobuf.ByteString
      getFacebookBytes();

  /**
   * <code>optional string googlePlus = 7;</code>
   */
  java.lang.String getGooglePlus();
  /**
   * <code>optional string googlePlus = 7;</code>
   */
  com.google.protobuf.ByteString
      getGooglePlusBytes();

  /**
   * <code>optional string instagram = 8;</code>
   */
  java.lang.String getInstagram();
  /**
   * <code>optional string instagram = 8;</code>
   */
  com.google.protobuf.ByteString
      getInstagramBytes();

  /**
   * <code>optional string linkedin = 9;</code>
   */
  java.lang.String getLinkedin();
  /**
   * <code>optional string linkedin = 9;</code>
   */
  com.google.protobuf.ByteString
      getLinkedinBytes();

  /**
   * <code>optional string origin = 10;</code>
   */
  java.lang.String getOrigin();
  /**
   * <code>optional string origin = 10;</code>
   */
  com.google.protobuf.ByteString
      getOriginBytes();

  /**
   * <code>optional string pinterest = 11;</code>
   */
  java.lang.String getPinterest();
  /**
   * <code>optional string pinterest = 11;</code>
   */
  com.google.protobuf.ByteString
      getPinterestBytes();

  /**
   * <code>optional string presentation = 12;</code>
   */
  java.lang.String getPresentation();
  /**
   * <code>optional string presentation = 12;</code>
   */
  com.google.protobuf.ByteString
      getPresentationBytes();

  /**
   * <code>optional string reddit = 13;</code>
   */
  java.lang.String getReddit();
  /**
   * <code>optional string reddit = 13;</code>
   */
  com.google.protobuf.ByteString
      getRedditBytes();

  /**
   * <code>optional .proto.UserRoleEnum role = 14;</code>
   */
  int getRoleValue();
  /**
   * <code>optional .proto.UserRoleEnum role = 14;</code>
   */
  proto.UserRoleEnum getRole();

  /**
   * <code>optional string slug = 15;</code>
   */
  java.lang.String getSlug();
  /**
   * <code>optional string slug = 15;</code>
   */
  com.google.protobuf.ByteString
      getSlugBytes();

  /**
   * <code>optional string soundcloud = 16;</code>
   */
  java.lang.String getSoundcloud();
  /**
   * <code>optional string soundcloud = 16;</code>
   */
  com.google.protobuf.ByteString
      getSoundcloudBytes();

  /**
   * <code>optional string steam = 17;</code>
   */
  java.lang.String getSteam();
  /**
   * <code>optional string steam = 17;</code>
   */
  com.google.protobuf.ByteString
      getSteamBytes();

  /**
   * <code>optional string twitch = 18;</code>
   */
  java.lang.String getTwitch();
  /**
   * <code>optional string twitch = 18;</code>
   */
  com.google.protobuf.ByteString
      getTwitchBytes();

  /**
   * <code>optional string twitter = 19;</code>
   */
  java.lang.String getTwitter();
  /**
   * <code>optional string twitter = 19;</code>
   */
  com.google.protobuf.ByteString
      getTwitterBytes();

  /**
   * <code>optional .google.protobuf.Timestamp updatedAt = 20;</code>
   */
  boolean hasUpdatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp updatedAt = 20;</code>
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp updatedAt = 20;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>optional string uplay = 21;</code>
   */
  java.lang.String getUplay();
  /**
   * <code>optional string uplay = 21;</code>
   */
  com.google.protobuf.ByteString
      getUplayBytes();

  /**
   * <code>optional string url = 22;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 22;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>optional string username = 23;</code>
   */
  java.lang.String getUsername();
  /**
   * <code>optional string username = 23;</code>
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>optional string youtube = 24;</code>
   */
  java.lang.String getYoutube();
  /**
   * <code>optional string youtube = 24;</code>
   */
  com.google.protobuf.ByteString
      getYoutubeBytes();
}