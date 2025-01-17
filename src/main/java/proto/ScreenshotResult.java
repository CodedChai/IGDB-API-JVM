// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.ScreenshotResult}
 */
public  final class ScreenshotResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ScreenshotResult)
    ScreenshotResultOrBuilder {
  // Use ScreenshotResult.newBuilder() to construct.
  private ScreenshotResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScreenshotResult() {
    screenshots_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_ScreenshotResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_ScreenshotResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.ScreenshotResult.class, proto.ScreenshotResult.Builder.class);
  }

  public static final int SCREENSHOTS_FIELD_NUMBER = 1;
  private java.util.List<proto.Screenshot> screenshots_;
  /**
   * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
   */
  public java.util.List<proto.Screenshot> getScreenshotsList() {
    return screenshots_;
  }
  /**
   * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
   */
  public java.util.List<? extends proto.ScreenshotOrBuilder> 
      getScreenshotsOrBuilderList() {
    return screenshots_;
  }
  /**
   * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
   */
  public int getScreenshotsCount() {
    return screenshots_.size();
  }
  /**
   * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
   */
  public proto.Screenshot getScreenshots(int index) {
    return screenshots_.get(index);
  }
  /**
   * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
   */
  public proto.ScreenshotOrBuilder getScreenshotsOrBuilder(
      int index) {
    return screenshots_.get(index);
  }

  public static proto.ScreenshotResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ScreenshotResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ScreenshotResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ScreenshotResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ScreenshotResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.ScreenshotResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.ScreenshotResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.ScreenshotResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.ScreenshotResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.ScreenshotResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.ScreenshotResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.ScreenshotResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ScreenshotResult)
      proto.ScreenshotResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_ScreenshotResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_ScreenshotResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.ScreenshotResult.class, proto.ScreenshotResult.Builder.class);
    }

    // Construct using proto.ScreenshotResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getScreenshotsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (screenshotsBuilder_ == null) {
        screenshots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        screenshotsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_ScreenshotResult_descriptor;
    }

    public proto.ScreenshotResult getDefaultInstanceForType() {
      return proto.ScreenshotResult.getDefaultInstance();
    }

    public proto.ScreenshotResult build() {
      proto.ScreenshotResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public proto.ScreenshotResult buildPartial() {
      proto.ScreenshotResult result = new proto.ScreenshotResult(this);
      int from_bitField0_ = bitField0_;
      if (screenshotsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          screenshots_ = java.util.Collections.unmodifiableList(screenshots_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.screenshots_ = screenshots_;
      } else {
        result.screenshots_ = screenshotsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private java.util.List<proto.Screenshot> screenshots_ =
      java.util.Collections.emptyList();
    private void ensureScreenshotsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        screenshots_ = new java.util.ArrayList<proto.Screenshot>(screenshots_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Screenshot, proto.Screenshot.Builder, proto.ScreenshotOrBuilder> screenshotsBuilder_;

    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public java.util.List<proto.Screenshot> getScreenshotsList() {
      if (screenshotsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(screenshots_);
      } else {
        return screenshotsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public int getScreenshotsCount() {
      if (screenshotsBuilder_ == null) {
        return screenshots_.size();
      } else {
        return screenshotsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public proto.Screenshot getScreenshots(int index) {
      if (screenshotsBuilder_ == null) {
        return screenshots_.get(index);
      } else {
        return screenshotsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public Builder setScreenshots(
        int index, proto.Screenshot value) {
      if (screenshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScreenshotsIsMutable();
        screenshots_.set(index, value);
        onChanged();
      } else {
        screenshotsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public Builder setScreenshots(
        int index, proto.Screenshot.Builder builderForValue) {
      if (screenshotsBuilder_ == null) {
        ensureScreenshotsIsMutable();
        screenshots_.set(index, builderForValue.build());
        onChanged();
      } else {
        screenshotsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public Builder addScreenshots(proto.Screenshot value) {
      if (screenshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScreenshotsIsMutable();
        screenshots_.add(value);
        onChanged();
      } else {
        screenshotsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public Builder addScreenshots(
        int index, proto.Screenshot value) {
      if (screenshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScreenshotsIsMutable();
        screenshots_.add(index, value);
        onChanged();
      } else {
        screenshotsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public Builder addScreenshots(
        proto.Screenshot.Builder builderForValue) {
      if (screenshotsBuilder_ == null) {
        ensureScreenshotsIsMutable();
        screenshots_.add(builderForValue.build());
        onChanged();
      } else {
        screenshotsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public Builder addScreenshots(
        int index, proto.Screenshot.Builder builderForValue) {
      if (screenshotsBuilder_ == null) {
        ensureScreenshotsIsMutable();
        screenshots_.add(index, builderForValue.build());
        onChanged();
      } else {
        screenshotsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public Builder addAllScreenshots(
        java.lang.Iterable<? extends proto.Screenshot> values) {
      if (screenshotsBuilder_ == null) {
        ensureScreenshotsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, screenshots_);
        onChanged();
      } else {
        screenshotsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public Builder clearScreenshots() {
      if (screenshotsBuilder_ == null) {
        screenshots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        screenshotsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public Builder removeScreenshots(int index) {
      if (screenshotsBuilder_ == null) {
        ensureScreenshotsIsMutable();
        screenshots_.remove(index);
        onChanged();
      } else {
        screenshotsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public proto.Screenshot.Builder getScreenshotsBuilder(
        int index) {
      return getScreenshotsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public proto.ScreenshotOrBuilder getScreenshotsOrBuilder(
        int index) {
      if (screenshotsBuilder_ == null) {
        return screenshots_.get(index);  } else {
        return screenshotsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public java.util.List<? extends proto.ScreenshotOrBuilder> 
         getScreenshotsOrBuilderList() {
      if (screenshotsBuilder_ != null) {
        return screenshotsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(screenshots_);
      }
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public proto.Screenshot.Builder addScreenshotsBuilder() {
      return getScreenshotsFieldBuilder().addBuilder(
          proto.Screenshot.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public proto.Screenshot.Builder addScreenshotsBuilder(
        int index) {
      return getScreenshotsFieldBuilder().addBuilder(
          index, proto.Screenshot.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Screenshot com.codedchai.igdb.kt.screenshots = 1;</code>
     */
    public java.util.List<proto.Screenshot.Builder> 
         getScreenshotsBuilderList() {
      return getScreenshotsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Screenshot, proto.Screenshot.Builder, proto.ScreenshotOrBuilder> 
        getScreenshotsFieldBuilder() {
      if (screenshotsBuilder_ == null) {
        screenshotsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Screenshot, proto.Screenshot.Builder, proto.ScreenshotOrBuilder>(
                screenshots_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        screenshots_ = null;
      }
      return screenshotsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.ScreenshotResult)
  }

  // @@protoc_insertion_point(class_scope:proto.ScreenshotResult)
  private static final proto.ScreenshotResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.ScreenshotResult();
  }

  public static proto.ScreenshotResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScreenshotResult>
      PARSER = new com.google.protobuf.AbstractParser<ScreenshotResult>() {
    public ScreenshotResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(
                builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ScreenshotResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScreenshotResult> getParserForType() {
    return PARSER;
  }

  public proto.ScreenshotResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

