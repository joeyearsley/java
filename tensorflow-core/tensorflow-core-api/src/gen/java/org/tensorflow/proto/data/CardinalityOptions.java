// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/dataset_options.proto

package org.tensorflow.proto.data;

/**
 * <pre>
 * next: 2
 * </pre>
 *
 * Protobuf type {@code tensorflow.data.CardinalityOptions}
 */
public  final class CardinalityOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.data.CardinalityOptions)
    CardinalityOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CardinalityOptions.newBuilder() to construct.
  private CardinalityOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CardinalityOptions() {
    computeLevel_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CardinalityOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CardinalityOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            computeLevel_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_CardinalityOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_CardinalityOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.data.CardinalityOptions.class, org.tensorflow.proto.data.CardinalityOptions.Builder.class);
  }

  /**
   * Protobuf enum {@code tensorflow.data.CardinalityOptions.ComputeLevel}
   */
  public enum ComputeLevel
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CARDINALITY_COMPUTE_UNSPECIFIED = 0;</code>
     */
    CARDINALITY_COMPUTE_UNSPECIFIED(0),
    /**
     * <pre>
     * Cardinality will only be computed if it can be determined in a cheap
     * manner (ie. without reading from file sources). If the cardinality would
     * be nontrivial to compute, Cardinality() will return UNKNOWN_CARDINALITY.
     * </pre>
     *
     * <code>CARDINALITY_COMPUTE_LOW = 1;</code>
     */
    CARDINALITY_COMPUTE_LOW(1),
    /**
     * <pre>
     * Moderate effort will be made to determine cardinality, such as reading
     * index data from source files. If significant work is needed to compute
     * cardinality (e.g. reading entire source file contents or executing user
     * defined functions), Cardinality() will return UNKNOWN_CARDINALITY.
     * </pre>
     *
     * <code>CARDINALITY_COMPUTE_MODERATE = 2;</code>
     */
    CARDINALITY_COMPUTE_MODERATE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CARDINALITY_COMPUTE_UNSPECIFIED = 0;</code>
     */
    public static final int CARDINALITY_COMPUTE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Cardinality will only be computed if it can be determined in a cheap
     * manner (ie. without reading from file sources). If the cardinality would
     * be nontrivial to compute, Cardinality() will return UNKNOWN_CARDINALITY.
     * </pre>
     *
     * <code>CARDINALITY_COMPUTE_LOW = 1;</code>
     */
    public static final int CARDINALITY_COMPUTE_LOW_VALUE = 1;
    /**
     * <pre>
     * Moderate effort will be made to determine cardinality, such as reading
     * index data from source files. If significant work is needed to compute
     * cardinality (e.g. reading entire source file contents or executing user
     * defined functions), Cardinality() will return UNKNOWN_CARDINALITY.
     * </pre>
     *
     * <code>CARDINALITY_COMPUTE_MODERATE = 2;</code>
     */
    public static final int CARDINALITY_COMPUTE_MODERATE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ComputeLevel valueOf(int value) {
      return forNumber(value);
    }

    public static ComputeLevel forNumber(int value) {
      switch (value) {
        case 0: return CARDINALITY_COMPUTE_UNSPECIFIED;
        case 1: return CARDINALITY_COMPUTE_LOW;
        case 2: return CARDINALITY_COMPUTE_MODERATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ComputeLevel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ComputeLevel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ComputeLevel>() {
            public ComputeLevel findValueByNumber(int number) {
              return ComputeLevel.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.tensorflow.proto.data.CardinalityOptions.getDescriptor().getEnumTypes().get(0);
    }

    private static final ComputeLevel[] VALUES = values();

    public static ComputeLevel valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ComputeLevel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:tensorflow.data.CardinalityOptions.ComputeLevel)
  }

  public static final int COMPUTE_LEVEL_FIELD_NUMBER = 1;
  private int computeLevel_;
  /**
   * <code>.tensorflow.data.CardinalityOptions.ComputeLevel compute_level = 1;</code>
   */
  public int getComputeLevelValue() {
    return computeLevel_;
  }
  /**
   * <code>.tensorflow.data.CardinalityOptions.ComputeLevel compute_level = 1;</code>
   */
  public org.tensorflow.proto.data.CardinalityOptions.ComputeLevel getComputeLevel() {
    @SuppressWarnings("deprecation")
    org.tensorflow.proto.data.CardinalityOptions.ComputeLevel result = org.tensorflow.proto.data.CardinalityOptions.ComputeLevel.valueOf(computeLevel_);
    return result == null ? org.tensorflow.proto.data.CardinalityOptions.ComputeLevel.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (computeLevel_ != org.tensorflow.proto.data.CardinalityOptions.ComputeLevel.CARDINALITY_COMPUTE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, computeLevel_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (computeLevel_ != org.tensorflow.proto.data.CardinalityOptions.ComputeLevel.CARDINALITY_COMPUTE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, computeLevel_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.proto.data.CardinalityOptions)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.data.CardinalityOptions other = (org.tensorflow.proto.data.CardinalityOptions) obj;

    if (computeLevel_ != other.computeLevel_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COMPUTE_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + computeLevel_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.data.CardinalityOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.CardinalityOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.CardinalityOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.CardinalityOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.CardinalityOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.CardinalityOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.CardinalityOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.CardinalityOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.data.CardinalityOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.CardinalityOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.data.CardinalityOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.CardinalityOptions parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.data.CardinalityOptions prototype) {
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
   * <pre>
   * next: 2
   * </pre>
   *
   * Protobuf type {@code tensorflow.data.CardinalityOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.data.CardinalityOptions)
      org.tensorflow.proto.data.CardinalityOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_CardinalityOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_CardinalityOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.data.CardinalityOptions.class, org.tensorflow.proto.data.CardinalityOptions.Builder.class);
    }

    // Construct using org.tensorflow.proto.data.CardinalityOptions.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      computeLevel_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_CardinalityOptions_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.data.CardinalityOptions getDefaultInstanceForType() {
      return org.tensorflow.proto.data.CardinalityOptions.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.data.CardinalityOptions build() {
      org.tensorflow.proto.data.CardinalityOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.data.CardinalityOptions buildPartial() {
      org.tensorflow.proto.data.CardinalityOptions result = new org.tensorflow.proto.data.CardinalityOptions(this);
      result.computeLevel_ = computeLevel_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.proto.data.CardinalityOptions) {
        return mergeFrom((org.tensorflow.proto.data.CardinalityOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.data.CardinalityOptions other) {
      if (other == org.tensorflow.proto.data.CardinalityOptions.getDefaultInstance()) return this;
      if (other.computeLevel_ != 0) {
        setComputeLevelValue(other.getComputeLevelValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.proto.data.CardinalityOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.proto.data.CardinalityOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int computeLevel_ = 0;
    /**
     * <code>.tensorflow.data.CardinalityOptions.ComputeLevel compute_level = 1;</code>
     */
    public int getComputeLevelValue() {
      return computeLevel_;
    }
    /**
     * <code>.tensorflow.data.CardinalityOptions.ComputeLevel compute_level = 1;</code>
     */
    public Builder setComputeLevelValue(int value) {
      computeLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.data.CardinalityOptions.ComputeLevel compute_level = 1;</code>
     */
    public org.tensorflow.proto.data.CardinalityOptions.ComputeLevel getComputeLevel() {
      @SuppressWarnings("deprecation")
      org.tensorflow.proto.data.CardinalityOptions.ComputeLevel result = org.tensorflow.proto.data.CardinalityOptions.ComputeLevel.valueOf(computeLevel_);
      return result == null ? org.tensorflow.proto.data.CardinalityOptions.ComputeLevel.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.data.CardinalityOptions.ComputeLevel compute_level = 1;</code>
     */
    public Builder setComputeLevel(org.tensorflow.proto.data.CardinalityOptions.ComputeLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      computeLevel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.data.CardinalityOptions.ComputeLevel compute_level = 1;</code>
     */
    public Builder clearComputeLevel() {
      
      computeLevel_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.data.CardinalityOptions)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.data.CardinalityOptions)
  private static final org.tensorflow.proto.data.CardinalityOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.data.CardinalityOptions();
  }

  public static org.tensorflow.proto.data.CardinalityOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CardinalityOptions>
      PARSER = new com.google.protobuf.AbstractParser<CardinalityOptions>() {
    @java.lang.Override
    public CardinalityOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CardinalityOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CardinalityOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CardinalityOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.data.CardinalityOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

