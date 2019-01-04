// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.AchievementIconResult}
 */
public  final class AchievementIconResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.AchievementIconResult)
    AchievementIconResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AchievementIconResult.newBuilder() to construct.
  private AchievementIconResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AchievementIconResult() {
    achievementicons_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_AchievementIconResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_AchievementIconResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.AchievementIconResult.class, proto.AchievementIconResult.Builder.class);
  }

  public static final int ACHIEVEMENTICONS_FIELD_NUMBER = 1;
  private java.util.List<proto.AchievementIcon> achievementicons_;
  /**
   * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
   */
  public java.util.List<proto.AchievementIcon> getAchievementiconsList() {
    return achievementicons_;
  }
  /**
   * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
   */
  public java.util.List<? extends proto.AchievementIconOrBuilder> 
      getAchievementiconsOrBuilderList() {
    return achievementicons_;
  }
  /**
   * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
   */
  public int getAchievementiconsCount() {
    return achievementicons_.size();
  }
  /**
   * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
   */
  public proto.AchievementIcon getAchievementicons(int index) {
    return achievementicons_.get(index);
  }
  /**
   * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
   */
  public proto.AchievementIconOrBuilder getAchievementiconsOrBuilder(
      int index) {
    return achievementicons_.get(index);
  }

  public static proto.AchievementIconResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.AchievementIconResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.AchievementIconResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.AchievementIconResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.AchievementIconResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.AchievementIconResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.AchievementIconResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.AchievementIconResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.AchievementIconResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.AchievementIconResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.AchievementIconResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.AchievementIconResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.AchievementIconResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code proto.AchievementIconResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.AchievementIconResult)
      proto.AchievementIconResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_AchievementIconResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_AchievementIconResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.AchievementIconResult.class, proto.AchievementIconResult.Builder.class);
    }

    // Construct using proto.AchievementIconResult.newBuilder()
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
        getAchievementiconsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (achievementiconsBuilder_ == null) {
        achievementicons_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        achievementiconsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_AchievementIconResult_descriptor;
    }

    @java.lang.Override
    public proto.AchievementIconResult getDefaultInstanceForType() {
      return proto.AchievementIconResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.AchievementIconResult build() {
      proto.AchievementIconResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.AchievementIconResult buildPartial() {
      proto.AchievementIconResult result = new proto.AchievementIconResult(this);
      int from_bitField0_ = bitField0_;
      if (achievementiconsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          achievementicons_ = java.util.Collections.unmodifiableList(achievementicons_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.achievementicons_ = achievementicons_;
      } else {
        result.achievementicons_ = achievementiconsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private java.util.List<proto.AchievementIcon> achievementicons_ =
      java.util.Collections.emptyList();
    private void ensureAchievementiconsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        achievementicons_ = new java.util.ArrayList<proto.AchievementIcon>(achievementicons_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.AchievementIcon, proto.AchievementIcon.Builder, proto.AchievementIconOrBuilder> achievementiconsBuilder_;

    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public java.util.List<proto.AchievementIcon> getAchievementiconsList() {
      if (achievementiconsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(achievementicons_);
      } else {
        return achievementiconsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public int getAchievementiconsCount() {
      if (achievementiconsBuilder_ == null) {
        return achievementicons_.size();
      } else {
        return achievementiconsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public proto.AchievementIcon getAchievementicons(int index) {
      if (achievementiconsBuilder_ == null) {
        return achievementicons_.get(index);
      } else {
        return achievementiconsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public Builder setAchievementicons(
        int index, proto.AchievementIcon value) {
      if (achievementiconsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAchievementiconsIsMutable();
        achievementicons_.set(index, value);
        onChanged();
      } else {
        achievementiconsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public Builder setAchievementicons(
        int index, proto.AchievementIcon.Builder builderForValue) {
      if (achievementiconsBuilder_ == null) {
        ensureAchievementiconsIsMutable();
        achievementicons_.set(index, builderForValue.build());
        onChanged();
      } else {
        achievementiconsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public Builder addAchievementicons(proto.AchievementIcon value) {
      if (achievementiconsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAchievementiconsIsMutable();
        achievementicons_.add(value);
        onChanged();
      } else {
        achievementiconsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public Builder addAchievementicons(
        int index, proto.AchievementIcon value) {
      if (achievementiconsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAchievementiconsIsMutable();
        achievementicons_.add(index, value);
        onChanged();
      } else {
        achievementiconsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public Builder addAchievementicons(
        proto.AchievementIcon.Builder builderForValue) {
      if (achievementiconsBuilder_ == null) {
        ensureAchievementiconsIsMutable();
        achievementicons_.add(builderForValue.build());
        onChanged();
      } else {
        achievementiconsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public Builder addAchievementicons(
        int index, proto.AchievementIcon.Builder builderForValue) {
      if (achievementiconsBuilder_ == null) {
        ensureAchievementiconsIsMutable();
        achievementicons_.add(index, builderForValue.build());
        onChanged();
      } else {
        achievementiconsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public Builder addAllAchievementicons(
        java.lang.Iterable<? extends proto.AchievementIcon> values) {
      if (achievementiconsBuilder_ == null) {
        ensureAchievementiconsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, achievementicons_);
        onChanged();
      } else {
        achievementiconsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public Builder clearAchievementicons() {
      if (achievementiconsBuilder_ == null) {
        achievementicons_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        achievementiconsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public Builder removeAchievementicons(int index) {
      if (achievementiconsBuilder_ == null) {
        ensureAchievementiconsIsMutable();
        achievementicons_.remove(index);
        onChanged();
      } else {
        achievementiconsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public proto.AchievementIcon.Builder getAchievementiconsBuilder(
        int index) {
      return getAchievementiconsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public proto.AchievementIconOrBuilder getAchievementiconsOrBuilder(
        int index) {
      if (achievementiconsBuilder_ == null) {
        return achievementicons_.get(index);  } else {
        return achievementiconsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public java.util.List<? extends proto.AchievementIconOrBuilder> 
         getAchievementiconsOrBuilderList() {
      if (achievementiconsBuilder_ != null) {
        return achievementiconsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(achievementicons_);
      }
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public proto.AchievementIcon.Builder addAchievementiconsBuilder() {
      return getAchievementiconsFieldBuilder().addBuilder(
          proto.AchievementIcon.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public proto.AchievementIcon.Builder addAchievementiconsBuilder(
        int index) {
      return getAchievementiconsFieldBuilder().addBuilder(
          index, proto.AchievementIcon.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.AchievementIcon achievementicons = 1;</code>
     */
    public java.util.List<proto.AchievementIcon.Builder> 
         getAchievementiconsBuilderList() {
      return getAchievementiconsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.AchievementIcon, proto.AchievementIcon.Builder, proto.AchievementIconOrBuilder> 
        getAchievementiconsFieldBuilder() {
      if (achievementiconsBuilder_ == null) {
        achievementiconsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.AchievementIcon, proto.AchievementIcon.Builder, proto.AchievementIconOrBuilder>(
                achievementicons_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        achievementicons_ = null;
      }
      return achievementiconsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.AchievementIconResult)
  }

  // @@protoc_insertion_point(class_scope:proto.AchievementIconResult)
  private static final proto.AchievementIconResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.AchievementIconResult();
  }

  public static proto.AchievementIconResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AchievementIconResult>
      PARSER = new com.google.protobuf.AbstractParser<AchievementIconResult>() {
    @java.lang.Override
    public AchievementIconResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<AchievementIconResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AchievementIconResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.AchievementIconResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

