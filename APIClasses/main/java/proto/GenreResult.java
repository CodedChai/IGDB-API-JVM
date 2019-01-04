// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.GenreResult}
 */
public  final class GenreResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.GenreResult)
    GenreResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenreResult.newBuilder() to construct.
  private GenreResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenreResult() {
    genres_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_GenreResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_GenreResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.GenreResult.class, proto.GenreResult.Builder.class);
  }

  public static final int GENRES_FIELD_NUMBER = 1;
  private java.util.List<proto.Genre> genres_;
  /**
   * <code>repeated .proto.Genre genres = 1;</code>
   */
  public java.util.List<proto.Genre> getGenresList() {
    return genres_;
  }
  /**
   * <code>repeated .proto.Genre genres = 1;</code>
   */
  public java.util.List<? extends proto.GenreOrBuilder> 
      getGenresOrBuilderList() {
    return genres_;
  }
  /**
   * <code>repeated .proto.Genre genres = 1;</code>
   */
  public int getGenresCount() {
    return genres_.size();
  }
  /**
   * <code>repeated .proto.Genre genres = 1;</code>
   */
  public proto.Genre getGenres(int index) {
    return genres_.get(index);
  }
  /**
   * <code>repeated .proto.Genre genres = 1;</code>
   */
  public proto.GenreOrBuilder getGenresOrBuilder(
      int index) {
    return genres_.get(index);
  }

  public static proto.GenreResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GenreResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GenreResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GenreResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GenreResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GenreResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GenreResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GenreResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GenreResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.GenreResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GenreResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GenreResult parseFrom(
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
  public static Builder newBuilder(proto.GenreResult prototype) {
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
   * Protobuf type {@code proto.GenreResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.GenreResult)
      proto.GenreResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_GenreResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_GenreResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.GenreResult.class, proto.GenreResult.Builder.class);
    }

    // Construct using proto.GenreResult.newBuilder()
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
        getGenresFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (genresBuilder_ == null) {
        genres_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        genresBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_GenreResult_descriptor;
    }

    @java.lang.Override
    public proto.GenreResult getDefaultInstanceForType() {
      return proto.GenreResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.GenreResult build() {
      proto.GenreResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.GenreResult buildPartial() {
      proto.GenreResult result = new proto.GenreResult(this);
      int from_bitField0_ = bitField0_;
      if (genresBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          genres_ = java.util.Collections.unmodifiableList(genres_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.genres_ = genres_;
      } else {
        result.genres_ = genresBuilder_.build();
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

    private java.util.List<proto.Genre> genres_ =
      java.util.Collections.emptyList();
    private void ensureGenresIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        genres_ = new java.util.ArrayList<proto.Genre>(genres_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Genre, proto.Genre.Builder, proto.GenreOrBuilder> genresBuilder_;

    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public java.util.List<proto.Genre> getGenresList() {
      if (genresBuilder_ == null) {
        return java.util.Collections.unmodifiableList(genres_);
      } else {
        return genresBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public int getGenresCount() {
      if (genresBuilder_ == null) {
        return genres_.size();
      } else {
        return genresBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public proto.Genre getGenres(int index) {
      if (genresBuilder_ == null) {
        return genres_.get(index);
      } else {
        return genresBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public Builder setGenres(
        int index, proto.Genre value) {
      if (genresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGenresIsMutable();
        genres_.set(index, value);
        onChanged();
      } else {
        genresBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public Builder setGenres(
        int index, proto.Genre.Builder builderForValue) {
      if (genresBuilder_ == null) {
        ensureGenresIsMutable();
        genres_.set(index, builderForValue.build());
        onChanged();
      } else {
        genresBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public Builder addGenres(proto.Genre value) {
      if (genresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGenresIsMutable();
        genres_.add(value);
        onChanged();
      } else {
        genresBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public Builder addGenres(
        int index, proto.Genre value) {
      if (genresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGenresIsMutable();
        genres_.add(index, value);
        onChanged();
      } else {
        genresBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public Builder addGenres(
        proto.Genre.Builder builderForValue) {
      if (genresBuilder_ == null) {
        ensureGenresIsMutable();
        genres_.add(builderForValue.build());
        onChanged();
      } else {
        genresBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public Builder addGenres(
        int index, proto.Genre.Builder builderForValue) {
      if (genresBuilder_ == null) {
        ensureGenresIsMutable();
        genres_.add(index, builderForValue.build());
        onChanged();
      } else {
        genresBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public Builder addAllGenres(
        java.lang.Iterable<? extends proto.Genre> values) {
      if (genresBuilder_ == null) {
        ensureGenresIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, genres_);
        onChanged();
      } else {
        genresBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public Builder clearGenres() {
      if (genresBuilder_ == null) {
        genres_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        genresBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public Builder removeGenres(int index) {
      if (genresBuilder_ == null) {
        ensureGenresIsMutable();
        genres_.remove(index);
        onChanged();
      } else {
        genresBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public proto.Genre.Builder getGenresBuilder(
        int index) {
      return getGenresFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public proto.GenreOrBuilder getGenresOrBuilder(
        int index) {
      if (genresBuilder_ == null) {
        return genres_.get(index);  } else {
        return genresBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public java.util.List<? extends proto.GenreOrBuilder> 
         getGenresOrBuilderList() {
      if (genresBuilder_ != null) {
        return genresBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(genres_);
      }
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public proto.Genre.Builder addGenresBuilder() {
      return getGenresFieldBuilder().addBuilder(
          proto.Genre.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public proto.Genre.Builder addGenresBuilder(
        int index) {
      return getGenresFieldBuilder().addBuilder(
          index, proto.Genre.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Genre genres = 1;</code>
     */
    public java.util.List<proto.Genre.Builder> 
         getGenresBuilderList() {
      return getGenresFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Genre, proto.Genre.Builder, proto.GenreOrBuilder> 
        getGenresFieldBuilder() {
      if (genresBuilder_ == null) {
        genresBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Genre, proto.Genre.Builder, proto.GenreOrBuilder>(
                genres_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        genres_ = null;
      }
      return genresBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.GenreResult)
  }

  // @@protoc_insertion_point(class_scope:proto.GenreResult)
  private static final proto.GenreResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.GenreResult();
  }

  public static proto.GenreResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenreResult>
      PARSER = new com.google.protobuf.AbstractParser<GenreResult>() {
    @java.lang.Override
    public GenreResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenreResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenreResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.GenreResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

