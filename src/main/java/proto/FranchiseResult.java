// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.FranchiseResult}
 */
public  final class FranchiseResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.FranchiseResult)
    FranchiseResultOrBuilder {
  // Use FranchiseResult.newBuilder() to construct.
  private FranchiseResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FranchiseResult() {
    franchises_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_FranchiseResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_FranchiseResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.FranchiseResult.class, proto.FranchiseResult.Builder.class);
  }

  public static final int FRANCHISES_FIELD_NUMBER = 1;
  private java.util.List<proto.Franchise> franchises_;
  /**
   * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
   */
  public java.util.List<proto.Franchise> getFranchisesList() {
    return franchises_;
  }
  /**
   * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
   */
  public java.util.List<? extends proto.FranchiseOrBuilder> 
      getFranchisesOrBuilderList() {
    return franchises_;
  }
  /**
   * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
   */
  public int getFranchisesCount() {
    return franchises_.size();
  }
  /**
   * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
   */
  public proto.Franchise getFranchises(int index) {
    return franchises_.get(index);
  }
  /**
   * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
   */
  public proto.FranchiseOrBuilder getFranchisesOrBuilder(
      int index) {
    return franchises_.get(index);
  }

  public static proto.FranchiseResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.FranchiseResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.FranchiseResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.FranchiseResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.FranchiseResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.FranchiseResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.FranchiseResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.FranchiseResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.FranchiseResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.FranchiseResult parseFrom(
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
  public static Builder newBuilder(proto.FranchiseResult prototype) {
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
   * Protobuf type {@code proto.FranchiseResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.FranchiseResult)
      proto.FranchiseResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_FranchiseResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_FranchiseResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.FranchiseResult.class, proto.FranchiseResult.Builder.class);
    }

    // Construct using proto.FranchiseResult.newBuilder()
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
        getFranchisesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (franchisesBuilder_ == null) {
        franchises_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        franchisesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_FranchiseResult_descriptor;
    }

    public proto.FranchiseResult getDefaultInstanceForType() {
      return proto.FranchiseResult.getDefaultInstance();
    }

    public proto.FranchiseResult build() {
      proto.FranchiseResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public proto.FranchiseResult buildPartial() {
      proto.FranchiseResult result = new proto.FranchiseResult(this);
      int from_bitField0_ = bitField0_;
      if (franchisesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          franchises_ = java.util.Collections.unmodifiableList(franchises_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.franchises_ = franchises_;
      } else {
        result.franchises_ = franchisesBuilder_.build();
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

    private java.util.List<proto.Franchise> franchises_ =
      java.util.Collections.emptyList();
    private void ensureFranchisesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        franchises_ = new java.util.ArrayList<proto.Franchise>(franchises_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Franchise, proto.Franchise.Builder, proto.FranchiseOrBuilder> franchisesBuilder_;

    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public java.util.List<proto.Franchise> getFranchisesList() {
      if (franchisesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(franchises_);
      } else {
        return franchisesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public int getFranchisesCount() {
      if (franchisesBuilder_ == null) {
        return franchises_.size();
      } else {
        return franchisesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public proto.Franchise getFranchises(int index) {
      if (franchisesBuilder_ == null) {
        return franchises_.get(index);
      } else {
        return franchisesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public Builder setFranchises(
        int index, proto.Franchise value) {
      if (franchisesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFranchisesIsMutable();
        franchises_.set(index, value);
        onChanged();
      } else {
        franchisesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public Builder setFranchises(
        int index, proto.Franchise.Builder builderForValue) {
      if (franchisesBuilder_ == null) {
        ensureFranchisesIsMutable();
        franchises_.set(index, builderForValue.build());
        onChanged();
      } else {
        franchisesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public Builder addFranchises(proto.Franchise value) {
      if (franchisesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFranchisesIsMutable();
        franchises_.add(value);
        onChanged();
      } else {
        franchisesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public Builder addFranchises(
        int index, proto.Franchise value) {
      if (franchisesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFranchisesIsMutable();
        franchises_.add(index, value);
        onChanged();
      } else {
        franchisesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public Builder addFranchises(
        proto.Franchise.Builder builderForValue) {
      if (franchisesBuilder_ == null) {
        ensureFranchisesIsMutable();
        franchises_.add(builderForValue.build());
        onChanged();
      } else {
        franchisesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public Builder addFranchises(
        int index, proto.Franchise.Builder builderForValue) {
      if (franchisesBuilder_ == null) {
        ensureFranchisesIsMutable();
        franchises_.add(index, builderForValue.build());
        onChanged();
      } else {
        franchisesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public Builder addAllFranchises(
        java.lang.Iterable<? extends proto.Franchise> values) {
      if (franchisesBuilder_ == null) {
        ensureFranchisesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, franchises_);
        onChanged();
      } else {
        franchisesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public Builder clearFranchises() {
      if (franchisesBuilder_ == null) {
        franchises_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        franchisesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public Builder removeFranchises(int index) {
      if (franchisesBuilder_ == null) {
        ensureFranchisesIsMutable();
        franchises_.remove(index);
        onChanged();
      } else {
        franchisesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public proto.Franchise.Builder getFranchisesBuilder(
        int index) {
      return getFranchisesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public proto.FranchiseOrBuilder getFranchisesOrBuilder(
        int index) {
      if (franchisesBuilder_ == null) {
        return franchises_.get(index);  } else {
        return franchisesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public java.util.List<? extends proto.FranchiseOrBuilder> 
         getFranchisesOrBuilderList() {
      if (franchisesBuilder_ != null) {
        return franchisesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(franchises_);
      }
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public proto.Franchise.Builder addFranchisesBuilder() {
      return getFranchisesFieldBuilder().addBuilder(
          proto.Franchise.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public proto.Franchise.Builder addFranchisesBuilder(
        int index) {
      return getFranchisesFieldBuilder().addBuilder(
          index, proto.Franchise.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Franchise com.codedchai.igdb.kt.franchises = 1;</code>
     */
    public java.util.List<proto.Franchise.Builder> 
         getFranchisesBuilderList() {
      return getFranchisesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Franchise, proto.Franchise.Builder, proto.FranchiseOrBuilder> 
        getFranchisesFieldBuilder() {
      if (franchisesBuilder_ == null) {
        franchisesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Franchise, proto.Franchise.Builder, proto.FranchiseOrBuilder>(
                franchises_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        franchises_ = null;
      }
      return franchisesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.FranchiseResult)
  }

  // @@protoc_insertion_point(class_scope:proto.FranchiseResult)
  private static final proto.FranchiseResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.FranchiseResult();
  }

  public static proto.FranchiseResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FranchiseResult>
      PARSER = new com.google.protobuf.AbstractParser<FranchiseResult>() {
    public FranchiseResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<FranchiseResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FranchiseResult> getParserForType() {
    return PARSER;
  }

  public proto.FranchiseResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

