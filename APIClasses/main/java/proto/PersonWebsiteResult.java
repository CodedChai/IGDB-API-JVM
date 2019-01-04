// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.PersonWebsiteResult}
 */
public  final class PersonWebsiteResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.PersonWebsiteResult)
    PersonWebsiteResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersonWebsiteResult.newBuilder() to construct.
  private PersonWebsiteResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersonWebsiteResult() {
    personwebsites_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_PersonWebsiteResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_PersonWebsiteResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.PersonWebsiteResult.class, proto.PersonWebsiteResult.Builder.class);
  }

  public static final int PERSONWEBSITES_FIELD_NUMBER = 1;
  private java.util.List<proto.PersonWebsite> personwebsites_;
  /**
   * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
   */
  public java.util.List<proto.PersonWebsite> getPersonwebsitesList() {
    return personwebsites_;
  }
  /**
   * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
   */
  public java.util.List<? extends proto.PersonWebsiteOrBuilder> 
      getPersonwebsitesOrBuilderList() {
    return personwebsites_;
  }
  /**
   * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
   */
  public int getPersonwebsitesCount() {
    return personwebsites_.size();
  }
  /**
   * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
   */
  public proto.PersonWebsite getPersonwebsites(int index) {
    return personwebsites_.get(index);
  }
  /**
   * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
   */
  public proto.PersonWebsiteOrBuilder getPersonwebsitesOrBuilder(
      int index) {
    return personwebsites_.get(index);
  }

  public static proto.PersonWebsiteResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PersonWebsiteResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PersonWebsiteResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PersonWebsiteResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PersonWebsiteResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PersonWebsiteResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PersonWebsiteResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PersonWebsiteResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.PersonWebsiteResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.PersonWebsiteResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.PersonWebsiteResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PersonWebsiteResult parseFrom(
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
  public static Builder newBuilder(proto.PersonWebsiteResult prototype) {
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
   * Protobuf type {@code proto.PersonWebsiteResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.PersonWebsiteResult)
      proto.PersonWebsiteResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_PersonWebsiteResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_PersonWebsiteResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.PersonWebsiteResult.class, proto.PersonWebsiteResult.Builder.class);
    }

    // Construct using proto.PersonWebsiteResult.newBuilder()
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
        getPersonwebsitesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (personwebsitesBuilder_ == null) {
        personwebsites_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        personwebsitesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_PersonWebsiteResult_descriptor;
    }

    @java.lang.Override
    public proto.PersonWebsiteResult getDefaultInstanceForType() {
      return proto.PersonWebsiteResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.PersonWebsiteResult build() {
      proto.PersonWebsiteResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.PersonWebsiteResult buildPartial() {
      proto.PersonWebsiteResult result = new proto.PersonWebsiteResult(this);
      int from_bitField0_ = bitField0_;
      if (personwebsitesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          personwebsites_ = java.util.Collections.unmodifiableList(personwebsites_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.personwebsites_ = personwebsites_;
      } else {
        result.personwebsites_ = personwebsitesBuilder_.build();
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

    private java.util.List<proto.PersonWebsite> personwebsites_ =
      java.util.Collections.emptyList();
    private void ensurePersonwebsitesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        personwebsites_ = new java.util.ArrayList<proto.PersonWebsite>(personwebsites_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.PersonWebsite, proto.PersonWebsite.Builder, proto.PersonWebsiteOrBuilder> personwebsitesBuilder_;

    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public java.util.List<proto.PersonWebsite> getPersonwebsitesList() {
      if (personwebsitesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(personwebsites_);
      } else {
        return personwebsitesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public int getPersonwebsitesCount() {
      if (personwebsitesBuilder_ == null) {
        return personwebsites_.size();
      } else {
        return personwebsitesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public proto.PersonWebsite getPersonwebsites(int index) {
      if (personwebsitesBuilder_ == null) {
        return personwebsites_.get(index);
      } else {
        return personwebsitesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public Builder setPersonwebsites(
        int index, proto.PersonWebsite value) {
      if (personwebsitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonwebsitesIsMutable();
        personwebsites_.set(index, value);
        onChanged();
      } else {
        personwebsitesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public Builder setPersonwebsites(
        int index, proto.PersonWebsite.Builder builderForValue) {
      if (personwebsitesBuilder_ == null) {
        ensurePersonwebsitesIsMutable();
        personwebsites_.set(index, builderForValue.build());
        onChanged();
      } else {
        personwebsitesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public Builder addPersonwebsites(proto.PersonWebsite value) {
      if (personwebsitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonwebsitesIsMutable();
        personwebsites_.add(value);
        onChanged();
      } else {
        personwebsitesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public Builder addPersonwebsites(
        int index, proto.PersonWebsite value) {
      if (personwebsitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonwebsitesIsMutable();
        personwebsites_.add(index, value);
        onChanged();
      } else {
        personwebsitesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public Builder addPersonwebsites(
        proto.PersonWebsite.Builder builderForValue) {
      if (personwebsitesBuilder_ == null) {
        ensurePersonwebsitesIsMutable();
        personwebsites_.add(builderForValue.build());
        onChanged();
      } else {
        personwebsitesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public Builder addPersonwebsites(
        int index, proto.PersonWebsite.Builder builderForValue) {
      if (personwebsitesBuilder_ == null) {
        ensurePersonwebsitesIsMutable();
        personwebsites_.add(index, builderForValue.build());
        onChanged();
      } else {
        personwebsitesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public Builder addAllPersonwebsites(
        java.lang.Iterable<? extends proto.PersonWebsite> values) {
      if (personwebsitesBuilder_ == null) {
        ensurePersonwebsitesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, personwebsites_);
        onChanged();
      } else {
        personwebsitesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public Builder clearPersonwebsites() {
      if (personwebsitesBuilder_ == null) {
        personwebsites_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        personwebsitesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public Builder removePersonwebsites(int index) {
      if (personwebsitesBuilder_ == null) {
        ensurePersonwebsitesIsMutable();
        personwebsites_.remove(index);
        onChanged();
      } else {
        personwebsitesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public proto.PersonWebsite.Builder getPersonwebsitesBuilder(
        int index) {
      return getPersonwebsitesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public proto.PersonWebsiteOrBuilder getPersonwebsitesOrBuilder(
        int index) {
      if (personwebsitesBuilder_ == null) {
        return personwebsites_.get(index);  } else {
        return personwebsitesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public java.util.List<? extends proto.PersonWebsiteOrBuilder> 
         getPersonwebsitesOrBuilderList() {
      if (personwebsitesBuilder_ != null) {
        return personwebsitesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(personwebsites_);
      }
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public proto.PersonWebsite.Builder addPersonwebsitesBuilder() {
      return getPersonwebsitesFieldBuilder().addBuilder(
          proto.PersonWebsite.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public proto.PersonWebsite.Builder addPersonwebsitesBuilder(
        int index) {
      return getPersonwebsitesFieldBuilder().addBuilder(
          index, proto.PersonWebsite.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.PersonWebsite personwebsites = 1;</code>
     */
    public java.util.List<proto.PersonWebsite.Builder> 
         getPersonwebsitesBuilderList() {
      return getPersonwebsitesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.PersonWebsite, proto.PersonWebsite.Builder, proto.PersonWebsiteOrBuilder> 
        getPersonwebsitesFieldBuilder() {
      if (personwebsitesBuilder_ == null) {
        personwebsitesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.PersonWebsite, proto.PersonWebsite.Builder, proto.PersonWebsiteOrBuilder>(
                personwebsites_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        personwebsites_ = null;
      }
      return personwebsitesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.PersonWebsiteResult)
  }

  // @@protoc_insertion_point(class_scope:proto.PersonWebsiteResult)
  private static final proto.PersonWebsiteResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.PersonWebsiteResult();
  }

  public static proto.PersonWebsiteResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonWebsiteResult>
      PARSER = new com.google.protobuf.AbstractParser<PersonWebsiteResult>() {
    @java.lang.Override
    public PersonWebsiteResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<PersonWebsiteResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonWebsiteResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.PersonWebsiteResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

