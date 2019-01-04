// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface PlatformVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.PlatformVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>repeated .proto.PlatformVersionCompany companies = 2;</code>
   */
  java.util.List<proto.PlatformVersionCompany> 
      getCompaniesList();
  /**
   * <code>repeated .proto.PlatformVersionCompany companies = 2;</code>
   */
  proto.PlatformVersionCompany getCompanies(int index);
  /**
   * <code>repeated .proto.PlatformVersionCompany companies = 2;</code>
   */
  int getCompaniesCount();
  /**
   * <code>repeated .proto.PlatformVersionCompany companies = 2;</code>
   */
  java.util.List<? extends proto.PlatformVersionCompanyOrBuilder> 
      getCompaniesOrBuilderList();
  /**
   * <code>repeated .proto.PlatformVersionCompany companies = 2;</code>
   */
  proto.PlatformVersionCompanyOrBuilder getCompaniesOrBuilder(
      int index);

  /**
   * <code>string connectivity = 3;</code>
   */
  java.lang.String getConnectivity();
  /**
   * <code>string connectivity = 3;</code>
   */
  com.google.protobuf.ByteString
      getConnectivityBytes();

  /**
   * <code>string cpu = 4;</code>
   */
  java.lang.String getCpu();
  /**
   * <code>string cpu = 4;</code>
   */
  com.google.protobuf.ByteString
      getCpuBytes();

  /**
   * <code>string graphics = 5;</code>
   */
  java.lang.String getGraphics();
  /**
   * <code>string graphics = 5;</code>
   */
  com.google.protobuf.ByteString
      getGraphicsBytes();

  /**
   * <code>.proto.PlatformVersionCompany mainManufacturer = 6;</code>
   */
  boolean hasMainManufacturer();
  /**
   * <code>.proto.PlatformVersionCompany mainManufacturer = 6;</code>
   */
  proto.PlatformVersionCompany getMainManufacturer();
  /**
   * <code>.proto.PlatformVersionCompany mainManufacturer = 6;</code>
   */
  proto.PlatformVersionCompanyOrBuilder getMainManufacturerOrBuilder();

  /**
   * <code>string media = 7;</code>
   */
  java.lang.String getMedia();
  /**
   * <code>string media = 7;</code>
   */
  com.google.protobuf.ByteString
      getMediaBytes();

  /**
   * <code>string memory = 8;</code>
   */
  java.lang.String getMemory();
  /**
   * <code>string memory = 8;</code>
   */
  com.google.protobuf.ByteString
      getMemoryBytes();

  /**
   * <code>string name = 9;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 9;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string online = 10;</code>
   */
  java.lang.String getOnline();
  /**
   * <code>string online = 10;</code>
   */
  com.google.protobuf.ByteString
      getOnlineBytes();

  /**
   * <code>string os = 11;</code>
   */
  java.lang.String getOs();
  /**
   * <code>string os = 11;</code>
   */
  com.google.protobuf.ByteString
      getOsBytes();

  /**
   * <code>string output = 12;</code>
   */
  java.lang.String getOutput();
  /**
   * <code>string output = 12;</code>
   */
  com.google.protobuf.ByteString
      getOutputBytes();

  /**
   * <code>.proto.PlatformLogo platformLogo = 13;</code>
   */
  boolean hasPlatformLogo();
  /**
   * <code>.proto.PlatformLogo platformLogo = 13;</code>
   */
  proto.PlatformLogo getPlatformLogo();
  /**
   * <code>.proto.PlatformLogo platformLogo = 13;</code>
   */
  proto.PlatformLogoOrBuilder getPlatformLogoOrBuilder();

  /**
   * <code>repeated .proto.PlatformVersionReleaseDate platformVersionReleaseDates = 14;</code>
   */
  java.util.List<proto.PlatformVersionReleaseDate> 
      getPlatformVersionReleaseDatesList();
  /**
   * <code>repeated .proto.PlatformVersionReleaseDate platformVersionReleaseDates = 14;</code>
   */
  proto.PlatformVersionReleaseDate getPlatformVersionReleaseDates(int index);
  /**
   * <code>repeated .proto.PlatformVersionReleaseDate platformVersionReleaseDates = 14;</code>
   */
  int getPlatformVersionReleaseDatesCount();
  /**
   * <code>repeated .proto.PlatformVersionReleaseDate platformVersionReleaseDates = 14;</code>
   */
  java.util.List<? extends proto.PlatformVersionReleaseDateOrBuilder> 
      getPlatformVersionReleaseDatesOrBuilderList();
  /**
   * <code>repeated .proto.PlatformVersionReleaseDate platformVersionReleaseDates = 14;</code>
   */
  proto.PlatformVersionReleaseDateOrBuilder getPlatformVersionReleaseDatesOrBuilder(
      int index);

  /**
   * <code>string resolutions = 15;</code>
   */
  java.lang.String getResolutions();
  /**
   * <code>string resolutions = 15;</code>
   */
  com.google.protobuf.ByteString
      getResolutionsBytes();

  /**
   * <code>string slug = 16;</code>
   */
  java.lang.String getSlug();
  /**
   * <code>string slug = 16;</code>
   */
  com.google.protobuf.ByteString
      getSlugBytes();

  /**
   * <code>string sound = 17;</code>
   */
  java.lang.String getSound();
  /**
   * <code>string sound = 17;</code>
   */
  com.google.protobuf.ByteString
      getSoundBytes();

  /**
   * <code>string storage = 18;</code>
   */
  java.lang.String getStorage();
  /**
   * <code>string storage = 18;</code>
   */
  com.google.protobuf.ByteString
      getStorageBytes();

  /**
   * <code>string summary = 19;</code>
   */
  java.lang.String getSummary();
  /**
   * <code>string summary = 19;</code>
   */
  com.google.protobuf.ByteString
      getSummaryBytes();

  /**
   * <code>string url = 20;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 20;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}
