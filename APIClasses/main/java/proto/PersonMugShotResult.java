// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.PersonMugShotResult}
 */
public  final class PersonMugShotResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.PersonMugShotResult)
    PersonMugShotResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersonMugShotResult.newBuilder() to construct.
  private PersonMugShotResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersonMugShotResult() {
    personmugshots_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_PersonMugShotResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_PersonMugShotResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.PersonMugShotResult.class, proto.PersonMugShotResult.Builder.class);
  }

  public static final int PERSONMUGSHOTS_FIELD_NUMBER = 1;
  private java.util.List<proto.PersonMugShot> personmugshots_;
  /**
   * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
   */
  public java.util.List<proto.PersonMugShot> getPersonmugshotsList() {
    return personmugshots_;
  }
  /**
   * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
   */
  public java.util.List<? extends proto.PersonMugShotOrBuilder> 
      getPersonmugshotsOrBuilderList() {
    return personmugshots_;
  }
  /**
   * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
   */
  public int getPersonmugshotsCount() {
    return personmugshots_.size();
  }
  /**
   * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
   */
  public proto.PersonMugShot getPersonmugshots(int index) {
    return personmugshots_.get(index);
  }
  /**
   * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
   */
  public proto.PersonMugShotOrBuilder getPersonmugshotsOrBuilder(
      int index) {
    return personmugshots_.get(index);
  }

  public static proto.PersonMugShotResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PersonMugShotResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PersonMugShotResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PersonMugShotResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PersonMugShotResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PersonMugShotResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PersonMugShotResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PersonMugShotResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.PersonMugShotResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.PersonMugShotResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.PersonMugShotResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PersonMugShotResult parseFrom(
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
  public static Builder newBuilder(proto.PersonMugShotResult prototype) {
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
   * Protobuf type {@code proto.PersonMugShotResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.PersonMugShotResult)
      proto.PersonMugShotResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_PersonMugShotResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_PersonMugShotResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.PersonMugShotResult.class, proto.PersonMugShotResult.Builder.class);
    }

    // Construct using proto.PersonMugShotResult.newBuilder()
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
        getPersonmugshotsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (personmugshotsBuilder_ == null) {
        personmugshots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        personmugshotsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_PersonMugShotResult_descriptor;
    }

    @java.lang.Override
    public proto.PersonMugShotResult getDefaultInstanceForType() {
      return proto.PersonMugShotResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.PersonMugShotResult build() {
      proto.PersonMugShotResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.PersonMugShotResult buildPartial() {
      proto.PersonMugShotResult result = new proto.PersonMugShotResult(this);
      int from_bitField0_ = bitField0_;
      if (personmugshotsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          personmugshots_ = java.util.Collections.unmodifiableList(personmugshots_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.personmugshots_ = personmugshots_;
      } else {
        result.personmugshots_ = personmugshotsBuilder_.build();
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

    private java.util.List<proto.PersonMugShot> personmugshots_ =
      java.util.Collections.emptyList();
    private void ensurePersonmugshotsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        personmugshots_ = new java.util.ArrayList<proto.PersonMugShot>(personmugshots_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.PersonMugShot, proto.PersonMugShot.Builder, proto.PersonMugShotOrBuilder> personmugshotsBuilder_;

    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public java.util.List<proto.PersonMugShot> getPersonmugshotsList() {
      if (personmugshotsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(personmugshots_);
      } else {
        return personmugshotsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public int getPersonmugshotsCount() {
      if (personmugshotsBuilder_ == null) {
        return personmugshots_.size();
      } else {
        return personmugshotsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public proto.PersonMugShot getPersonmugshots(int index) {
      if (personmugshotsBuilder_ == null) {
        return personmugshots_.get(index);
      } else {
        return personmugshotsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public Builder setPersonmugshots(
        int index, proto.PersonMugShot value) {
      if (personmugshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonmugshotsIsMutable();
        personmugshots_.set(index, value);
        onChanged();
      } else {
        personmugshotsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public Builder setPersonmugshots(
        int index, proto.PersonMugShot.Builder builderForValue) {
      if (personmugshotsBuilder_ == null) {
        ensurePersonmugshotsIsMutable();
        personmugshots_.set(index, builderForValue.build());
        onChanged();
      } else {
        personmugshotsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public Builder addPersonmugshots(proto.PersonMugShot value) {
      if (personmugshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonmugshotsIsMutable();
        personmugshots_.add(value);
        onChanged();
      } else {
        personmugshotsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public Builder addPersonmugshots(
        int index, proto.PersonMugShot value) {
      if (personmugshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonmugshotsIsMutable();
        personmugshots_.add(index, value);
        onChanged();
      } else {
        personmugshotsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public Builder addPersonmugshots(
        proto.PersonMugShot.Builder builderForValue) {
      if (personmugshotsBuilder_ == null) {
        ensurePersonmugshotsIsMutable();
        personmugshots_.add(builderForValue.build());
        onChanged();
      } else {
        personmugshotsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public Builder addPersonmugshots(
        int index, proto.PersonMugShot.Builder builderForValue) {
      if (personmugshotsBuilder_ == null) {
        ensurePersonmugshotsIsMutable();
        personmugshots_.add(index, builderForValue.build());
        onChanged();
      } else {
        personmugshotsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public Builder addAllPersonmugshots(
        java.lang.Iterable<? extends proto.PersonMugShot> values) {
      if (personmugshotsBuilder_ == null) {
        ensurePersonmugshotsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, personmugshots_);
        onChanged();
      } else {
        personmugshotsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public Builder clearPersonmugshots() {
      if (personmugshotsBuilder_ == null) {
        personmugshots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        personmugshotsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public Builder removePersonmugshots(int index) {
      if (personmugshotsBuilder_ == null) {
        ensurePersonmugshotsIsMutable();
        personmugshots_.remove(index);
        onChanged();
      } else {
        personmugshotsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public proto.PersonMugShot.Builder getPersonmugshotsBuilder(
        int index) {
      return getPersonmugshotsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public proto.PersonMugShotOrBuilder getPersonmugshotsOrBuilder(
        int index) {
      if (personmugshotsBuilder_ == null) {
        return personmugshots_.get(index);  } else {
        return personmugshotsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public java.util.List<? extends proto.PersonMugShotOrBuilder> 
         getPersonmugshotsOrBuilderList() {
      if (personmugshotsBuilder_ != null) {
        return personmugshotsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(personmugshots_);
      }
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public proto.PersonMugShot.Builder addPersonmugshotsBuilder() {
      return getPersonmugshotsFieldBuilder().addBuilder(
          proto.PersonMugShot.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public proto.PersonMugShot.Builder addPersonmugshotsBuilder(
        int index) {
      return getPersonmugshotsFieldBuilder().addBuilder(
          index, proto.PersonMugShot.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.PersonMugShot personmugshots = 1;</code>
     */
    public java.util.List<proto.PersonMugShot.Builder> 
         getPersonmugshotsBuilderList() {
      return getPersonmugshotsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.PersonMugShot, proto.PersonMugShot.Builder, proto.PersonMugShotOrBuilder> 
        getPersonmugshotsFieldBuilder() {
      if (personmugshotsBuilder_ == null) {
        personmugshotsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.PersonMugShot, proto.PersonMugShot.Builder, proto.PersonMugShotOrBuilder>(
                personmugshots_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        personmugshots_ = null;
      }
      return personmugshotsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.PersonMugShotResult)
  }

  // @@protoc_insertion_point(class_scope:proto.PersonMugShotResult)
  private static final proto.PersonMugShotResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.PersonMugShotResult();
  }

  public static proto.PersonMugShotResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonMugShotResult>
      PARSER = new com.google.protobuf.AbstractParser<PersonMugShotResult>() {
    @java.lang.Override
    public PersonMugShotResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<PersonMugShotResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonMugShotResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.PersonMugShotResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

