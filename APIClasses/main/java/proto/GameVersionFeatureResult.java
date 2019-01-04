// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.GameVersionFeatureResult}
 */
public  final class GameVersionFeatureResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.GameVersionFeatureResult)
    GameVersionFeatureResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameVersionFeatureResult.newBuilder() to construct.
  private GameVersionFeatureResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameVersionFeatureResult() {
    gameversionfeatures_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_GameVersionFeatureResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_GameVersionFeatureResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.GameVersionFeatureResult.class, proto.GameVersionFeatureResult.Builder.class);
  }

  public static final int GAMEVERSIONFEATURES_FIELD_NUMBER = 1;
  private java.util.List<proto.GameVersionFeature> gameversionfeatures_;
  /**
   * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
   */
  public java.util.List<proto.GameVersionFeature> getGameversionfeaturesList() {
    return gameversionfeatures_;
  }
  /**
   * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
   */
  public java.util.List<? extends proto.GameVersionFeatureOrBuilder> 
      getGameversionfeaturesOrBuilderList() {
    return gameversionfeatures_;
  }
  /**
   * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
   */
  public int getGameversionfeaturesCount() {
    return gameversionfeatures_.size();
  }
  /**
   * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
   */
  public proto.GameVersionFeature getGameversionfeatures(int index) {
    return gameversionfeatures_.get(index);
  }
  /**
   * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
   */
  public proto.GameVersionFeatureOrBuilder getGameversionfeaturesOrBuilder(
      int index) {
    return gameversionfeatures_.get(index);
  }

  public static proto.GameVersionFeatureResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameVersionFeatureResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameVersionFeatureResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameVersionFeatureResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameVersionFeatureResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameVersionFeatureResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameVersionFeatureResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GameVersionFeatureResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GameVersionFeatureResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.GameVersionFeatureResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GameVersionFeatureResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GameVersionFeatureResult parseFrom(
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
  public static Builder newBuilder(proto.GameVersionFeatureResult prototype) {
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
   * Protobuf type {@code proto.GameVersionFeatureResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.GameVersionFeatureResult)
      proto.GameVersionFeatureResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_GameVersionFeatureResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_GameVersionFeatureResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.GameVersionFeatureResult.class, proto.GameVersionFeatureResult.Builder.class);
    }

    // Construct using proto.GameVersionFeatureResult.newBuilder()
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
        getGameversionfeaturesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (gameversionfeaturesBuilder_ == null) {
        gameversionfeatures_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        gameversionfeaturesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_GameVersionFeatureResult_descriptor;
    }

    @java.lang.Override
    public proto.GameVersionFeatureResult getDefaultInstanceForType() {
      return proto.GameVersionFeatureResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.GameVersionFeatureResult build() {
      proto.GameVersionFeatureResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.GameVersionFeatureResult buildPartial() {
      proto.GameVersionFeatureResult result = new proto.GameVersionFeatureResult(this);
      int from_bitField0_ = bitField0_;
      if (gameversionfeaturesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          gameversionfeatures_ = java.util.Collections.unmodifiableList(gameversionfeatures_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.gameversionfeatures_ = gameversionfeatures_;
      } else {
        result.gameversionfeatures_ = gameversionfeaturesBuilder_.build();
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

    private java.util.List<proto.GameVersionFeature> gameversionfeatures_ =
      java.util.Collections.emptyList();
    private void ensureGameversionfeaturesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        gameversionfeatures_ = new java.util.ArrayList<proto.GameVersionFeature>(gameversionfeatures_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.GameVersionFeature, proto.GameVersionFeature.Builder, proto.GameVersionFeatureOrBuilder> gameversionfeaturesBuilder_;

    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public java.util.List<proto.GameVersionFeature> getGameversionfeaturesList() {
      if (gameversionfeaturesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(gameversionfeatures_);
      } else {
        return gameversionfeaturesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public int getGameversionfeaturesCount() {
      if (gameversionfeaturesBuilder_ == null) {
        return gameversionfeatures_.size();
      } else {
        return gameversionfeaturesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public proto.GameVersionFeature getGameversionfeatures(int index) {
      if (gameversionfeaturesBuilder_ == null) {
        return gameversionfeatures_.get(index);
      } else {
        return gameversionfeaturesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public Builder setGameversionfeatures(
        int index, proto.GameVersionFeature value) {
      if (gameversionfeaturesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGameversionfeaturesIsMutable();
        gameversionfeatures_.set(index, value);
        onChanged();
      } else {
        gameversionfeaturesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public Builder setGameversionfeatures(
        int index, proto.GameVersionFeature.Builder builderForValue) {
      if (gameversionfeaturesBuilder_ == null) {
        ensureGameversionfeaturesIsMutable();
        gameversionfeatures_.set(index, builderForValue.build());
        onChanged();
      } else {
        gameversionfeaturesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public Builder addGameversionfeatures(proto.GameVersionFeature value) {
      if (gameversionfeaturesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGameversionfeaturesIsMutable();
        gameversionfeatures_.add(value);
        onChanged();
      } else {
        gameversionfeaturesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public Builder addGameversionfeatures(
        int index, proto.GameVersionFeature value) {
      if (gameversionfeaturesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGameversionfeaturesIsMutable();
        gameversionfeatures_.add(index, value);
        onChanged();
      } else {
        gameversionfeaturesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public Builder addGameversionfeatures(
        proto.GameVersionFeature.Builder builderForValue) {
      if (gameversionfeaturesBuilder_ == null) {
        ensureGameversionfeaturesIsMutable();
        gameversionfeatures_.add(builderForValue.build());
        onChanged();
      } else {
        gameversionfeaturesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public Builder addGameversionfeatures(
        int index, proto.GameVersionFeature.Builder builderForValue) {
      if (gameversionfeaturesBuilder_ == null) {
        ensureGameversionfeaturesIsMutable();
        gameversionfeatures_.add(index, builderForValue.build());
        onChanged();
      } else {
        gameversionfeaturesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public Builder addAllGameversionfeatures(
        java.lang.Iterable<? extends proto.GameVersionFeature> values) {
      if (gameversionfeaturesBuilder_ == null) {
        ensureGameversionfeaturesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, gameversionfeatures_);
        onChanged();
      } else {
        gameversionfeaturesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public Builder clearGameversionfeatures() {
      if (gameversionfeaturesBuilder_ == null) {
        gameversionfeatures_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        gameversionfeaturesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public Builder removeGameversionfeatures(int index) {
      if (gameversionfeaturesBuilder_ == null) {
        ensureGameversionfeaturesIsMutable();
        gameversionfeatures_.remove(index);
        onChanged();
      } else {
        gameversionfeaturesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public proto.GameVersionFeature.Builder getGameversionfeaturesBuilder(
        int index) {
      return getGameversionfeaturesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public proto.GameVersionFeatureOrBuilder getGameversionfeaturesOrBuilder(
        int index) {
      if (gameversionfeaturesBuilder_ == null) {
        return gameversionfeatures_.get(index);  } else {
        return gameversionfeaturesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public java.util.List<? extends proto.GameVersionFeatureOrBuilder> 
         getGameversionfeaturesOrBuilderList() {
      if (gameversionfeaturesBuilder_ != null) {
        return gameversionfeaturesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(gameversionfeatures_);
      }
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public proto.GameVersionFeature.Builder addGameversionfeaturesBuilder() {
      return getGameversionfeaturesFieldBuilder().addBuilder(
          proto.GameVersionFeature.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public proto.GameVersionFeature.Builder addGameversionfeaturesBuilder(
        int index) {
      return getGameversionfeaturesFieldBuilder().addBuilder(
          index, proto.GameVersionFeature.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.GameVersionFeature gameversionfeatures = 1;</code>
     */
    public java.util.List<proto.GameVersionFeature.Builder> 
         getGameversionfeaturesBuilderList() {
      return getGameversionfeaturesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.GameVersionFeature, proto.GameVersionFeature.Builder, proto.GameVersionFeatureOrBuilder> 
        getGameversionfeaturesFieldBuilder() {
      if (gameversionfeaturesBuilder_ == null) {
        gameversionfeaturesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.GameVersionFeature, proto.GameVersionFeature.Builder, proto.GameVersionFeatureOrBuilder>(
                gameversionfeatures_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        gameversionfeatures_ = null;
      }
      return gameversionfeaturesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.GameVersionFeatureResult)
  }

  // @@protoc_insertion_point(class_scope:proto.GameVersionFeatureResult)
  private static final proto.GameVersionFeatureResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.GameVersionFeatureResult();
  }

  public static proto.GameVersionFeatureResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameVersionFeatureResult>
      PARSER = new com.google.protobuf.AbstractParser<GameVersionFeatureResult>() {
    @java.lang.Override
    public GameVersionFeatureResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<GameVersionFeatureResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameVersionFeatureResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.GameVersionFeatureResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

