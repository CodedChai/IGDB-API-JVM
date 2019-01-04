// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.PageWebsiteResult}
 */
public  final class PageWebsiteResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.PageWebsiteResult)
    PageWebsiteResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PageWebsiteResult.newBuilder() to construct.
  private PageWebsiteResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PageWebsiteResult() {
    pagewebsites_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_PageWebsiteResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_PageWebsiteResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.PageWebsiteResult.class, proto.PageWebsiteResult.Builder.class);
  }

  public static final int PAGEWEBSITES_FIELD_NUMBER = 1;
  private java.util.List<proto.PageWebsite> pagewebsites_;
  /**
   * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
   */
  public java.util.List<proto.PageWebsite> getPagewebsitesList() {
    return pagewebsites_;
  }
  /**
   * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
   */
  public java.util.List<? extends proto.PageWebsiteOrBuilder> 
      getPagewebsitesOrBuilderList() {
    return pagewebsites_;
  }
  /**
   * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
   */
  public int getPagewebsitesCount() {
    return pagewebsites_.size();
  }
  /**
   * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
   */
  public proto.PageWebsite getPagewebsites(int index) {
    return pagewebsites_.get(index);
  }
  /**
   * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
   */
  public proto.PageWebsiteOrBuilder getPagewebsitesOrBuilder(
      int index) {
    return pagewebsites_.get(index);
  }

  public static proto.PageWebsiteResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PageWebsiteResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PageWebsiteResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PageWebsiteResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PageWebsiteResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PageWebsiteResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PageWebsiteResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PageWebsiteResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.PageWebsiteResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.PageWebsiteResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.PageWebsiteResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PageWebsiteResult parseFrom(
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
  public static Builder newBuilder(proto.PageWebsiteResult prototype) {
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
   * Protobuf type {@code proto.PageWebsiteResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.PageWebsiteResult)
      proto.PageWebsiteResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_PageWebsiteResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_PageWebsiteResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.PageWebsiteResult.class, proto.PageWebsiteResult.Builder.class);
    }

    // Construct using proto.PageWebsiteResult.newBuilder()
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
        getPagewebsitesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (pagewebsitesBuilder_ == null) {
        pagewebsites_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        pagewebsitesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_PageWebsiteResult_descriptor;
    }

    @java.lang.Override
    public proto.PageWebsiteResult getDefaultInstanceForType() {
      return proto.PageWebsiteResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.PageWebsiteResult build() {
      proto.PageWebsiteResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.PageWebsiteResult buildPartial() {
      proto.PageWebsiteResult result = new proto.PageWebsiteResult(this);
      int from_bitField0_ = bitField0_;
      if (pagewebsitesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          pagewebsites_ = java.util.Collections.unmodifiableList(pagewebsites_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pagewebsites_ = pagewebsites_;
      } else {
        result.pagewebsites_ = pagewebsitesBuilder_.build();
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

    private java.util.List<proto.PageWebsite> pagewebsites_ =
      java.util.Collections.emptyList();
    private void ensurePagewebsitesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        pagewebsites_ = new java.util.ArrayList<proto.PageWebsite>(pagewebsites_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.PageWebsite, proto.PageWebsite.Builder, proto.PageWebsiteOrBuilder> pagewebsitesBuilder_;

    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public java.util.List<proto.PageWebsite> getPagewebsitesList() {
      if (pagewebsitesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pagewebsites_);
      } else {
        return pagewebsitesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public int getPagewebsitesCount() {
      if (pagewebsitesBuilder_ == null) {
        return pagewebsites_.size();
      } else {
        return pagewebsitesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public proto.PageWebsite getPagewebsites(int index) {
      if (pagewebsitesBuilder_ == null) {
        return pagewebsites_.get(index);
      } else {
        return pagewebsitesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public Builder setPagewebsites(
        int index, proto.PageWebsite value) {
      if (pagewebsitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePagewebsitesIsMutable();
        pagewebsites_.set(index, value);
        onChanged();
      } else {
        pagewebsitesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public Builder setPagewebsites(
        int index, proto.PageWebsite.Builder builderForValue) {
      if (pagewebsitesBuilder_ == null) {
        ensurePagewebsitesIsMutable();
        pagewebsites_.set(index, builderForValue.build());
        onChanged();
      } else {
        pagewebsitesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public Builder addPagewebsites(proto.PageWebsite value) {
      if (pagewebsitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePagewebsitesIsMutable();
        pagewebsites_.add(value);
        onChanged();
      } else {
        pagewebsitesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public Builder addPagewebsites(
        int index, proto.PageWebsite value) {
      if (pagewebsitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePagewebsitesIsMutable();
        pagewebsites_.add(index, value);
        onChanged();
      } else {
        pagewebsitesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public Builder addPagewebsites(
        proto.PageWebsite.Builder builderForValue) {
      if (pagewebsitesBuilder_ == null) {
        ensurePagewebsitesIsMutable();
        pagewebsites_.add(builderForValue.build());
        onChanged();
      } else {
        pagewebsitesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public Builder addPagewebsites(
        int index, proto.PageWebsite.Builder builderForValue) {
      if (pagewebsitesBuilder_ == null) {
        ensurePagewebsitesIsMutable();
        pagewebsites_.add(index, builderForValue.build());
        onChanged();
      } else {
        pagewebsitesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public Builder addAllPagewebsites(
        java.lang.Iterable<? extends proto.PageWebsite> values) {
      if (pagewebsitesBuilder_ == null) {
        ensurePagewebsitesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pagewebsites_);
        onChanged();
      } else {
        pagewebsitesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public Builder clearPagewebsites() {
      if (pagewebsitesBuilder_ == null) {
        pagewebsites_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pagewebsitesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public Builder removePagewebsites(int index) {
      if (pagewebsitesBuilder_ == null) {
        ensurePagewebsitesIsMutable();
        pagewebsites_.remove(index);
        onChanged();
      } else {
        pagewebsitesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public proto.PageWebsite.Builder getPagewebsitesBuilder(
        int index) {
      return getPagewebsitesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public proto.PageWebsiteOrBuilder getPagewebsitesOrBuilder(
        int index) {
      if (pagewebsitesBuilder_ == null) {
        return pagewebsites_.get(index);  } else {
        return pagewebsitesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public java.util.List<? extends proto.PageWebsiteOrBuilder> 
         getPagewebsitesOrBuilderList() {
      if (pagewebsitesBuilder_ != null) {
        return pagewebsitesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pagewebsites_);
      }
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public proto.PageWebsite.Builder addPagewebsitesBuilder() {
      return getPagewebsitesFieldBuilder().addBuilder(
          proto.PageWebsite.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public proto.PageWebsite.Builder addPagewebsitesBuilder(
        int index) {
      return getPagewebsitesFieldBuilder().addBuilder(
          index, proto.PageWebsite.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.PageWebsite pagewebsites = 1;</code>
     */
    public java.util.List<proto.PageWebsite.Builder> 
         getPagewebsitesBuilderList() {
      return getPagewebsitesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.PageWebsite, proto.PageWebsite.Builder, proto.PageWebsiteOrBuilder> 
        getPagewebsitesFieldBuilder() {
      if (pagewebsitesBuilder_ == null) {
        pagewebsitesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.PageWebsite, proto.PageWebsite.Builder, proto.PageWebsiteOrBuilder>(
                pagewebsites_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        pagewebsites_ = null;
      }
      return pagewebsitesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.PageWebsiteResult)
  }

  // @@protoc_insertion_point(class_scope:proto.PageWebsiteResult)
  private static final proto.PageWebsiteResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.PageWebsiteResult();
  }

  public static proto.PageWebsiteResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PageWebsiteResult>
      PARSER = new com.google.protobuf.AbstractParser<PageWebsiteResult>() {
    @java.lang.Override
    public PageWebsiteResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<PageWebsiteResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PageWebsiteResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.PageWebsiteResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

