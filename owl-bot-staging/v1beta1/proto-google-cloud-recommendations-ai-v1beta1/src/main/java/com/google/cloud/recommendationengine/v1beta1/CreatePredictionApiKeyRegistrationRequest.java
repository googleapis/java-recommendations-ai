// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommendationengine/v1beta1/prediction_apikey_registry_service.proto

package com.google.cloud.recommendationengine.v1beta1;

/**
 * <pre>
 * Request message for the `CreatePredictionApiKeyRegistration` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest}
 */
public final class CreatePredictionApiKeyRegistrationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest)
    CreatePredictionApiKeyRegistrationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreatePredictionApiKeyRegistrationRequest.newBuilder() to construct.
  private CreatePredictionApiKeyRegistrationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreatePredictionApiKeyRegistrationRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreatePredictionApiKeyRegistrationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.recommendationengine.v1beta1.PredictionApikeyRegistryService.internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommendationengine.v1beta1.PredictionApikeyRegistryService.internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest.class, com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The parent resource path.
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/eventStores/default_event_store`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The parent resource path.
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/eventStores/default_event_store`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREDICTION_API_KEY_REGISTRATION_FIELD_NUMBER = 2;
  private com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration predictionApiKeyRegistration_;
  /**
   * <pre>
   * Required. The prediction API key registration.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration prediction_api_key_registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the predictionApiKeyRegistration field is set.
   */
  @java.lang.Override
  public boolean hasPredictionApiKeyRegistration() {
    return predictionApiKeyRegistration_ != null;
  }
  /**
   * <pre>
   * Required. The prediction API key registration.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration prediction_api_key_registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The predictionApiKeyRegistration.
   */
  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration getPredictionApiKeyRegistration() {
    return predictionApiKeyRegistration_ == null ? com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.getDefaultInstance() : predictionApiKeyRegistration_;
  }
  /**
   * <pre>
   * Required. The prediction API key registration.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration prediction_api_key_registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistrationOrBuilder getPredictionApiKeyRegistrationOrBuilder() {
    return getPredictionApiKeyRegistration();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (predictionApiKeyRegistration_ != null) {
      output.writeMessage(2, getPredictionApiKeyRegistration());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (predictionApiKeyRegistration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPredictionApiKeyRegistration());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest other = (com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasPredictionApiKeyRegistration() != other.hasPredictionApiKeyRegistration()) return false;
    if (hasPredictionApiKeyRegistration()) {
      if (!getPredictionApiKeyRegistration()
          .equals(other.getPredictionApiKeyRegistration())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasPredictionApiKeyRegistration()) {
      hash = (37 * hash) + PREDICTION_API_KEY_REGISTRATION_FIELD_NUMBER;
      hash = (53 * hash) + getPredictionApiKeyRegistration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest prototype) {
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
   * Request message for the `CreatePredictionApiKeyRegistration` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest)
      com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.recommendationengine.v1beta1.PredictionApikeyRegistryService.internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommendationengine.v1beta1.PredictionApikeyRegistryService.internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest.class, com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest.Builder.class);
    }

    // Construct using com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (predictionApiKeyRegistrationBuilder_ == null) {
        predictionApiKeyRegistration_ = null;
      } else {
        predictionApiKeyRegistration_ = null;
        predictionApiKeyRegistrationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.recommendationengine.v1beta1.PredictionApikeyRegistryService.internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest getDefaultInstanceForType() {
      return com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest build() {
      com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest buildPartial() {
      com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest result = new com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest(this);
      result.parent_ = parent_;
      if (predictionApiKeyRegistrationBuilder_ == null) {
        result.predictionApiKeyRegistration_ = predictionApiKeyRegistration_;
      } else {
        result.predictionApiKeyRegistration_ = predictionApiKeyRegistrationBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest) {
        return mergeFrom((com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest other) {
      if (other == com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasPredictionApiKeyRegistration()) {
        mergePredictionApiKeyRegistration(other.getPredictionApiKeyRegistration());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              parent_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPredictionApiKeyRegistrationFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent resource path.
     * `projects/&#42;&#47;locations/global/catalogs/default_catalog/eventStores/default_event_store`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource path.
     * `projects/&#42;&#47;locations/global/catalogs/default_catalog/eventStores/default_event_store`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource path.
     * `projects/&#42;&#47;locations/global/catalogs/default_catalog/eventStores/default_event_store`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource path.
     * `projects/&#42;&#47;locations/global/catalogs/default_catalog/eventStores/default_event_store`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource path.
     * `projects/&#42;&#47;locations/global/catalogs/default_catalog/eventStores/default_event_store`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration predictionApiKeyRegistration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration, com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.Builder, com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistrationOrBuilder> predictionApiKeyRegistrationBuilder_;
    /**
     * <pre>
     * Required. The prediction API key registration.
     * </pre>
     *
     * <code>.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration prediction_api_key_registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the predictionApiKeyRegistration field is set.
     */
    public boolean hasPredictionApiKeyRegistration() {
      return predictionApiKeyRegistrationBuilder_ != null || predictionApiKeyRegistration_ != null;
    }
    /**
     * <pre>
     * Required. The prediction API key registration.
     * </pre>
     *
     * <code>.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration prediction_api_key_registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The predictionApiKeyRegistration.
     */
    public com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration getPredictionApiKeyRegistration() {
      if (predictionApiKeyRegistrationBuilder_ == null) {
        return predictionApiKeyRegistration_ == null ? com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.getDefaultInstance() : predictionApiKeyRegistration_;
      } else {
        return predictionApiKeyRegistrationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The prediction API key registration.
     * </pre>
     *
     * <code>.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration prediction_api_key_registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPredictionApiKeyRegistration(com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration value) {
      if (predictionApiKeyRegistrationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        predictionApiKeyRegistration_ = value;
        onChanged();
      } else {
        predictionApiKeyRegistrationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The prediction API key registration.
     * </pre>
     *
     * <code>.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration prediction_api_key_registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setPredictionApiKeyRegistration(
        com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.Builder builderForValue) {
      if (predictionApiKeyRegistrationBuilder_ == null) {
        predictionApiKeyRegistration_ = builderForValue.build();
        onChanged();
      } else {
        predictionApiKeyRegistrationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The prediction API key registration.
     * </pre>
     *
     * <code>.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration prediction_api_key_registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergePredictionApiKeyRegistration(com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration value) {
      if (predictionApiKeyRegistrationBuilder_ == null) {
        if (predictionApiKeyRegistration_ != null) {
          predictionApiKeyRegistration_ =
            com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.newBuilder(predictionApiKeyRegistration_).mergeFrom(value).buildPartial();
        } else {
          predictionApiKeyRegistration_ = value;
        }
        onChanged();
      } else {
        predictionApiKeyRegistrationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The prediction API key registration.
     * </pre>
     *
     * <code>.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration prediction_api_key_registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearPredictionApiKeyRegistration() {
      if (predictionApiKeyRegistrationBuilder_ == null) {
        predictionApiKeyRegistration_ = null;
        onChanged();
      } else {
        predictionApiKeyRegistration_ = null;
        predictionApiKeyRegistrationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The prediction API key registration.
     * </pre>
     *
     * <code>.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration prediction_api_key_registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.Builder getPredictionApiKeyRegistrationBuilder() {
      
      onChanged();
      return getPredictionApiKeyRegistrationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The prediction API key registration.
     * </pre>
     *
     * <code>.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration prediction_api_key_registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistrationOrBuilder getPredictionApiKeyRegistrationOrBuilder() {
      if (predictionApiKeyRegistrationBuilder_ != null) {
        return predictionApiKeyRegistrationBuilder_.getMessageOrBuilder();
      } else {
        return predictionApiKeyRegistration_ == null ?
            com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.getDefaultInstance() : predictionApiKeyRegistration_;
      }
    }
    /**
     * <pre>
     * Required. The prediction API key registration.
     * </pre>
     *
     * <code>.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration prediction_api_key_registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration, com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.Builder, com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistrationOrBuilder> 
        getPredictionApiKeyRegistrationFieldBuilder() {
      if (predictionApiKeyRegistrationBuilder_ == null) {
        predictionApiKeyRegistrationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration, com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.Builder, com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistrationOrBuilder>(
                getPredictionApiKeyRegistration(),
                getParentForChildren(),
                isClean());
        predictionApiKeyRegistration_ = null;
      }
      return predictionApiKeyRegistrationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest)
  private static final com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest();
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePredictionApiKeyRegistrationRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreatePredictionApiKeyRegistrationRequest>() {
    @java.lang.Override
    public CreatePredictionApiKeyRegistrationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CreatePredictionApiKeyRegistrationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePredictionApiKeyRegistrationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

